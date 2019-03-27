package com.gabara.complaintservices.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Category category;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Complaint(Category category, Customer customer) {
        this.category = category;
        this.customer = customer;
    }

    public enum Category {
        PRODUCT_CONCERNS, REOCCURRING_ISSUES, CONNECTION_ISSUES, SATISFACTION;
    }
}
