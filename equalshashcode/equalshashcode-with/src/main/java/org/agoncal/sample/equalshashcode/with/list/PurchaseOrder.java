package org.agoncal.sample.equalshashcode.with.list;

import org.agoncal.sample.equalshashcode.with.Customer;
import org.agoncal.sample.equalshashcode.with.OrderLine;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private Long orderId;
    private transient Integer quantity;
    private LocalDate orderDate;
    private Customer customer;
    private List<OrderLine> orderLines;

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
            orderLines = new ArrayList<>();
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

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}