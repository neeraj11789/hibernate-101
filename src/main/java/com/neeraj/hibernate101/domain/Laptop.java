package com.neeraj.hibernate101.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author neerajgupta
 * @since 02/04/21
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String company;

    private Long price;

    @ToString.Exclude
    @ManyToOne
    private Student student;

    public Laptop(String company, Long price) {
        this.company = company;
        this.price = price;
    }
}
