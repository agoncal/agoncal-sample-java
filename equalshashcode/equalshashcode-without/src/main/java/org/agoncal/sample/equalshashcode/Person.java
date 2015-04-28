package org.agoncal.sample.equalshashcode;

import org.joda.time.LocalDate;

public abstract class Person
{
   // ======================================
   // =             Attributes             =
   // ======================================

   protected Long id;
   protected String firstName;
   protected String lastName;
   protected LocalDate dateOfBirth;
   protected transient Integer age;

   // ======================================
   // =         Getters & setters          =
   // ======================================

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public LocalDate getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public Integer getAge() {
      return age;
   }

   public void setAge(Integer age) {
      this.age = age;
   }
}