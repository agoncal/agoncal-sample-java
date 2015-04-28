package org.agoncal.sample.equalshashcode.without;

import org.apache.commons.lang3.builder.ToStringBuilder;
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
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("dateOfBirth", dateOfBirth)
                .append("bio", bio)
                .append("preferredInstrument", preferredInstrument)
                .toString();
    }
}