package personas;

public class Cliente extends Persona{

    private static int contCliente;
    private int id;
    private int numPedidos;

    public Cliente(String nombre){
        super(nombre);
        this.id = ++contCliente;
        this.numPedidos = 0;
    }

    public void incrementarPedidos(){
        numPedidos++;
    }

    public int getNumPedidos() {
        return numPedidos;
    }

    public int getId() {
        return id;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("Id: "+id);
        System.out.println("Numero de pedidos: "+ numPedidos);
    }

}
