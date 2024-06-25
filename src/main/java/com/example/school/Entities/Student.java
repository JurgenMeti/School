package com.example.school.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@Table (name = "students")
public class Student {
    @Id
    @UuidGenerator
    @GeneratedValue
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "date_of_birth")
    private int dateOfBirth;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "email")
    private String email;
    @Column (name = "phone")
    private String phone;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "roles")
    private Roles roles;
}
