package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public interface TaskListRepository extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}
