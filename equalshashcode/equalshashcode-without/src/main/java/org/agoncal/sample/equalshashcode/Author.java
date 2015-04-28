package org.agoncal.sample.equalshashcode;

public class Author extends Person
{
   // ======================================
   // =             Attributes             =
   // ======================================

   private String bio;
   private Language preferredLanguage;

   // ======================================
   // =            Constructors            =
   // ======================================

   // ======================================
   // =         Getters & setters          =
   // ======================================

   public String getBio() {
      return bio;
   }

   public void setBio(String bio) {
      this.bio = bio;
   }

   public Language getPreferredLanguage() {
      return preferredLanguage;
   }

   public void setPreferredLanguage(Language preferredLanguage) {
      this.preferredLanguage = preferredLanguage;
   }
}