package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags ={"@testPT,@testPT2"},
                 features = "src/test/resources/features",
                 glue ="steps",
                 plugin = "pretty", 
                 monochrome = true, 
                 dryRun = false,
                 strict = false,
                 snippets = SnippetType.CAMELCASE
                 )
public class Runner {
}
