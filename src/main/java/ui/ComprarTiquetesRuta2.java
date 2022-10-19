package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarTiquetesRuta2 {

    public static Target DIA_2 = Target.the("SELECCIONAR DIA RUTA 2").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]/a"));
    public static Target TEXT = Target.the("VER TEXTO").located(By.xpath("//*[@id=\"content\"]/article/div[7]/a/div"));


}
