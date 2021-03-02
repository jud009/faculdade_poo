package atividade_5;

public class Book {

    private String author;
    private Integer publishYear;
    private String publisher;

    public Book(String author, Integer publishYear, String publisher) {
        this.author = author;
        this.publishYear = publishYear;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
