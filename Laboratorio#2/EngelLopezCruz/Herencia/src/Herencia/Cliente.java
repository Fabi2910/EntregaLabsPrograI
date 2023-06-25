/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;
/**
 *
 * @author LENOVO
 */
public class Cliente extends Persona {
    //Atributos heredados de la clase padre
    public Cliente(int identificacion, String nombre, String apellido1, char apellido2) {
        super(identificacion, nombre, apellido1, apellido2);
    }
}