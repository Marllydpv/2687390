
import java.util.Scanner;
public class Conta{
    public static void main(String[] args) {
        int precio,cantidad,contador,subtotal,acumulador,paga,cambio,exito;
        Scanner lectura = new Scanner(System.in);
        contador=0;
        acumulador=0;
        for (int x=1; x<=5; x++){
        System.out.println("digite el precio del producto");
        precio=lectura.nextInt();
        System.out.println("digite la cantidad del producto");
        cantidad=lectura.nextInt();
        contador=contador+1;
          subtotal=precio*cantidad;
          acumulador=acumulador+subtotal;
    }
    System.out.println("el valor a pagar es:"+acumulador);
    System.out.println("ingrese la cantidad con la que va a pagar");
    paga=lectura.nextInt();
    cambio = acumulador-paga;
    System.out.println("su cambio es : $ "+cambio);
    System.out.println("usted cuenta con telefonia movil exito? (1)si,(2)no");
    exito=lectura.nextInt();
    if(exito==1){
        System.out.println("minutos obtenidos:"+contador+"min");
    }
    else if (exito==2)
    {
        System.out.println("no pierdas mas minutos,asquiere ya tu telefonia movil");
    }
    else  {
        System.out.println("opcion no valida");
    }

    lectura.close();
}
    }
