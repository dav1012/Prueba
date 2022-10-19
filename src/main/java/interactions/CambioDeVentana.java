package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambioDeVentana implements Interaction {

    private int ventana;

    public CambioDeVentana(int ventana){

        this.ventana=ventana;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        List<String> newWindow = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newWindow.get(ventana));

    }

    public CambioDeVentana aLaVentana(int ventana){

        return instrumented(CambioDeVentana.class,ventana);

    }


}
