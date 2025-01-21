public class Matrices {
    public static void main(String[] args) {
        //declacion
        int[][] Numeros = new int[5][3];
        int[][] Copia = new int[5][3];
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

        //Recorrido
        for (int f=0;f<Numeros.length;f++)
        {
            for (int c=0;c<Numeros[0].length;c++)
            {
                System.out.print(Numeros[f][c] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Valores de la matriz copia");
        System.arraycopy(Numeros,0,Copia,0,Numeros.length);
        //Recorrido de la matriz copia
        for (int f=0;f<Copia.length;f++)
        {
            for (int c=0;c<Copia[0].length;c++)
            {
                System.out.print(Copia[f][c] + "\t");
            }
            System.out.print("\n");
        }

    }
}
