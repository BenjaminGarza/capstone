package com.BenGarza.capstone.Models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import javax.print.attribute.standard.DateTimeAtCompleted;
import java.math.BigDecimal;
import java.util.Objects;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(appliesTo = "purchase")
@Entity
public class Purchase {



    //has one user
    //has many courses

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull @Column
    BigDecimal Price;



}
