package com.example.wego.Clases;




import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private String idEvento;
    public String tituloEvento;
    //private Date fechaEvento;
    private String fechaEvento;
    //private Time horaEvento;
    private String horaEvento;
    private String descripcionEvento;
    private String reglaEvento;
    private String recomendacionEvento;
    private String ubicacionEvento;
    private String dirccionEvento;
    private String referenciaEvento;
    private String tagsEvento;


    public Evento(String idEvento, String tituloEvento, String fechaEvento, String horaEvento, String descripcionEvento, String reglaEvento, String recomendacionEvento, String ubicacionEvento, String dirccionEvento, String referenciaEvento, String tagsEvento) {
        this.idEvento = idEvento;
        this.tituloEvento = tituloEvento;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
        this.descripcionEvento = descripcionEvento;
        this.reglaEvento = reglaEvento;
        this.recomendacionEvento = recomendacionEvento;
        this.ubicacionEvento = ubicacionEvento;
        this.dirccionEvento = dirccionEvento;
        this.referenciaEvento = referenciaEvento;
        this.tagsEvento = tagsEvento;
    }

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

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public String getReglaEvento() {
        return reglaEvento;
    }

    public void setReglaEvento(String reglaEvento) {
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

    public String getReferenciaEvento() {
        return referenciaEvento;
    }

    public void setReferenciaEvento(String referenciaEvento) {
        this.referenciaEvento = referenciaEvento;
    }

    public String getTagsEvento() {
        return tagsEvento;
    }

    public void setTagsEvento(String tagsEvento) {
        this.tagsEvento = tagsEvento;
    }
}
