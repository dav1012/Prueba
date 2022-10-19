package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarTiquetesRuta3 {

    public static Target SELECTOR_IDA_VUELTA = Target.the("SELECCIONAR VIAJE IDA Y VUELTA").located(By.xpath("//*[@id=\"radioset\"]/div[2]/label/span"));
    public static Target DIA_3 = Target.the("SELECCIONAR DIA 3").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a"));
    public static Target BOTON_ADICIONAR = Target.the("ADICION DE PASAJEROS").located(By.xpath("//*[@id=\"btnAddChild\"]"));
    public static Target CAJA_ADULTOS_NIÑOS = Target.the("ADICION DE ADULTOS Y NIÑOS").located(By.id("countParentsChildren"));
    public static Target BOTON_RESTAR = Target.the("DECREMENTO DE ADULTOS Y NIÑOS").located(By.xpath("//*[@id=\"btnRemoveAdult\"]"));


}
