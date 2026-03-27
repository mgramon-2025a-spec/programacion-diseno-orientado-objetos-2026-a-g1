package com.corhuila.poo.semana7;

import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {
        List<Envio> envios = new ArrayList<>();
        envios.add (new EnvioEstandar("7667564",5));
        envios.add (new EnvioExpress("6454543",2));
        envios.add (new EnvioInternacional("1233355",6.3,"Italia"));

        double total = 0;
        for (Envio e : envios) {
            System.out.println(e.resumen ());
            total += e.costo();
        }
        System.out.println("Costo total =" + total);
    }
}
