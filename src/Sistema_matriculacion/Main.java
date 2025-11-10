package Sistema_matriculacion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int opcionAuto;
        do {
            System.out.println("========= Sistema de Matriculacion =========");
            System.out.println("Elija una opcion: ");
            System.out.println("1. Registro de vehiculo \n2. Mostrar datos  \n 3.Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            System.out.println(" ");
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("====== Registro de vehiculo registrado ======");
                        System.out.println("\n1. Auto \n2.Moto \n3.Camion \n4.Salir");
                        opcionAuto = sc.nextInt();

                        if (opcionAuto == 1) {

                            Auto nuevo = crearAutoDesdeUsuario(sc);
                        } else if (opcionAuto == 2) {
                            Moto nuevo = crearMotoDesdeUsuario(sc);
                        } else if (opcionAuto == 3) {
                            Camion nuevo = crearCamionDesdeUsuario(sc);
                        } else if (opcionAuto == 4) {
                            System.out.println("Saliendo...");

                        }
                    }while(opcionAuto != 4);
                    break;
                case 2:
                    System.out.println("Pendiente con ArrayList, explicacion en los comentarios del codigo");
                    // de esta manera podemos hacerlo pero al no tener el for y verificar que existe en arraylist no funcionara por ahora y para calcular los precios
                    // de la matricula tambien porque debemos tener referancia a un objeto
                    // System.out.println(mostrarResultado(nuevo));
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");

                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }while(opcion !=3);


        sc.close();
    }



    private static Auto crearAutoDesdeUsuario(Scanner scanner) {
        System.out.print("Placa: ");
        String placa = scanner.next();
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        System.out.print("Propietario: ");
        scanner.nextLine();
        String propietario = scanner.nextLine();
        System.out.print("Número de Puertas: ");
        int puertas = scanner.nextInt();
        return new Auto(placa, marca, anio, propietario, puertas);
    }

    private static Moto crearMotoDesdeUsuario(Scanner scanner) {
        System.out.print("Placa: ");
        String placa = scanner.next();
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        System.out.print("Propietario: ");
        scanner.nextLine();
        String propietario = scanner.nextLine();
        System.out.print("Cilindraje (cc): ");
        int cilindraje = scanner.nextInt();
        return new Moto(placa, marca, anio, propietario, cilindraje);
    }

    private static Camion crearCamionDesdeUsuario(Scanner scanner) {
        System.out.print("Placa: ");
        String placa = scanner.next();
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        System.out.print("Propietario: ");
        scanner.nextLine();
        String propietario = scanner.nextLine();
        System.out.print("Capacidad de Carga (toneladas): ");
        double carga = scanner.nextDouble();

        return new Camion(placa, marca, anio, propietario, carga);
    }


    private static void mostrarResultado(Vehiculo vehiculo) {


        double valor = vehiculo.calcularValorMatricula();
        System.out.println("------------------------------------------");

        System.out.println(vehiculo.mostrarInformación());
        System.out.printf("Valor de Matrícula: $%.2f%n", valor);
    }

}