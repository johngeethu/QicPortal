package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

public class MyAccountDataVerificationTests extends TestBase {

    @BeforeClass
    public void login() {
        pm.getQicPortalLoginHelper().loginAsProviderAdmin();
        pm.getQicPortalTabNavigationHelper().clickOnMyAccountTab();
    }

    @Test
    public static void testQicAppealNumber(){
        String submissionTempId = "Q19-00001431";
        System.out.println("QicAppealNumberFromDb is " + pm.getDatabaseDataUploadAdditionalInfo().getQicAppealNumberFromDb(submissionTempId));
        System.out.println("SubmitterFirstNameFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterFirstNameFromDb(submissionTempId));
        System.out.println("SubmitterLastNameFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterLastNameFromDb(submissionTempId));
        System.out.println("SubmitterAddress1FromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterAddress1FromDb(submissionTempId));
        System.out.println("SubmitterAddress2FromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterAddress2FromDb(submissionTempId));
        System.out.println("SubmitterCityFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterCityFromDb(submissionTempId));
        System.out.println("SubmitterStateFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterStateFromDb(submissionTempId));
        System.out.println("SubmitterZipFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterZipFromDb(submissionTempId));
        System.out.println("SubmitterPhoneFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterPhoneFromDb(submissionTempId));
        System.out.println("SubmitterFaxFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterFaxFromDb(submissionTempId));
        System.out.println("SubmitterEmailFromDb is " + pm.getMyAccountDatabaseHelper().getSubmitterEmailFromDb(submissionTempId));

        System.out.println("SubmitterFirstNameFromDb is " + pm.getUiDataMyAccount().getSubmitterFirstName());
        System.out.println("SubmitterLastNameFromDb is " + pm.getUiDataMyAccount().getSubmitterLastName());
        System.out.println("SubmitterAddress1FromDb is " + pm.getUiDataMyAccount().getSubmitterAddress1());
        System.out.println("SubmitterAddress2FromDb is " + pm.getUiDataMyAccount().getSubmitterAddress2());
        System.out.println("SubmitterCityFromDb is " + pm.getUiDataMyAccount().getSubmitterCity());
        System.out.println("SubmitterStateFromDb is " + pm.getUiDataMyAccount().getSubmitterState());
        System.out.println("SubmitterZipFromDb is " + pm.getUiDataMyAccount().getSubmitterZip());
        System.out.println("SubmitterPhoneFromDb is " + pm.getUiDataMyAccount().getSubmitterPhone());
        System.out.println("SubmitterFaxFromDb is " + pm.getUiDataMyAccount().getSubmitterFax());
        System.out.println("SubmitterEmailFromDb is " + pm.getUiDataMyAccount().getSubmitterEmail());




    }




}
