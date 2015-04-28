package org.agoncal.sample.equalshashcode;

import com.thedeanda.lorem.Lorem;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class MusicianTest {

    @Test
    public void shouldCheckLongBio() {
        Musician musician = new Musician(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(100,500), Lorem.getWords(1));
        assertNotNull(musician.hashCode());
    }

}