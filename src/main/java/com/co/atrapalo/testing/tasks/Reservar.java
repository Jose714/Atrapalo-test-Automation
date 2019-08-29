package com.co.atrapalo.testing.tasks;

import static com.co.atrapalo.testing.ui.PaginaInicioAtrapalo.SELECCIONAR_HOTELES_A_BUSCAR;
import static com.co.atrapalo.testing.ui.PaginaInicioAtrapalo.BUSCAR_DESTINO;
import static com.co.atrapalo.testing.ui.PaginaInicioAtrapalo.SELECCIONA_EL_HOTEL;
import static net.serenitybdd.screenplay.Tasks.instrumented;


import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Reservar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SELECCIONAR_HOTELES_A_BUSCAR),
				Enter.theValue("CALI").into(BUSCAR_DESTINO).thenHit(Keys.ENTER),
				Click.on(SELECCIONA_EL_HOTEL));
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			
		}
		
	}

	public static Reservar elHotel() {
		return instrumented(Reservar.class);
	}

}
