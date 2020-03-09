package com.greenfoxacademy.connectionwithmysl.repositories;

import com.greenfoxacademy.connectionwithmysl.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
