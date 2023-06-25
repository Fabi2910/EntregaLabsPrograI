
 /* @author LENOVO
 */
package Herencia;
//Clase padre Persona
public class Persona {
    private int identificacion;
    private String nombre;
    private String apellido1;
    private char apellido2;

    public Persona(int identificacion, String nombre, String apellido1, char apellido2) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Getters y setters de clase padre

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public char getApellido2() {
        return apellido2;
    }

    public void setApellido2(char apellido2) {
        this.apellido2 = apellido2;
    }
}
