package com.sathwik.UnitTesting.Mockito.business;

import java.util.ArrayList;
import java.util.List;

import com.sathwik.UnitTesting.Mockito.data.api.TodoService;


public class TodoBusinessImpl { // System Under Test (SUT)
	
	// This is dependency
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public TodoService getTodoService() {
		return todoService;
	}

	public void setTodoService(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String User){
		List<String> todos = todoService.retrieveTodos("Dummy"); // The user doesnt really matter here!
		List<String> springTodos = new ArrayList<>();
		
		for(String itr : todos) {
			if(itr.contains("Spring")) {
				springTodos.add(itr);
			}
		}
		
		return springTodos;
	}
	
	public void deleteTodosNotRelatedToSpring(String User){
		List<String> todos = todoService.retrieveTodos("Dummy"); // The user doesnt really matter here!
		
		for(String itr : todos) {
			if(!itr.contains("Spring")) {
				todoService.deleteTodos(itr);
			}
		}
	}
	
	public List<String> modifyTodosForUser(String User, List<String> newTodos) {
		List<String> retrieveTodos = todoService.retrieveTodos(User);
		retrieveTodos.addAll(newTodos);
		todoService.retrieveTodos("dummy").addAll(newTodos);
		return retrieveTodos;
	}
}
