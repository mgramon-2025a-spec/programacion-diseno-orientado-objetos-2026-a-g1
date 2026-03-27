package com.corhuila.poo.semana6;

public class Administrativo extends Persona {
    private String cargo;
    public Administrativo (int documento, String nombre, String correo, String cargo) {
       super (documento, nombre, correo);
       setCargo (cargo);
    }
    public String getCargo () {
        return cargo;
    }
    public void setCargo (String cargo) {
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new IllegalArgumentException ("Llene la información sobre el cargo");
        }
        this.cargo =cargo.trim();
    }
    public String fichaAdministrativa () {
        return ficha () + ", Administrativo {cargo =" +cargo + "}";
    }
}
