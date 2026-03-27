package com.corhuila.poo.semana7;

public class EnvioEstandar extends Envio{
    public EnvioEstandar (String codigo, double pesoKg) {
        super(codigo, pesoKg);
    }
    @Override
    public double costo() {
        return 8000 + (getPesoKg() + 2000);
    }
    @Override
   public String resumen () {
        return super.resumen () + ", tipo = Estandar, costo = " + costo();
    }
}
