package com.example.wego;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.wego.Clases.Evento;
import com.example.wego.Clases.Usuario;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fgEvento#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fgEvento extends Fragment {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    TextView crear;


    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootview = inflater.inflate(R.layout.fragment_fg_evento, container, false);
        inicializarFirebase();


        crear = rootview.findViewById(R.id.txtCrear);






        Date firstDate1 = new Date(2002, 1, 1);
        ArrayList<String> reglas1 = new ArrayList<String>();
        ArrayList<String> tags1 = new ArrayList<String>();

        Evento event = new Evento();
        event.setIdEvento(UUID.randomUUID().toString());
        event.setTituloEvento("GranDiesta");
        event.setFechaEvento(firstDate1);
        event.setDescripcionEvento("DescripcionEvento1");
        event.setRegla(reglas1);
        event.setRecomendacion("123434Reco");
        event.setUbicacion("123Ubi");
        event.setDirccion("123Direc");
        event.setTags(tags1);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("Evento").child(event.getIdEvento()).setValue(event);
            }
        });


        return rootview;
    }
    private void inicializarFirebase() {
        FirebaseApp.initializeApp(getContext());
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

}