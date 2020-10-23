package br.com.teste.steps;

import org.openqa.selenium.WebDriver;

import br.com.teste.driver.DriverFactory;
import br.com.teste.driver.Screenshot;
import br.com.teste.excel.MassaDeDados;
import br.com.teste.logic.AccountLogic;
import br.com.teste.logic.GenericLogic;
import br.com.teste.logic.HomeLogic;
import br.com.teste.logic.LoginLogic;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginComSucessoStep {

	private WebDriver driver;
	private String folder;
	private HomeLogic homePageLogic;
	private LoginLogic loginLogic;
	private AccountLogic accountLogic;
	private MassaDeDados massaDeDados;

	@Before
	public void Driver() throws Exception {
		driver = DriverFactory.getDriver();
		homePageLogic = new HomeLogic(driver);
		accountLogic = new AccountLogic(driver);
		loginLogic = new LoginLogic(driver);
		massaDeDados = new MassaDeDados();
		folder = "Teste de Login com sucesso " + GenericLogic.getTimeStamp();

	}

	@Dado("que eu esteja na HomePage do site AutomationPractice")
	public void que_eu_esteja_na_HomePage_do_site_AutomationPractice() throws Exception {
		Screenshot.getScreenShot(driver, folder, "Home Page");
	}

	@Quando("clico em 'Sign In")
	public void clico_em_Sign_In() throws Throwable {
		homePageLogic.clicaSignIn();
		Screenshot.getScreenShot(driver, folder, "Tela de Login");
	}

	@Quando("preencho o campos de login")
	public void preencho_o_campos_de_login() throws Throwable {
		loginLogic.insereEmail(massaDeDados.getEmailUserValido());
		loginLogic.inserePassword(massaDeDados.getPasswordUserValido());
		Screenshot.getScreenShot(driver, folder, "Dados De Login Preenchidos");
	}

	@Entao("ao clicar em 'Sign In' efetuo o login com sucesso")
	public void ao_clicar_em_Sig_In_efetuo_o_meu_login() throws Throwable {
		loginLogic.clicaSignIn();
		accountLogic.validaTituloMyAccount();
		Screenshot.getScreenShot(driver, folder, "Tela De Login efetuado com Sucesso");
	}

	@After
	public void closeDriver() {

		DriverFactory.quit();
	}

}
