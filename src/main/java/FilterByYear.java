public class FilterByYear {
    public static library[] filterFromHighestToLowest(int size, library library[], int greatOrLess) {
        library[] help = new library[size];

        library[] libraryByYear = new library[size];

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (greatOrLess == 1) {
                    if (library[j].getYear() < library[j + 1].getYear()) {
                        help[i] = library[j];
                        library[j] = library[j + 1];
                        library[j + 1] = help[i];
                    }
                } else if (greatOrLess == 2) {
                    if (library[j].getYear() > library[j + 1].getYear()) {
                        help[i] = library[j];
                        library[j] = library[j + 1];
                        library[j + 1] = help[i];
                    }
                } else {
                    System.out.println("A correct number was not entered");
                }
            }
        }
        libraryByYear = library;

        for (int i = 0; i < library.length; i++) {
            libraryByYear[i].display();
            System.out.println(" ");
        }
        return (libraryByYear);
    }

}
