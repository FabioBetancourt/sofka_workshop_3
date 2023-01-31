import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * creating the song library
         */
        library[] library = new library[16];

        library [0] = new library ("Yonaguni", 122, 2020, 3, 27, "Reguetón","Bad Bunny","Disco Sencillo. Lanzado por Rimas Entertainment" );
        library [1] = new library ("Azul", 348, 2020, 3, 25, "Reguetón","J Balvin","Albúm: Colores" );
        library [2] = new library ("Tal para cúal", 158, 1995, 4, 38, "Salsa","Joe Arroyo","Albúm: Mi libertad" );
        library [3] = new library ("Conteo Regresivo", 248, 2003, 4,28, "Salsa","Gilberto Santa Rosa","Albúm: Constrste en salsa" );
        library [4] = new library ("Flor Palida", 888, 2013, 4,58, "Salsa","Marc Anthony","Albúm: 3.0" );
        library [5] = new library ("Dakiti", 668, 2013, 3,25, "Reguetón","Bad Bunny","Albúm: El último tour del mundo");
        library [6] = new library ("Sin sentimiento", 489, 1990, 5, 0, "Salsa","Grupo Niche","Albúm: Cielo de tambores" );
        library [7] = new library ("Bohemian Rhapsody", 409, 1975, 6, 0, "Rock","Queen","Albúm: A night at the opera" );
        library [8] = new library ("Welcome to the Jungle", 358, 1987, 4,40, "Rock","Guns N' Roses","Albúm: Apetite for destruction" );
        library [9] = new library ("Thunderstruck", 963, 1990, 4,53, "Rock","AC/DC","Nominado al MTV Video Music Award for Best Rock Video" );
        library [10] = new library ("I was made for loving you", 838, 1979, 3,59, "Rock","Kiss","Albúm: Dynasty" );
        library [11] = new library ("Promesa", 735, 2014, 3,59, "Pop","Melendi","Albúm: Un alumno más" );
        library [12] = new library ("Virtual Diva", 458, 2009, 4, 3, "Reguetón","Don Omar","Albúm: Meet the Orphans");
        library [13] = new library ("Besos usados", 735, 2009, 3,57, "Pop","Andrés Cepeda","Albúm: Día tras día" );
        library [14] = new library ("Bajo del agua", 555, 2015, 3,51, "Pop","Manuel Medrano","Albúm: Manuel Medrano" );
        library [15] = new library ("A la primera persona", 774, 2006, 5,13, "Pop","Alejandro Sanz","Albúm: El tren de los momentos" );

        /**
         * cycle for print the library
         */

        for (int i = 0; i < library.length; i++) {
            library[i].display();
        }
        System.out.println(" ");

        System.out.println("¿Do you want make a playlist?");
        System.out.println("Please enter the number 1 to make a playlist otherwise select any key");
        Scanner sc = new Scanner(System.in);

        try {
            int newPlaylist = Integer.parseInt(sc.nextLine());
            if (newPlaylist == 1){
                Playlist.makePlaylist(library.length, library);
            }
        }catch (NumberFormatException ex){
            System.out.println("Not Entered Number");
        }
        System.out.println("Enter 1 if you want to filter songs by year or genre"
                + "or press another key to exit:");
        try {
            int count = Integer.parseInt(sc.nextLine());
            if (count==1){
                System.out.println("Enter 1 to filter by gender "
                        + "or enter 2 to filter by year: ");
                try {
                    int searchByYear = Integer.parseInt(sc.nextLine());
                    switch (searchByYear) {
                        case 1 -> Filter.filterByGenre(library.length, library);
                        case 2 -> Filter.filterByYear(library.length, library);
                        default -> System.out.println("No valid value entered");
                    }
                }catch (NumberFormatException ex) {
                    System.out.println("No number entered");
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("No number entered");
        }


        System.out.println("Enter 1 if you want to organize songs by year or length, "
                + "or press another key to exit: " );
        try {
            int count = Integer.parseInt(sc.nextLine());
            if (count==1){
                System.out.println("Enter 1 to organize per year"
                        + "or enter 2 to sort by duration: ");
                int yearOrDuration = Integer.parseInt(sc.nextLine());
                switch (yearOrDuration){
                    case 1:
                        System.out.println("Enter 1 if you want to sort by year from highest to lowest "
                                + "or enter 2 if you want the reverse");
                        int greaterOrLess = Integer.parseInt(sc.nextLine());
                        FilterByYear.filterFromHighestToLowest(library.length, library,greaterOrLess);

                        break;

                    case 2:
                        System.out.println("Enter 1 if you want to sort by duration from longest to shortest "
                                + "or enter 2 if you want the reverse");
                        greaterOrLess = Integer.parseInt(sc.nextLine());
                        OrderOfDuration.orderByTime(library.length, library,greaterOrLess);
                        break;

                    default:
                        System.out.println("No se ingresó un valor valido");
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("No se ingresó un número");
        }
    }
}
