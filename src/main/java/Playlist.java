import java.util.Scanner;

public class Playlist {

        public static library [] makePlaylist (int size, library[] library){

            Scanner sc = new Scanner (System.in);
            library[] playlist = new library [size];
            int count = 0;
            int countSongs = 0;

            do {
                library[] foundSongs = new library [size];
                int addSongs = 0;
                System.out.println("Type 1 if you want search by song's name: ");
                System.out.println("Type 2 if you want search by genre: ");
                System.out.println("Type 3 if you want search by artist: ");
                System.out.println("Type 4 if you want search by year:");
                try {
                    int searchTypeA = Integer.parseInt(sc.nextLine());
                    switch (searchTypeA){
                        case 1:
                            System.out.println("Type the name's song: ");
                            String nameSong = (sc.nextLine());
                            for (int i=0; i<size; i++){
                                if (nameSong.equals(library[i].getName())){
                                    foundSongs [addSongs] = library[i];
                                    addSongs = addSongs + 1;
                                }
                            }
                            break;

                        case 2:
                            System.out.println("Type the genre's song like you search: ");
                            String genreSong = (sc.nextLine());
                            for (int i=0; i<size; i++){
                                if (genreSong.equals(library[i].getGenre())){
                                    foundSongs [addSongs] = library[i];
                                    addSongs = addSongs + 1;
                                }
                            }
                            break;

                        case 3:
                            System.out.println("Type the artist's song like you search: ");
                            String artistSong = (sc.nextLine());
                            for (int i=0; i<size; i++){
                                if (artistSong.equals(library[i].getAuthor())){
                                    foundSongs [addSongs] = library[i];
                                    addSongs = addSongs + 1;
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Type the year's song like you search: ");
                            try{
                                int year = Integer.parseInt(sc.nextLine());
                                for (int i=0; i<size; i++){
                                    if (year == library[i].getYear()){
                                        foundSongs [addSongs] = library[i];
                                        addSongs = addSongs + 1;
                                    }
                                }
                            } catch (NumberFormatException ex) {
                                System.out.println("I cant found a number with a letter");
                            }
                            break;

                        default:
                            System.out.println("The description enter is incorrect");
                    }
                }catch (NumberFormatException ex) {
                    System.out.println("No number entered");
                }
                if (addSongs>=1){
                    System.out.println("Were found" + addSongs + " songs");
                    for(int i =0; i < addSongs;i++){
                        foundSongs[i].display();
                        System.out.println("Enter 1 to add the song to the Playlist or any other key to NOT add it");
                        try {
                            int decision = Integer.parseInt(sc.nextLine());
                            if (decision==1){
                                playlist[countSongs] = foundSongs[i];
                                countSongs = countSongs + 1;
                            } else {
                                System.out.println("Failed adding the song");
                            }
                        }catch (NumberFormatException ex) {
                            System.out.println("No number entered");
                        }
                    }
                } else if (addSongs==0){
                    System.out.println("No songs found in the search");
                }
                System.out.println("Enter 1 to browse and add more songs or press any key to end the playlist.");
                try{
                    int addingMoreSongs = Integer.parseInt(sc.nextLine());
                    if (addingMoreSongs!=1){
                        count = count + 1;
                    }
                }catch (NumberFormatException ex) {
                    count = count + 1;
                    System.out.println("No number entered");
                }
            } while (count==0);


            System.out.println("The songs added to the Playlist are the following: ");
            for(int i =0; i<countSongs;i++){
                playlist[i].display();
                System.out.println(" ");
            }
            return (playlist);
        }
    }

