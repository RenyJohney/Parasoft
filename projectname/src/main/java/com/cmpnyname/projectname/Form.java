package com.cmpnyname.projectname;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Form {
	WebDriver driver;
	String url = "https://parabank.parasoft.com/parabank/index.htm;jsessionid=CC68FB3B9A6E581DC45B46A4F76D3482";
	String firstName = "Reny";
	String lastName = "Lopez";
	String address = "7301 Topping Rd";
	String city = "Mississauga";
	String state = "Ontario";
	String zipCode = "L4T2Y6";
	String phoneNo = "6474049982";
	String ssn = "1234";
	String userName = "RenyLopez";
	String pwd = "RenyJLopez";
	
	WebElement FirstName,LastName,Address,City,State,ZipCode,PhoneNo,SSN,UserName,Pwd,ConfPwd;
	WebElement Register;

	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\renyjohney1988\\Documents\\Reny\\Study\\Testing\\Selenium\\chromedriver_win32_2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	
	@AfterMethod
	public void clearFields() throws InterruptedException {
		FirstName = driver.findElement(By.xpath("//*[@id=\'customer.firstName\']"));
		LastName = driver.findElement(By.xpath("//*[@id='customer.lastName']"));
		Address = driver.findElement(By.xpath("//*[@id=\'customer.address.street\']"));
		City = driver.findElement(By.xpath("//*[@id=\'customer.address.city\']"));
		State = driver.findElement(By.xpath("//*[@id=\'customer.address.state\']"));
		ZipCode = driver.findElement(By.xpath("//*[@id=\'customer.address.zipCode\']"));
		PhoneNo = driver.findElement(By.xpath("//*[@id=\'customer.phoneNumber\']"));
		SSN = driver.findElement(By.xpath("//*[@id=\'customer.ssn\']"));
		UserName = driver.findElement(By.xpath("//*[@id=\'customer.username\']"));
		Pwd = driver.findElement(By.xpath("//*[@id=\'customer.password\']"));
		ConfPwd = driver.findElement(By.xpath("//*[@id=\'repeatedPassword\']"));
		Register = driver.findElement(By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input"));
		Thread.sleep(1000);
		FirstName.clear();
		LastName.clear();
		Address.clear();
		City.clear();
		State.clear();
		ZipCode.clear();
		SSN.clear();
		PhoneNo.clear();
		UserName.clear();
		Pwd.clear();
		ConfPwd.clear();
	}

	@Test(priority = 1)
	public void RegisterBtnClick() throws InterruptedException {

		WebElement RegBtn = driver.findElement(By.xpath("//*[@id=\'loginPanel\']/p[2]/a"));
		RegBtn.click();
		/*WebElement Register = driver.findElement(By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input"));
		Thread.sleep(3000);
		Register.click();
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\'customer.firstName\']"));
		FirstName.sendKeys("abc");*/
		/*FirstName = driver.findElement(By.xpath("//*[@id=\'customer.firstName\']"));
		LastName = driver.findElement(By.xpath("//*[@id='customer.lastName']"));
		FirstName = driver.findElement(By.xpath("//*[@id=\'customer.firstName\']"));
		LastName = driver.findElement(By.id("customer.lastName"));
		Address = driver.findElement(By.id("customer.address.street"));
		City = driver.findElement(By.id("customer.address.city"));
		State = driver.findElement(By.id("customer.address.state"));
		ZipCode = driver.findElement(By.id("customer.address.zipCode"));
		PhoneNo = driver.findElement(By.id("customer.phoneNumber"));
		SSN = driver.findElement(By.id("customer.ssn"));
		UserName = driver.findElement(By.id("customer.username"));
		Pwd = driver.findElement(By.id("customer.password"));
		ConfPwd = driver.findElement(By.id("repeatedPassword"));
		Register = driver.findElement(By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input"));*/

	}
	
	 
	  @Test (priority = 3) 
	  public void FirstNameNull() {
	
		//FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		PhoneNo.sendKeys(phoneNo);
		SSN.sendKeys(ssn);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		Register.click();
		
		//clearFields();
		}
	  
	  @Test (priority = 4) 
	  public void LastNameNull() {
		   
		FirstName.sendKeys(firstName);
		//LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}

	  
	  @Test (priority = 5) 
	  public void AddressNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		//Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}

	  @Test (priority = 6) 
	  public void CityNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		//City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}

	  @Test (priority = 7) 
	  public void StateNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		//State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}

	  @Test (priority = 8) 
	  public void ZipCodeNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		//ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}

	  @Test (priority = 9) 
	  public void SSNNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		//SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}

	  @Test (priority = 10) 
	  public void UserNameNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		//UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}
	  @Test (priority = 11) 
	  public void PwdNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		//Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}

	  @Test (priority = 12) 
	  public void ConfPwdNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		//ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}
  
	  @Test (priority = 13) 
	  public void PhNo_ZipCodeNull() {
	
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		//ZipCode.sendKeys(zipCode);
		SSN.sendKeys(ssn);
		//PhoneNo.sendKeys(phoneNo);
		UserName.sendKeys(userName);
		Pwd.sendKeys(pwd);
		ConfPwd.sendKeys(pwd);
		
	    Register.click();
		}
	  
	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}


}
