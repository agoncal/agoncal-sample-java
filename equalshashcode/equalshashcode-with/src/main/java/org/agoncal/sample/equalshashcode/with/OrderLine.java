package org.agoncal.sample.equalshashcode.with;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class OrderLine {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Integer quantity;
    private Item item;

    // ======================================
    // =            Constructors            =
    // ======================================

    public OrderLine() {
    }

    public OrderLine(Integer quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    // ======================================
    // =         Getters & setters          =
    // ======================================

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof OrderLine)) {
            return false;
        }

        OrderLine orderLine = (OrderLine) o;

        return new EqualsBuilder()
                .append(quantity, orderLine.quantity)
                .append(item, orderLine.item)
                .isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(quantity)
                .append(item)
                .toHashCode();
    }
}