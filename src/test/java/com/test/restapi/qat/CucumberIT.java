package com.test.restapi.qat;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:target/cucumber.json"},
          features = {"src/test/resources/features"},
		  glue="com.test.restapi.qat"
		)
public class CucumberIT {

}
