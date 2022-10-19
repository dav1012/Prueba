package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.ComprarTiquetesRuta1.*;
import static ui.ComprarTiquetesRuta1.BOTON_BUSQUEDA;
import static ui.ComprarTiquetesRuta3.*;
import static ui.ComprarTiquetesRuta3.BOTON_ADICIONAR;
import static ui.SeleccionarCabinas.*;
import static ui.SeleccionarTren.*;
import static ui.SeleccionarTren.APELLIDO_NIÑO;
import static ui.SeleccionarTren.DIA_NACIMIENTO_NIÑO;
import static ui.SeleccionarTren.FECHA_NACIMIENTO_NIÑO;
import static ui.SeleccionarTren.NACIONALIDAD_NIÑO;

public class SeleccionarTren implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(SELECT_TREN_IDA),
                Click.on(BOTON_CONTINUAR),
                Enter.theValue("Raul").into(NOMBRE_ADULTO),
                Enter.theValue("Gomez").into(APELLIDO_ADULTO),
                Click.on(FECHA_NACIMIENTO_ADULTO),
                Click.on(DIA_NACIMIENTO_ADULTO),
                SelectFromOptions.byVisibleText("Colombia").from(NACIONALIDAD_ADULTO),
                SelectFromOptions.byVisibleText("Passport").from(DOCUMENTO_ADULTO),
                Enter.theValue("786654").into(NUMERO_DOCUMENTO_ADULTO),
                SelectFromOptions.byVisibleText("Male").from(TIPO_GENERO_ADULTO),
                Enter.theValue("7345678").into(NUMERO_TELEFONO_ADULTO),
                Enter.theValue("raul@gmail.com").into(EMAIL_ADULTO),
                Enter.theValue("raul@gmail.com").into(CONFIRMAR_EMAIL_ADULTO),
                Click.on(ITEM_NIÑO),
                Enter.theValue("steven").into(NOMBRE_NIÑO),
                Enter.theValue("gomez").into(APELLIDO_NIÑO),
                Click.on(FECHA_NACIMIENTO_NIÑO),
                Click.on(DIA_NACIMIENTO_NIÑO),
                SelectFromOptions.byVisibleText("Colombia").from(NACIONALIDAD_NIÑO),
                SelectFromOptions.byVisibleText("Passport").from(TIPO_DOCUMENTO_NIÑO),
                Enter.theValue("786654888").into(NUMERO_DOCUMENTO_NIÑO),
                SelectFromOptions.byVisibleText("Male").from(TIPO_GENERO_NIÑO),
                Click.on(BTN_CONTINUAR_PAGO),
                Click.on(PESTAÑA_COMPRA)

        );

    }

    public static SeleccionarTren seleccionar(){

        return instrumented(SeleccionarTren.class ,"");
    }


}
