package module2.exercise.mocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class InvoiceFilterTest {
	
	private InvoiceFilter invoiceFilterMock;

	@Before
	public void setUp() {
		invoiceFilterMock = mock(InvoiceFilter.class);
		
	}
	
	@Test
	public void test() {
		Invoice inv1 = new Invoice(Calendar.getInstance(), "Some customer name", 23232.0);
		Invoice inv2 = new Invoice(Calendar.getInstance(), "another customer", 98797.0);
		
		when(invoiceFilterMock.filter()).thenReturn(Arrays.asList(inv1, inv2));
		
		List<Invoice> ans = invoiceFilterMock.filter();
		// System.out.println("ans : " + ans );
		assertEquals(ans.get(0).getAmount(), inv1.getAmount(), 0.001);
	}
}
