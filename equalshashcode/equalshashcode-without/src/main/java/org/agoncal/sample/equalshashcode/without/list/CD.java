package org.agoncal.sample.equalshashcode.without.list;

import org.agoncal.sample.equalshashcode.without.Genre;
import org.agoncal.sample.equalshashcode.without.Item;
import org.agoncal.sample.equalshashcode.without.MajorLabel;
import org.agoncal.sample.equalshashcode.without.Musician;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CD extends Item {
    // ======================================
    // =             Attributes             =
    // ======================================

    private Float totalDuration;
    private MajorLabel label;
    private Genre genre;
    private List<Musician> musicians;

    // ======================================
    // =            Constructors            =
    // ======================================

    public CD() {
    }

    public CD(String title, Float price, String description, Float totalDuration, MajorLabel label, Genre genre) {
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
            musicians = new ArrayList<>();
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

    public List<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }
}