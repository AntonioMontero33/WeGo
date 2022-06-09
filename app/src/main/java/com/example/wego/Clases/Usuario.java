package com.example.wego.Clases;

import java.util.ArrayList;

public class Usuario {
    private String idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String descripcionUsuario;
    private String correoUsuario;
    private String edadUsuario;
    private String conocidos;

    public Usuario(String idUsuario, String nombreUsuario, String apellidoUsuario, String descripcionUsuario, String correoUsuario, String edadUsuario, String conocidos) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.descripcionUsuario = descripcionUsuario;
        this.correoUsuario = correoUsuario;
        this.edadUsuario = edadUsuario;
        this.conocidos = conocidos;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(String edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public String getConocidos() {
        return conocidos;
    }

    public void setConocidos(String conocidos) {
        this.conocidos = conocidos;
    }
}
