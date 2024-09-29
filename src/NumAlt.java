import java.util.Random;
import java.util.Scanner;

public class NumAlt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(101);
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivina el numero");
        System.out.println("Deberas intentar el numero entre el 0 y 100");

        while (intentos < 5) {
            System.out.print("Ingresa tu intento: ");
            int intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario == randomNum) {
                System.out.println("¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
                break; // Salir del bucle si el usuario adivina
            } else if (intentoUsuario < randomNum) {
                System.out.println("El número secreto es mayor que " + intentoUsuario + ".");
            } else {
                System.out.println("El número secreto es menor que " + intentoUsuario + ".");
            }
        }

        if (intentos == 5) {
            System.out.println("¡Agotaste tus 5 intentos! El número secreto era " + randomNum + ".");
        }

    }
}
