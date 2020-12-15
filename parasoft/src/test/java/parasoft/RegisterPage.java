package parasoft;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePageObject {

	public RegisterPage(WebDriver driver) {
		super(driver);
		
		
		//List<By> info = new ArrayList<>(); 
		
	}
	
	By first_name = By.id("customer.firstName");
	By last_name = By.id("customer.lastName");
	By address = By.id("customer.address.street");
	By city = By.id("customer.address.city");
	By state  = By.id("customer.address.state");
	By zipCode  = By.id("customer.address.zipCode");
	By phone_number = By.id("customer.phoneNumber");
	By ssn = By.id("customer.ssn");
	By user_name = By.id("customer.username");
	By pwd = By.id("customer.password");
	By pwd_conf = By.id("repeatedPassword");
	By registerBtn = By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input");
	
	/*public static final String FIRST_NAME     = "first_name";
	public static final String LAST_NAME      = "last_name";
	public static final String ADDRESS   		= "address";
	public static final String CITY   			= "city";
	public static final String STATE  			= "state";
	public static final String ZIP_CODE     	= "zipCode";
	public static final String PH_NO      		= "phone_number";
	public static final String SSN   			= "ssn";
	public static final String USERNAME   		= "user_name";
	public static final String PWD 			    = "pwd_confirm";
	public static final String PWD_CONF  		= "registerBtn";*/
	
	public void getPageURL(String url) {
		loadPage(url);
		
	}
	
	public void typeInfo(String info, String info_type) {
		
		switch(info_type){
			
			case("FIRST_NAME") :
				typeValue(first_name, info);
			break;
			
			case("LAST_NAME") :
				System.out.println("Inside LAST_NAME");
				typeValue(last_name, info);
				break;
			
			case("ADDRESS") :
				typeValue(address, info);
				break;
			
			case("CITY") :
				typeValue(city, info);
				break;
			
			case("STATE") :
				typeValue(state, info);
				break;
			
			case("ZIP_CODE") :
				typeValue(zipCode, info);
				break;
			
			case("PH_NO") :
				typeValue(phone_number, info);
				break;
			
			case("SSN") :
				typeValue(ssn, info);
				break;
			
			case("USERNAME") :
				typeValue(user_name, info);
				break;
			
			case("PWD") :
				typeValue(pwd, info);
				break;
				
			case("PWD_CONF") :
				typeValue(pwd_conf, info);
				break;
				
			
		}
		//typeValue
		
	
	}
	
	/*
	 * public void typeInfo(String first_name, String last_name, String address,
	 * String city, String state, String zipCode, String phone_number, String ssn,
	 * String user_name, String pwd, String pwd_confirm) {
	 * 
	 * 
	 * }
	 */
	public void getInfo(By locator) {
		getValue(locator); 
		
	}
	
	public void clickButon() {
		clickButton(registerBtn); 
		
		
	}

}
