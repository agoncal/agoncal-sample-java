package org.agoncal.sample.equalshashcode;

import org.joda.time.LocalDate;

import java.util.Date;

public class Book extends Item
{
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