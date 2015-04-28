package org.agoncal.sample.equalshashcode.with.map;

import com.thedeanda.lorem.Lorem;
import org.agoncal.sample.equalshashcode.with.*;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class InventoryTest {

    private Random random = new Random();

    @Test
    public void shouldAddDifferentItems() {
        Inventory inventory = new Inventory(12L);
        Book book1 = new Book(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextInt(), new LocalDate(2014, 12, 4), Language.ENGLISH, new Category("Scifi"), new Author(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(10,100), Language.FRENCH), new Publisher(Lorem.getWords(3)));
        Book book2 = new Book(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextInt(), new LocalDate(2014, 12, 4), Language.ENGLISH, new Category("Scifi"), new Author(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(10,100), Language.FRENCH), new Publisher(Lorem.getWords(3)));

        // Adds an item to the inventory
        inventory.addItems(book1, 10);
        assertEquals(1, inventory.getStock().size());
        assertEquals(10, inventory.getStock().get(book1).intValue());

        // Adds another item to the inventory
        inventory.addItems(book2, 30);
        assertEquals(2, inventory.getStock().size());
        assertEquals(30, inventory.getStock().get(book2).intValue());
    }

    @Test
    public void shouldAddSameItem() {
        Inventory inventory = new Inventory(12L);
        Book book1 = new Book(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextInt(), new LocalDate(2014, 12, 4), Language.ENGLISH, new Category("Scifi"), new Author(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(10,100), Language.FRENCH), new Publisher(Lorem.getWords(3)));

        // Adds an item to the inventory
        inventory.addItems(book1, 10);
        assertEquals(1, inventory.getStock().size());
        assertEquals(10, inventory.getStock().get(book1).intValue());

        // Adds an item to the inventory
        inventory.addItems(book1, 30);
        assertEquals(1, inventory.getStock().size());
        assertEquals(40, inventory.getStock().get(book1).intValue());
    }
}
