/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;
/**
 *
 * @author LENOVO
 */
public class Empleado extends Persona {
    private double puestoEmpleado;// Atributo propio de esta clase hija
    //Atributos heredados de la clase padre
    public Empleado(int identificacion, String nombre, String apellido1, char apellido2, double puestoEmpleado) {
        super(identificacion, nombre, apellido1, apellido2);
        this.puestoEmpleado = puestoEmpleado;
    }
    public double getPuestoEmpleado() {
        return puestoEmpleado;
    }
    public void setPuestoEmpleado(double puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }
    public void darSaludo() {//Esto es un método de esta clase hija
        System.out.println("Hola, es un placer atenderle");
    }
}
