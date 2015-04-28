package org.agoncal.sample.equalshashcode.with;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.LocalDate;

public class Customer extends Person {

    // ======================================
    // =             Attributes             =
    // ======================================

    private String telephone;
    private String email;
    private Address homeAddress;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Customer() {
    }

    public Customer(String firstName, String lastName, LocalDate dateOfBirth, String telephone, String email, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
        this.email = email;
        this.homeAddress = homeAddress;
    }

// ======================================
    // =         Getters & setters          =
    // ======================================

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    // ======================================
    // =   Methods hash, equals, toString   =
    // ======================================

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Customer)) {
            return false;
        }

        Customer customer = (Customer) o;

        return new EqualsBuilder()
                .append(email, customer.email)
                .isEquals();
    }

    @Override
    public final int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(email)
                .toHashCode();
    }
}