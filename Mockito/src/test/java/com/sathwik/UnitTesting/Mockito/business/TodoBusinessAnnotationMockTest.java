package com.sathwik.UnitTesting.Mockito.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sathwik.UnitTesting.Mockito.data.api.TodoService;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessAnnotationMockTest {
	
	@Mock
	TodoService todoServiceMock;
	
	// since TodoBusinessImpl class has a member (dependency) TodoService it will be auto-injected. 
	//	In this case via constructor injection
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;
	
	
	@Test
	public void testSomething() {
		
		
		// given
		List<String> todos = todoServiceMock.retrieveTodos("dummy");
		// when
		given(todoServiceMock.retrieveTodos("Dummy")).willReturn(Arrays.asList("AAA", "BBB", "CCCC"));
		
		given(todoServiceMock.modifyTodos("dummy", Arrays.asList("Spring", "Junit"))).willReturn(todos);
		// then
		assertThat(todos.size(), is(0));
	}

}
