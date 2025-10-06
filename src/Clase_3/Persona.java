package Clase_3;

public class Persona {
    String cedula;
    String nombre;
    int edad;
    String correo;


    public Persona(String cedula, String nombre, int edad, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;

    }
    void impresion(){
        System.out.println("Bienvenido!!!");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("1722295050", "Carlos", 25, "carlos.puente20@hotmail.com");

        p1.impresion();
    }
}
