package com.greenfoxacademy.connectionwithmysl.repositories;
import com.greenfoxacademy.connectionwithmysl.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}

