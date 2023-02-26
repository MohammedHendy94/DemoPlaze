import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/tests",
                 glue = {"tests","util.hooks"},
                 plugin ="html:target/reports/report.html"
)
public class TestRunner {
}
