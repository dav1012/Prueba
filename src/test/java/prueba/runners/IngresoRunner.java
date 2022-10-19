package prueba.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/ingreso.feature",
        glue = "prueba.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE

)

public class IngresoRunner {


}
