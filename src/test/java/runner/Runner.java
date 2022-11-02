package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/featurefile/Login.feature"},
        glue = {"stepdfn"},
        dryRun = true,
        monochrome = true
)
public class Runner {

}
