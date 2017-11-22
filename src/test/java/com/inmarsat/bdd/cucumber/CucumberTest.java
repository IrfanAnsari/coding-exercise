package com.inmarsat.bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/",
        format = {"json:target/cucumber/cucumber-report.json","html:target/cucumber/plain-html-reports"},
        plugin = {"pretty", "html:target/cucumber"},
glue = "com.inmarsat.bdd.glue")
public class CucumberTest {
}
