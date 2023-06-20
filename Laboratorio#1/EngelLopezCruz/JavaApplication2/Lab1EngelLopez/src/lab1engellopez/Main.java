/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1engellopez;
import java.util.Scanner;// Esta es una libería que fué necesaria para poder utilizar la clase sccanner.
/**
 *
 * @author Engel López Cruz UIA
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){// En esta clase main se va a tomar encuenta el rango de los valores a tomar en cuenta.
       int inicio, fin, contador = 0;// Aquí estoy diciendo que los inicio y fin y contador por defecto van a ser ceros.
        try (Scanner scanner = new Scanner(System.in)) {// Con esta linea de código se logra captar lo ingresado por el X uuario 
            System.out.println("Los numeros primos se van a tomar en cuenta desde 0");//Con esta linea le estoy diciendo al usuario que el rango que van a ser tomados van a iniciar desde cero.
            inicio = 0 ;//Aquí le estoy declarando a la variale inicio que su valor es cero.
            System.out.println("Ingresa el numero hasta que desees tomar en cuenta");//Esto se le mostrará al usuario X, este es el valor límite o máximo.
            fin = scanner.nextInt();//Aquí extrayendo el valor que el usuario ingresó al programa.
            for (int x = inicio; x <= fin; x++) {//Este es el ciclo para ir haciendo de contador, en cada paso va a ir aumentando.
                if (esPrimo(x)) {// En este if el va a ir a buscar la lógica si el dato X es primo.
                    contador++;//Si el dato X es primo el va a guardar ese dato en memoria.
                    System.out.print(String.valueOf(x) + ",");//Aquí el programa me va a imprimir el dato que se encuentre almacenado en Contador y lo va a estar separando por una coma.
                }// Hasta acá termina el valor proceso de guardar los datos en contador y agregar una coma en pantalla.
            }//Hasta acá termina el proceso del ciclo que va en aumento
            System.out.printf("\nTotal: %d", contador);//Aquí el programa me va a imprimir el dato de la cantidad de número0s de primos encontrados en dicho rango.
        }
	}

	public static boolean esPrimo(int numero) {// Esta es la lógica que determina si un número es primo o no.
		if (numero == 0 || numero == 1 || numero == 4) {// Esta es una validación rápida para que si el valor sea los que están aquí mencionados no sean tomados en cuenta. El 0, 1 y 4 no son números primos.
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {//Este es un ciclo que va una y otra vez hacer que determine si es divisible entre 2.
			if (numero % x == 0)//Acá realiza la verificación si es número divisible en 2 y si lo es no serátomado en cuenta.
				return false;
		}// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;//Aquí termina la verificación de los numeros si son primos si es primo es true y nos guardamos ese valor.
	}
}

