package co.com.sofka.crud.dao;

import co.com.sofka.crud.dto.TodoListDto;

import java.util.Set;

public interface TodoListDAO {
    //Set<TodoListDto> listTodoByListIb(Long id);

    Iterable<TodoListDto> list();

    TodoListDto save(TodoListDto todoListDto);

    void delete(Long id);

    TodoListDto get(Long id);

}


