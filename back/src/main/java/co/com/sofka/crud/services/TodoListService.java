package co.com.sofka.crud.services;


import co.com.sofka.crud.dao.TodoListDAO;

import co.com.sofka.crud.dto.TodoListDto;
import co.com.sofka.crud.entity.TodoList;
import co.com.sofka.crud.mapper.TodoListMapper;

import co.com.sofka.crud.mapper.TodoMapper;
import co.com.sofka.crud.repositories.TodoListRepository;
import co.com.sofka.crud.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class TodoListService implements TodoListDAO {

    @Autowired
    private TodoListRepository repository;
    @Autowired
    private TodoListMapper mapper;

    @Autowired

    @Override
    public Iterable<TodoListDto> list() {
        Iterable<TodoList> todoLists = repository.findAll();
        return mapper.toTodoListDtos(todoLists);

    }

    @Override
    public TodoListDto save(TodoListDto todoListDto) {
        TodoList todoList = mapper.toTodoList(todoListDto);
        return mapper.toTodoListDto(repository.save(todoList));
    }

    @Override
    public void delete(Long id) {
        repository.delete(mapper.toTodoList(get(id)));
    }


    @Override
    public TodoListDto get(Long id) {
        return mapper.toTodoListDto(repository.findById(id).orElseThrow());
    }


}

