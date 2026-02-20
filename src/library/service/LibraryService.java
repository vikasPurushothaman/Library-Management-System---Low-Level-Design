package library.service;
import library.model.Patron;
import library.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService{
    private Map<String, Book> bookMap = new HashMap<>();
    private Map<String, Patron> patronMap = new HashMap<>();

    public void addBook(Book book) {
        bookMap.put(book.getIsbin() , book);
    }

    public  void removeBook(String isbn) {
        bookMap.remove(isbn);
    }

    public Book searchBook(String isbn) {
        return bookMap.get(isbn);
    }

    public List<Book> searchByTitle(String title){
            return bookMap.values().stream().filter(
                    b -> b.getTitle().equalsIgnoreCase(title)
             ).toList();
    }
    public  void addPatron(Patron patron ){
        patronMap.put(patron.getId(), patron);
    }


    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

}
