package com.sathwik.UnitTesting.Mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
	
	private TodoService todoService;
	
	List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring Boot",
			"Learn JUnit Testing");

	@Override
	public List<String> retrieveTodos(String User) {
		
		return todos;
	}

	@Override
	public void deleteTodos(String todos) {
		
	}

	@Override
	public void ListTodos(String User) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> modifyTodos(String User, List<String> newTodos) {
		todos.addAll(newTodos);
		return todos;
	}

}
