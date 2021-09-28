package Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "StepsDefinitions",
        features = "src/test/resources/Features/testMOBILE.feature",
        tags = "@positive",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)
public class runnerMOBILE {}
