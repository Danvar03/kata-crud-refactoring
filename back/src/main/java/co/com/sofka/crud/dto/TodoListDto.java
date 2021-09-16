package co.com.sofka.crud.dto;

import java.util.Set;

public class TodoListDto {
    private Long id;
    private String nameList;
    private Set<TodoDto> todos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public Set<TodoDto> getTodos() {
        return todos;
    }

    public void setTodos(Set<TodoDto> todos) {
        this.todos = todos;
    }
}
