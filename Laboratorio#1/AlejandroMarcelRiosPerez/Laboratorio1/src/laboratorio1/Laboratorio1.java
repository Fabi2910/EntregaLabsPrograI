package laboratorio1;

// Importar el scanner para el ingreso de números
import java.util.Scanner;

public class Laboratorio1 {

    public static void main(String[] args) {
        // Se crea el scanner
                Scanner scanner = new Scanner(System.in);
                // Se pide al usuario el número
                System.out.print("Ingrese su número aca:");
                // La variable número de tipo integer recibe un número del scanner
                int numero = scanner.nextInt();
                   System.out.println("Números impares hasta " + numero + ":");
                   // se crea una rutina for desde 0 hasta el número ingresado por el usuario
                   for (int i = 0; i <= numero; i++) {
                       // Un número es impar si el residuo de su división entre 2  es mayor a 0
                       if ((i % 2)>0){
                           // Imprime el valor de i actual que es equivalente al valor de número actual
                           System.out.println(i);
                       }
                   }
    }
   
}
