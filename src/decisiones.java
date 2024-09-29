public class decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaPelicula = 8.2;
        String plan = "plus";

        if (fechaDeLanzamiento >2022){

            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Pelicula retro que vale la peena ver");
        }


        if (incluidoEnPlan || plan.equals("plus")){
            System.out.println("Disfruta la pelicula");
        } else {
            System.out.println("Pelicula no disponible en el plann");
        }

    }
}
