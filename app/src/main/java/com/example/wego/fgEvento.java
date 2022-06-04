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
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fgEvento#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fgEvento extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fgEvento() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fgEvento.
     */
    // TODO: Rename and change types and number of parameters
    public static fgEvento newInstance(String param1, String param2) {
        fgEvento fragment = new fgEvento();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    EditText titulo,hora,fecha,descripcion,regla,recomendacion,ubicacion,direccion,tags;
    Button crear;
    ImageView imagenEvento;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fg_evento, container, false);
        View view = inflater.inflate(R.layout.fragment_fg_evento,container, false);
        titulo=view.findViewById(R.id.txtTitulo);
        hora=view.findViewById(R.id.txtHora);
        fecha=view.findViewById(R.id.txtFecha);
        descripcion=view.findViewById(R.id.txtDescripcion);
        regla=view.findViewById(R.id.txtRegla);
        recomendacion=view.findViewById(R.id.txtRecomendaciones);
        ubicacion=view.findViewById(R.id.txtUbicacion);
        direccion=view.findViewById(R.id.txtDireccion);
        tags=view.findViewById(R.id.txtEtiqueta);
        crear=view.findViewById(R.id.btnCrear);
        imagenEvento=view.findViewById(R.id.imgEvento);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}