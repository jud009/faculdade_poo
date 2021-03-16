package lista_2.domain;

import java.util.Date;
import java.util.Objects;

public class Book{

    private String bookId;
    private String author;
    private String name;
    private String publisherName;
    private Date publishedYear;

    public Book() {
    }

    protected Book(String bookId, String author, String name, String publisherName, Date publishedYear) {
        this.author = author;
        this.name = name;
        this.publisherName = publisherName;
        this.publishedYear = publishedYear;
        this.bookId = bookId;
    }

    public static class Builder {

        private String bookId;
        private String name;
        private String author;
        private String publisherName;
        private Date publishedYear;


        public Builder addId(String id) {
            this.bookId = id;
            return this;
        }

        public Builder addName(String name) {
            this.name = name;
            return this;
        }

        public Builder addAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder addPublisherName(String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public Builder addPublishYear(Date publishedYear) {
            this.publishedYear = publishedYear;
            return this;
        }

        public Book build() {
            return new Book(bookId, author, name, publisherName, publishedYear);
        }
    }

    public String getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Date getPublishedYear() {
        return publishedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}
