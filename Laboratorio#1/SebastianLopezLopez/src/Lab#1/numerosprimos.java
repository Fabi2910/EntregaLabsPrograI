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
    Scanner read= new Scanner(System.in);
       int limite; 
      System.out.println("ingrese un numero");
       limite = read.nextInt();
       
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