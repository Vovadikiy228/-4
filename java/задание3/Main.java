
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isRead;

    public Book(String title, String author, int pages, boolean isRead) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String describe() {
        return "Книга: " + title + " автор " + author + ", " + pages + " стр., прочитана: " + isRead;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }

        return result;
    }

    public int getTotalPages() {
        int totalPages = 0;

        for (Book book : books) {
            totalPages += book.getPages();
        }

        return totalPages;
    }

    public List<Book> getUnreadBooks() {
        List<Book> unreadBooks = new ArrayList<>();

        for (Book book : books) {
            if (!book.isRead()) {
                unreadBooks.add(book);
            }
        }

        return unreadBooks;
    }
}
public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 =new Book("2033", "Дмитрий Глуховский", 393, false);
        Book book2 =new Book("2033 last light", "Дмитрий Глуховский", 400, false);
        Book book3 =new Book("Метро исход", "Дмитрий Глуховский", 635, false);
        Book book4 = new Book("Муму", "Михаил Бугалков", 230, false);
        Book book5 = new Book("Зачем идти в школу", "Дима Зицера", 672, false);
        Book book6 = new Book("Как управлять рабами", "Джерри Тонер", 440, false);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        System.out.println("Общее количество страниц:");
        System.out.println(library.getTotalPages());

        System.out.println();

        System.out.println("Дмитрий Глуховский:");

        for (Book book : library.findByAuthor("Дмитрий Глуховский")) {
            System.out.println(book.describe());
        }

        System.out.println();

        System.out.println("Непрочитанные книги:");

        for (Book book : library.getUnreadBooks()) {
            System.out.println(book.describe());
        }
    }
}
