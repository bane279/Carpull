package test.java;
//Run this file.
//ctrl + shift + o to auto include all packages

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features="src/test/resources")

public class TestRunner {
	
}
