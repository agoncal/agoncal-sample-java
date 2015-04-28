package org.agoncal.sample.equalshashcode.without;

public abstract class Item {
    // ======================================
    // =             Attributes             =
    // ======================================

    protected Long id;
    protected String title;
    protected Float price;
    protected String description;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}