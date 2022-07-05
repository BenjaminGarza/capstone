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
@Table(appliesTo = "lesson")
@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

//Lesson id
        //sequence
        //Current timestamp



    //Many lessons to one course
        // Fields
    @NonNull @Column
    Boolean done;
    @NonNull @Column
    String url;



}
