package Clase_6.Figura;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se inicializa el Scanner y la clase Area
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.println("--- MENU DE CÁLCULO DE ÁREAS ---");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Trapecio");

        int opcion =  Integer.parseInt( JOptionPane.showInputDialog(null,"MENU AREA DE FIGURAS"+
                "\n1. Cuadrado"
                + "\n2. Rectangulo"
                + "\n3. Trapecio"
                + "\n4. Seleccione opcion"));

        //int opcion = sc.nextInt();

        System.out.println();

        if (opcion == 1) {
            //System.out.print("Ingrese el lado del cuadrado: ");
            double lado  =  Double.parseDouble( JOptionPane.showInputDialog(null,"Ingrese el lado del cuadrado: "));
           // System.out.println("El área es: " + a.calcularArea(lado));
            JOptionPane.showMessageDialog(null,"El area es:  "+ a.calcularArea(lado));

        } else if (opcion == 2) {
            double base =  Double.parseDouble( JOptionPane.showInputDialog(null,"Ingrese la altura del rectángulo: "));
            // System.out.println("El área es: " + a.calcularArea(lado));
            double altura =  Double.parseDouble( JOptionPane.showInputDialog(null,"Ingrese la altura del rectángulo: "));
            JOptionPane.showMessageDialog(null,"El area es:  " + a.calcularArea(base,altura));


            //System.out.println("El área es: " + a.calcularArea(base, altura));

        } else if (opcion == 3) {
            System.out.print("Ingrese la Base Mayor del trapecio: ");
            double base1 = sc.nextDouble();
            System.out.print("Ingrese la Base Menor del trapecio: ");
            double base2 = sc.nextDouble();
            System.out.print("Ingrese la altura del trapecio: ");
            double altura = sc.nextDouble();

            System.out.println("El área es: " + a.calcularArea(base1, base2, altura));

        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
        }


        sc.close();
    }
}
