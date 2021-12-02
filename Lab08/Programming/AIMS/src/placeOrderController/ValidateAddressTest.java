package placeOrderController;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidateAddressTest {
	
	private PlaceOrderController placeOrderController;

	@Before
	public void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"hanoi, true",
		"so 15 Hai Ba Trung Ha Noi, false",
		"#$ ha noi, false",
		"null, false"
	})

	@Test
	public void test(String address, boolean expected) {
		boolean isValid = PlaceOrderController.validateName(address);
		assertEquals(expected, isValid);
	}

}
