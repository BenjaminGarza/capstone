package com.BenGarza.capstone.Models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Objects;

@NoArgsConstructor
@Setter @Getter @ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentModel {

    // Fields
    String email;
    String name;
    String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentModel that = (StudentModel) o;
        return email.equals(that.email) && name.equals(that.name) && password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name, password);
    }
}
