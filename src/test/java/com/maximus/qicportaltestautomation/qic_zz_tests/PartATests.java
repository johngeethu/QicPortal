package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.*;

public class PartATests extends TestBase {

    @BeforeClass
    public void login() {
        pm.getQicPortalLoginHelper().loginAsOtherAdmin();
        pm.getQicPortalTabNavigationHelper().clickOnPartATab();
    }


    /**
     * This verifies the name of the Part A tab
     */
    @Test(enabled = false, groups = {"functest", "dataverification", "part a"})
    public void testTabNameDataVerification() {
        String tabNameInRequirementsExpected = pm.getRequirementsDataPartA().getTabNamePartA();
        String tabNameInUiActual = pm.getQicPortalTabNavigationHelper().getPartATabText();

        assertEquals(tabNameInUiActual, tabNameInRequirementsExpected);
    }


    /**
     * This verifies that options of MAC drop-down meet the requirements
     */
    @Test(enabled = false, groups = {"functest", "dataverification", "part a"})
    public void testDropdownDataVerification() {
        List<String> listOfMacExpected = pm.getRequirementsDataPartA().getListOfMac();
        List<String> listOfMacActual = pm.getQicPortalPartAHelper().getListOfMac();

        assertEquals(listOfMacActual, listOfMacExpected);
    }


    /**
     * This creates a Part A case with Provider role
     *
     * @throws IOException
     * @throws InterruptedException
     */
    @Test(enabled = true, groups = {"functest", "part a"})
    public void testSubmitCaseClaims() throws IOException, InterruptedException {
        pm.getFillOutPartA().submitSeveralCases(5, 2);
      //  System.out.println(pm.getFillOutPartA().caseNumber());
    }


}
