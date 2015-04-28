package org.agoncal.sample.equalshashcode.with;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.LocalDate;

public class Musician extends Person {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String bio;
    private String preferredInstrument;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Musician() {
    }

    public Musician(String firstName, String lastName, LocalDate dateOfBirth, String bio, String preferredInstrument) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bio = bio;
        this.preferredInstrument = preferredInstrument;
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

    public String getPreferredInstrument() {
        return preferredInstrument;
    }

    public void setPreferredInstrument(String preferredInstrument) {
        this.preferredInstrument = preferredInstrument;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Musician)) {
            return false;
        }

        Musician musician = (Musician) o;

        return new EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(firstName, musician.firstName)
                .append(lastName, musician.lastName)
                .append(dateOfBirth, musician.dateOfBirth)
                .append(preferredInstrument, musician.preferredInstrument)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(firstName)
                .append(lastName)
                .append(dateOfBirth)
                .append(preferredInstrument)
                .toHashCode();
    }
}