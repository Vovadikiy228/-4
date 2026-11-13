package zadanie2;

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

class Reader {
    private String name;
    private String favoriteGenre;
    private Book lastBook;

    public Reader(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public void readBook(Book book) {
        lastBook = book;
        book.setRead(true);
    }

    public String getLastBookInfo() {
        if (lastBook == null) {
            return "мне лень читать";
        }

        return lastBook.describe();
    }
}

public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Дмитрий", "Фантастика");
        Reader reader2 = new Reader("Мария", "Детективы");

        Book book1 = new Book("10 Негретят", "Уолтер Шмидт", 945, false);
        Book book2 = new Book("Шерлок Холмс", "Артур Конан Дойл", 250, false);
        Book book3 = new Book("Азазель", "Борис Акунин", 480, false);

        reader1.readBook(book1);
        reader2.readBook(book2);

        System.out.println("Последняя книга Дмитрия:");
        System.out.println(reader1.getLastBookInfo());

        System.out.println();

        System.out.println("Последняя книга Марии:");
        System.out.println(reader2.getLastBookInfo());

        System.out.println();

        System.out.println("Дополнительная книга:");
        System.out.println(book3.describe());
    }
}