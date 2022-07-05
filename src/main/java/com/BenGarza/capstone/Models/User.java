package com.BenGarza.capstone.Models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor
@Setter @Getter @ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(appliesTo = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull @Column(name = "id", nullable = false)
    private Long id;

    // Fields
    // Many users to one course
     @NonNull @Column(name = "email")
     String email;
    @NonNull @Column(name = "name")
     String name;
    @NonNull @Column(name = "password")
     String password;

    public User(@NonNull String email, @NonNull String name, @NonNull String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return email.equals(that.email) && name.equals(that.name) && password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, password);
    }
}
