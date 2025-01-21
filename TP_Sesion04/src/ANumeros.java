//Llenar 40 numeros aleatoriamente y mostrar su suma promedio y el mayor de ellos
public class  ANumeros{
    public static void main(String[] args) {
        int Suma=0;
        int Mayor;
        int[] Numeros = new int[20];
        float Promedio;

        //llenar el array
        for (int j=0;j<Numeros.length;j++)
        {
            Numeros[j] = (int)(Math.random()*200);
        }

        System.out.println("Los valores del array son:");
        Mayor=Numeros[0];
        for (int j=0;j<Numeros.length;j++)
        {
            if(Numeros[j]>Mayor)
            {
                Mayor=Numeros[j];
            }
            Suma+=Numeros[j];       //Suma=Suma+Numeros[j];
            System.out.printf("Numeros[%d] es: %d  \n",j,Numeros[j]);
        }
        Promedio=(Suma/Numeros.length);
        System.out.printf("La suma de los %d numeros es: %d \n", Numeros.length, Suma);
        System.out.printf("El promedio de los %d numeros es: %.1f \n", Numeros.length, Promedio);
        System.out.printf("El mayor de los %d numeros es: %d \n", Numeros.length, Mayor);
    }
}
