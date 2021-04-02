package com.neeraj.hibernate101.domain;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author neerajgupta
 * @since 02/04/21
 */
@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Name {

    private String firstName;

    private String middleName;

    private String lastName;
}
