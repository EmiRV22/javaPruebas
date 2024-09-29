import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEval = 0;
        double totalEval = 0;

        while (nota != -1){

            System.out.println("Escribe la nota que le darias a Matrix");
            nota = teclado.nextDouble();

            if(nota != -1) {
                mediaEval += nota;
                totalEval++;
            }

        }

        System.out.println("El promedio de evaluaciones para Batman es:" + mediaEval/ totalEval);

    }
}
