package org.agoncal.sample.equalshashcode.with.map;

import org.agoncal.sample.equalshashcode.with.Item;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private Long warehouseId;
    private Map<Item, Integer> stock;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Inventory() {
    }

    public Inventory(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    // ======================================
    // =          Business methods          =
    // ======================================

    public void addItems(Item item, Integer quantity) {
        if (stock == null) {
            stock = new HashMap<>();
        }

        if (stock.containsKey(item)) {
            Integer q = stock.get(item);
            stock.put(item, q + quantity);
        } else {
            stock.put(item, quantity);
        }
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

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Map<Item, Integer> getStock() {
        return stock;
    }

    public void setStock(Map<Item, Integer> stock) {
        this.stock = stock;
    }
}