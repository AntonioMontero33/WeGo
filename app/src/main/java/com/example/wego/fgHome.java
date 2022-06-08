package com.example.wego;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.wego.Adapters.ListAdapterHoy;
import com.example.wego.Clases.Evento;

import java.util.List;


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
        listAdapterHoy = new ListAdapterHoy(getContext(), R.layout.evento_cardview, eventoList);

        listaHoy = rootview.findViewById(R.id.listViewHoy);


        return rootview;
    }
}