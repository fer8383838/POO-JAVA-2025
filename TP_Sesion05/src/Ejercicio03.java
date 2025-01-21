//Ingrese 15 números en un arreglo de dos dimensiones(matriz) de 5x3 y obtenga la suma de los números
// ingresados en filas y columnas.
public class Ejercicio03 {
    public static void main(String[] args) {
        int[][] Numeros = new int[5][3];
        int Sumaf=0, Sumac=0;
        double Promedio;
        //llenado de la matriz
        Numeros[0][0]=80;
        Numeros[0][1]=17;
        Numeros[0][2]=12;
        Numeros[1][0]=19;
        Numeros[1][1]=73;
        Numeros[1][2]=18;
        Numeros[2][0]=21;
        Numeros[2][1]=16;
        Numeros[2][2]=3;
        Numeros[3][0]=18;
        Numeros[3][1]=12;
        Numeros[3][2]=37;
        Numeros[4][0]=95;
        Numeros[4][1]=31;
        Numeros[4][2]=38;

        for (int f=0;f<Numeros.length;f++)
        {
            Sumaf=0;
            for (int c=0;c<Numeros[0].length;c++)
            {
                System.out.printf("%d\t\t",Numeros[f][c]);
                Sumaf+=Numeros[f][c];
            }
            System.out.printf("%d\n",Sumaf);
        }

        for (int c=0;c<Numeros[0].length;c++)
        {
            Sumac=0;
            for (int f=0;f<Numeros.length;f++)
            {
                Sumac+=Numeros[f][c];
            }
            System.out.printf("%d\t\t",Sumac);
        }
    }
}
