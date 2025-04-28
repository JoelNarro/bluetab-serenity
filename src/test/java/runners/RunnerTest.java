package runners;

import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.ReportBuilder;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.htmlunit.Page;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.lang.module.Configuration;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/triangle.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class RunnerTest {

}

