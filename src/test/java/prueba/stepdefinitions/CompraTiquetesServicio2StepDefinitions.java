package prueba.stepdefinitions;

import interactions.CambioDeVentana;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import task.ComprarTiquetesRuta1;
import task.ComprarTiquetesRuta3;
import task.SeleccionarCabinas;
import task.SeleccionarTren;

import static ui.ComprarTiquetesRuta2.TEXT;
import static ui.SeleccionarTren.TEXTO_CONFIRMACION;

public class CompraTiquetesServicio2StepDefinitions {

    @Before
    public void setUp() {

        OnStage.setTheStage(new OnlineCast());

    }

    @Cuando("el usuario intenta realizar la compra de tiquetes para la ruta Cusco-Machu Picchu")
    public void elUsuarioIntentaRealizarLaCompraDeTiquetesParaLaRutaCuscoMachuPicchu() {


        OnStage.theActorInTheSpotlight().attemptsTo(

                ComprarTiquetesRuta3.comprar(),
                new CambioDeVentana(1),
                SeleccionarTren.seleccionar()


        );


    }

    @Entonces("el usuario deberia ver el mensaje que la compra fue exitosa")
    public void elUsuarioDeberiaVerElMensajeQueLaCompraFueExitosa() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(TEXTO_CONFIRMACION).isDisplayed());

    }

}
