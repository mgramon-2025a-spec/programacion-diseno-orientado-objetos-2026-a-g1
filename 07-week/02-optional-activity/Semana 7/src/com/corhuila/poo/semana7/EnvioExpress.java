package com.corhuila.poo.semana7;

public class EnvioExpress extends Envio{
    public EnvioExpress (String codigo, double pesoKg) {
        super(codigo, pesoKg);
    }
    @Override
    public double costo () {
        return 15000 + (getPesoKg () * 3500);
    }
    @Override
    public String resumen () {
        return super.resumen() + "tipo = Express, costo = " + costo();
    }
}
