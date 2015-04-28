package org.agoncal.sample.equalshashcode;

import com.thedeanda.lorem.Lorem;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PurchaseOrderTest {

    private final int nbOrderLines = 100;

    @Test
    public void shouldAddDifferentMusicians() {
        Random random = new Random();
        PurchaseOrder purchaseOrder = new PurchaseOrder(random.nextLong(), new LocalDate(2015, 1, 1), new Customer(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971,5,29), Lorem.getPhone(), Lorem.getWords(1), new Address(Lorem.getWords(3), Lorem.getWords(2), Lorem.getWords(2), Lorem.getStateAbbr(), Lorem.getZipCode(), Lorem.getWords(1))));

        // Adding different order lines
        for(int i=0; i<nbOrderLines; i++) {
            purchaseOrder.addOrderLine(new OrderLine(random.nextInt(), new CD(Lorem.getTitle(1,10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock"))));
        }
        assertEquals(nbOrderLines, purchaseOrder.getOrderLines().size());
    }

    @Test
    public void shouldAddTheSameMusicianSeveralTimes() {
        Random random = new Random();
        PurchaseOrder purchaseOrder = new PurchaseOrder(random.nextLong(), new LocalDate(2015, 1, 1), new Customer(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971,5,29), Lorem.getPhone(), Lorem.getWords(1), new Address(Lorem.getWords(3), Lorem.getWords(2), Lorem.getWords(2), Lorem.getStateAbbr(), Lorem.getZipCode(), Lorem.getWords(1))));
        OrderLine orderLine = new OrderLine(random.nextInt(), new CD(Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock")));

        // Adding the same order line several times
        for(int i=0; i<nbOrderLines; i++) {
            purchaseOrder.addOrderLine(orderLine);
        }
        assertEquals(nbOrderLines, purchaseOrder.getOrderLines().size());
    }
}