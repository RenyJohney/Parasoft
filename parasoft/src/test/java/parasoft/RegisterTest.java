package parasoft;

import org.databene.benerator.anno.Source;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
	@Test(dataProvider = "feeder")
	@Source("src/test/resources/RegisterData.csv")
	public void TestRegisterPage(String first_name, String last_name, String address, String city, String state, String zipCode, String phone_number, String ssn, String user_name, String pwd, String pwd_confirm) throws InterruptedException {
		
	String url = prop.getProperty("url_reg");	
	RegisterPage regPage = new RegisterPage(driver);
	regPage.getPageURL(url);
	regPage.typeInfo(first_name,"FIRST_NAME");
	regPage.typeInfo(last_name,"LAST_NAME");
	regPage.typeInfo(address,"ADDRESS");
	regPage.typeInfo(city,"CITY");
	regPage.typeInfo(state,"STATE");
	regPage.typeInfo(zipCode,"ZIP_CODE");
	regPage.typeInfo(phone_number,"PH_NO");
	regPage.typeInfo(ssn,"SSN");
	regPage.typeInfo(user_name,"USER_NAME");
	//regPage.typeInfo(pwd,"PWD");
	regPage.typeInfo(pwd_confirm,"PWD_CONF");
	regPage.clickButon();
	
	
	}

	
}
