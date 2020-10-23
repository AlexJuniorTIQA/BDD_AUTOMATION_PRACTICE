package br.comteste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how = How.ID, using = "email")
	public WebElement campoEmail;
	
	@FindBy(how = How.ID, using = "passwd")
	public WebElement campoPassword;
	
	@FindBy(how = How.ID, using = "SubmitLogin")
	public WebElement btnSignIn;
	
	
}
