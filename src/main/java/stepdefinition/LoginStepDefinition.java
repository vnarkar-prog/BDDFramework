package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends TestBase{

	

	@Given("^user is on login page$")
	public void user_on_login_page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vnarkar\\eclipse-workspace\\BDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
	}

	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String passowrd) {

		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passowrd);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}

	@SuppressWarnings("deprecation")
	@Then("^user is on homepage$")
	public void user_is_on_homepage() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Guru99 Bank Manager HomePage", title);
	}

	@Given("^user enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_invalid_username_and_password(String username, String password) {

		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

	}

	@Then("^user should get error message$")
	public void user_should_get_error_message() {
		driver.switchTo().alert().accept();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
