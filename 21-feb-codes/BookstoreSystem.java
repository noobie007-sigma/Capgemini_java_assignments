import java.util.*;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}

class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }
}

class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Double.compare(b1.getPrice(), b2.getPrice());
    }
}

public class BookstoreSystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Alchemist", "Paulo Coelho", 299.0));
        books.add(new Book("harry potter", "J.K. Rowling", 399.0));
        books.add(new Book("1984", "George Orwell", 199.0));
        books.add(new Book("Clean Code", "Robert C. Martin", 499.0));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 450.0));

        System.out.println("Books before sorting:");
        for (Book b : books) System.out.println(b);

        Collections.sort(books, new BookTitleComparator());
        System.out.println("\nBooks after sorting by title (case-insensitive):");
        for (Book b : books) System.out.println(b);

        Collections.sort(books, new BookPriceComparator());
        System.out.println("\nBooks after sorting by price (ascending):");
        for (Book b : books) System.out.println(b);
    }
}
