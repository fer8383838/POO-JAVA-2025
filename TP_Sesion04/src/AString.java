import java.util.Arrays;

public class AString {
    public static void main(String[] args) {
        String[] Ciudades = {"Tumbes","Piura","Chiclayo","Trujillo","Lima","Ica","Tacna"};
        String[] Copia = new String[7];
        boolean Rpta;

        System.out.println("El contenido del array es: ");
        for(String Var: Ciudades)   //recorriendo con un foreach
        {
            System.out.println(Var);
        }

        //copio el contenido de Ciudades en COPIA
        System.arraycopy(Ciudades,0,Copia,0,Ciudades.length);

        //Comparar Arreglos
        Rpta=Arrays.equals(Ciudades,Copia);
        if(Rpta==true)
            System.out.println("Los Arrays si son iguales");
        else
            System.out.println("Los Arrays son diferentes");


        System.out.println("El contenido del array COPIA es: ");
        for(String Var: Copia)   //recorriendo con un foreach
        {
            System.out.println(Var);
        }

        //Ordenar el array Ciudades
        Arrays.sort(Ciudades);
        System.out.println("El Array Ciudades ORDENADO: ");
        for(String Var: Ciudades)   //recorriendo con un foreach
        {
            System.out.println(Var);
        }

        //Comparar Arreglos
        Rpta=Arrays.equals(Ciudades,Copia);
        if(Rpta==true)
            System.out.println("Los Arrays si son iguales");
        else
            System.out.println("Los Arrays son diferentes");
    }
}
