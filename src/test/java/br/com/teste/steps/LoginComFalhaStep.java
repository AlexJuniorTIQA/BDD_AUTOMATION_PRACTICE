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
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginComFalhaStep {

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
		folder = "Teste de Login com falha " + GenericLogic.getTimeStamp();

	}
	@Dado("que eu esteja na HomePage do site Automation Practice")
	public void que_eu_esteja_na_HomePage_do_site_AutomationPractice() throws Exception {
		Screenshot.getScreenShot(driver, folder, "Home Page");
	}

	@Quando("clico no campo 'Sign In'")
	public void clico_no_campo_Sign_In() throws Exception{
		homePageLogic.clicaSignIn();
		Screenshot.getScreenShot(driver, folder, "Tela de Login");
	}

	@E("preencho o campo 'Email address'")
	public void preencho_o_campo_Email_address() throws Exception{
		loginLogic.insereEmail(massaDeDados.getEmailUserInvalido());
	
	}

	@E("preencho o campo 'Password'")
	public void preencho_o_campo_Password() throws Exception {
		loginLogic.inserePassword(massaDeDados.getPasswordUserInvalido());
		Screenshot.getScreenShot(driver, folder, "Dados De Login Preenchidos");
	}

	@Entao("ao clicar em 'Sign In' recebo uma mensagem de erro")
	public void ao_clicar_em_Sig_In_recebo_uma_mensagem_de_erro() throws Exception{
		loginLogic.clicaSignIn();
		accountLogic.validaAlertaErro();
		Screenshot.getScreenShot(driver, folder, "Mensagem de erro no login");
	}


	@After
	public void closeDriver() {

		DriverFactory.quit();
	}

}
