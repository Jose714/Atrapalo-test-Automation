package com.co.atrapalo.testing.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.co.atrapalo.testing.tasks.Entra;
import com.co.atrapalo.testing.tasks.Reservar;
import com.co.atrapalo.testing.ui.PaginaInicioAtrapalo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReservarHotelEnAtrapaloStepdefinitions {
	PaginaInicioAtrapalo paginadeinicio;

	@Managed(driver = "chrome")
	WebDriver suNavegador;
	
	Actor jose = Actor.named("jose");
	//EL ACTOR PUEDE REALIZAR LA ACCION ABRIR EL NAVEGADOR
	@Before
	public void setUp() {
		jose.can(BrowseTheWeb.with(suNavegador));
		suNavegador.manage().window().maximize();
	}
	@Given("^Jose entra a la pagina Atrapalo$")
	public void joseEntraALaPaginaAtrapalo() {
		jose.wasAbleTo(Entra.enLa(paginadeinicio));
	    
	}

	@When("^El busca y reserva el hotel$")
	public void elBuscaYReservaElHotel() {
	    jose.attemptsTo(Reservar.elHotel());
	    
	}

	@Then("^El verifica que la reserva se halla hecho satisfactoriamente$")
	public void elVerificaQueLaReservaSeHallaHechoSatisfactoriamente() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
