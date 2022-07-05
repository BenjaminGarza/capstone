package com.BenGarza.capstone.Models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(appliesTo = "course")
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;




//id

    //list of lessons Many Lessons to one course

    //One course to many lessons
    //One course to many students

    // Fields
    @NonNull @Column
    String name;
    @NonNull @Column
    Double price;

    @NonNull @Column
    String description;

    public Course(@NonNull String name, @NonNull Double price, @NonNull String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
