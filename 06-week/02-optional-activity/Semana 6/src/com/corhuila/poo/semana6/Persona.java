package com.corhuila.poo.semana6;

public class Persona {
    private int documento;
    private String  nombre;
    private String correo;

    public Persona (int documento, String nombre, String correo) {
        setDocumento (documento);
        setNombre (nombre);
        setCorreo (correo);
    }
    public int getDocumento () {
        return documento;
    }
    public void setDocumento (int documento) {
        if (documento <= 0) {
            throw new IllegalArgumentException("El documento no úede estar en negativo");
        }
    this.documento = documento;
    }
    public String getNombre () {
        return nombre;
    }
    public void setNombre (String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Poner la información del nombre");
        }
        this.nombre = nombre;
    }
    public void setCorreo (String correo) {
        if (correo == null || !correo.contains("@")) {
           throw new IllegalArgumentException("Cambiar el correo");
        }
        this.correo = correo.trim();
    }
    public String ficha () {
        return "Persona {documento=" + documento + ", nombre=" + nombre + ", correo=" + correo +"}";
    }
}
