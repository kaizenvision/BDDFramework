package StepDefination;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSeachSteps {
	
	 WebDriver driver = new ChromeDriver();
	
	@Given("i am on google search page")
	public void i_am_on_google_search_page() {
	   driver.get("https://www.google.com/");
	}

	@When("i entered java and click on seach")
	public void i_entered_java_and_click_on_seach() {
	    driver.findElement(By.xpath(" //textarea[@name='q']")).sendKeys("java");
	    driver.findElement(By.xpath("//input[@name='btnK']")).click();
	}

	@Then("page title must start with java")
	public void page_title_must_start_with_java() {
	   String title = driver.getTitle();
	   title.contains("java");
	}


}
