package org.agoncal.sample.equalshashcode.without;

import com.thedeanda.lorem.Lorem;
import org.agoncal.sample.equalshashcode.without.list.CD;
import org.agoncal.sample.equalshashcode.without.map.Inventory;
import org.joda.time.LocalDate;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.Random;

public class MyBenchmark {

    @Benchmark
    public void benchmarkingDifferentInventory() {
        Random random = new Random();
        Inventory inventory = new Inventory(12L);
        Book book;
        CD cd;

        for (int i = 0; i < 10000; i++) {
            // Adds a book
            book = new Book("ISBN", "Title", 1F, "Description", 1, new LocalDate(2014, 12, 4), Language.ENGLISH, new Category("Scifi"), new Author("FirstName", "LastName", new LocalDate(1971, 5, 29), "bio", Language.FRENCH), new Publisher(Lorem.getWords(3)));
            inventory.addItems(book, 10);
            inventory.getStock().get(book);

            // Adds a CD
            cd = new CD("ISBN", "Title", 1F, "Description", 1F, new MajorLabel("EMI"), new Genre(Lorem.getWords(3)));
            inventory.addItems(cd, 10);
            inventory.getStock().get(cd);
        }
    }

    //@Benchmark
    public void benchmarkingSameInventory() {
        Random random = new Random();
        Inventory inventory = new Inventory(12L);
        Book book = new Book("ISBN", "Title", 1F, "Description", 1, new LocalDate(2014, 12, 4), Language.ENGLISH, new Category("Scifi"), new Author("FirstName", "LastName", new LocalDate(1971, 5, 29), "bio", Language.FRENCH), new Publisher(Lorem.getWords(3)));
        CD cd = new CD("ISBN", "Title", 1F, "Description", 1F, new MajorLabel("EMI"), new Genre(Lorem.getWords(3)));

        for (int i = 0; i < 10000; i++) {
            // Adds a book
            inventory.addItems(book, 10);
            inventory.getStock().get(book);

            // Adds a CD
            inventory.addItems(cd, 10);
            inventory.getStock().get(cd);
        }
    }
}
