package com.corhuila.poo.semana6;

public class Docente extends Persona {
    private String asignatura;
    public Docente (int documento, String nombre, String correo, String asignatura) {
        super (documento, nombre, correo);
        setAsignatura (asignatura);
    }
    public String getAsignatura () {
        return asignatura;
    }
    public void setAsignatura (String asignatura) {
        if (asignatura == null || asignatura.trim().isEmpty()) {
            throw new IllegalArgumentException("Llene la información de la asignatura");
        }
        this.asignatura = asignatura.trim();
    }
    public String fichaDocente () {
        return ficha() + ", Docente {asignatura=" + asignatura + "}";
    }
}
