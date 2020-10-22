package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;

import static org.testng.Assert.assertEquals;

public class UploadAdditionalInfoGuiTests extends TestBase {

    @BeforeClass
    public void login() {
        pm.getQicPortalLoginHelper().loginAsPlanAdmin();
        pm.getQicPortalTabNavigationHelper().clickOnUploadAdditionalInformationTab();
    }

    /**
     * This test verifies if the page title text meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testPageTitleVerification() {
        String titleNameFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().pageTitle();
        String titleInUiActual = pm.getUiDataUploadAdditionalInfoBase().getPageTitle();

        assertEquals(titleInUiActual, titleNameFromTheRequirements);
    }


    /**
     * This test verifies if the text of the first row after the page title meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testFirstRowVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().firstRowAfterTitleText();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getTextFirstRowAfterTitle();

        assertEquals(textInUiActual, textFromTheRequirements);
    }

    /**
     * This test verifies if the text of the second row after the page title meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testSecondRowVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().secondRowAfterTitleText();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getTextSecondRowAfterTitle();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the text of the third row after the page title meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testThirdRowVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().thirdRowAfterTitleText();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getTextThirdRowAfterTitle();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the name of the first section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testFirstSectionNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().firstSectionName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getFirstSectionName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }



    /**
     * This test verifies if the name of the QIC project drop-down meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testQicProjectDropDownNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().qicProjectDropDownName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getQicProjectDropDownName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }



    /**
     * This test verifies if the name of the second section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testSecondSectionNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().secondSectionName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getSecondSectionName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the text of the first row of the second (QIC Appeal number or QIC Portal Temp ID) section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testFirstRow2SectionVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().firstRow2SectionText();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getFirstRow2SectionText();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the text of the second row of the second (QIC Appeal number or QIC Portal Temp ID) section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testSecondRow2SectionVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().secondRow2SectionText();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getSecondRow2SectionText();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the text of the third row of the second (QIC Appeal number or QIC Portal Temp ID) section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testThirdRow2SectionVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().thirdRow2SectionText();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getThirdRow2SectionText();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the name of the QIC Appeal number field meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testQicAppealFieldNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().qicAppealNumberFieldName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getQicAppealNumberFieldName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the name of the QIC Portal Temp ID number field meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testQicTempIdFieldNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().qicPortalTempIdNumberFieldName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getQicPortalTempIdNumberFieldName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the name of the third section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testThirdSectionNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().thirdSectionName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getThirdSectionName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }

    /**
     * This test verifies if the text for the brief description field of the third section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testBriefDescriptionFieldNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().qicPortalBriefDescriptionFieldName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getQicPortalBriefDescriptionFieldName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the name of the fourth section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testFourthSectionNameVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().fourthSectionName();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getFourthSectionName();

        assertEquals(textInUiActual, textFromTheRequirements);
    }



    /**
     * This test verifies if the text of the first row of the second (QIC Appeal number or QIC Portal Temp ID) section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testFirstRowDocumentUploadVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().qicPortalDocumentUploadNote();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getQicPortalDocumentUploadNoteText();

        assertEquals(textInUiActual, textFromTheRequirements);
    }


    /**
     * This test verifies if the text of the second row of the second (QIC Appeal number or QIC Portal Temp ID) section meets the requirements
     */
    @Test(enabled = true, groups = {"guitest", "dataverification", "upload additional info"})
    public void testSecondRowDocumentUploadVerification() {
        String textFromTheRequirements = pm.getRequirementsDataUploadAdditionalInfo().qicPortalAcceptableFileTypes();
        String textInUiActual = pm.getUiDataUploadAdditionalInfoBase().getQicPortalDocumentUploadAcceptableFileTypes();

        assertEquals(textInUiActual, textFromTheRequirements);
    }









}
