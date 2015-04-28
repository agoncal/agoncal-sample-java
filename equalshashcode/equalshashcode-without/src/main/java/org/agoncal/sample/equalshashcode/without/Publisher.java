package org.agoncal.sample.equalshashcode.without;

public class Publisher {
    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private String name;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}