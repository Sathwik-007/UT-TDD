package com.sathwik.UnitTesting.Mockito.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.sathwik.UnitTesting.Mockito.data.api.TodoService;
import com.sathwik.UnitTesting.Mockito.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> springTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		System.out.println(springTodos);
		assertEquals(2, springTodos.size());
	}

}
