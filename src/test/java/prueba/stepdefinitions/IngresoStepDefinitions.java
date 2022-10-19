package prueba.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import net.serenitybdd.screenplay.ensure.Ensure;
import task.Ingresar;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static ui.Ingresar.INGRESO;

public class IngresoStepDefinitions {

    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());

    }

    @Cuando("el usuario intenta ingresar a la pagina booking de viajes")
    public void elUsuarioIntentaIngresarALaPaginaBookingDeViajes() {

        theActorCalled("usuario").attemptsTo(

                Open.url("https://www.perurail.com/"),
                Ingresar.inicio()

        );

    }


    @Entonces("el usuario verifica que el ingreso es correcto")
    public void elUsuarioVerificaQueElIngresoEsCorrecto() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(INGRESO).isDisplayed()

        );

    }

}
