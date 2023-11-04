package StepDefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	
	WebDriver driver = new ChromeDriver();
	
	/*
	 * @Given("i am on login page") public void i_am_on_login_page() { driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 * 
	 * @When("user enters valid username") public void user_enters_valid_username()
	 * {
	 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 * }
	 * 
	 * @And("user enters valid password") public void user_enters_valid_password() {
	 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"
	 * ); }
	 * 
	 * @And("click on login button") public void click_on_login_button() {
	 * driver.findElement(By.xpath("//button[@type='submit']")).click(); }
	 * 
	 * @Then("user redirects to Home page") public void
	 * user_redirects_to_home_page() { System.out.println(driver.getCurrentUrl()); }
	 */
	
	/*
	 * @Given("i am on login page") public void i_am_on_login_page() {
	 * 
	 * }
	 * 
	 * @When("user enters username and password") public void
	 * user_enters_username_and_password(DataTable dataTable) { List<List<String>>
	 * data = dataTable.asLists(); for(List<String> e : data) {
	 * System.out.println(e); } }
	 * 
	 * @When("click on login button") public void click_on_login_button() {
	 * 
	 * }
	 * 
	 * @Then("user redirects to Home page") public void
	 * user_redirects_to_home_page() {
	 * 
	 * }
	 */
	
	@Given("i am on login page")
	public void i_am_on_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2); 
	}

	@When("click on login button")
	public void click_on_login_button() {
	    
	}

	@Then("user redirects to Home page")
	public void user_redirects_to_home_page() {
	    
	}
	

}
