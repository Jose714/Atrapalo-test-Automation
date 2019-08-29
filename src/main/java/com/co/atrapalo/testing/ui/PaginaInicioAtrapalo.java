package com.co.atrapalo.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.atrapalo.com.co/")
public class PaginaInicioAtrapalo extends PageObject {
	public static final Target SELECCIONAR_HOTELES_A_BUSCAR = Target.the("Se selecciona el link para hacer la reserva del hotel").located(By.xpath("//li[@class='main-nav toggle-menu-option tabHOT']"));
	public static final Target BUSCAR_DESTINO = Target.the("Elige el destino donde quiere reservar su hotel").located(By.id("search_engine_HOT_destiny"));
	public static final Target SELECCIONA_EL_HOTEL = Target.the("Se selecciona el hotel de nuestro agrado").located(By.xpath("//a[@class='product-name'][1]"));

}
