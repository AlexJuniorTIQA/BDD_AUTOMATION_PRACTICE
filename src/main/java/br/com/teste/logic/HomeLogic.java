package br.com.teste.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.teste.driver.StoredActions;
import br.comteste.pages.HomePage;

public class HomeLogic {

	private HomePage homePage;
	private StoredActions action;

	public HomeLogic(WebDriver driver) {
		homePage = PageFactory.initElements(driver, HomePage.class);
		action = new StoredActions(driver);

	}

	public void clicaVerOfertas() throws Exception {
		action.waitElementToBeClickable(homePage.btnVerOfertas, 5);
		action.click(homePage.btnVerOfertas);
	}

}
