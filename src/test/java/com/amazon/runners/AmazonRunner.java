package com.amazon.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@AddProduct",
        glue = "com.amazon.stepDef",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AmazonRunner {
}
