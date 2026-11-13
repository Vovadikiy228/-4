
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

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String describe() {
        return "Книга: " + title + " автор " + author + ", " + pages + " стр., прочитана: " + isRead;
    }
}

public class Main {
    public static void main(String[] args) {

        Book[] books = {
            new Book("2033", "Дмитрий Глуховский", 384, false),
            new Book("2033 last light", "Дмитрий Глуховский", 400, false),
            new Book("Метро исход", "Дмитрий Глуховский", 635, false)
        };

        for (Book book : books) {
            System.out.println(book.describe());
        }
    }
}