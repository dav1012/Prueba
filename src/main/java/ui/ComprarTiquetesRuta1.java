package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarTiquetesRuta1 {

    public static Target RUTA_INICIO = Target.the("SELECCIONAR RUTA INICIO").located(By.xpath("//*[@id=\"Filtros_Ida_Origen\"]"));
    public static Target RUTA_DESTINO = Target.the("SELECCIONAR RUTA DESTINO").located(By.xpath("//*[@id=\"Filtros_Ida_Destino\"]"));
    public static Target TREN = Target.the("SELECCIONAR TREN").located(By.id("cbTrenSelect"));
    public static Target FECHA = Target.the("SELECCIONAR FECHA").located(By.id("Filtros_Ida_Fecha"));
    public static Target MES = Target.the("SELECCIONAR MES").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
    public static Target DIA = Target.the("SELECCIONAR DIA").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a"));
    public static Target BOTON_BUSQUEDA = Target.the("OPRIMIR_BOTON").located(By.xpath("//*[@id=\"btn_search\"]"));



}
