//package stepdefinition;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//
//import base.TestBase;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class addNewAccountStepDefinition extends TestBase {
//
//	@When("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//
//		List<List<String>> cred = credentials.raw();
//
//		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(cred.get(0).get(0));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cred.get(0).get(1));
//	}
//
//	@Then("^user clicks on New Account$")
//	public void user_clicks_on_New_Account() {
//
//		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
//	}
//
//	@Then("^User is on New Add new account page$")
//	public void user_is_on_New_Add_new_account_page() {
//		driver.findElement(By.xpath("//p[contains(text(),'Add new account form')]")).isDisplayed();
//	}
//
//	@Then("User enters Customerid and Accounttype and Initialdeposit$")
//	public void user_enters_and_and(DataTable custDetails) {
//
//		List<List<String>> details = custDetails.raw();
//
//		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys(details.get(0).get(0));
//
//		String acctType = details.get(0).get(1);
//		if (acctType == "Savings") {
//			driver.findElement(By.xpath("//option[contains(text(),'Savings')]")).click();
//		} else {
//			driver.findElement(By.xpath("//option[contains(text(),'Current')]")).click();
//		}
//
//		driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys(details.get(0).get(2));
//
//	}
//
//	@Then("^Clicks on Account Submit$")
//	public void Clicks_on_Account_Submit() {
//
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//
//	@Then("^user gets Account success message$")
//	public void user_gets_Account_success_message() {
//		boolean status = driver.findElement(By.xpath("//p[contains(text(),'Account Generated Successfully!!!')]"))
//				.isDisplayed();
//
//		Assert.assertTrue(status);	
//	}
//
//}
