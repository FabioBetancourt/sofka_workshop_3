import java.util.Scanner;

public class Filter {
    public static String filterByGenre(int size, library library[] ){
        int count = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name of the genre to search: ");
        String genderSearched = (sc.nextLine());
        for (int i=0; i<size; i++){
            if (genderSearched.equals(library[i].getGenre())){
                library[i].display();
                count = count + 1;
            }
        }
        if (count==0){
            System.out.println("There are no songs of that genre!");
        }
        return null;
    }

    public static String filterByYear(int size, library library[] ){
        int count = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year to search: ");
        try {
            Integer searchedYear = Integer.parseInt(sc.nextLine());
            for (int i=0; i<size; i++){
                if (searchedYear == library[i].getYear()){
                    library[i].display();
                    count = count + 1;
                }
            }
            if (count==0){
                System.out.println("There are no songs in that year");
            }
        } catch (NumberFormatException ex) {
            System.out.println("No number entered");
        }
        return null;
    }
}

