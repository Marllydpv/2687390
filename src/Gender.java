import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Gender {
    public static void main(String[] args) throws ExecutionException {
        int hombre,mujer,genero;
        Scanner lectura = new Scanner(System.in);

      

        hombre=0;
        mujer=0;
        for(int x=1; x<=5 ; x++) {
            System.out.println(" digite si eres : (1)hombre, (2)mujeres ");
            genero = lectura.nextInt();

            if(genero==1){
                hombre = hombre + 1 ;

            }
            else if(genero==2){
                mujer = mujer+1;
            }
            else{
                System.out.println(" opcion no valida no seras contado ");
            }
        }
        System.out.println(" la cantidad de hombres es de "+ hombre);
        System.out.println(" la cantidad de mujeres es de "+mujer);
    }
}


