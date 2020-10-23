package br.com.teste.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.teste.driver.StoredActions;
import br.comteste.pages.LoginPage;

public class LoginLogic {

	private LoginPage cadastroPage;
	private StoredActions action;

	public LoginLogic(WebDriver driver) {
		cadastroPage = PageFactory.initElements(driver, LoginPage.class);
		action = new StoredActions(driver);

	}

	public void insereEmail(String email) {
		action.waitVisibilityOf(cadastroPage.campoEmail,5);
		action.insertText(cadastroPage.campoEmail, email);
	}
	public void inserePassword(String password) {
		action.waitVisibilityOf(cadastroPage.campoPassword,5);
		action.insertText(cadastroPage.campoPassword, password);
	}
	public void clicaSignIn() {
		action.waitVisibilityOf(cadastroPage.btnSignIn,5);
		action.click(cadastroPage.btnSignIn);
	}
}
