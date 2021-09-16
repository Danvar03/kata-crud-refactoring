package co.com.sofka.crud.dao;

import co.com.sofka.crud.dto.TodoDto;

public interface TodoDAO {
    Iterable<TodoDto> list();

    TodoDto save(TodoDto todoDto);

    void delete(Long id);

    TodoDto get(Long id);
}

