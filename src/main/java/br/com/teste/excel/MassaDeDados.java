package br.com.teste.excel;

import br.com.teste.excel.ExcelUtils;

public class MassaDeDados {
	
	public String getEmailUserValido() throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "TesteComSucesso");
		String user = ExcelUtils.getCellData(1, 0);
		return user;
	}

	public String getPasswordUserValido() throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "TesteComSucesso");
		String password = ExcelUtils.getCellData(1, 1);
		return password;
	}

	public String getEmailUserInvalido() throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "TesteComFalha");
		String user = ExcelUtils.getCellData(1, 0);
		return user;
	}

	public String getPasswordUserInvalido() throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "TesteFalha");
		String password = ExcelUtils.getCellData(1, 1);
		return password;
	}

}
