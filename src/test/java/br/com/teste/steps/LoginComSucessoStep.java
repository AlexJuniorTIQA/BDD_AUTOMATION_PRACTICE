package br.com.teste.steps;

import org.openqa.selenium.WebDriver;

import br.com.teste.driver.DriverFactory;
import br.com.teste.driver.Screenshot;
import br.com.teste.excel.MassaDeDados;
import br.com.teste.logic.CadastroPageLogic;
import br.com.teste.logic.GenericLogic;
import br.com.teste.logic.HomeLogic;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginStep {

	private WebDriver driver;
	private String folder;
	private HomeLogic homePageLogic;
	private CadastroPageLogic estoqueLogic;
	private MassaDeDados massaDeDados;

	@Before
	public void Driver() throws Exception {
		driver = DriverFactory.getDriver();
		homePageLogic = new HomeLogic(driver);
		estoqueLogic = new CadastroPageLogic(driver);
		massaDeDados = new MassaDeDados();
		folder = "AutomationPractice" + GenericLogic.getTimeStamp();

	}

	@Dado("que eu esteja na HomePage do site Automation Practice")
	public void que_eu_esteja_na_HomePage_do_site_Automation_Practice(){
	   
	}

	@After
	public void closeDriver() {

		DriverFactory.quit();
	}

}
