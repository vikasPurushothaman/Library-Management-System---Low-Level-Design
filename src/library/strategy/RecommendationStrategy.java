package library.strategy;

import library.model.Book;
import library.model.Patron;

import java.util.List;

public interface RecommendationStrategy {
    List<Book> recommend(Patron patron, List<Book> allBooks);
}
