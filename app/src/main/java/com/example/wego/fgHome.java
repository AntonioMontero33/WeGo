package com.example.wego;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.wego.Adapters.ListAdapterHoy;
import com.example.wego.Clases.Evento;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


public class fgHome extends Fragment {

    ListView listaHoy;
    ListAdapterHoy listAdapterHoy;
    List<Evento> eventoList;

    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_fg_home, container, false);


        listaHoy = rootview.findViewById(R.id.listViewHoy);

        eventoList = new ArrayList<Evento>();

        /*Date firstDate1 = new Date(2002, 1, 1);
        Time time = new Time(4,5,1);
        ArrayList<String> reglas1 = new ArrayList<String>();
        ArrayList<String> tags1 = new ArrayList<String>();

        eventoList.add(new Evento(UUID.randomUUID().toString(),"GranDiesta",firstDate1, time
                ,"DescripcionEvento1",reglas1,"123Ubi","123Ubi","123Ubi", tags1));

        eventoList.add(new Evento(UUID.randomUUID().toString(),"GranDiesta1",firstDate1, time
                ,"DescripcionEvento1",reglas1,"123Ubi","123Ubi","123Ubi", tags1));

        eventoList.add(new Evento(UUID.randomUUID().toString(),"GranDiesta2",firstDate1, time
                ,"DescripcionEvento1",reglas1,"123Ubi","123Ubi","123Ubi", tags1));

        eventoList.add(new Evento(UUID.randomUUID().toString(),"GranDiesta3",firstDate1, time
                ,"DescripcionEvento1",reglas1,"123Ubi","123Ubi","123Ubi", tags1));

        listAdapterHoy = new ListAdapterHoy(getActivity(), R.layout.evento_cardview, eventoList);
        listaHoy.setAdapter(listAdapterHoy);*/


        return rootview;
    }
}