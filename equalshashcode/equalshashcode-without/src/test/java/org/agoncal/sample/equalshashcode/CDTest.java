package org.agoncal.sample.equalshashcode;

import com.thedeanda.lorem.Lorem;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CDTest {

    private final int nbMusicians = 100;

    @Test
    public void shouldAddDifferentMusicians() {
        Random random = new Random();
        CD cd = new CD(Lorem.getTitle(1,10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"));

        for(int i=0; i<nbMusicians; i++) {
            cd.addMusician(new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100, 500), Lorem.getWords(1)));
        }
        assertEquals(nbMusicians, cd.getMusicians().size());
    }

    @Test
    public void shouldAddTheSameMusicianSeveralTimes() {
        Random random = new Random();
        CD cd = new CD(Lorem.getTitle(1,10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"));
        Musician musican = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100,500), Lorem.getWords(1));
        for(int i=0; i<nbMusicians; i++) {
            cd.addMusician(musican);
        }
        assertEquals(1, cd.getMusicians().size());
    }


    @Test
    public void shouldAddTheSameMusicianSeveralTimesAndChangeIt() {
        Random random = new Random();
        CD cd = new CD(Lorem.getTitle(1,10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"));
        Musician musican = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100,500), Lorem.getWords(1));
        for(int i=0; i<nbMusicians; i++) {
            cd.addMusician(musican);
        }
        assertEquals(1, cd.getMusicians().size());

        // Changing the musician object
        musican = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100,500), Lorem.getWords(1));
        for(int i=0; i<nbMusicians; i++) {
            cd.addMusician(musican);
        }
        assertEquals(2, cd.getMusicians().size());
    }
}