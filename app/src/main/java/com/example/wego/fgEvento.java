package com.example.wego;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.wego.Clases.Evento;
import com.example.wego.Clases.Usuario;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


public class fgEvento extends Fragment {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    TextView crear,tituloevento,hora,descripcion,reglas ,recomendaciones,ubicacion, direccion,referencia, tags,fecha;
    ImageButton btncrear;


    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootview = inflater.inflate(R.layout.fragment_fg_evento, container, false);
        inicializarFirebase();


        crear = rootview.findViewById(R.id.txtCrear);
        tituloevento=rootview.findViewById(R.id.txtTitulo);
        hora=rootview.findViewById(R.id.txtHora);
        descripcion=rootview.findViewById(R.id.txtDescripcion);
        reglas=rootview.findViewById(R.id.txtRegla);
        recomendaciones=rootview.findViewById(R.id.txtRecomendaciones);
        ubicacion=rootview.findViewById(R.id.txtUbicacion);
        direccion=rootview.findViewById(R.id.txtDireccion);
        referencia=rootview.findViewById(R.id.txtReferencia);
        tags=rootview.findViewById(R.id.txtEtiqueta);
        fecha=rootview.findViewById(R.id.txtFecha);
        btncrear=rootview.findViewById(R.id.btnCrear);

        /*Date firstDate1 = new Date(2002, 1, 1);
        ArrayList<String> reglas1 = new ArrayList<String>();
        ArrayList<String> tags1 = new ArrayList<String>();*/

        /*Evento event = new Evento();
        event.setIdEvento(UUID.randomUUID().toString());
        event.setTituloEvento("GranDiesta");
        event.setFechaEvento("24/03/22");
        event.setHoraEvento("10:00");
        event.setDescripcionEvento("DescripcionEvento1");
        event.setReglaEvento("ir con toda la actitud");
        event.setRecomendacionEvento("123434Reco");
        event.setUbicacionEvento("123Ubi");
        event.setDirccionEvento("123Direc");
        event.setTagsEvento("#loquerio");*/

        btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tituloEvento=tituloevento.getText().toString();
                String fechaEvento=fecha.getText().toString();
                String horaEvento=hora.getText().toString();
                String descripcionEvento=descripcion.getText().toString();
                String reglaEvento= reglas.getText().toString();
                String recomendacionEvento=recomendaciones.getText().toString();
                String ubicacionEvento=ubicacion.getText().toString();
                String direccionEvento=direccion.getText().toString();
                String referenciaEvento=referencia.getText().toString();
                String tagsEvento=tags.getText().toString();


                if(tituloEvento.equals("")||fechaEvento.equals("")||horaEvento.equals("")||descripcionEvento.equals("")||reglaEvento.equals("")||recomendacionEvento.equals("")||ubicacionEvento.equals("")||direccionEvento.equals("")||referenciaEvento.equals("")||tagsEvento.equals("")){
                    validacion();
                }
                else {
                    Evento evento = new Evento();
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
                    evento.setTagsEvento(tagsEvento);
                    databaseReference.child("Evento").child(evento.getIdEvento()).setValue(evento);
                    limpiarcajas();
                }
            }
        });
        return rootview;
    }

    private void limpiarcajas() {
        tituloevento.setText("");
        fecha.setText("");
        hora.setText("");
        descripcion.setText("");
        reglas.setText("");
        recomendaciones.setText("");
        ubicacion.setText("");
        direccion.setText("");
        referencia.setText("");
        tags.setText("");

    }

    private void validacion() {
        String tituloEvento=tituloevento.getText().toString();
        String fechaEvento=fecha.getText().toString();
        String horaEvento=hora.getText().toString();
        String descripcionEvento=descripcion.getText().toString();
        String reglaEvento= reglas.getText().toString();
        String recomendacionEvento=recomendaciones.getText().toString();
        String ubicacionEvento=ubicacion.getText().toString();
        String direccionEvento=direccion.getText().toString();
        String referenciaEvento=referencia.getText().toString();
        String tagsEvento=tags.getText().toString();
        if(tituloEvento.equals("")){
            tituloevento.setError("Requerido");
        }
        if(fechaEvento.equals("")){
            fecha.setError("Requerido");
        }
        if(horaEvento.equals("")){
            hora.setError("Requerido");
        }
        if(reglaEvento.equals("")){
            reglas.setError("Requerido");
        }
        if(descripcionEvento.equals("")){
            descripcion.setError("Requerido");
        }
        if(recomendacionEvento.equals("")){
            recomendaciones.setError("Requerido");
        }
        if(ubicacionEvento.equals("")){
            ubicacion.setError("Requerido");
        }
        if(direccionEvento.equals("")){
            direccion.setError("Requerido");
        }
        if(referenciaEvento.equals("")){
            referencia.setError("Requerido");
        }
        if(tagsEvento.equals("")){
            tags.setError("Requerido");
        }
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(getContext());
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();


    }
}