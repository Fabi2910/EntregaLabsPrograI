/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebastianmarinzlab2;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {

    private double puestoEmpelado;
    
    public Empleado(int identificacion,String nombre,String apellido1,char apellido2)
    {
        super(identificacion,nombre,apellido1,apellido2);
        puestoEmpelado = 0.0;
    }
    public void darSaludo(){
        
    }
}
