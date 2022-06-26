package com.sathwik.UnitTesting.Mockito.data.api;

import java.util.List;

public interface TodoService {
	public List<String> retrieveTodos(String User);
	public void deleteTodos(String todos);
	public void ListTodos(String User);
	public List<String> modifyTodos(String User, List<String> newTodos);
}
