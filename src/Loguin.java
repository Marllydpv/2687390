import java.io.EOFException;

import java.util.Scanner;
public class Loguin {
   
    public static void main(String[] args) throws EOFException {
        Scanner lectura= new Scanner(System.in); 
        String name,password;
        System.out.println(" por favor ingrasa tu nombre  ");
         name= lectura.nextLine();
         System.out.println(" por favor ingresa tu contraseña  ");
         password= lectura.nextLine();
         
        
        if(name.equals("Santiago") && password.equals( "123")) {
            System.out.println("Bienvenido al sistema");

        }
        else if (name.equals( "Santiago")){
            System.out.println(" Parece que olvidaste las credenciales de acceso ");
        }

        else if (password.equals( "123")){
                System.out.println(" Algo pasa con tus datos de acceso");
        }

        else{
                    System.out.println("acceso denegado"); 
                }
        
      lectura.close();
    }
}
