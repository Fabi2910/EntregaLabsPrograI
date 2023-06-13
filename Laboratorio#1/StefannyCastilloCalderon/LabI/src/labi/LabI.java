/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labi;

/**
 *
 * @author Stefanny Castillo
 */
public class LabI {
    public static void main(String[] args)
  {
   	NumeroPrimo(11);
    NumeroPrimo(12);
  }
  
  public static void NumeroPrimo(int num) {
    boolean primo = true; 
    for(int i = 2; i < num; i++) {
        if (num % i == 0) {
            primo = false;
            break;
        }
    }
    if (primo)
        System.out.println("El número es primo.");
    else
        System.out.println("El número no es primo.");
    }

}