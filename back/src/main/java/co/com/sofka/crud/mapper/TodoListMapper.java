package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.TodoListDto;
import co.com.sofka.crud.entity.TodoList;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TodoListMapper {

    //@Mappings({
         //   @Mapping(source = "nameList", target = "nameList"),


    //})
    TodoListDto toTodoListDto(TodoList todoList);
    Iterable<TodoListDto> toTodoListDtos (Iterable<TodoList> todoList);

    @InheritInverseConfiguration
    TodoList toTodoList(TodoListDto todoDto);
}
