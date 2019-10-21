package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="stepdefinitions",
        plugin ={"pretty", "html:target/cucumber"},
        tags = "(@smoke and @ui) or @external")

public class RunCukesRegressionTest {
}
