package org.agoncal.sample.equalshashcode.with.list;

import com.thedeanda.lorem.Lorem;
import org.agoncal.sample.equalshashcode.with.Genre;
import org.agoncal.sample.equalshashcode.with.MajorLabel;
import org.agoncal.sample.equalshashcode.with.Musician;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CDTest {

    @Test
    public void shouldAddDifferentMusicians() {
        Random random = new Random();
        CD cd = new CD(Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"));
        Musician musician1 = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100, 500), Lorem.getWords(1));
        Musician musician2 = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100, 500), Lorem.getWords(1));

        // Add one musician
        cd.addMusician(musician1);
        assertEquals(1, cd.getMusicians().size());

        // Add a different one
        cd.addMusician(musician2);
        assertEquals(2, cd.getMusicians().size());

        // Equals and Hashcode
        assertFalse(musician1.equals(musician2));
        assertFalse(musician2.equals(musician1));
        assertFalse(musician1.hashCode() == musician2.hashCode());
    }

    @Test
    public void shouldAddTheSameMusicianSeveralTimes() {
        Random random = new Random();
        CD cd = new CD(Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"));
        Musician musician1 = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100, 500), Lorem.getWords(1));

        // Add one musician
        cd.addMusician(musician1);
        assertEquals(1, cd.getMusicians().size());

        // Add the same musician
        cd.addMusician(musician1);
        assertEquals(2, cd.getMusicians().size());
    }

    @Test
    public void shouldAddTheSameMusicianSeveralTimesAndChangeIt() {
        Random random = new Random();
        CD cd = new CD(Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"));
        Musician musician1 = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100, 500), Lorem.getWords(1));

        // Equals and Hashcode
        Musician saveMusician = musician1;
        assertTrue(musician1.equals(saveMusician));
        assertTrue(saveMusician.equals(musician1));
        assertTrue(musician1.hashCode() == saveMusician.hashCode());

        // Add one musician
        cd.addMusician(musician1);
        assertEquals(1, cd.getMusicians().size());

        // Change the musician and add it
        musician1.setBio(Lorem.getParagraphs(10,40));
        cd.addMusician(musician1);
        assertEquals(2, cd.getMusicians().size());

        // Equals and Hashcode
        assertTrue(musician1.equals(saveMusician));
        assertTrue(saveMusician.equals(musician1));
        assertTrue(musician1.hashCode() == saveMusician.hashCode());
    }
}