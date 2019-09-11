package com.osvaldovillalobosperez.objetosactivities;

import android.text.Editable;

import java.io.Serializable;

public class Contacto implements Serializable {

    public String usuario;
    public String email;
    public String twitter;
    public String telefono;
    public String fechaNacimiento;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Contacto(String usuario, String email, String twitter, String telefono, String fechaNacimiento) {
        this.usuario = usuario;
        this.email = email;
        this.twitter = twitter;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }
}
