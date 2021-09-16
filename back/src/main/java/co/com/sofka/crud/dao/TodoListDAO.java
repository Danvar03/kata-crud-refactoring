package co.com.sofka.crud.dao;

import co.com.sofka.crud.dto.TodoDto;

import java.util.Set;

public interface TodoListDAO {
    Set<TodoListDAO> listTodoByListIb(Long id);
    public Iterable<TodoListDAO> list();
    public TodoListDAO save(TodoListDAO todoListDAO);
    public void delete(Long id);
    public TodoListDAO get(Long id);

}


