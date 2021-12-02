package placeOrderController;

import java.io.IOException;
import java.util.HashMap;

public class PlaceOrderController {
	public void validateDeliveryInfo(HashMap<String, String> info) throws InterruptedException, IOException{
		
	}
	
	public boolean validatePhoneNumber(String phoneNumber)
	{
		if (phoneNumber.length() != 10)
			return false;
		
		try {
			Integer.parseInt(phoneNumber);
		}catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public boolean validateName(String name)
	{
		return false;
	}
	
	public boolean validateAddress(String address)
	{
		return false;
	}
}
