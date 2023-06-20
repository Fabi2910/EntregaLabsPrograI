package laboratorio2;

public class Laboratorio2 {

    public static void main(String[] args) {
        
        }
}
class Persona {
    private int identificacion;
    private String nombre;
    private String apellido1;
    private char apellido2;
}
class Cliente extends Persona {
}
class Empleado extends Persona {
    private double puestoEmpelado;
    public void darSaludo(){
        System.out.println("Hola mundo");
    }
}
class Proveedores extends Persona {
    private String materiaPrima;
    private String organizacion;
}