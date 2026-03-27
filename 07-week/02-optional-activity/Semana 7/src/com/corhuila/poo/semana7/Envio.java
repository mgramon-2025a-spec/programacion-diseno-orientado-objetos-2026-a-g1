package com.corhuila.poo.semana7;

public class Envio {
    private String codigo;
    private double pesoKg;

    public Envio (String codigo, double pesoKg) {
        setCodigo (codigo);
        setPesoKg (pesoKg);
    }

    public String setCodigo () {
        return this.codigo;
    }

    public void setCodigo (String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Llene la información del código");
        }
        this.codigo = codigo.trim();
    }

    public double getPesoKg () {
        return pesoKg;
    }

    public void setPesoKg (double pesoKg) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException ("El peso necesita ser mayor a 0");
        }

        this.pesoKg = pesoKg;
    }

    public double costo () {
        return 0;
    }

    public String resumen () {
        return "Envio {código =" + codigo + ", peso =" + pesoKg + "}";
    }
}
