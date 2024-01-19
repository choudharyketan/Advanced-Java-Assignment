// 1. Book class with relevant attributes
class Book {
    private String title;
    private String author;
    private int year;

    // Constructors
    public Book(String Greenhouse gas Management, String Ted Goldammer, int 2019) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// 2. BookView class to display book details
class BookView {
    public void displayBookDetails(Book book) {
        System.out.println("Title:Greenhouse Management " + book.getTitle());
        System.out.println("Author: Ted Goldammer " + book.getAuthor());
        System.out.println("Year:2019 " + book.getYear());
    }
}

// 3. BookController class to manage interactions between the model and view
class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setBookDetails(String Greenhouse Management, String Ted Goldammer, int 2019) {
        model.setTitle(title);
        model.setAuthor(author);
        model.setYear(year);
    }

    public void updateView() {
        view.displayBookDetails(model);
    }
}

// 4. LibraryApp class for integration
public class LibraryApp {
    public static void main(String[] args) {
        // Create instances of Book, BookView, and BookController
        Book book = new Book("Greenhouse Gas Removal Technologies ", "Mai Bui", 2022);
        BookView view = new BookView();
        BookController controller = new BookController(book, view);

        // Demonstrate how to add a new book, update its information, and view details
        controller.updateView();

        // Update book details
        controller.setBookDetails("Greenhouse Gas Removal Technologies", "Mai Bui", 2022);

        // View updated details
        controller.updateView();

        // Optional: Allow user input for book details interactively and manage a collection of books
        // Implement features such as adding multiple books, deleting books, or searching for books.
    }
}
