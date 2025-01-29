package gestion;

import propietario.Propietario;
import vehiculo.Vehiculo;

public class GestorVehiculos {

    private Vehiculo[] vehiculo = new Vehiculo[10];
    private Propietario [] propietario = new Propietario[10];
    private int contadorVehiculos = 0;
    private int contadorPropietarios = 0;


       public void registrarPropietarios(Propietario propietario) {

           if (contadorPropietarios < 10) {
                this.propietario[contadorPropietarios] =  propietario;
                contadorPropietarios++;

            }else{
               System.out.println("No se permite asignar más usuarios");
           }
       }

       public void registrarVehiculo(Vehiculo vehiculo){
           if(contadorVehiculos < 10){
               this.vehiculo[contadorVehiculos] = vehiculo;
               contadorVehiculos++;
           }else{
               System.out.println("No se pueden asignar más vehiculos");
           }
       }

       public void asignarPropietarios(String placa, Propietario propietario){
           System.out.println("Lista de propietarios");
           for(int i = 0; i < contadorPropietarios; i++){
               if(this.vehiculo[i].getPlaca().equalsIgnoreCase(placa)){

                   this.vehiculo[i].setPropietario(propietario);
                   System.out.println((i + 1) + ". Nombre: " + propietario.getNombre() + "    ||    Dni: " + propietario.getDni() + "    ||    Placa: " +placa);
                return;
               }
           }
           System.out.println("No se encontro un vehiculo con la placa");
       }


       public void mostrarVehiculos(){
           System.out.println("Vehiculos registrados: ");
           for(int i = 0; i < contadorVehiculos; i++){

               Vehiculo vehiculo = this.vehiculo[i];
               System.out.println("Marca: "+vehiculo.getMarca()+ " || Placa: "+vehiculo.getPlaca()+" || Placa"+vehiculo.getPlaca());
               if(vehiculo.getPropietario() != null){
                   System.out.println("Propietario: "+vehiculo.getPropietario().getNombre());
               }else{
                   System.out.println("Sin propietario registrado");
               }
           }
       }

}
