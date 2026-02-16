package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features", // Path ke file .feature
        glue = {"StepDefs"}, // Path ke step definitions //
        tags = "@NormalScenario",
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Plugin untuk laporan
        monochrome = true // Untuk output yang lebih mudah dibaca di console
)
public class CucumberRunner {
}
