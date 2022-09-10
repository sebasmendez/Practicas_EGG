/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5.ejercicios_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author uno
 */
/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/
public class ejr23_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //se define la clase scanner
        String palabra[] = new String[5];
        String sopa[][] = new String[20][20];

        System.out.println("Bienvenido, debe ingresar 5 palabras para ingresar a la sopa de letras");
        for (int i = 0; i < 5; i++) {
            System.out.println("ingresa palabra " + (i+1) + ":");
            palabra[i] = leer.nextLine();
        }

        //  inicializar matriz 20x20 con numeros aleatorios
        // Los caracteres de interés en un array de char.
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String bc;
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                int numero = ((int) (Math.random() * 25));
                sopa[j][k] = (bc = abc.substring(numero, numero + 1));
            }
        }
        
        
        //ubicacion aleatoria en la fila (desde 0 a (20-tamaño)) 
        //int numero = (int)(Math.random()*(Y-X+1)+X;
        for (int c = 0; c < 5; c++) {            //para las 5 palabras hacer:
            int i = (int) (Math.random() * 19); //numero de fila aleatorio
            int tamaño = palabra[c].length();   //calculamos el tamaño de cada palabra
            int ubicacion = (int) (Math.random() * (19 - tamaño)); //ubicacion en la fila aleatorio
            int p = 0;           //contador auxiliar 
            for (int j = ubicacion; j < (tamaño + ubicacion); j++) { // colocar las palabras en la sopa 
                sopa[i][j] = palabra[c].substring(p, p + 1);
                p = p + 1;
            }
        }

        //imprimir sopa
        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" "+sopa[i][j]);
            }
            System.out.println(" ");
        }

    }

}
