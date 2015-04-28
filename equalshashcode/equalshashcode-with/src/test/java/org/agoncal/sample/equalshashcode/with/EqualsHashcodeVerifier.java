package org.agoncal.sample.equalshashcode.with;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;
import org.joda.time.LocalDate;

public class EqualsHashcodeVerifier {

    @Test
    public void shouldVerifyAddress(){
        EqualsVerifier.forClass(Address.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldVerifyAuthor(){
        EqualsVerifier.forClass(Author.class).suppress(Warning.NONFINAL_FIELDS).withPrefabValues(LocalDate.class, new LocalDate(1), new LocalDate(2)).verify();
    }

    @Test
    public void shouldVerifyBook(){
        EqualsVerifier.forClass(Book.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldVerifyCategory(){
        EqualsVerifier.forClass(Category.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldVerifyCustomer(){
        EqualsVerifier.forClass(Customer.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldVerifyGenre(){
        EqualsVerifier.forClass(Genre.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldVerifyMajorLabel(){
        EqualsVerifier.forClass(MajorLabel.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldVerifyMusician(){
        EqualsVerifier.forClass(Musician.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.IDENTICAL_COPY).verify();
    }

    @Test
    public void shouldVerifyOrderLine(){
        EqualsVerifier.forClass(OrderLine.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void shouldVerifyPublisher(){
        EqualsVerifier.forClass(Publisher.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }
}
