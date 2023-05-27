package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDef"},
        publish = true,
        plugin = {"pretty",
                "json:target/cucumber.json",
                "html:target/report.html",
                "json:target/report.json",
                "junit:target/report.xml"
        }
)
public class TestRunner {
}
