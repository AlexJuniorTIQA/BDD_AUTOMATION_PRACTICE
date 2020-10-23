package br.com.teste.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.teste.driver.StoredActions;
import br.comteste.pages.CadastroPage;

public class CadastroPageLogic {

	private CadastroPage estoquePage;
	private StoredActions action;

	public CadastroPageLogic(WebDriver driver) {
		estoquePage = PageFactory.initElements(driver, CadastroPage.class);
		action = new StoredActions(driver);

	}

	public void escreveBarraDePesquisa(String pesquisa) throws Exception {
		action.waitElementToBeClickable(estoquePage.barraDePesquisa, 5);
		action.insertText(estoquePage.barraDePesquisa, pesquisa);
		action.waitElementToBeClickable(estoquePage.resultadoDaPesquisa, 5);
		action.click(estoquePage.resultadoDaPesquisa);
	}

}
