/*Elaborar un programa para almacenar las notas(3) de los alumnos(10) de Taller de Programación, y
calcular sus respectivos promedios indicando si aprobaron o desaprobaron el curso.*/

import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int i = 0;

        do {
            String[] nombres = new String[10];
            System.out.printf("Ingrese nombre del alumno %d: \n",i+1);
            nombres[i] = sc.next();

            System.out.printf("Ingrese las notas del alumno %s \n", nombres[i]);
            int[] notas = new int[3];
            int e;
            for (e = 0; e < 3; ++e) {

                System.out.printf("Ingrese nota %d \n",e+1);
                notas[e] = sc.nextInt();
                while(notas[e] < 0 || notas[e] > 20){
                    System.out.println("Ingrese una nota valida");
                    notas[e] = sc.nextInt();
                }
            }
            System.out.println("Las notas del alumno son: ");
            for (int al:notas) {

                System.out.println(al);

            }
            float promedio = (notas[0]+notas[1]+notas[2])/3;
            System.out.printf("El promedio del alumno es %.2f \n", promedio);
            if (promedio >=12){
                System.out.println("El alumno APROBÓ");
            } else {
                System.out.println("El alumno DESAPROBÓ");
            }
            i++;
        } while (i<10);

        System.out.println("Proceso terminado");
        }
    }

