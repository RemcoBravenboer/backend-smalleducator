package com.hva.smalleducator.backendsmalleducator.Feature;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Long> {
    @Override
    List<Question> findAll();
}
