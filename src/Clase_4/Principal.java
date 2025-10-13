package Clase_4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Prueba de la Clase Mascota ---");


        System.out.println("\n--- Objeto 1: Constructor por Defecto ---");
        Mascota mascota1 = new Mascota();
        mascota1.mostrarInformacion();
        mascota1.calcularVacunasTotales();


        System.out.println("\n--- Objeto 2: Constructor con Parámetros ---");
        Mascota mascota2 = new Mascota("Boby", 5);
        mascota2.mostrarInformacion();
        mascota2.calcularVacunasTotales();


        System.out.println("\n--- Objeto 3: Constructor con Scanner ---");
        Mascota mascota3 = new Mascota(scanner);
        mascota3.mostrarInformacion();
        mascota3.calcularVacunasTotales();

        Mascota mascotaNueva = new Mascota("Max", 2);

        System.out.println("--- Prueba de Getters y Setters ---");
        System.out.println("Nombre inicial (GET): " + mascotaNueva.getNombre()); // Output: Max
        System.out.println("Cambiando el nombre a 'Fido'...");
        mascotaNueva.setNombre("Fido");

        // 3. Uso del GETTER para verificar el nuevo valor
        System.out.println("Nuevo nombre (GET): " + mascotaNueva.getNombre());

        // 4. Uso del SETTER con validación para cambiar la edad
        System.out.println("\nEdad inicial: " + mascotaNueva.getEdad());

        System.out.println("Intentando establecer edad: 7");
        mascotaNueva.setEdad(7);
        System.out.println("Edad actualizada: " + mascotaNueva.getEdad());

        // Intentando establecer edad inválida
        System.out.println("Intentando establecer edad: -5");
        mascotaNueva.setEdad(-5); // Llama al mensaje de error en el setter
        System.out.println("Edad después de error: " + mascotaNueva.getEdad());

        scanner.close();
    }
}