package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarTren {

    public static Target SELECT_TREN_IDA = Target.the("SELECCIONAR TREN IDA").located(By.xpath("//*[@id=\"div_2021007908_13\"]"));
    public static Target BOTON_CONTINUAR = Target.the("SELECCIONAR BOTON CONTINUAR").located(By.xpath("//*[@id=\"formTrenSeleccionar\"]/div/div/input"));
    public static Target NOMBRE_ADULTO = Target.the("INGRESAR NOMBRE ADULTO").located(By.id("formPasajero1-nomPasajero"));
    public static Target APELLIDO_ADULTO = Target.the("INGRESAR APELLIDO ADULTO").located(By.id("formPasajero1-apePasajero"));
    public static Target FECHA_NACIMIENTO_ADULTO = Target.the("INGRESAR FECHA NACIMIENTO ADULTO").located(By.id("formPasajero1-fecNacimiento"));
    public static Target DIA_NACIMIENTO_ADULTO = Target.the("INGRESAR DIA NACIMIENTO ADULTO").located(By.xpath("//*[@id=\"tlb_calendario\"]/tbody/tr[4]/td[7]/a"));
    public static Target NACIONALIDAD_ADULTO = Target.the("SELECCIONAR NACIONALIDAD ADULTO").located(By.id("formPasajero1-idPais"));
    public static Target DOCUMENTO_ADULTO = Target.the("SELECCIONAR DOCUMENTO ADULTO").located(By.xpath("//*[@id=\"formPasajero1-idDocumentoIdentidad\"]"));
    public static Target NUMERO_DOCUMENTO_ADULTO = Target.the("INGRESAR NUMERO DOCUMENTO ADULTO").located(By.id("formPasajero1-numDocumentoIdentidad"));
    public static Target TIPO_GENERO_ADULTO = Target.the("INGRESAR GENERO ADULTO").located(By.id("formPasajero1-idSexo"));
    public static Target NUMERO_TELEFONO_ADULTO = Target.the("INGRESAR NUMERO TELEFONO ADULTO").located(By.id("formPasajero1-numTelefono"));
    public static Target EMAIL_ADULTO = Target.the("INGRESAR EMAIL ADULTO").located(By.id("formPasajero1-desEmail"));
    public static Target CONFIRMAR_EMAIL_ADULTO = Target.the("INGRESAR CONFIRMACION EMAIL ADULTO").located(By.id("formPasajero1-desEmailConfirmacion"));

    public static Target ITEM_NIÑO = Target.the("SELECCIONAR DATOS NIÑO").located(By.xpath("//*[@id=\"formPasajeroRegistrar\"]/div[2]/div[1]"));


    public static Target NOMBRE_NIÑO = Target.the("INGRESAR NOMBRE NIÑO").located(By.id("formPasajero2-nomPasajero"));
    public static Target APELLIDO_NIÑO = Target.the("INGRESAR APELLIDO NIÑO").located(By.id("formPasajero2-apePasajero"));
    public static Target FECHA_NACIMIENTO_NIÑO = Target.the("INGRESAR FECHA NACIMIENTO NIÑO").located(By.id("formPasajero2-fecNacimiento"));
    public static Target DIA_NACIMIENTO_NIÑO = Target.the("INGRESAR DIA NACIMIENTO NIÑO").located(By.xpath("//*[@id=\"tlb_calendario\"]/tbody/tr[4]/td[4]/a"));
    public static Target NACIONALIDAD_NIÑO = Target.the("INGRESAR NACIONALIDAD NIÑO").located(By.id("formPasajero2-idPais"));
    public static Target TIPO_DOCUMENTO_NIÑO= Target.the("SELECCIONAR DOCUMENTO NIÑO").located(By.id("formPasajero2-idDocumentoIdentidad"));
    public static Target NUMERO_DOCUMENTO_NIÑO= Target.the("INGRESAR DOCUMENTO NIÑO").located(By.id("formPasajero2-numDocumentoIdentidad"));
    public static Target TIPO_GENERO_NIÑO= Target.the("SELECCIONAR GENERO NIÑO").located(By.id("formPasajero2-idSexo"));
    public static Target BTN_CONTINUAR_PAGO= Target.the("OPRIMIR BOTON CONTINUAR").located(By.xpath("//*[@id=\"enviarPago\"]"));
    public static Target PESTAÑA_COMPRA= Target.the("VER O CERRAR PESTAÑA COMPRA").located(By.xpath("//*[@id=\"compra\"]/a"));
    public static Target TEXTO_CONFIRMACION= Target.the("VER TEXTO CONFIRMACION").located(By.xpath("//*[@id=\"text_menu_4\"]"));

















}
