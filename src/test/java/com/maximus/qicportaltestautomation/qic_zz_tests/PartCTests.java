package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

import java.io.IOException;



public class PartCTests extends TestBase {

    @BeforeClass
    public void login() {
       pm.getQicPortalLoginHelper().loginAsPlanAdmin();
    	//pm.getQicPortalLoginHelper().loginAsPlanAssociatedUser();
        pm.getQicPortalTabNavigationHelper().clickOnPartCTab();
    }

    @Test(enabled = true, groups = {"functest", "part c"})
    public void testSubmitOneCase() throws IOException, InterruptedException {
        pm.getFillOutPartC().enterCaseDataAndSubmit1(3);
        pm.getFillOutPartC().downLoadPdfForTheCase();
    }
    
    @Test(enabled = false)
    public void testpdf()
    {
    	String s=pm.getPdfDataPartC().getCasePriority("Q19-00001387");
    	System.out.println("pdf"+s);
    }
    
    


    @Test(enabled = false, groups = {"functest", "part c"})
    public void testSubmitMultipleCases() throws IOException, InterruptedException {
        pm.getFillOutPartC().enterCaseDataAndSubmit1(2);
    }

    @Test(enabled = false, groups = {"functest", "part c"})
    public void testSubmitCaseAndSavePDF() throws IOException, InterruptedException {
        pm.getFillOutPartC().enterCaseDataAndSubmit1(1);
        pm.getFillOutPartC().downLoadPdfForTheCase();
    }


}
