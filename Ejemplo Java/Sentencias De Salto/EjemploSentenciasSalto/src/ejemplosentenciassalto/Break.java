package ejemplosentenciassalto;

public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 4) {

                continue; // El break cuando se encuentra el 4, corta el for y no sigue
            }
            if (i == 6) {
              break;  
            }
            

            System.out.println("El numero es " + i);

        }

    }

}
