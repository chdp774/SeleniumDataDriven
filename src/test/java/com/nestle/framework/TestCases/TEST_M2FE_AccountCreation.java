package com.nestle.framework.TestCases;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nestle.framework.Factory.TestBase;
import com.nestle.framework.PageObjects.M2FE_AccountCreation_Page;
import com.nestle.framework.Util.ExcelOperations;

public class TEST_M2FE_AccountCreation extends TestBase{
	M2FE_AccountCreation_Page m2fe;
	ExcelOperations excel = new ExcelOperations("AccountCreation");
	
	@Test
	public void accountCreation_test() {
		m2fe = new M2FE_AccountCreation_Page();
		m2fe.accountCreation("automation1234@yahoo.in", "selenium", "automation", "9000900090", "Dentistry", "adv123", "For personal or family use", 
				"99 UNIVERSITY AVE", "NEW CASTLE", "Delaware", "19720-4319", "Catalog Mail");

#okay checking
	}
	
	
//	@Test(dataProvider = "testDataSupplier")
//	public void test_accountCreation(Object obj1) {
//		HashMap<String, String> td = (HashMap<String, String>) obj1;
//		m2fe = new M2FE_AccountCreation_Page();
//		m2fe.accountCreation(td.get("mail"), td.get("firstname"), td.get("lastname"), td.get("phone"), td.get("practitioner"), td.get("license"), 
//				td.get("personaluse"), td.get("address1"), td.get("city"), td.get("state"), td.get("zip"), td.get("referral"));
//	}
//	
//	@DataProvider
//	public Object[][] testDataSupplier() throws Exception {
//		Object[][] obj = new Object[excel.getRowCount()][1];
//		for(int i = 1; i <= excel.getRowCount(); i++) {
//			HashMap<String, String> testData = excel.getTestDataInMap(i);
//			obj[i-1][0] = testData;
//		}
//		return obj;
//	}
}