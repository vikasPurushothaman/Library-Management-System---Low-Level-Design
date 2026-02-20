package library.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Patron {
private final String id;
private String name;
private List<Book> borrowedBooks = new ArrayList<>();
private List<Book> history = new ArrayList<>();


public  Patron (String id, String name) {
    this.id = id;
    this.name = name;
}

public void borrowedBooks(Book book) {
    borrowedBooks.add(book);
    history.add(book);
}

public  void returnBooks(Book book) {
    borrowedBooks.remove(book);
}

public List<Book> getHistory() {
    return  history;
}

public String getId () {
    return id;
}



}