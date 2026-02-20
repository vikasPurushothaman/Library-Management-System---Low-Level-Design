import library.factory.BookFactory;
import library.model.Book;
import library.model.Patron;
import library.service.LendingService;
import library.service.LibraryService;
import library.strategy.HistoryRecommendationStrategy;
import library.strategy.RecommendationStrategy;

import java.util.List;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        LendingService lendingService = new LendingService();

        Book book = BookFactory.creatBook(
                "ISBN001", "Clean Code", "Robert Martin", 2008
        );
        Book book2 = BookFactory.creatBook("ISBN002", "Effective Java", "Joshua Bloch", 2018);
        Book book3 = BookFactory.creatBook("ISBN003", "Clean Architecture", "Robert Martin", 2017);

        libraryService.addBook(book);
        libraryService.addBook(book2);
        libraryService.addBook(book3);
        logger.info("Books added to library.");


        Patron patron = new Patron("P001", "Vikas");
        libraryService.addPatron(patron);
        logger.info("Patron added.");

        lendingService.checkOutBook(book3, patron);
        logger.info("Book checked out: " + book3.getIsbin());

        lendingService.returnBooks(book3, patron);
        logger.info("Book returned: " + book3.getIsbin());


        RecommendationStrategy strategy = new HistoryRecommendationStrategy();
        List<Book> recommendations = strategy.recommend(
                patron,
                libraryService.getAllBooks()
        );
        System.out.println("Recommended Books:");
        recommendations.forEach(b ->
                System.out.println("- " + b.getTitle())
        );

    }
}