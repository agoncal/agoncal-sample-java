package org.agoncal.sample.equalshashcode;

public class Genre
{
   // ======================================
   // =             Attributes             =
   // ======================================

   private Long id;
   private String name;

   // ======================================
   // =            Constructors            =
   // ======================================

   public Genre() {
   }

   public Genre(String name) {
      this.name = name;
   }

// ======================================
   // =         Getters & setters          =
   // ======================================

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}