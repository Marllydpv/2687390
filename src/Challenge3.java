import java.util.Scanner;
public class Challenge3 {
    public static void main(String[] args) throws Exception {
int stamp,dato;
        stamp=(int)(Math.random()*2+1);
 Scanner lectura = new Scanner(System.in);
 System.out.println("elija cara o sello, donde 2 es cara y 1 es sello");
 dato=lectura.nextInt();

if (stamp==dato) {
    System.out.println("ganó" );

}


else
{
    System.out.println( "perdio");
}

 lectura.close();
}

}