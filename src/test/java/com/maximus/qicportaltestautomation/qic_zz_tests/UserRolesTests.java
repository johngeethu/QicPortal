package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

import java.io.IOException;

public class UserRolesTests extends TestBase {

    /**
     * This verifies multifunctional login
     */

    @Test(enabled = true, groups = {"functest", "part a"})
    public void testLoginLogout() throws IOException, InterruptedException {
        pm.getQicPortalLoginHelper().loginAsRole("provider");
        pm.getQicPortalLoginHelper().loginAsPlanAdmin();
        System.out.println("Done");
    }

    @Test(enabled = true, groups = {"functest", "part a"})
    public void testLoginAsOther() throws IOException, InterruptedException {
        pm.getQicPortalLoginHelper().loginAsOtherAdmin();
        System.out.println("Done");
    }
}
