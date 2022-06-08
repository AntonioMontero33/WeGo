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
    private ArrayList<String> reglaEvento;
    private String recomendacionEvento;
    private String ubicacionEvento;
    private String dirccionEvento;
    private String referenciaEvento;
    private ArrayList<String> tagsEvento;

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

    public ArrayList<String> getReglaEvento() {
        return reglaEvento;
    }

    public void setReglaEvento(ArrayList<String> reglaEvento) {
        this.reglaEvento = reglaEvento;
    }

    public String getRecomendacionEvento() {
        return recomendacionEvento;
    }

    public void setRecomendacionEvento(String recomendacionEvento) {
        this.recomendacionEvento = recomendacionEvento;
    }

    public String getUbicacionEvento() {
        return ubicacionEvento;
    }

    public void setUbicacionEvento(String ubicacionEvento) {
        this.ubicacionEvento = ubicacionEvento;
    }

    public String getDirccionEvento() {
        return dirccionEvento;
    }

    public void setDirccionEvento(String dirccionEvento) {
        this.dirccionEvento = dirccionEvento;
    }

    public ArrayList<String> getTagsEvento() {
        return tagsEvento;
    }

    public void setTagsEvento(ArrayList<String> tagsEvento) {
        this.tagsEvento = tagsEvento;
    }

    public String getReferenciaEvento() {
        return referenciaEvento;
    }

    public void setReferenciaEvento(String referenciaEvento) {
        this.referenciaEvento = referenciaEvento;
    }
}
