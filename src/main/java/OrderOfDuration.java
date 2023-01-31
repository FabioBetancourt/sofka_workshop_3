public class OrderOfDuration {
    public static library[] orderByTime (int size, library library[], int MayOMen){

        library[] help = new library [size];

        library[] filterByDuration = new library [size];

        for(int i = 1; i < size; i++){
            for(int j = 0;j < size-i;j++){
                if (MayOMen==1){
                    if(library[j].getTotalTime() < library[j+1].getTotalTime()) {
                        help[i] = library[j];
                        library[j] = library[j+1];
                        library[j+1] = help[i];
                    }
                } else if (MayOMen==2) {
                    if(library[j].getTotalTime() > library[j+1].getTotalTime()) {
                        help[i] = library[j];
                        library[j] = library[j+1];
                        library[j+1] = help[i];
                    }
                } else {
                    System.out.println("A correct number was not entered");
                }
            }
        }
        filterByDuration = library;

        for(int i =0; i<library.length;i++){
            filterByDuration[i].display();
            System.out.println(" ");
        }
        return (filterByDuration);
    }
}
