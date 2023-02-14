import java.util.Scanner;

    public class Identify {
        public static void main(String[] args) throws Exception {
            int number;
            Scanner lectura = new Scanner(System.in);
            System.out.println("ingrese el  numero");
           number=lectura.nextInt();
           if(number>0) {
        System.out.println("el numero es positivo");
           }
           else if (number==0) { 
            
                System.out.println("el numero es neutro");
            }
            
                else { 
                    System.out.println("el numero es negativo");

        }
   
        
        lectura.close();
    }
}

    