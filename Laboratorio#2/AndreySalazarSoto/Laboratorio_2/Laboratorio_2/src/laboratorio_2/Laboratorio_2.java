/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio_2;

/**
 *
 * @author Andrey
 */
public class Laboratorio_2 {

        public class Empresa {
    
    
    int identificacion;
    String nombre;
    String apellido1;
    char apellido2;
    
    public void darsaludo() {
        // Lógica del primer metodo
    }
    
    // Otros atributos y métodos de la clase base
    
}

class Empleado extends Empresa {
    
    double puestoEmpleado;
    
    // Otros atributos y métodos específicos del empleado
    
    // Constructor de la clase Empleado
    
    public Empleado(int identificacion, String nombre, String apellido1, char apellido2, double puestoEmpleado) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.puestoEmpleado = puestoEmpleado;
    }
    
}
    }
    

