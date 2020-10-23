package br.com.teste.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.teste.driver.StoredActions;
import br.comteste.pages.AccountPage;

public class AccountLogic {

	private AccountPage accountPage;
	private StoredActions action;

	public AccountLogic(WebDriver driver) {
		accountPage = PageFactory.initElements(driver, AccountPage.class);
		action = new StoredActions(driver);

	}


	@SuppressWarnings("unlikely-arg-type")
	public void validaTituloMyAccount() {
		 action.equals(action.waitVisibilityOf(accountPage.tituloMyAccount,10));
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void validaAlertaErro() {
		 action.equals(action.waitVisibilityOf(accountPage.alertaErro,10));
	}
}
