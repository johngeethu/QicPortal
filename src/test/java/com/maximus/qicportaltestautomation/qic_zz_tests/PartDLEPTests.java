package com.maximus.qicportaltestautomation.qic_zz_tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

public class PartDLEPTests extends TestBase {
	  @BeforeClass
	    public void login() {
		  
	     pm.getQicPortalLoginHelper().loginAsPlanAdmin();
		  
		 // pm.getQicPortalLoginHelper().loginAsPlanAssociatedUser();
	        pm.getQicPortalTabNavigationHelper().clickOnPartDDrugTab();
	    }

	    @Test(enabled = true, groups = {"functest", "part d lep"})
	    public void testSubmitOneCase() throws IOException, InterruptedException {
	        pm.getFillOutPartDLEP().enterCaseDataAndSubmit(1);
	    }


}
