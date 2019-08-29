package com.co.atrapalo.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/co/atrapalo/testing/features/"
		+ "ReservarHotelEnAtrapalo.feature",glue = "com.co.atrapalo.testing."
				+ "stepsdefinitions", snippets = SnippetType.CAMELCASE)
public class ReservarHotelRunner {
	
}
