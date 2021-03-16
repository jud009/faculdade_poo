package lista_2.application;

import lista_2.domain.Book;
import lista_2.domain.BookStore;
import lista_2.domain.LibraryBook;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Book b1 = new Book.Builder().addId("b1").addAuthor("author1").
                addName("name1").addPublisherName("publisher1").addPublishYear(new Date()).build();

        Book b2 = new Book.Builder().addId("b2").addAuthor("author2")
                .addName("name2").addPublisherName("publisher2").addPublishYear(new Date()).build();

        Book b3 = new Book.Builder().addId("b3").addAuthor("author3")
                .addName("name3").addPublisherName("publisher3").addPublishYear(new Date()).build();

        List<LibraryBook> library = List.of(
                new LibraryBook(b1, LibraryBook.Status.AVAILABLE),
                new LibraryBook(b2, LibraryBook.Status.BORROWED),
                new LibraryBook(b3, LibraryBook.Status.NOT_FOUND)
        );

        List<BookStore> store = List.of(
                new BookStore(b1, BookStore.Status.SOLD),
                new BookStore(b2, BookStore.Status.SOLD),
                new BookStore(b3, BookStore.Status.AVAILABLE),
                new BookStore(b3, BookStore.Status.NOT_FOUND)
        );

        display("livro livraria");
        for (BookStore item : store) {
            System.out.println(item);
            System.out.println();
        }
        display("Livro biblioteca");
        for (LibraryBook item : library) {
            System.out.println(item);
            System.out.println();
        }

    }

    public static void display(String msg) {
        System.out.println("-------------------------------------------");
        System.out.println(msg.toUpperCase());
        System.out.println("-------------------------------------------");
    }
}
