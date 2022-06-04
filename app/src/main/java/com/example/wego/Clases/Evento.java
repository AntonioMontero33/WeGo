package com.example.wego.Clases;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private String idEvento;
    private String tituloEvento;
    private Date fechaEvento;
    private Time horaEvento;
    private String descripcionEvento;
    private ArrayList<String> regla;
    private String recomendacion;
    private String ubicacion;
    private String dirccion;
    private ArrayList<String> tags;

    public Evento() {
    }

    /*public Evento(String idEvento, String tituloEvento, Date fechaEvento, Time horaEvento, String descripcionEvento, String regla, String recomendacion, String ubicacion, String dirccion, String tags) {
        this.idEvento = idEvento;
        this.tituloEvento = tituloEvento;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
        this.descripcionEvento = descripcionEvento;
        this.regla = regla;
        this.recomendacion = recomendacion;
        this.ubicacion = ubicacion;
        this.dirccion = dirccion;
        this.tags = tags;
    }*/

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public Time getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(Time horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public ArrayList<String> getRegla() {
        return regla;
    }

    public void setRegla(ArrayList<String> regla) {
        this.regla = regla;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDirccion() {
        return dirccion;
    }

    public void setDirccion(String dirccion) {
        this.dirccion = dirccion;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
