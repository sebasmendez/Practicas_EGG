package ejemplosrepetitivos;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        /*
         Teniendo en cuenta que la clave es “eureka”, 
         escribir un programa que nos pida ingresar una clave. 
         Sólo se cuenta con 3 intentos para acertar, 
         si fallamos los 3 intentos se deberá mostrar un mensaje indicándonos 
         que hemos agotado esos 3 intentos.  
         Si acertamos la clave se deberá mostrar un mensaje que indique 
         que se ha ingresado al sistema correctamente.
         */
        
        Scanner scan = new Scanner(System.in);

        String codigo;
        int password;
        int j =0;
        for (int i = 1; i < 4; i++) {

            // do {
            System.out.println("Ingrese su codigo: (intento:"+i+")");
            codigo = scan.nextLine();
            //System.out.println("Ingrese su contraseña");
            //password = scan.nextInt();

            if (codigo.equals("eureka")) /*|| password != 4567)*/ {
                break;
            } else {
                System.out.println("Su código no es correcto");

            }
            j=i;
        }
            //} while (((codigo.equals("eureka"))==false) & i<4);
            if (j<3) {
            System.out.println("BIEMVENIDO"); 
            }
            
            else {
            System.out.println("intentos max permitidos!! "+j);

            }
    }

}
