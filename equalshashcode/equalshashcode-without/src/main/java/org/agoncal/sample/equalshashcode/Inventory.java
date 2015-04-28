package org.agoncal.sample.equalshashcode;

import java.util.Map;

public class Inventory
{
   // ======================================
   // =             Attributes             =
   // ======================================

   private Long id;
   private Long warehouseId;
   private Map<Item, Integer> stock;

   // ======================================
   // =            Constructors            =
   // ======================================

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