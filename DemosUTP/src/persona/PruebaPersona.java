package persona;

public class PruebaPersona {
    public static void main (String[] args){
        var person1 =  new Persona("Fer", "Mon");

        person1.mostrarNombre();

        person1.setApellido("Fernando");
        person1.setNombre("Montero");
        System.out.println();
        System.out.println("Nombre: "+ person1.getNombre());
        System.out.println("Apellido: "+person1.getApellido());

    }
}
