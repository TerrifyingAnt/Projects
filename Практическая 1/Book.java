public class Book {
    private String genre;
    private String name;

    public Book(String n, String g){
        name = n;
        genre = g;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setGenre(String g){
        this.genre = g;
    }

    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }

    public String toString() {
        return this.name + ", it is " + this.genre;
    }

}