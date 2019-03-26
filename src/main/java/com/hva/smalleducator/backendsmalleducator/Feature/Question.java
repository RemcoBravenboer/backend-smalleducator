package com.hva.smalleducator.backendsmalleducator.Feature;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "question")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "question", nullable = false)
    @NotBlank
    @NotNull
    public String question;

    @Column(name = "lessonName", nullable = false)
    @NotBlank
    @NotNull
    public String lessonName;
}
