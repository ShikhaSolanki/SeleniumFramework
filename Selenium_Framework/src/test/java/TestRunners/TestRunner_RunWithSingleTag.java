package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue= {"StepDefinitions"},
//tags = "@somke or @regression or @shikha or not @important")
tags = "@mustrun")
public class TestRunner_RunWithSingleTag {

}
