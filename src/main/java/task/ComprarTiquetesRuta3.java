package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.ComprarTiquetesRuta1.*;
import static ui.ComprarTiquetesRuta1.BOTON_BUSQUEDA;
import static ui.ComprarTiquetesRuta2.DIA_2;
import static ui.ComprarTiquetesRuta3.*;

public class ComprarTiquetesRuta3 implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                SelectFromOptions.byVisibleText("MachuPicchu").from(RUTA_INICIO),
                SelectFromOptions.byVisibleText("Ciudad de Cusco").from(RUTA_DESTINO),
                Click.on(SELECTOR_IDA_VUELTA),
                Click.on(FECHA),
                Click.on(DIA_3),
                Click.on(CAJA_ADULTOS_NIÑOS),
                Click.on(BOTON_RESTAR),
                Click.on(BOTON_ADICIONAR),
                Click.on(BOTON_BUSQUEDA)

        );



    }

    public static ComprarTiquetesRuta3 comprar(){

        return instrumented(ComprarTiquetesRuta3.class ,"");
    }


}
