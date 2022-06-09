package com.example.wego.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.wego.Clases.Evento;
import com.example.wego.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



public class ListAdapterHoy extends ArrayAdapter<Evento> {

    private List<Evento> eventList;
    private Context context;
    private int resourceLayout;

    public ListAdapterHoy(@NonNull Context context, int resource, @NonNull List<Evento> objects) {
        super(context, resource, objects);
        this.context = context;
        this.eventList = objects;
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.evento_cardview, null);
        }

        Evento evento = eventList.get(position);

        TextView txtTitulo = view.findViewById(R.id.cardTitulo);
        txtTitulo.setText(evento.getTituloEvento());

        TextView txtDescripcion = view.findViewById(R.id.cardDescripcion);
        txtDescripcion.setText(evento.getDescripcionEvento());

        TextView txtFecha = view.findViewById(R.id.cardFecha);

        //Convertir Date to String
        //Date date = evento.getFechaEvento();
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        //String strDate = dateFormat.format(date);
        //txtDescripcion.setText(strDate);


        return view;
    }
}
