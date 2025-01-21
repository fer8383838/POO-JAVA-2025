package main;
import modelos.*;
import utilidades.*;

import utilidades.CalculadoraImpuestos;

public class Main {

    public static void showInfo(Vehiculo vehiculo){
        vehiculo.mostrarInfo();
    }

    public static void showImpuesto(Vehiculo vehiculo){
        vehiculo.getPrecio();
    }

    public static void main(String[] args) {

        /*Vehiculo auto1 = new Vehiculo("Toyota", "Corolla", 20000);
        auto1.mostrarInfo();*/

        Auto auto1 = new Auto("Toyota", "Corolla", 20000, "Sedán");
        showInfo(auto1);
        CalculadoraImpuestos.calcularImpuesto(auto1);

        // Crear una instancia de Auto
        //Auto auto1 = new Auto("Toyota", "Corolla", 20000, "Sedán");

        Moto moto1 = new Moto("Yamaha", "MT-07",700, 689);
        showInfo(moto1);
        CalculadoraImpuestos.calcularImpuesto(moto1);


    }
}
