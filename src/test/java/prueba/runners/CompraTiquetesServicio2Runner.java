package prueba.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/comprar_tiquetes_servicio2.feature",
        glue = "prueba.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE

)

public class CompraTiquetesServicio2Runner {

}
