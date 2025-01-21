import java.util.*;


public class Ejercicio2Arrays {


    public  static  void main( String[] args){
        String producto ;
        Double precio;
        Double total=0.0 ;
        List<String>listproductos= new  ArrayList<String>();
        List<Double>listprecioproducto= new  ArrayList<Double>();

        for(int i=1;i<=5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el nombre del producto"+i+" : ");
            producto =  sc.nextLine();
           // sc.next();
            listproductos.add(producto);

            System.out.print("Introduzca el precio del producto"+i+" : ");
            precio =sc.nextDouble();
            listprecioproducto.add(precio);

        }

        //System.out.println(listproductos);
        //System.out.println(listprecioproducto);
        System.out.println("--------BOLETA DE VENTA-----------");
        for(int i=0; i<listproductos.size(); i++){

            System.out.println(listproductos.get(i) +" -> "+ listprecioproducto.get(i));
            total=total+listprecioproducto.get(i);
        }
        System.out.println("-------------------");
        //System.out.println("TOTAL:  "+total);
        System.out.println(String.format("%.2f", total));


    }
}