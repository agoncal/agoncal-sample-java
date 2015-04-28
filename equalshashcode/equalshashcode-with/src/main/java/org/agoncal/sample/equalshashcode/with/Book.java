package org.agoncal.sample.equalshashcode.with;

import org.joda.time.LocalDate;

public class Book extends Item {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String isbn;
    private Integer nbOfPages;
    private LocalDate publicationDate;
    private Language language;
    private Category category;
    private Author author;
    private Publisher publisher;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Book() {
    }

    public Book(String title, Float price, String description, String isbn, Integer nbOfPages, LocalDate publicationDate, Language language, Category category, Author author, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.isbn = isbn;
        this.nbOfPages = nbOfPages;
        this.publicationDate = publicationDate;
        this.language = language;
        this.category = category;
        this.author = author;
        this.publisher = publisher;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}