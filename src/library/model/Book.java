package library.model;

// Book Model
public class Book {
    private final String isbin;
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;

    public Book(String isbin , String title, String author, int publicationYear) {
            this.isbin = isbin;
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
            this.available = true;

    }

    public  void markBorrowed(){
                this.available = false;
    }

    public  void markReturned () {
        this.available = true;
    }
    public  boolean isAvailable() {
            return available;
    }

    public String getIsbin () {
        return  isbin;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}

