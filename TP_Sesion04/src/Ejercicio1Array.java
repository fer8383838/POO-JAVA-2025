import java.util.Scanner;

public class Ejercicio1Array {
    public static void main(String[] args) {
    	System.out.println("========== Curso: TALLER DE PROGRAMACION ==========");
        RegistroNotas();
    }
    /*
       Ingreso de datos
    */
    public static void RegistroNotas(){
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        String nombre;

        double[][]Notas = new double[3][3];
        double[] promedios = new double[3];

        String[]Nombres = new String[3];
        for(int i = 0; i < Nombres.length; i ++){
            System.out.println("Ingrese el nombre del Alumno ");
            Nombres[i] = nombre = s.nextLine();

            // Pedir notas
            System.out.println("Ingrese Práctica Calificada 1 ");
            Notas[i][0] = sc.nextDouble();
            System.out.println("Ingrese Práctica Calificada 2 ");
            Notas[i][1] = sc.nextDouble();
            System.out.println("Ingrese Examen Final ");
            Notas[i][2] = sc.nextDouble();
            suma = Notas[i][0] + Notas[i][1] + Notas[i][2] ;

            double promedio = Math.round((suma / 3)*100.0)/100.0;
            promedios[i] = promedio;
            suma = 0;
        }

        ImprimirLibretaNotas(Nombres, Notas, promedios);

    }

    public static void ImprimirLibretaNotas(String Nombres[], double Notas[][], double promedios[]){
        Scanner s = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        String nombre, opcion = "S";
        System.out.println("///////////////////////////////////////////////////////////////////");
        System.out.println("Impresión de libretas de notas ");

        while(opcion.equals("S")) {
            System.out.print("Buscar por nombre del alumno ");
            nombre = s.nextLine();

            for (int f = 0; f < Nombres.length; f++) {
                if (Nombres[f].equals(nombre)) {
                    System.out.println("============== LIBRETA DE NOTAS ==============");
                    System.out.printf("Código  " + f + " \nNombre del Alumno: " + Nombres[f]);
                    System.out.println("");
                    System.out.println("Práctica Calificada 1   Práctica Calificad 2    Examen Final");
                    System.out.printf("%15.2f %18.2f %18.2f", Notas[f][0], Notas[f][1], Notas[f][2]);
                    System.out.println("");
                    System.out.println("===============================================");
                    System.out.printf("Promedio %.2f", promedios[f]);
                    System.out.println("");
                    if (promedios[f] > 12.5) {
                        System.out.println("APROBADO");
                        System.out.println("CONCLUIDO");
                    } else {
                        System.out.println("DESAPROBADO");
                    }
                }
            }
            System.out.println("");
            System.out.println("===============================================");
            System.out.println("Desea Continuar [S][N]");
            opcion = e.next();
            if(opcion.equals("N")) {
                break;
            }
        }

    }


}
