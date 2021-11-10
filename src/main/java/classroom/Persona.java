package classroom;

public class Persona {

    long cedula; 
    String nombre;
    static int totalPersonas;

    static {
        totalPersonas = 0;
        
    }

    Persona(){

    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        totalPersonas++;
        this.cedula = 1;
    }
    
    public long getCedula() {
        return cedula;
    } 

    public String getNombre() {
        return nombre;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
}