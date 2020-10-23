package br.comteste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how = How.XPATH, using = "//a[@title='Log in to your customer account']")
	public WebElement btnSignIn;
}