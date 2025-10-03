import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String usuario= "ADMIN123";
        String contraseña= "EPN123";

        System.out.println("Ingrese un usuario: ");
         String cadena1 = sc.nextLine();


        System.out.println("Ingrese una contraseña ");
            String cadena2 = sc.nextLine();

            if (usuario.equals(cadena1)&&contraseña.equals(cadena2)) {
                System.out.println("Ingreso exitoso ");


                }else{
                System.out.println("Contraseña o usuario incorrecto");
            }

        System.out.println("La primera cadena es: " + cadena1);
        System.out.println("La segunda cadena es: " + cadena2);
        System.out.println(usuario.equals(cadena1));
        System.out.println(contraseña.equals(cadena2));
    }
}
