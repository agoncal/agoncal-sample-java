package org.agoncal.sample.equalshashcode.with.set;

import org.agoncal.sample.equalshashcode.with.Customer;
import org.agoncal.sample.equalshashcode.with.OrderLine;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PurchaseOrder {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private Long orderId;
    private transient Integer quantity;
    private LocalDate orderDate;
    private Customer customer;
    private Set<OrderLine> orderLines;

    // ======================================
    // =            Constructors            =
    // ======================================

    public PurchaseOrder() {
    }

    public PurchaseOrder(Long orderId, LocalDate orderDate, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    // ======================================
    // =          Business methods          =
    // ======================================

    public void addOrderLine(OrderLine orderLine) {
        if (orderLines == null) {
            orderLines = new HashSet<>();
        }
        orderLines.add(orderLine);
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getTotalQuantity() {
        Integer quantity = 0;
        for (OrderLine orderLine : orderLines) {
            quantity += orderLine.getQuantity();
        }
        return quantity;
    }

    public Float getTotalAmount() {
        Float total = 0F;
        for (OrderLine orderLine : orderLines) {
            total += orderLine.getQuantity() * orderLine.getItem().getPrice();
        }
        return total;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}