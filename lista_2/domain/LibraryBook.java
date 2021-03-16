package lista_2.domain;

import java.text.SimpleDateFormat;

public class LibraryBook extends Book {

    private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public enum Status {
        AVAILABLE,
        BORROWED,
        NOT_FOUND
    }

    private Status status;

    public LibraryBook() {
        super();
    }

    public LibraryBook(Book book, Status status) {
        super(book.getBookId(), book.getAuthor(), book.getName(),
                book.getPublisherName(), book.getPublishedYear());
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome do livro: ").append(this.getName())
                .append("\nAutor: ").append(this.getAuthor())
                .append("\nAno de publicação: ").append(sdf.format(this.getPublishedYear()))
                .append("\nstatus: ").append(status.toString());

        return sb.toString();
    }
}
