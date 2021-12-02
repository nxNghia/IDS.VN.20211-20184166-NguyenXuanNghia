package placeOrderController;

class ValidatePhoneNumberTest<PlaceOrderController> {
	
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"0123456789, true",
		"01234, false",
		"abc123, false",
		"1234567890, false"
	})
	void test(String phone, boolean expected) {
		boolean isValid = PlaceOrderController.validatePhoneNumber(phone);
		assertEquals(expected, isValid);
	}

}
