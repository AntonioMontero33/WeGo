package com.example.wego;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.wego.Adapters.ListAdapterHoy;
import com.example.wego.Clases.Evento;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class fgHome extends Fragment {

    ListView listaHoy;
    ListAdapterHoy listAdapterHoy;
    List<Evento> eventoList;


    String ubicacionEvent, tagsEvent, reglaEvent, referenciaEvent,recomendacionEvent
            ,horaEvent, fechaEvent, direccionEvent, descripcionEvent, tituloEvent, idEvent;

    Button btnTry;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private ListView coursesLV;

    List<String> coursesArrayList;
    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_fg_home, container, false);


        coursesArrayList = new ArrayList<String>();

        listaHoy = rootview.findViewById(R.id.listViewHoy);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, coursesArrayList);



        databaseReference = FirebaseDatabase.getInstance().getReference();

        DatabaseReference ref = databaseReference.child("Evento");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot data : snapshot.getChildren()) {

                    String key = data.getKey();
                    //Step 7: Storing the key in the keyList arrayList
                    coursesArrayList.add(key);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        eventoList = new ArrayList<Evento>();




        List<String> list1 = new ArrayList<>();
        list1.add("9d92f647-61bd-4210-9d00-4b3ea55734d2");
        list1.add("3935b137-d00d-41f8-83d1-f7dbb0932995");
        list1.add("f5ed8cc2-b6df-4ad8-9835-fe19d6a8da05");



        for (int i=0;i<list1.size();i++){
            DatabaseReference refChild = databaseReference.child("Evento").child(list1.get(i));
            refChild.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()){
                        tituloEvent = snapshot.child("tituloEvento").getValue().toString();
                        descripcionEvent = snapshot.child("descripcionEvento").getValue().toString();
                        direccionEvent = snapshot.child("dirccionEvento").getValue().toString();
                        fechaEvent = snapshot.child("fechaEvento").getValue().toString();
                        horaEvent = snapshot.child("horaEvento").getValue().toString();
                        recomendacionEvent = snapshot.child("recomendacionEvento").getValue().toString();
                        referenciaEvent = snapshot.child("referenciaEvento").getValue().toString();
                        reglaEvent = snapshot.child("reglaEvento").getValue().toString();
                        tagsEvent = snapshot.child("tagsEvento").getValue().toString();
                        ubicacionEvent = snapshot.child("ubicacionEvento").getValue().toString();
                        idEvent = snapshot.child("ubicacionEvento").getValue().toString();
                        eventoList.add(new Evento(idEvent,tituloEvent,fechaEvent,horaEvent
                                ,descripcionEvent,recomendacionEvent,ubicacionEvent,direccionEvent,referenciaEvent));
                        listAdapterHoy = new ListAdapterHoy(getActivity(), R.layout.evento_cardview, eventoList);
                        listaHoy.setAdapter(listAdapterHoy);
                    }


                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }

        return rootview;
    }


}