package com.kodilla.hibernate.manytomany.repository;

import com.kodilla.hibernate.task.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
