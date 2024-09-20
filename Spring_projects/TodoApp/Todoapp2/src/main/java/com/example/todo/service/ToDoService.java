package com.example.todo.service;

import com.example.todo.model.ToDo;
import com.example.todo.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo save(ToDo todo) {
        return toDoRepository.save(todo);
    }

    public ToDo update(Long id, ToDo todoDetails) {
        ToDo todo = toDoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ToDo not found"));
        todo.setContent(todoDetails.getContent());
        return toDoRepository.save(todo);
    }

    public void delete(Long id) {
        toDoRepository.deleteById(id);
    }
}
