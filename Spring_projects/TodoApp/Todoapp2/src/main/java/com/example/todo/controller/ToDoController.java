package com.example.todo.controller;

import com.example.todo.model.ToDo;
import com.example.todo.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {

    private final ToDoService todoService;

    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }

    // ホーム画面（ToDoリストの表示）
    @GetMapping("/todos")
    public String getAllTodos(Model model) {
        model.addAttribute("todos", todoService.findAll());
        return "todo-list"; // todo-list.htmlを返す
    }

    // ToDoの追加
    @PostMapping("/todos/add")
    public String addTodo(@RequestParam String content) {
        ToDo todo = new ToDo();
        todo.setContent(content);
        todoService.save(todo);
        return "redirect:/todos"; // 追加後、リストにリダイレクト
    }

    // ToDoの削除
    @PostMapping("/todos/delete")
    public String deleteTodo(@RequestParam Long id) {
        todoService.delete(id);
        return "redirect:/todos"; // 削除後、リストにリダイレクト
    }

    // ToDoの編集
    @PostMapping("/todos/edit")
    public String editTodo(@RequestParam Long id, @RequestParam String content) {
        ToDo todo = todoService.update(id, new ToDo(content));
        return "redirect:/todos"; // 編集後、リストにリダイレクト
    }
}
