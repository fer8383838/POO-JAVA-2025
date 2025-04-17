package cuenta;

public class Cuenta {

    private int id;
    private String nombre;
    private double saldo;


    public Cuenta(int id, String nombre, double saldo){
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }


    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getSaldo(){
        return this.saldo;
    }


    @Override
    public String toString(){
        return this.id + " | " + this.nombre +" | Saldo: " + this.saldo;
    }
}
