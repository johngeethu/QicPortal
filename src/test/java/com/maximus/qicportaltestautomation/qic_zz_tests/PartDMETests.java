package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.*;

public class PartDMETests extends TestBase {

    @BeforeClass
    public void login() {
        pm.getQicPortalLoginHelper().loginAsOtherAdmin();
        pm.getQicPortalTabNavigationHelper().clickOnPartDMETab();
    }


  

    /**
     * This creates a Part A case with Provider role
     *
     * @throws IOException
     * @throws InterruptedException
     */
    @Test(enabled = true, groups = {"functest", "part dme"})
    public void testSubmitCaseClaims() throws IOException, InterruptedException {
      //  pm.getFillOutPartDME().submitOneCase(1);
    	pm.getFillOutPartDME().submitSeveralCases(5,2);
        System.out.println(pm.getFillOutPartDME().caseNumber());
    }


}
