public class Main {
    public static void main(String[] args) {

        System.out.println("¡Bienvenido a Screen Match!");
        System.out.println("Película: Matrix");

        /* prueba de varias lineas texto
            hola hgola hola hoa holla
         */

//        String saludo = "Hola, ";
//        String nombre = "Emiliano";
//        String mensaje = saludo + nombre + "jeje";
//        System.out.println(mensaje);
//        String contra = "1223";
//        if (contra.equals("123")) {
//            System.out.println("Acceso Aut");
//        } else {
//            System.out.println("No auth");
//        }
//        String nombre = "Maria";
//        int edad = 30;
//        double valor = 55.9999;
//        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaPelicula = 8.2;
        double media = (8.2 + 10 + 10) / 3;

        System.out.println("Media de calificaciones: " + media);

        // Sinopsis de la película (usando un bloque de texto)
        String sinopsis = """
                Matrix es una película icónica que marcó el fin del milenio.
                Lanzada en el año """ + fechaDeLanzamiento + """
                , se convirtió en un referente
                del género de ciencia ficción y acción.
                La trama gira en torno a la simulación de la realidad y la lucha por la libertad
                de la humanidad contra las máquins.
                """;
        System.out.println(sinopsis);

        int clasificacion = (int) (media/2);
        System.out.println(clasificacion);
    }
}
