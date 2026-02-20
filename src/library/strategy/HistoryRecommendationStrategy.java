package library.strategy;

import library.model.Book;
import library.model.Patron;

import java.util.List;

public class HistoryRecommendationStrategy implements RecommendationStrategy {
    public List<Book> recommend (Patron patron , List<Book> allBooks){
            return  allBooks.stream().filter( bk -> patron.getHistory()
                    .stream().anyMatch(
                            b-> b.getAuthor().equals(bk.getAuthor())
                    )
            ).toList();
    }
}
