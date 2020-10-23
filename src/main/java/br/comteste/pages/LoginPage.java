package br.comteste.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CadastroPage {

	@FindBy(how = How.XPATH, using = "//input[@class='SearchBar__input ']")
	public WebElement barraDePesquisa;
	
	@FindBy(how = How.XPATH, using = "//div[@class='SearchBar__results__result__name']")
	public WebElement resultadoDaPesquisa;

}
