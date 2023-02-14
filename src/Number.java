 import java.util.Scanner;

    public class Number {
        public static void main(String[] args) throws Exception {
            int number,number2,suma,resta;
            Scanner lectura = new Scanner(System.in);
            System.out.println("ingrese el primer numero");
           number=lectura.nextInt();
           System.out.println("ingrese el segundo numero");
           number2=lectura.nextInt();
           if(number>number2) {
           suma = number + number2;
           System.out.println("la suma es:"+ suma);
           }
           else { 
            resta = number-number2;
                System.out.println("su resta es"+ resta);
    
        }
    
           
    
         
        
          
        
            lectura.close();
        }
    }
    

