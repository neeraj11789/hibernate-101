package com.neeraj.hibernate101.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author neerajgupta
 * @since 02/04/21
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Student(String firstName, String lastName) {
        this.name = new Name(firstName, "", lastName);
    }

    private Name name;

    private String email;

    @ManyToMany
    @ToString.Exclude
    private List<Laptop> laptops = new ArrayList<>();
}
