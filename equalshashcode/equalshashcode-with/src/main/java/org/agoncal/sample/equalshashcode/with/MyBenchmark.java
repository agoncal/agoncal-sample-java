package org.agoncal.sample.equalshashcode.with;

import com.thedeanda.lorem.Lorem;
import org.agoncal.sample.equalshashcode.with.list.CD;
import org.agoncal.sample.equalshashcode.with.map.Inventory;
import org.joda.time.LocalDate;
import org.openjdk.jmh.annotations.Benchmark;

import java.util.Random;

public class MyBenchmark {

    @Benchmark
    public void benchmarkingInventory() {
        Random random = new Random();
        Inventory inventory = new Inventory(12L);
        Book book;
        CD cd;

        for (int i = 0; i < 10000; i++) {
            // Adds a book
            book = new Book(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextInt(), new LocalDate(2014, 12, 4), Language.ENGLISH, new Category("Scifi"), new Author(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getParagraphs(10, 100), Language.FRENCH), new Publisher(Lorem.getWords(3)));
            inventory.addItems(book, 10);
            inventory.getStock().get(book);

            // Adds a CD
            cd = new CD(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"));
            inventory.addItems(cd, 10);
            inventory.getStock().get(cd);
        }
    }
}
