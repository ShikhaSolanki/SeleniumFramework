package TestRunners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature",
glue= {"stepsForBackground"},
monochrome= true ,
plugin = {"pretty" , "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/Htmlreports/report.html"} )






public class TestRunnerforBackgroundDemo {

}
