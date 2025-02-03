package persona;

public class Cliente extends Usuario{

    private int librosPrestados;

    public Cliente(String nombre, String id, int librosPrestados){
        super(nombre,id);
        this.librosPrestados = librosPrestados;
    }

    public void prestarLibro(){
        this.librosPrestados++;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Informacion del cliente");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Id: "+this.id);
        System.out.println("Libros prestados: "+ this.librosPrestados);
        System.out.println("");
    }

}
