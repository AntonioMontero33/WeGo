package com.example.wego;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class fgEvento extends Fragment {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    TextView crear;
    EditText titulo,fecha,hora,descripcion,regla,recomendacion,ubicacion,direccion,referencia,etiqueta;


    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootview = inflater.inflate(R.layout.fragment_fg_evento, container, false);
        inicializarFirebase();
        crear = rootview.findViewById(R.id.txtCrear);
        titulo=rootview.findViewById(R.id.txtTitulo);
        fecha=rootview.findViewById(R.id.txtFecha);
        hora=rootview.findViewById(R.id.txtHora);
        descripcion=rootview.findViewById(R.id.txtDescripcion);
        regla=rootview.findViewById(R.id.txtRegla);
        recomendacion=rootview.findViewById(R.id.txtRecomendaciones);
        ubicacion=rootview.findViewById(R.id.txtUbicacion);
        direccion=rootview.findViewById(R.id.txtDireccion);
        referencia=rootview.findViewById(R.id.txtReferencia);
        etiqueta=rootview.findViewById(R.id.txtEtiqueta);

        String tituloEvento=titulo.getText().toString();
        Date fechaEvento=fecha.getText().toString();
        String horaEvento=hora.getText().toString();
        String descripcionEvento=descripcion.getText().toString();
        ArrayList<> reglaEvento= Arrays.toString(getText(regla));
        String recomendacionEvento=recomendacion.getText().toString();
        String ubicacionEvento=ubicacion.getText().toString();
        String direccionEvento=direccion.getText().toString();
        String referenciaEvento=referencia.getText().toString();
        String tagsEvento=etiqueta.getText().toString();

        if(tituloEvento.equals("")||fechaEvento.equals("")||horaEvento.equals("")||descripcionEvento.equals("")||reglaEvento.equals("")||recomendacionEvento.equals("")||ubicacionEvento.equals("")||direccionEvento.equals("")||referenciaEvento.equals("")||tagsEvento.equals("")){
            validacion();
            break;
        }
        else{
            Evento evento= new Evento();
            evento.setIdEvento(UUID.randomUUID().toString());
            evento.setTituloEvento(tituloEvento);
            evento.setFechaEvento(fechaEvento);
            evento.setHoraEvento(horaEvento);
            evento.setDescripcionEvento(descripcionEvento);
            evento.setReglaEvento(reglaEvento);
            evento.setRecomendacionEvento(recomendacionEvento);
            evento.setUbicacionEvento(ubicacionEvento);
            evento.setDirccionEvento(direccionEvento);
            evento.setReferenciaEvento(referenciaEvento);


        }




        /*Date firstDate1 = new Date(2002, 1, 1);
        ArrayList<String> reglas1 = new ArrayList<String>();
        ArrayList<String> tags1 = new ArrayList<String>();

        Evento event = new Evento();
        event.setIdEvento(UUID.randomUUID().toString());
        event.setTituloEvento("GranDiesta");
        event.setFechaEvento(firstDate1);
        event.setDescripcionEvento("DescripcionEvento1");
        event.setReglaEvento(reglas1);
        event.setRecomendacionEvento("123434Reco");
        event.setUbicacionEvento("123Ubi");
        event.setDirccionEvento("123Direc");
        event.setTagsEvento(tags1);*/

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("Evento").child(evento.getIdEvento()).setValue(evento);
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