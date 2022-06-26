package module1.exercise.discount;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BasketTest {
	
	@Mock
	private Basket basket = mock(Basket.class);
	private List<Item> items;
	
	@Before
	public void initializer() {
		Item macbook = new Item("Rog Zephyrus", 1, 75000);
		Item iphone= new Item("Samsung s22 ultra", 2, 65000);
		Item ipad = new Item("ps5", 1, 60000);
		Item xbox = new Item("xbox", 1, 50000);
		List<Item> items = Arrays.asList(macbook, iphone, ipad, xbox);
		basket = new Basket(items);
		
	}

	@Test
	public void test_getAmountMethod_ReturnsAmountPerQuantity() {
		// given
//		Basket basket = mock(Basket.class);
		
		// when
//		when(basket1.subtract((double)34)).thenReturn(3423);
		when(basket.getAmount()).thenReturn((double) 200000);
		// doNothing().when(basket).subtract(anyDouble());
		
		double amount = basket.getAmount();
		assertThat(amount, is((double)20000));
//		verify(basket1, times(0));
	}

}
