package CucumberOption;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		features="src/test/java/Feature/Login.feature",glue
		
		= "src/test/java/stepDefinitions"
		)
		

public class TestRunner {
	

}
