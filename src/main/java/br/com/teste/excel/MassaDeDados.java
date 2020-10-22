package br.com.teste.excel;

import br.com.teste.excel.ExcelUtils;

public class MassaDeDados {

	public String getMarca() throws Exception {
		String marca = ExcelUtils.getCellData(1, 0);
		return marca;
	}

	public String getModelo() throws Exception {
		ExcelUtils.setExcelFile("./MassaDeDados.xlsx", "Teste");

		String modelo = ExcelUtils.getCellData(1, 1);
		return modelo;
	}

}
