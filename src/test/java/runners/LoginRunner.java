package runners;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",
glue= {"stepDefinition"},
tags = "@tag",
plugin= {"pretty", "html:target/cucumber-reports"}
)
public class LoginRunner {



}