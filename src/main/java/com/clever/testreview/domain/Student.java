package com.clever.testreview.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data // Не рекомендуется для JPA-сущностей!
@Entity
@ToString // Может вызвать StackOverflowError из-за циклов!
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "students")
    private Set<Lesson> lessons = new HashSet<>();
}