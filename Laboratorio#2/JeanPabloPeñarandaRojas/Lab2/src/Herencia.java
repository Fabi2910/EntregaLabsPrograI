/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tjean
 */
// Clase base: Persona
public class Persona {
    private int identificacion;
    private String nombre;
    private String apellido1;
    private char apellido2;
    
}

// subclase: Cliente 
public class Cliente extends Persona {
    // Atributos adicionales de Cliente
    
    public Cliente(int identificacion, String nombre, String apellido1, char apellido2) {
        super(identificacion, nombre, apellido1, apellido2);
        // Reutiliza atributos de la clase Persona
    }
    

}

// subclase: Empleado 
public class Empleado extends Persona {
    private double puestoEmpleado;
    
    public Empleado(int identificacion, String nombre, String apellido1, char apellido2, double puestoEmpleado) {
        super(identificacion, nombre, apellido1, apellido2);
        
    }
    
    public void darSaludo() {
        
    }
   
 
}

