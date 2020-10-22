package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

import java.io.IOException;

public class PartDTests extends TestBase {

    @BeforeClass
    public void login() {
    pm.getQicPortalLoginHelper().loginAsPlanAdmin();
    	//pm.getQicPortalLoginHelper().loginAsPlanAssociatedUser();
        pm.getQicPortalTabNavigationHelper().clickOnPartDTab();
    }

    @Test(enabled = false, groups = {"functest", "part d"})
    public void testSubmitOneCase() throws IOException, InterruptedException {
        pm.getFillOutPartD().enterCaseDataAndSubmit1(2,1,1);
    }


    @Test(enabled = true, groups = {"functest", "part d"})
    public void testSubmitMultipleCases() throws IOException, InterruptedException {
        pm.getFillOutPartD().enterCaseDataAndSubmit1(1,1,1);
    }

    @Test(enabled = false, groups = {"functest", "part d"})
    public void testSubmitCaseAndSavePDF() throws IOException, InterruptedException {
        pm.getFillOutPartD().enterCaseDataAndSubmit1(2,1,1);
        pm.getFillOutPartD().downLoadPdfForTheCase();
    }


}
