package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue="StepDefinitions",
        dryRun = false,
        tags = "",
        plugin = "pretty")



public class Runner {

}
