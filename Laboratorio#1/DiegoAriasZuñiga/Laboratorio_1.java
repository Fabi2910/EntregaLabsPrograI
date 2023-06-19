/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio_1;

import java.util.Scanner;
/**
 *
 * @author Diegs
 */
public class Laboratorio_1 {

       
    static Numero objNumero; //Declaracion de la variable aqui solo es la declaracion pero aun no existe en la memoria
    
    public static void main(String [] args){
        
        try{
          calcularNumerosPares();
          //calcular Numeros Pares Con Usuario
          
        }
        catch(Exception e){
            //1. Poder dar una presentación mas agradable del error al usuario
            //2. Poder gestionar el error, es registrarlo en alguna bitacora
            //3. se guarda los datos al momento del error
            System.out.println("No se puede divir entre cero "+e.getMessage());
        
        }
        
       
     

        
    }
    
    public static void calcularNumerosParesConUsuario(){
        
        objNumero = new Numero("Carlos"); //Instanciar un clase en un objeto
        objNumero.imprimirNumerosPares();
        String usuario = objNumero.getNombreUsuario();
        System.out.println("Muchas gracias "+usuario);
    }
    
    public static void calcularNumerosPares(){
        objNumero = new Numero(); //Instanciar un clase en un objeto
        objNumero.imprimirNumerosPares();
        String usuario = objNumero.getNombreUsuario();
        System.out.println("Muchas gracias "+usuario.toUpperCase());
    }
    
   
}
