package org.agoncal.sample.equalshashcode.without.set;

import com.thedeanda.lorem.Lorem;
import org.agoncal.sample.equalshashcode.without.*;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PurchaseOrderTest {

    private Random random = new Random();

    @Test
    public void shouldAddDifferentOrderLines() {
        PurchaseOrder purchaseOrder = new PurchaseOrder(random.nextLong(), new LocalDate(2015, 1, 1), new Customer(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971, 5, 29), Lorem.getPhone(), Lorem.getWords(1), new Address(Lorem.getWords(3), Lorem.getWords(2), Lorem.getWords(2), Lorem.getStateAbbr(), Lorem.getZipCode(), Lorem.getWords(1))));
        OrderLine orderLine1 = new OrderLine(random.nextInt(), new CD(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock")));
        OrderLine orderLine2 = new OrderLine(random.nextInt(), new CD(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock")));

        // Add one order line
        purchaseOrder.addOrderLine(orderLine1);
        assertEquals(1, purchaseOrder.getOrderLines().size());

        // Add a different order line
        purchaseOrder.addOrderLine(orderLine2);
        assertEquals(2, purchaseOrder.getOrderLines().size());

        // Equals and Hashcode
        assertFalse(orderLine1.equals(orderLine2));
        assertFalse(orderLine2.equals(orderLine1));
        assertFalse(orderLine1.hashCode() == orderLine2.hashCode());
    }

    @Test
    public void shouldAddTheSameOrderLineSeveralTimes() {
        PurchaseOrder purchaseOrder = new PurchaseOrder(random.nextLong(), new LocalDate(2015, 1, 1), new Customer(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971,5,29), Lorem.getPhone(), Lorem.getWords(1), new Address(Lorem.getWords(3), Lorem.getWords(2), Lorem.getWords(2), Lorem.getStateAbbr(), Lorem.getZipCode(), Lorem.getWords(1))));
        OrderLine orderLine1 = new OrderLine(random.nextInt(), new CD(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock")));

        // Add one order line
        purchaseOrder.addOrderLine(orderLine1);
        assertEquals(1, purchaseOrder.getOrderLines().size());

        // Add the same order line
        purchaseOrder.addOrderLine(orderLine1);
        assertEquals(1, purchaseOrder.getOrderLines().size());
    }

    @Test
    public void shouldAddTheSameOrderLineSeveralTimesAndChangeIt_Byref() {
        PurchaseOrder purchaseOrder = new PurchaseOrder(random.nextLong(), new LocalDate(2015, 1, 1), new Customer(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971,5,29), Lorem.getPhone(), Lorem.getWords(1), new Address(Lorem.getWords(3), Lorem.getWords(2), Lorem.getWords(2), Lorem.getStateAbbr(), Lorem.getZipCode(), Lorem.getWords(1))));
        OrderLine orderLine1 = new OrderLine(random.nextInt(), new CD(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("EMI"), new Genre("Rock")));

        // Equals and Hashcode
        OrderLine savedOrderLine = orderLine1; // just saves the reference
        assertTrue(orderLine1.equals(savedOrderLine));
        assertTrue(savedOrderLine.equals(orderLine1));
        assertTrue(orderLine1.hashCode() == savedOrderLine.hashCode());

        // Add one order line
        purchaseOrder.addOrderLine(orderLine1);
        assertEquals(1, purchaseOrder.getOrderLines().size());

        // Change the order line and add it
        orderLine1.setItem(new CD(Lorem.getWords(1), Lorem.getTitle(1, 10), random.nextFloat(), Lorem.getParagraphs(10, 50), random.nextFloat(), new MajorLabel("Blue Note"), new Genre("Pop")));
        purchaseOrder.addOrderLine(orderLine1);
        assertEquals(1, purchaseOrder.getOrderLines().size());

        // Equals and Hashcode
        assertTrue(orderLine1.equals(savedOrderLine));
        assertTrue(savedOrderLine.equals(orderLine1));
        assertTrue(orderLine1.hashCode() == savedOrderLine.hashCode());
    }

    @Test
    public void shouldAddTheSameOrderLineSeveralTimesAndChangeIt_Bycopy() {
        PurchaseOrder purchaseOrder = new PurchaseOrder(random.nextLong(), new LocalDate(2015, 1, 1), new Customer(Lorem.getFirstName(), Lorem.getLastName(), new LocalDate(1971,5,29), Lorem.getPhone(), Lorem.getWords(1), new Address(Lorem.getWords(3), Lorem.getWords(2), Lorem.getWords(2), Lorem.getStateAbbr(), Lorem.getZipCode(), Lorem.getWords(1))));
        OrderLine orderLine1 = new OrderLine(1, new CD("isbn", "title", 12F, "description", 10F, new MajorLabel("EMI"), new Genre("Rock")));
        OrderLine orderLine2 = new OrderLine(1, new CD("isbn", "title", 12F, "description", 10F, new MajorLabel("EMI"), new Genre("Rock")));

        // Equals and Hashcode
        assertFalse(orderLine1.equals(orderLine2));
        assertFalse(orderLine2.equals(orderLine1));
        assertFalse(orderLine1.hashCode() == orderLine2.hashCode());

        // Add one order line
        purchaseOrder.addOrderLine(orderLine1);
        assertEquals(1, purchaseOrder.getOrderLines().size());

        // Add a different order line but with same values
        purchaseOrder.addOrderLine(orderLine2);
        assertEquals(2, purchaseOrder.getOrderLines().size());

        // Equals and Hashcode
        assertFalse(orderLine1.equals(orderLine2));
        assertFalse(orderLine2.equals(orderLine1));
        assertFalse(orderLine1.hashCode() == orderLine2.hashCode());
    }
}