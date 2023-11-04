package StepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResgistrationTest {
	
	@Given("I am on registration page")
	public void i_am_on_registration_page() {
	    
	}

	@When("i click on signup")
	public void i_click_on_signup() {
	    
	}

	@When("I entered user details")
	public void i_entered_user_details(DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps();
		
		for(Map<String, String> e : data) {
			System.out.println(e);
		}
	    
	}

	@Then("i got the message")
	public void i_got_the_message() {
	    
	}

}
