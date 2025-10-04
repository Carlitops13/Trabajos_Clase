package Clase_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero: ");
        int numero1 = entrada.nextInt();

        System.out.println("Ingrese el numero decimal: ");
        double numero2 = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Ingrese la variable char: ");
        char caracter = entrada.nextLine().charAt(0);

        System.out.println("Ingrese la cadena de texto: ");
        String texto = entrada.nextLine();

        System.out.println("Ingrese el valor booleano (true/false): ");
        boolean valor = entrada.nextBoolean();

        if (valor) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }

        System.out.println("El numero entero es: " + numero1);
        System.out.println("El numero decimal es: " + numero2);
        System.out.println("El caracter es: " + caracter);
        System.out.println("El texto es: " + texto);
        System.out.println("El valor es: " + valor);
    }
}
