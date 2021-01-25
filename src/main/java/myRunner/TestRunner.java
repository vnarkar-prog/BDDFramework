package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\vnarkar\\eclipse-workspace\\BDDFramework\\src\\main\\java\\features\\addNewAccountMap.feature" }, 
				glue = {"stepdefinition" }, 
				format = { "pretty", "html:test-output" ,"json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
				monochrome=true,
				dryRun=false)

public class TestRunner {
}
