package steps;

import base.GenericWrappers;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends GenericWrappers {


	@Before
    public void before(Scenario scenario) throws Exception {
		System.out.println("Get In To Invoke app");
        new GenericWrappers();
        IntitateBrowser();
	}


	@After
    public void afterClass(Scenario scenario) throws Exception {

            if (scenario.isFailed()) {
                System.out.println("Scenario Failed...Taking screenshot....");
                takeScreenShotonFailure(scenario);
                //driver.quit();
            }
            else {
              //  driver.quit();
        }

    }

}

