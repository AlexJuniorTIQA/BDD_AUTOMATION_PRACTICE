package br.com.teste.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "./features", glue = { "br.com.webmotors.teste.steps" },
		tags = {"@BuscaHomePage "},
		plugin = { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:report/reports.html" }, monochrome = true)

public class RunnerTest {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("./extension-config.xml"));
	}

}
