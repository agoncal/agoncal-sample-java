package org.agoncal.sample.equalshashcode.with;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.LocalDate;

public class Book extends Item {

    // ======================================
    // =             Attributes             =
    // ======================================

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

    public Book(String isbn, String title, Float price, String description, Integer nbOfPages, LocalDate publicationDate, Language language, Category category, Author author, Publisher publisher) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.description = description;
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

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Book)) {
            return false;
        }

        Book book = (Book) o;

        return new EqualsBuilder()
                .append(isbn, book.isbn)
                .isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(isbn)
                .toHashCode();
    }
}