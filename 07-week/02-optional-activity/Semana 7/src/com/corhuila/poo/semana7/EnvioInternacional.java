package com.corhuila.poo.semana7;

public class EnvioInternacional extends Envio{
    private String pais;

    public EnvioInternacional (String codigo, double pesoKg, String pais) {
        super(codigo, pesoKg);
        setPais (pais);
    }

    public String getPais() {
        return pais;
    }

    public void setPais (String pais) {
        if (pais == null || pais.trim().isEmpty()) {
            throw new IllegalArgumentException("El país no puede estar vacío");
        }
        this.pais = pais.trim();
    }

    @Override
    public double costo () {
        return 30000 + (getPesoKg() * 6000);
    }
    @Override
    public String resumen () {
        return super.resumen() + "tipo = Internacional, destino =" + pais + ", costo =" +costo();
    }
}
