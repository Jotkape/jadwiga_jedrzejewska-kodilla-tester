package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList1 = new TaskList("Test List 1", "This is the first test list");
        TaskList taskList2 = new TaskList("Test List 2", "This is the second test list");
        taskListRepository.save(taskList1);
        taskListRepository.save(taskList2);

        // When
        List<TaskList> result = taskListRepository.findByListName("Test List 1");

        // Then
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("Test List 1", result.get(0).getListName());
        Assertions.assertEquals("This is the first test list", result.get(0).getDescription());

        // Clean up
        taskListRepository.delete(taskList1);
        taskListRepository.delete(taskList2);
    }
}
