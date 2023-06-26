/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioii;

/**
 *
 * @author Carlos Montiel H
 */
public class LaboratorioII {
// Clase padre: PantallaProveedor
class Persona {
    private final int identificacion;
    private String nombre;
    private String apellido1;
    private char apellido2;

    public Persona(int identificacion, String nombre, String apellido1, char apellido2) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public void darSaludo() {
        System.out.println("¡Hola! Soy una persona.");
    }
}

class Empleado extends Persona {
    private double puestoEmpleado;

    public Empleado(int identificacion, String nombre, String apellido1, char apellido2, double puestoEmpleado) {
        super(identificacion, nombre, apellido1, apellido2);
        this.puestoEmpleado = puestoEmpleado;
    }

    // Aquí puedes agregar métodos y atributos específicos para la clase Empleado
}

class Cliente extends Persona {
    public Cliente(int identificacion, String nombre, String apellido1, char apellido2) {
        super(identificacion, nombre, apellido1, apellido2);
    }

    // Aquí puedes agregar métodos y atributos específicos para la clase Cliente
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(111, "Juan", "Pérez", 'A');
        persona.darSaludo();

        Empleado empleado;
        empleado = new Empleado(1234, "Pedro", "González", 'B', 5000.0);
        empleado.darSaludo();

        Cliente cliente = new Cliente(5678, "María", "López", 'C');
        cliente.darSaludo();
    }
}
}
/**/