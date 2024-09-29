import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaLanzamiento = teclado.nextInt();
        System.out.println("Califica la pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(nota);
    }
}
