package net.javaguides.todoapp.dao;

import java.util.List;

import net.javaguides.todoapp.model.LoginBean;
import net.javaguides.todoapp.model.Todo;

public interface TodoDao {
	
	
	
	void insertTodo(Todo todo);
	Todo selectTodo(long id);
	List<Todo> selectAllTodos(LoginBean login);
	boolean deleteTodo(long id);
	boolean updateTodo(Todo todo);
	

}
