package stepdefinition;

import org.openqa.selenium.By;

import base.TestBase;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class addNewCustomerStepDefinition extends TestBase {

	@SuppressWarnings("deprecation")
	@Then("^user is on Homepage$")
	public void user_is_on_Homepage() {
		boolean status = driver.findElement(By.xpath("//*[contains(text(),'Manger Id')]")).isDisplayed();
		Assert.assertTrue(status);
	}

	@Then("^user clicks on New Customer$")
	public void user_clicks_on_New_Customer() {
		driver.findElement(By.xpath("//*[contains(text(),'New Customer')]")).click();
	}

	@Then("^User is on New Customer page$")
	public void user_is_on_New_Customer_page() {
		boolean status = driver.findElement(By.xpath("//*[contains(text(),'Add New Customer')]")).isDisplayed();
		Assert.assertTrue(status);
	}

	@Then("^User enters \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_CustomerName_and_Gender_and_DateofBirth_and_Address_and_City_and_State_and_PIN_and_MobileNumber_and_Email_and_Password(
			String custName, String gender, String custDOB, String custAddress, String custCity, String custState,
			String custPin, String custMBnumber, String custEmail, String custPassword) {

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(custName);

		if (gender == "male") {
			driver.findElement(By.xpath("//input[@value='m']")).click();
		} else {
			driver.findElement(By.xpath("//input[@value='f']")).click();
		}
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(custDOB);
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys(custAddress);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(custCity);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(custState);
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(custPin);
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(custMBnumber);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(custEmail);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(custPassword);

	}

	@Then("^Clicks on Submit$")
	public void clicks_on_Submit() {
		driver.findElement(By.xpath("//input[@name='sub']")).click();
	}

	@Then("^user gets success message$")
	public void user_gets_success_message() {
		boolean status = driver.findElement(By.xpath("//p[contains(text(),'Customer Registered Successfully!!!')]"))
				.isDisplayed();
		Assert.assertTrue(status);
	}

	@Then("^User exit$")
	public void User_exit() {
		driver.quit();
	}
}	
