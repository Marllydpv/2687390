import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int number1, number2, resultado,name;
        System.out.println("ingrese un numero");
        number1 = lectura.nextInt();
        System.out.println("ingrese el otro numero");

        number2 = lectura.nextInt();
        resultado = lectura.nextInt();
        name = lectura.nextInt();

        resultado = number1 + number2;

        System.out.println("la suma entre es" + number1 + " y " + number2 + " es " + resultado);
        
        lectura.nextInt();
        System.out.println("ingrese su nombre");

       

        System.out.println("el nombre ingresado fue:" + name);

        lectura.close();
    }
}
