package org.agoncal.sample.equalshashcode.with;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
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

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Author)) {
            return false;
        }

        Author author = (Author) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(firstName, author.firstName)
                .append(lastName, author.lastName)
                .append(dateOfBirth, author.dateOfBirth)
                .append(preferredLanguage, author.preferredLanguage)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(firstName)
                .append(lastName)
                .append(dateOfBirth)
                .append(preferredLanguage)
                .toHashCode();
    }
}