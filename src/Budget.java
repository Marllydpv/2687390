import java.util.Scanner;

public class Budget {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
       double ancho, largo , presupuesto,area;
        System.out.println("ingrese el ancho");
        ancho = lectura.nextDouble();
        System.out.println("ingrese el largo");

        largo = lectura.nextDouble();
    
        area = largo * ancho ;
        presupuesto = 45000 * area ;
        System.out.println("la superficie tiene"+ancho+"metros de ancho x"+largo+"metros de largo"+presupuesto+"del proyecto es"+area);


    
        lectura.close();
    }
}