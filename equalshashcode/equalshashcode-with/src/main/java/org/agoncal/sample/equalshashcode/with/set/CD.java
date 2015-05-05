package org.agoncal.sample.equalshashcode.with.set;

import org.agoncal.sample.equalshashcode.with.Genre;
import org.agoncal.sample.equalshashcode.with.Item;
import org.agoncal.sample.equalshashcode.with.MajorLabel;
import org.agoncal.sample.equalshashcode.with.Musician;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.HashSet;
import java.util.Set;

public class CD extends Item {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Float totalDuration;
    private MajorLabel label;
    private Genre genre;
    private Set<Musician> musicians;

    // ======================================
    // =            Constructors            =
    // ======================================

    public CD() {
    }

    public CD(String isbn, String title, Float price, String description, Float totalDuration, MajorLabel label, Genre genre) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.description = description;
        this.totalDuration = totalDuration;
        this.label = label;
        this.genre = genre;
    }

    // ======================================
    // =          Business methods          =
    // ======================================

    public void addMusician(Musician musician) {
        if (musicians == null) {
            musicians = new HashSet<>();
        }
        musicians.add(musician);
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public Float getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Float totalDuration) {
        this.totalDuration = totalDuration;
    }

    public MajorLabel getLabel() {
        return label;
    }

    public void setLabel(MajorLabel label) {
        this.label = label;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Set<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(Set<Musician> musicians) {
        this.musicians = musicians;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof CD)) {
            return false;
        }

        CD cd = (CD) o;

        return new EqualsBuilder()
                .append(isbn, cd.isbn)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(isbn)
                .toHashCode();
    }
}