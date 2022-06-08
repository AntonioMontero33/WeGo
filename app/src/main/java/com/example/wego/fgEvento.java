package com.example.wego;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wego.Clases.Evento;
import com.example.wego.Clases.Usuario;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;


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
        Time time = new Time(1,1,1);
        ArrayList<String> reglas1 = new ArrayList<String>();
        ArrayList<String> tags1 = new ArrayList<String>();

        Evento event = new Evento(UUID.randomUUID().toString(),"GranDiesta",firstDate1, time
                ,"DescripcionEvento1",reglas1,"123Ubi","123Ubi","123Ubi", tags1);


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