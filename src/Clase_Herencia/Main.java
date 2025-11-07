package Clase_Herencia;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("1722295050","Carlos", 25);
        Estudiante p2 = new Estudiante("1726626366","Milka", 19, "a001");
        Docente p3 = new Docente("1722295050","Lubswer", 25, "Doctor");
        Persona p4 = new Persona("1722295050","Carlos", 25);
        Estudiante p5 = new Estudiante("1726626366","Milka", 19, "a001");
        Docente p6 = new Docente("1722295050","Alan", 25, "Doctor");
        System.out.println("Persona : " );
        System.out.println("-------------");
        p1.imprimir();
        System.out.println("Estudiante: " );
        System.out.println("-------------");
        p2.imprimir();
        System.out.println("Docente: " );
        System.out.println("-------------");
        p3.imprimir();
        System.out.println("-------------");
        System.out.println("Sin sobrescribir");
        System.out.println("-------------");
        p4.imprimir2();
        p5.imprimir3();
        p6.imprimir4();
    }
}
