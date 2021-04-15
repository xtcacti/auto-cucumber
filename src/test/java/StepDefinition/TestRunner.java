package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition"},
        monochrome = true,
        plugin = {"pretty",
//                "junit:target/report.xml",
//                "html:target/report.html",
                "json:target/cucumber.json"
        },
        tags = "@smokeTest-hooks"
)
public class TestRunner {
}
