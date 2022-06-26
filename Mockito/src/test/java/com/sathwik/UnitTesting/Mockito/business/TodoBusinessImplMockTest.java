package com.sathwik.UnitTesting.Mockito.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sathwik.UnitTesting.Mockito.data.api.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {

		TodoService todoServiceMock = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> springTodos = new ArrayList<>();
		when(todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy")).thenReturn(springTodos);
		assertEquals(0, springTodos.size());
		
	}
	
	@Test
	public void test() {
		
		// mocking the class
		TodoService todoServiceMock = mock(TodoService.class);
		
		// now mock the methods
		List<String> todos = Arrays.asList("AAA", "BBB", "CCCC");
		given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
		
		// now assert the results
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		assertThat(todoBusinessImpl.getTodoService().retrieveTodos("Dummy").size(), is(3));
		System.out.println(todoBusinessImpl.getTodoService().retrieveTodos("Dummy"));
		
	}

}
