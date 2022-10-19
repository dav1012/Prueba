package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.ComprarTiquetesRuta1.*;

public class ComprarTiquetesRuta1 implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                SelectFromOptions.byVisibleText("City of Cusco").from(RUTA_INICIO),
                SelectFromOptions.byVisibleText("Puno").from(RUTA_DESTINO),
                SelectFromOptions.byVisibleText("Andean Explorer, A Belmond Train").from(TREN),
                Click.on(FECHA),
                Click.on(DIA),
                Click.on(BOTON_BUSQUEDA)

        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static ComprarTiquetesRuta1 comprar(){

        return instrumented(ComprarTiquetesRuta1.class ,"");
    }


}
