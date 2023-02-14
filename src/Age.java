
import java.util.Scanner;

public class Age {
    public static void main(String[] args) throws Exception {
        int age;
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese su edad");
       age=lectura.nextInt();
       if(age>=18) {
        System.out.println("Bienvenido siga");
       }
       else {
            System.out.println("pa la casa");

    }

       

     
    
      
    
        lectura.close();
    }
}