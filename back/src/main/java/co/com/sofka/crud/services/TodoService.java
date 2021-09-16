package co.com.sofka.crud.services;

import co.com.sofka.crud.dao.TodoDAO;
import co.com.sofka.crud.dto.TodoDto;
import co.com.sofka.crud.mapper.TodoMapper;
import co.com.sofka.crud.repositories.TodoRepository;
import co.com.sofka.crud.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements TodoDAO {

    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private TodoMapper todoMapper;


    @Override
    public Iterable<TodoDto> list() {
        Iterable<Todo> todos = todoRepository.findAll();
        return todoMapper.toTodoDtos(todos);
    }


    @Override
    public TodoDto save(TodoDto todoDto) {
        Todo todo = todoMapper.toTodo(todoDto);
        return todoMapper.toTodoDto(todoRepository.save(todo));
    }

    @Override
    public void delete(Long id) {
        todoRepository.delete(todoMapper.toTodo(get(id)));
    }

    @Override
    public TodoDto get(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        return todoMapper.toTodoDto(todo);
    }
}


