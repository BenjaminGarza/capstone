package com.BenGarza.capstone.Models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;

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

    @Column
    double price;

    @NonNull @Column
    Date date;

    public Purchase(double price, @NonNull Date date) {
        this.price = price;
        this.date = date;
    }
}
