import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) throws Exception {
        int number,number2,resultado,op;
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
       number=lectura.nextInt();
       System.out.println("ingrese el segundo numero");
       number2=lectura.nextInt();
       System.out.println("ingrese el numero de la opcion que desea");
       System.out.println("(1)suma");
       System.out.println("(2)resta");
       System.out.println("(3)multiplicacion");
       System.out.println("(4)division");
       System.out.println("(5)potencia");
       System.out.println("(6)raizcuadrada");
       op=lectura.nextInt();
       
       switch (op){ 
       case 1:
       resultado=number+number2;
       System.out.println("el resultado de la suma es" +number+ "y"+number2+ "es" +resultado);
       break;
       case 2:
       resultado=number-number2;
       System.out.println("el resultado de la resta  es" +number+ "y"+number2+ "es" +resultado);
       break;
       case 3:
       resultado=number*number2;
       System.out.println ("el resultado de la multiplicacion es" +number+ "y"+number2+ "es" +resultado);
       break;
       case 4:
       resultado=number/number2;
       System.out.print("el resultado de la division es" +number+ "y"+number2+ "es" +resultado);
       break;
       case 5:
       double resultadopow=Math.pow(number,number2);
       System.out.print("el resultado de la potencia es" +number+ "y"+number2+ "es" +resultadopow);
       break;
       case 6:
       double resultadoSqrt=Math.sqrt(number);
       double resultadoSqrt2=Math.sqrt(number2);
       System.out.println("la raiz cuadrada de"+number+ "es"+resultadoSqrt);
       System.out.println("la raiz cuadrada de"+number+ "es"+resultadoSqrt2);
       break;
       default:
       System.out.println("la operacion no es valida");
    }
    lectura.close();
}
}