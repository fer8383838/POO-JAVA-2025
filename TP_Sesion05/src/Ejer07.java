public class Ejer07 {
    public static void main(String[] args) {

        int[][] Matriz = {{19, 71, 6},{5, 26, 93},{36, 45, 2},{76, 15, 31}};
        int Mayor;

        for (int f =0; f< Matriz.length; f++){
            for (int c=0; c<Matriz[0].length; c++){
                System.out.printf("%d\t",Matriz[f][c]);
            }
            System.out.print("\n");
        }

        for (int c=0; c<Matriz[0].length;  c++){
            Mayor=Matriz[0][c];
            for (int f=0; f<Matriz.length; f++){
                if(Matriz[f][c]>Mayor){
                    Mayor = Matriz[f][c];
                }
            }
            System.out.printf("%d\t",Mayor);
        }
    }
}
