package com.levm.postwork02.entity;

public class Persona {
    private String nombreCompleto;
    private String  numeroTelefono;

    public Persona() {
    }

    public Persona(String nombreCompleto, String numeroTelefono) {
        this.nombreCompleto = nombreCompleto;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}
