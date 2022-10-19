package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static ui.ComprarTiquetesRuta1.RUTA_INICIO;
import static ui.SeleccionarCabinas.*;

public class SeleccionarCabinas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                SelectFromOptions.byVisibleText("1 CABIN").from(CABINA),
                SelectFromOptions.byVisibleText("1").from(CABINA_NIÑOS),
                Click.on(BTN_CONTINUAR),
                Enter.theValue("Raul").into(PRIMER_NOMBRE),
                Enter.theValue("Gomez").into(APELLIDO),
                Click.on(FECHA_NACIMIENTO),
                Click.on(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText("Colombia").from(NACIONALIDAD),
                SelectFromOptions.byVisibleText("Passport").from(DOCUMENTO_ID),
                Enter.theValue("786654").into(DOCUMENTO_NUMBER),
                SelectFromOptions.byVisibleText("Male").from(GENERO),
                Enter.theValue("7345678").into(TELEFONO),
                Enter.theValue("raul@gmail.com").into(EMAIL),
                Enter.theValue("raul@gmail.com").into(CONFIRMAR_EMAIL),
                Click.on(CABINA2),
                Enter.theValue("steven").into(PRIMER_NOMBRE_NIÑO),
                Enter.theValue("gomez").into(APELLIDO_NIÑO),
                Click.on(FECHA_NACIMIENTO_NIÑO),
                Click.on(DIA_NACIMIENTO_NIÑO),
                SelectFromOptions.byVisibleText("Colombia").from(NACIONALIDAD_NIÑO),
                SelectFromOptions.byVisibleText("Passport").from(DOCUMENTO_ID_NIÑO),
                Enter.theValue("786654888").into(DOCUMENTO_NUMBER_NIÑO),
                SelectFromOptions.byVisibleText("Male").from(GENERO_NIÑO),
                Click.on(BTN_CONTINUAR_2),
                Click.on(PURCHASE),
                WaitUntil.the(PURCHASE,isCurrentlyEnabled()).forNoMoreThan(1000).seconds()

                );

    }

    public static SeleccionarCabinas seleccionar(){

        return instrumented(SeleccionarCabinas.class ,"");
    }


}
