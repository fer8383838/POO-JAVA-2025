package gestion;
import vehiculo.*;
import propietario.*;

public class Main {
    public static void main(String[] args) {

        GestorVehiculos gestor = new GestorVehiculos();

        Propietario propietario1 = new Propietario("Fer", "7374");
        Propietario propietario2 = new Propietario("Mon", "3123");
        Propietario propietario3 = new Propietario("gty", "6657");


        gestor.registrarPropietarios(propietario1);
        gestor.registrarPropietarios(propietario2);
        gestor.registrarPropietarios(propietario3);



        Vehiculo vehiculo1 = new Vehiculo("honda", "sedan", "4345");
        Vehiculo vehiculo2 = new Vehiculo("toyota", "frontier", "43553");
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Cobra", "4353");

        gestor.registrarVehiculo(vehiculo1);
        gestor.registrarVehiculo(vehiculo2);
        gestor.registrarVehiculo(vehiculo3);

        gestor.asignarPropietarios("4353",propietario1);
        gestor.asignarPropietarios("43553", propietario2);
        gestor.asignarPropietarios("4345", propietario3);

        gestor.mostrarVehiculos();

    }
}
