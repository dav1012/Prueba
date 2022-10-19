package prueba.stepdefinitions;

import interactions.CambioDeVentana;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import task.ComprarTiquetesRuta1;
import task.ComprarTiquetesRuta2;
import task.SeleccionarCabinas;

import static ui.ComprarTiquetesRuta2.TEXT;

public class CompraTiquetesServicio1StepDefinitions {

    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());

    }

    @Cuando("el usuario intenta realizar la compra de tiquetes para la ruta Puno-Cusco")
    public void elUsuarioIntentaRealizarLaCompraDeTiquetesParaLaRutaPunoCusco() {

        OnStage.theActorInTheSpotlight().attemptsTo(

                ComprarTiquetesRuta1.comprar(),
                new CambioDeVentana(1),
                SeleccionarCabinas.seleccionar()

        );

    }


    @Cuando("el usuario intenta realizar la compra de tiquetes para la ruta Arequipa-Cusco")
    public void elUsuarioIntentaRealizarLaCompraDeTiquetesParaLaRutaArequipaCusco() {

        OnStage.theActorInTheSpotlight().attemptsTo(

                ComprarTiquetesRuta2.comprar(),
                new CambioDeVentana(1),
                SeleccionarCabinas.seleccionar()

        );

    }

    @Entonces("el usuario deberia ver que la compra fue exitosa")
    public void elUsuarioDeberiaVerQueLaCompraFueExitosa() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(TEXT).isDisplayed());


    }

}
