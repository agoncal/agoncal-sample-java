package org.agoncal.sample.equalshashcode.without;

import org.joda.time.LocalDate;

public class Author extends Person {
    // ======================================
    // =             Attributes             =
    // ======================================

    private String bio;
    private Language preferredLanguage;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Author() {
    }

    public Author(String firstName, String lastName, LocalDate dateOfBirth, String bio, Language preferredLanguage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bio = bio;
        this.preferredLanguage = preferredLanguage;
    }

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