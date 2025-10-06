package Clase_3;


import java.util.Scanner;

class Empleado {
    String nombre;
    int  salario;
    String fecha;

    public Empleado( String nombre, int salario, String fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }

    public void MostrarDatos(){
        System.out.println("--- Ficha del Empleado ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println(" Salario : " + this.salario);
        System.out.println("Fecha de Ingreso: " + this.fecha);
        System.out.println("-------------------------");
    }
}

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Empleado[] empleado = new Empleado[1];
        System.out.println("\n---REGISTRO DE CLIENTES---");
        for (int i = 0; i < empleado.length; i++) {
            System.out.println("\n---Registrando empleado N°: " + (i + 1) + "---");
            String nombre;
            int salario;
            String fecha;

            do {
                System.out.println("Ingrese sus nombres: ");
                nombre = lector.nextLine();
                if (nombre.isEmpty()) {
                    System.out.println("Error! No ha ingresado su nombre, inténtelo de nuevo ");

                }
            } while (nombre.isEmpty());
            do {
                System.out.println("Ingrese sus apellidos: ");
                salario = lector.nextInt();
                if (salario < 0 || salario > 1000) {
                    System.out.println("Error! No ha ingresado sus salario, inténtelo de nuevo ");

                }
            } while (salario < 0 || salario > 1000);
            do {
                System.out.println("Ingrese su cédula: ");
                fecha = lector.nextLine();
                if (fecha.isEmpty()) {
                    System.out.println("Error! No ha ingresado su fecha de ingreso, inténtelo de nuevo ");

                }


            } while (fecha.isEmpty());

            empleado[i] = new Empleado(nombre, salario, fecha);
            System.out.println("\n---Cliente  N°: " + (i + 1) + " registrado con éxito---");

        }
        System.out.println("\n---Empleados Registrados---");
        for (Empleado emp : empleado) {
            emp.MostrarDatos();


        }
    }
}