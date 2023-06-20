/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2;

import laboratorio2.Empleado;

/**
 *
 * @author 50683
 */
public class Cliente {
    private int identificacion;
    private String nombre;
    private String apellido1;
    private char apellido2;
}

public class EmpleadoHerencia extends Empleado {
    public void darSaludo() {
        System.out.println("Hola, soy un empleado con herencia");
    }
}