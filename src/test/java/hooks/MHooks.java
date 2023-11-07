package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MHooks {
	
	@Before( order = 1)
	public void test() {
		System.out.println("in before hook order 1");
	}
	
	@Before( order = 2)
	public void test2() {
		System.out.println("in before hook order 2");
	}
	
	@After
	public void test1(Scenario scenario) {
		if(scenario.isFailed()) {
			
		}
		System.out.println("in after hook");
	}

}
