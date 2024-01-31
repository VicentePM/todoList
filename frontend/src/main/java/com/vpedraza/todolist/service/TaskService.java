package com.vpedraza.todolist.service;

import com.vpedraza.todolist.model.Task;
import com.vpedraza.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> listAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> listByName(String name) {
        return taskRepository.findTaskByName(name);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
