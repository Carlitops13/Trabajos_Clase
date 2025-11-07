package Clase_Herencia;

public  class Persona {
    public String cedula;
    public String nombre;
    public int edad;

    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;

    }
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);

    }
    public void imprimir2() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
    }

}

class Estudiante extends Persona{

    String codigo;


    public Estudiante(String cedula, String nombre, int edad, String codigo) {
        super(cedula, nombre, edad);
        this.codigo = codigo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Codigo: " + codigo);
    }
    public void imprimir3() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);
    }
}

class Docente extends Persona {


    String maestrias;

    public Docente(String cedula, String nombre, int edad,String maestrias) {
        super(cedula, nombre, edad);
        this.maestrias = maestrias;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Maestria: " + maestrias);
    }
    public void imprimir4() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Maestria: " + maestrias);
    }
}

