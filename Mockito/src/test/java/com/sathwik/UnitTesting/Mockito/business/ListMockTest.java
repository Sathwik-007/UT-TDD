package com.sathwik.UnitTesting.Mockito.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListMockTest {
	
	private List listMock = mock(List.class);

	@Test
	public void mockListSizeMethod() {
		// List listmock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void mockListSizeMethod_ReturnMultipleValue() {
		// List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		
		// holds first return value
		assertEquals(2, listMock.size());
		
		// holds second return value
		assertEquals(3, listMock.size());

	}
	
	@Test
	public void mockListGetMethod() {
//		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("list index 0 is called");
		assertEquals("list index 0 is called", listMock.get(0));
	}
	
	@Test(expected=RuntimeException.class)
	public void mockListExceptionThrower() {
//		List listMock = mock(List.class)
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("MY Exception : List index cannot be negative"));
		assertEquals("MY Exception : List index cannot be negative", listMock.get(-1));
	}
}
