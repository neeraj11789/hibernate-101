package com.neeraj.hibernate101.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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

    public Laptop(String company, Long price) {
        this.company = company;
        this.price = price;
    }
}
