package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@createjobvacancy",
    strict = true,
	monochrome = true,
	plugin = {"pretty", "html:target/hrm/hrm_1_result.html"}
)

public class HRMRunner_1 {}
