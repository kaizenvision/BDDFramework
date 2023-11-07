package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\demo.feature", 
					glue = {"StepDefination"}, 
					plugin = {"pretty",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							}, 
					tags = "@mytag")
public class MyTestRunner {
}
