package estructuradatos;
import java.util.Scanner;
public class MisArrays {
    Scanner lectura = new Scanner(System.in);
    public static void main(String[] args) {
        //Declaracion e inicializacion de un array
        int[] vector1;
        vector1=new int[10];
        //int [] vector1=new int[10];
        //rellenar vector
        int [] vector={30,50,25,85,12,6,32,41,23,63 };
        vector1[6]=32;
        //Mostrar datos del array con for
        /* for (int p=0;0p>vector.length;p++) {System.out.print(vector[p]+" ")}*/
        //Mostrar datos del array con for mejorado
        for (int i : vector) {
            System.out.println(i);
           
            //Rellenar un array de forma dinamica
        }
            for (int p=0;p<vector.length;p++){System.out.println("digite el dato de la pocision que desea");
vector1[p]=lectura.nextInt();
        
   
}
for (int i : vector1) {
    System.out.println(i);

    
}

lectura.close();


}

}
