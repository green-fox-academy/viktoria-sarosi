package com.greenfoxacademy.connectionwithmysl.repositories;

import com.greenfoxacademy.connectionwithmysl.models.entities.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {


    Iterable<Todo> findAllByIsDone(Boolean isActive);

    Iterable<Todo> findAllByOrderByIdAsc();

    Iterable<Todo> findAllByTitleContaining(String titleFragment);

    Iterable<Todo> findAllByAssigneeContaining(String fragment);

    Iterable<Todo> findAllByAssigneeContainingAndIsDone(String fragment, String isActive);

    Iterable<Todo> findAllByTitleContainingAndIsDone(String titleFragment, String isActive);

}

