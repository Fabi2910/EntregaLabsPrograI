/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado(1558206933, "Jose", "Garcia", 'T', 60089.00);
        Cliente cliente = new Cliente(2, "Marco", "Lopez", 'C');

        System.out.println("Empleado:");
        System.out.println("Identificacion: " + empleado.getIdentificacion());
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido 1: " + empleado.getApellido1());
        System.out.println("Apellido 2: " + empleado.getApellido2());
        System.out.println("Puesto de empleado: " + empleado.getPuestoEmpleado());
        empleado.darSaludo();

        System.out.println("\nCliente:");
        System.out.println("Identificacion: " + cliente.getIdentificacion());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido 1: " + cliente.getApellido1());
        System.out.println("Apellido 2: " + cliente.getApellido2());
    }
}
