package placeOrderController;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidateRushOrderTest {
	
	private PlaceOrderController placeOrderController;

	@Before
	public void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"[\"iPhoneX\", \"Mac\"], true",
		"[\"T-Shirt\"], false",
		"[\"@#Cooker\"], false",
		"null, false"
	})

	@Test
	public void test(HashMap<String, String> items, boolean expected) {
		boolean isValid = PlaceOrderController.validateName(items);
		assertEquals(expected, isValid);
	}

}
