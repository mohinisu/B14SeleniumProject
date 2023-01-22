package org.example.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"org/example/stepDefinitions"}
        , tags = "@LoginHappyPath"
        ,plugin = {"pretty", "html:target/report.html"}
      , dryRun = true  //dry run mode
)
public class TestRunner {

}