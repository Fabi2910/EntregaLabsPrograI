/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sebastianlopezlopez;
import java.util.Scanner;
/**
 *
 * @author Sebas
 */
public class numerosprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //se crea un scanner para leer la entrada
    Scanner read= new Scanner(System.in);
    
       //se crea un limite para contar los numeros primos desde 0 hasta el numero ingresado
       int limite; 
       
       //se pide que se ingrese un numero por ejemplo 100
      System.out.println("ingrese un numero");
       limite = read.nextInt();
       
       //se muestran todos los numeros primos desde el 0 hasta el 100
       for(int i=1;i<limite;i++){
            int  count=0;
       for(int j=1;j<=i;j++){
       
            if(i%j==0)
                count++;
            }
       if(count==2)
        System.out.println(i);
        }   
    }
}