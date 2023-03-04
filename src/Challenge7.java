import java.util.Scanner;

public class Challenge7 {
   
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int value,desc,finalvalue;
        System.out.println(" ingrese el valor total de su compra  ");
        value=leer.nextInt();
        int number =(int) (Math.random()*(5-1)+1);

        if(value>50000) {
           if (number==1){System.out.println("has sido beneficiario de nuestro descuento de aniversario,has obtenido es de");
           desc=(value*10)/100;
           finalvalue=value-desc;
           System.out.println("el valor de descuento de tu compra es:"+desc+"y el valor total de tu compra es"+finalvalue);
        }
        else if(number==2){
            System.out.println("has sido beneficiario de nuestro descuento de aniversario,has obtenido es de");
            desc=(value*30)/100;
            finalvalue=value-desc;
            System.out.println("el valor de descuento de tu compra es:"+desc+"y el valor total de tu compra es"+finalvalue);
    }
    else if(number==3){
        System.out.println("has sido beneficiario de nuestro descuento de aniversario,has obtenido es de");
        desc=(value*50)/100;
        finalvalue=value-desc;
        System.out.println("el valor de descuento de tu compra es:"+desc+"y el valor total de tu compra es"+finalvalue);
}
else if(number==4){
        System.out.println("el valor  de tu compra es totalmente gratis debido a que sascte la balota gratis,ofrece supermercado noe");
}
            
 }
 else {
    System.out.println("no obtienes descuento");
}
leer.close();
}

}
