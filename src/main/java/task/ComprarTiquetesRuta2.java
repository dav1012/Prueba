package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.ComprarTiquetesRuta1.*;
import static ui.ComprarTiquetesRuta1.BOTON_BUSQUEDA;
import static ui.ComprarTiquetesRuta2.DIA_2;

public class ComprarTiquetesRuta2 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                SelectFromOptions.byVisibleText("Arequipa").from(RUTA_INICIO),
                SelectFromOptions.byVisibleText("Ciudad de Cusco").from(RUTA_DESTINO),
                Click.on(FECHA),
                Click.on(DIA_2),
                Click.on(BOTON_BUSQUEDA)

        );



    }

    public static ComprarTiquetesRuta2 comprar(){

        return instrumented(ComprarTiquetesRuta2.class ,"");
    }


}
