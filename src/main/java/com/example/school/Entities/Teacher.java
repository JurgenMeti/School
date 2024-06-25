package com.example.school.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@Table (name = "teacher")
public class Teacher {
    @Id
    @UuidGenerator
    @GeneratedValue
    @Column(name = "teacher_id")
    private int ID;
    @Column(name = "name")
    private String Name;
    @Column(name = "subject")
    private String Subject;
    @Column(name="email")
    private String Email;
    @Column(name = "number")
    private double Number;

    @NotNull
    private Roles roles;
}
