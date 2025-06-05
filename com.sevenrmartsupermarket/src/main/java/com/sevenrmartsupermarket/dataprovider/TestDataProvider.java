package com.sevenrmartsupermarket.dataprovider;


import org.testng.annotations.DataProvider;

import com.sevenrmartsupermarket.utilities.ExcelReader;




public class TestDataProvider {
	ExcelReader excelreader= new ExcelReader();

	@DataProvider(name = "loginData")
	public Object[][] getData() {
		excelreader.setExcelFile("Credentials");
		return excelreader.getMultidimentionalData(3, 2);

	}
}
