package com.co.atrapalo.testing.tasks;

import com.co.atrapalo.testing.ui.PaginaInicioAtrapalo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Entra implements Task {
	PageObject pagina;
	
	public Entra (PageObject pagina) {
		this.pagina = pagina;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pagina));	
	}

	public static Entra enLa(PaginaInicioAtrapalo paginadeinicio) {
		return instrumented(Entra.class,paginadeinicio);
	}

}
