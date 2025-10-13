package Clase_4;

import java.util.Scanner;

public class Mascota {
    private String nombre;
    private int edad;

    public Mascota(){
        this.nombre = "Mango";
        this.edad = 6;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=0){
            this.edad = edad;
        }else{
            System.out.println("La edad es incorrecta");
        }

    }

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Mascota(Scanner scanner){
        System.out.println("Creando base de datos mascotas");
        System.out.println("Ingrese nombre de la mascota");
        this.nombre = scanner.nextLine();
        System.out.println("Ingrese edad de la mascota");
        if(scanner.hasNextInt()){
            this.edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        } else {
            this.edad = 0;
            scanner.nextLine();
            System.out.println("Edad inválida");
        }
    }

    public void mostrarInformacion(){
        System.out.println("Información de la mascota");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }


    public int calcularVacunasTotales() {

        final int VACUNAS_POR_ANIO = 3;


        int vacunasTotales = this.edad * VACUNAS_POR_ANIO;

        System.out.println("Cálculo de Vacunas Requeridas");
        System.out.println("La mascota de " + this.edad + " años ha requerido un total de " + vacunasTotales + " dosis de vacunas.");


        return vacunasTotales;
    }
}