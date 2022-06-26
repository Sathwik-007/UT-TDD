package com.in28minutes.powermock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest(UtilityClass.class)
public class MockingStaticMethodTest{
	
	@Mock
	Dependency dependency;
	
	@InjectMocks
	SystemUnderTest systemUnderTest;
	
	@Test
	public void testMockingStaticMethods_UsingPowerMock() {
		// given
		List<Integer> stats = Arrays.asList(1,2,3);
		when(dependency.retrieveAllStats()).thenReturn(stats);
		
		/**
		 * tell powermock before encountering static method
		 * 
		 */
		PowerMockito.mockStatic(UtilityClass.class);
		
		when(UtilityClass.staticMethod(6)).thenReturn(232);
		
		int result = systemUnderTest.methodCallingAStaticMethod();
		
		System.out.println("Result : " + result);
		
		assertThat(result, is(232));
		
		PowerMockito.verifyStatic(UtilityClass.class);
		UtilityClass.staticMethod(6);
	}
	
	@Test
	public void testInvokingPrivateMethod_UsingPowerMockito() throws Exception {
		List<Integer> stats = Arrays.asList(1,2,3);
		when(dependency.retrieveAllStats()).thenReturn(stats);
		
		int result = Whitebox.invokeMethod(systemUnderTest, "privateMethodUnderTest");
		assertThat(result, is(6));
	}
	
	
	
	
	
}