package vehiculo;
import propietario.*;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private Propietario propietario;

    public Vehiculo(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.propietario = null;

    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getPlaca(){
        return this.placa;
    }
    public Propietario getPropietario(){
        return this.propietario;
    }
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;

    }
}
