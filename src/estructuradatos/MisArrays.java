package estructuradatos;
import java.util.Scanner;
public class MisArrays {
    public static void main (String[] args){
        Scanner lectura=new Scanner (System.in);

        //declaracion y inicializacion de un array
        int [] vector1;
        vector1= new int [10];
        //rellenar vector
        int [] vector={30,50,25,85,12,6,32,41,23,63};
        vector [6]=32;
        //mostrar datos al array con for
        /*for (int p=0; p<vector.length;p++){
            System.out.println(vector[p]);
        }*/
        // mostrar datos del array con for mejorado
        for (int i: vector){
            System.out.println(i);
        }
        //rellenar de forma dinamica
        for (int p=0; p<vector.length;p++){
            System.out.println("digite el dato de la posicion "+p);
            vector1[p]=lectura.nextInt();
        }
        for (int i: vector1){
            System.out.println(i);
        }
        lectura.close();
    }
}