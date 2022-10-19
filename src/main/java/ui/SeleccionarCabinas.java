package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarCabinas {

    public static Target PAGINA = Target.the("SELECCIONAR PAGINA").located(By.xpath("//*[@id=\"content\"]"));
    public static Target CABINA = Target.the("SELECCIONAR CABINA").located(By.name("selectRooms[twin]"));
    public static Target CABINA_ADULTOS = Target.the("SELECCIONAR CABINA ADULTOS").located(By.name("selectRooms[twin][cabinas][cab1][adult]"));
    public static Target CABINA_NIÑOS = Target.the("SELECCIONAR CABINA NIÑOS").located(By.name("selectRooms[twin][cabinas][cab1][nin]"));
    public static Target BTN_CONTINUAR = Target.the("BOTON CONTINUAR").located(By.xpath("//*[@id=\"continuar_bae\"]"));
    public static Target CABINA1 = Target.the("SELECCIONAR CABINA 1").located(By.id("cab-1"));

    public static Target PRIMER_NOMBRE = Target.the("INGRESAR NOMBRE").located(By.id("txt_nombre[twin][cab1][1]"));
    public static Target APELLIDO = Target.the("INGRESAR APELLIDO").located(By.id("txt_apellido[twin][cab1][1]"));
    public static Target FECHA_NACIMIENTO = Target.the("INGRESAR FECHA NACIMIENTO").located(By.id("txt_fecha_nacimiento[twin][cab1][1]"));
    public static Target DIA_NACIMIENTO = Target.the("INGRESAR FECHA NACIMIENTO").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
    public static Target NACIONALIDAD = Target.the("INGRESAR NACIONALIDAD").located(By.id("sel_nacion[twin][cab1][1]"));
    public static Target DOCUMENTO_ID = Target.the("SELECCIONAR DOCUMENTO").located(By.id("sel_tpdoc[twin][cab1][1]"));
    public static Target DOCUMENTO_NUMBER = Target.the("INGRESAR NUMERO DOCUMENTO").located(By.id("txt_nroid[twin][cab1][1]"));
    public static Target GENERO = Target.the("INGRESAR GENERO").located(By.id("sel_sexo[twin][cab1][1]"));
    public static Target TELEFONO = Target.the("INGRESAR TELEFONO").located(By.id("txt_telefono[twin][cab1][1]"));
    public static Target EMAIL = Target.the("INGRESAR EMAIL").located(By.id("txt_mail[twin][cab1][1]"));
    public static Target CONFIRMAR_EMAIL = Target.the("CONFIRMACION EMAIL").located(By.id("txt_mail_conf[twin][cab1][1]"));
    public static Target CABINA2 = Target.the("SELECCIONAR CABINA 2").located(By.xpath("//*[@id=\"itm1-2\"]"));

    public static Target PRIMER_NOMBRE_NIÑO = Target.the("INGRESAR NOMBRE DEL NIÑO").located(By.id("txt_nombre[twin][cab1][2]"));
    public static Target APELLIDO_NIÑO = Target.the("INGRESAR APELLIDO DEL NIÑO").located(By.id("txt_apellido[twin][cab1][2]"));
    public static Target FECHA_NACIMIENTO_NIÑO = Target.the("INGRESAR FECHA NACIMIENTO DEL NIÑO").located(By.id("txt_fecha_nacimiento[twin][cab1][2]"));
    public static Target DIA_NACIMIENTO_NIÑO = Target.the("INGRESAR DIA NACIMIENTO NIÑO").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a"));
    public static Target NACIONALIDAD_NIÑO = Target.the("INGRESAR NACIONALIDAD DEL NIÑO").located(By.id("sel_nacion[twin][cab1][2]"));
    public static Target DOCUMENTO_ID_NIÑO = Target.the("SELECCIONAR DOCUMENTO DEL NIÑO ").located(By.id("sel_tpdoc[twin][cab1][2]"));
    public static Target DOCUMENTO_NUMBER_NIÑO = Target.the("INGRESAR NUMERO DOCUMENTO NIÑO").located(By.id("txt_nroid[twin][cab1][2]"));
    public static Target GENERO_NIÑO = Target.the("INGRESAR GENERO NIÑO").located(By.id("sel_sexo[twin][cab1][2]"));
    public static Target BTN_CONTINUAR_2 = Target.the("BOTON CONTINUAR 2").located(By.xpath("//*[@id=\"btnContinuarPas\"]"));

    public static Target BTN_COMPRA_TICKET = Target.the("BOTON COMPRAR TICKET").located(By.xpath("//*[@id=\"btn_search_bae\"]"));
    public static Target SELECT_TARJETA = Target.the("SELECCIONAR METODO DE PAGO").located(By.xpath("//*[@id=\"mastercard\"]"));
    public static Target CHECK_ACEPTAR = Target.the("ACEPTAR TERMINOS").located(By.xpath("//*[@id=\"chk_tercon\"]"));
    public static Target BUTTON_PAGO = Target.the("BOTON PAGO").located(By.id("ingresar_tarjeta"));
    public static Target NUMERO_TARJETA = Target.the("INGRESAR NUMERO TARJETA").located(By.id("F1009"));
    public static Target SELECT_MES_TARJETA = Target.the("SELECCIONAR MES TARJETA").located(By.id("F1010_MM"));
    public static Target SECURITY_CODE = Target.the("INGRESAR SECURITY CODE").located(By.id("F1136"));
    public static Target NAME_CARD = Target.the("INGRESAR NAME CARD").located(By.id("F1142"));
    public static Target PURCHASE = Target.the("BOTON PURCHASE").located(By.xpath("//*[@id=\"compra\"]/a"));





























}
