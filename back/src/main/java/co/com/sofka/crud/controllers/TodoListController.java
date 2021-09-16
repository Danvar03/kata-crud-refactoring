package co.com.sofka.crud.controllers;

import co.com.sofka.crud.entity.TodoList;
import co.com.sofka.crud.services.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoListController {

    @Autowired
    private TodoListService listService;

    @GetMapping(value = "api/list")
    public Iterable<TodoList> list(){
        return listService.list();
    }

    @PostMapping(value = "api/list")
    public TodoList save(@RequestBody TodoList todoList){
        return listService.save(todoList);
    }

    @PutMapping(value = "api/list")
    public TodoList update(@RequestBody TodoList todoList){
        if(todoList.getId() != null){
            return listService.save(todoList);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/list")
    public void delete(@PathVariable("id")Long id){
        listService.delete(id);
    }

    @GetMapping(value = "api/{id}/list")
    public TodoList get(@PathVariable("id") Long id){
        return listService.get(id);
    }






}
