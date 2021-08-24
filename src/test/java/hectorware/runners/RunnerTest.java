package hectorware.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "hectorware/stepsdefinitions",
        dryRun = true,
        tags = "@HECW-76"
)

public class RunnerTest {
}
