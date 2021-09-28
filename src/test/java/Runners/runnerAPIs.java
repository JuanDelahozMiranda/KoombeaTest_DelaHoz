package Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "StepsDefinitions",
        features = "src/test/resources/Features/testAPI.feature",
        tags = "@testCases",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)
public class runnerAPIs {}
