package placeOrderController;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidateNameTest {
	
	private PlaceOrderController placeOrderController;

	@Before
	public void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"nguyenlm, true",
		"nguyen01234, false",
		"#$nguyen, false",
		"null, false"
	})

	@Test
	public void test(String name, boolean expected) {
		boolean isValid = PlaceOrderController.validateName(name);
		assertEquals(expected, isValid);
	}

}
