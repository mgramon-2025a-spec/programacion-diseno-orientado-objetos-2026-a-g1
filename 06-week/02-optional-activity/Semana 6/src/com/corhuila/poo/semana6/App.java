package com.corhuila.poo.semana6;

import java.sql.SQLOutput;

public class App {
    public void main(String[] args) {
        Persona p = new Persona (87265, "María Pérez","maríaP@gmail.com");
        Docente d = new Docente (13135, "Margarita Rodrigo", "rmrgarita@gmail.com", "Matemáticas");
        Administrativo a = new Administrativo (12132, "Daniel Lopez", "dlopez@gmail.com", "Contador");

        System.out.println (p.ficha());
        System.out.println (d.fichaDocente());
        System.out.println (a.fichaAdministrativa());

    }
}
