package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html", "json:target/json/output.json"},
        features = {"src/test/resources/features/"},
        glue = {"stepdefs"},
        tags = {"@Armory, @Rdw"}
)
public class Runner {
}
