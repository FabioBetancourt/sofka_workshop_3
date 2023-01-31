public class library {

    public String name;
    public int id;
    public int year;
    public int durationMin;
    public int durationSeg;
    public String genre;
    public String author;
    public String description;

    public library(String name, int id, int year, int durationMin, int durationSeg, String genre, String author, String description) {
        this.name = name;
        this.id = id;
        this.year = year;
        this.durationMin = durationMin;
        this.durationSeg = durationSeg;
        this.genre = genre;
        this.author = author;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public int getDurationSeg() {
        return durationSeg;
    }

    public void setDurationSeg(int durationSeg) {
        this.durationSeg = durationSeg;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTotalTime() {
        String durationString = durationMin + "." + durationSeg;
        Float duration = Float.valueOf(durationString);
        return (duration);
    }


    public void display(){
        System.out.println("|" + name + " ID:" + id + " " + year
                + " " + durationMin + ":" + durationSeg + " "
                + genre + " " + author + " " + description + "|");
    }
}
