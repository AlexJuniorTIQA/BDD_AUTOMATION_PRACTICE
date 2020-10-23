package br.comteste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage {

	@FindBy(how = How.XPATH, using = "//span[@class='navigation_page'][contains(text(),'My account')]")
	public WebElement tituloMyAccount;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='alert alert-danger'])[1]")
	public WebElement alertaErro;
}