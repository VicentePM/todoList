package com.vpedraza.todolist.controller;

import com.vpedraza.todolist.model.Libro;
import com.vpedraza.todolist.model.Task;
import com.vpedraza.todolist.service.LibroService;
import com.vpedraza.todolist.service.TaskService;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todolist")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private LibroService libroService;

    @GetMapping("all")
    public List<Task> taskList() {
        return taskService.listAllTasks();
    }

    @GetMapping("/{name}")
    public List<Task> tasksByName(@PathVariable String name) {
        return taskService.listByName(name);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable Long id) {
        Libro libro = libroService.findById(id);
        if(libro == null) {
            return new ResponseEntity<>("Id debe ser numerico", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
