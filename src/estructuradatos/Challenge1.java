package estructuradatos;


import java.util.Scanner;
public class Challenge1 {
    public static void main (String[] args){
        Scanner lectura=new Scanner (System.in);
        int p;
        double [] notes;
        double prom,more;
        more=0;
        System.out.println("digite la cantidad de notas a evaluar.");
        p=lectura.nextInt();
        notes=new double [p];
        for ( int i=0; i<p;i++){
            System.out.println("digite la nota de la posicion "+(i+1));
            notes[i]=lectura.nextDouble();
            more=more+notes[i];
            prom=more/p;
        }
        lectura.close();



    }
}