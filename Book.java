package book;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    int numberOfPages;

    // Constructor for the Book class
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
}

public class BookInputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter the number of pages: ");
        int numberOfPages = scanner.nextInt();

        scanner.nextLine();

        Book myBook = new Book(title, author, numberOfPages);

        System.out.println("The Book title is: " + myBook.title);
        System.out.println("The Book author is: " + myBook.author);
        System.out.println("The book has " + myBook.numberOfPages + " pages.");

        scanner.close();
    }
}