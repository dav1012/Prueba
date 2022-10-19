package prueba.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/comprar_tiquetes_servicio1.feature",
        glue = "prueba.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE

)

public class CompraTiquetesServicio1Runner {



}
