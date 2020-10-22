package com.maximus.qicportaltestautomation.qic_zz_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maximus.qicportaltestautomation.qic_app_manager.TestBase;
import com.maximus.qicportaltestautomation.qic_object_model.AdditionalInfoUploadData;

import static org.testng.Assert.assertEquals;

public class UploadAdditionalInfoFunctionalTests extends TestBase {
    private static final String TEST_WITH_ROLE = "Plan";


    @BeforeClass
    public void login() {
        pm.getQicPortalLoginHelper().loginAsRole(TEST_WITH_ROLE);
        pm.getQicPortalTabNavigationHelper().clickOnUploadAdditionalInformationTab();

    }


    /**
     * This test verifies that Additional Information upload was successful and the correct data was saved into the PDF
     */
    @Test(enabled = true, groups = {"upload additional info"})
    public void testUploadAdditionalInfoPdf() {
        //Fill out all fields on the Upload Additional Information page
        pm.getFillOutUploadAdditionalInfo().enterUploadAdditionalInfoData();
        //This string creates an object of a new submission with the info from the UI
        AdditionalInfoUploadData infoUploadUI = pm.getUiDataUploadAdditionalInfoBase().submissionInfoDuringCreation();
        //This string adds the signed in user's (submitter's) data to the AdditionalInfoUploadData object
        infoUploadUI = pm.getDatabaseDataUploadAdditionalInfo().getSubmitterInfoFromDatabase(pm.getQicPortalLoginHelper().pickParty(TEST_WITH_ROLE), infoUploadUI);
        //This method clicks on the Submit button on the Upload Additional Information page
        pm.getFillOutUploadAdditionalInfo().submitUploadAdditionalInfo();
        //This string contains date/time of the submission from the UI(Confirmation page)
        String dateFromConfirmationPage = pm.getUiDataUploadAdditionalInfoConfirmation().additionalInfoSubmissionDate();
        //This string contains Temp Id number of the submission from the UI(Confirmation page)
        String tempIdFromConfirmationPage = pm.getUiDataUploadAdditionalInfoConfirmation().additionalInfoSubmissionTempId();
        //This string updates (adds) the object of a new submission with date/time and Temp Id
        infoUploadUI.withSubmissionDate(dateFromConfirmationPage).withSubmissionTempId(tempIdFromConfirmationPage);
        //This string downloads a PDF for the submission and saves it to the resources
        pm.getUiDataUploadAdditionalInfoConfirmation().downloadPdfForTheSubmission(pm.getQicPortalLoginHelper().pickParty(TEST_WITH_ROLE));
        //This string reads the PDF from the resources and creates second object of the submission data
        AdditionalInfoUploadData infoUploadPdf = pm.getPdfDataUploadAdditionalInfo().infoUploadPdfWithSubmitter1(tempIdFromConfirmationPage);
        //Return back to the Upload additional Information page
        pm.getQicPortalTabNavigationHelper().clickOnUploadAdditionalInformationTab();

        //Compare the set of data how it was entered in the UI and appeared in the PDF
        assertEquals(infoUploadPdf, infoUploadUI);
    }


    /**
     * This test verifies that all required fields have correct validation messages when empty during the submission
     */
    @Test(enabled = true, groups = {"upload additional info"})
    public void testUploadAdditionalInfoRequiredFieldsValidation() {
        //Don't enter any values and click on  submit
        pm.getFillOutUploadAdditionalInfo().submitUploadAdditionalInfo();
        //Get the validation messages from the Ui to compare
        String projectValidationUi = pm.getUiDataUploadAdditionalInfoBase().getProjectValidationMessageUi();
        String qicAppealNumberValidationUi = pm.getUiDataUploadAdditionalInfoBase().getQicAppealNumberValidationMessageUi();
        String qicPortalTempIdValidationUi = pm.getUiDataUploadAdditionalInfoBase().getQicPortalTempIdValidationMessageUi();
        String documentValidationUi = pm.getUiDataUploadAdditionalInfoBase().getDocumentValidationMessageUi();
        //Get the validation message from the requirements to compare
        String projectValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredProjectValidation();
        String qicAppealNumberValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredQicAppealNumberOrTempIdValidation();
        String qicPortalTempIdValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredQicAppealNumberOrTempIdValidation();
        String documentValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredDocumentValidation();
        //This method clicks on the Reset button on the Upload Additional Information page
        pm.getFillOutUploadAdditionalInfo().resetUploadAdditionalInfo();

        //Compare validation messages from the UI to the expected in the requirements.
        assertEquals(projectValidationUi, projectValidationRequired);
        assertEquals(qicAppealNumberValidationUi, qicAppealNumberValidationRequired);
        assertEquals(qicPortalTempIdValidationUi, qicPortalTempIdValidationRequired);
        assertEquals(documentValidationUi, documentValidationRequired);
    }


    /**
     * This test verifies that all required fields have correct validation messages when empty during the submission
     */
    @Test(enabled = true, groups = {"upload additional info"})
    public void testProjectFieldIsRequiredValidation() {
        //Fill out required fields on the Upload Additional Information page, except for the Project drop-down
        pm.getFillOutUploadAdditionalInfo().enterQicAppealNumber();
        pm.getFillOutUploadAdditionalInfo().uploadDocument();
        //Click on  submit
        pm.getFillOutUploadAdditionalInfo().submitUploadAdditionalInfo();
        //Get the validation message from the Ui to compare
        String projectValidationUi = pm.getUiDataUploadAdditionalInfoBase().getProjectValidationMessageUi();
        //Get the validation message from the requirements to compare
        String projectValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredProjectValidation();
        //This method clicks on the Reset button on the Upload Additional Information page
        pm.getFillOutUploadAdditionalInfo().resetUploadAdditionalInfo();

        //Compare a validation message from the UI to the expected in the requirements.
        assertEquals(projectValidationUi, projectValidationRequired);
    }


    /**
     * This test verifies that all required fields have correct validation messages when empty during the submission
     */
    @Test(enabled = true, groups = {"upload additional info"})
    public void testQicAppealNumberFieldIsRequiredValidation() {
        //Fill out required fields on the Upload Additional Information page, except for the QIC appeal number or QIC portal Temp Id number
        pm.getFillOutUploadAdditionalInfo().selectRandomProject();
        pm.getFillOutUploadAdditionalInfo().uploadDocument();
        //Click on  submit
        pm.getFillOutUploadAdditionalInfo().submitUploadAdditionalInfo();

        //Get the validation message for QIC appeal number from the Ui to compare
        String qicAppealNumberValidationUi = pm.getUiDataUploadAdditionalInfoBase().getQicAppealNumberValidationMessageUi();
        //Get the validation message for QIC appeal number from the requirements to compare
        String qicAppealNumberValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredQicAppealNumberOrTempIdValidation();
        //Get the validation message for Temp Id from the Ui to compare
        String qicTempIdNumberValidationUi = pm.getUiDataUploadAdditionalInfoBase().getQicPortalTempIdValidationMessageUi();
        //Get the validation message for Temp Id from the requirements to compare
        String qicTempIdNumberValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredQicAppealNumberOrTempIdValidation();
        //This method clicks on the Reset button on the Upload Additional Information page
        pm.getFillOutUploadAdditionalInfo().resetUploadAdditionalInfo();

        //Compare validation messages from the UI to the expected in the requirements.
        assertEquals(qicAppealNumberValidationUi, qicAppealNumberValidationRequired);
        assertEquals(qicTempIdNumberValidationUi, qicTempIdNumberValidationRequired);
    }


    /**
     * This test verifies that all required fields have correct validation messages when empty during the submission
     */
    @Test(enabled = true, groups = {"upload additional info"})
    public void testDocumentIsRequiredValidation() {
        //Fill out required fields on the Upload Additional Information page, except for the Document upload
        pm.getFillOutUploadAdditionalInfo().selectRandomProject();
        pm.getFillOutUploadAdditionalInfo().enterQicAppealNumber();
        //Click on  submit
        pm.getFillOutUploadAdditionalInfo().submitUploadAdditionalInfo();
        //Get the validation message for QIC appeal number from the Ui to compare
        String documentValidationUi = pm.getUiDataUploadAdditionalInfoBase().getDocumentValidationMessageUi();
        //Get the validation message for QIC appeal number from the requirements to compare
        String documentValidationRequired = pm.getRequirementsDataUploadAdditionalInfo().requiredDocumentValidation();
        //This method clicks on the Reset button on the Upload Additional Information page
        pm.getFillOutUploadAdditionalInfo().resetUploadAdditionalInfo();

        //Compare validation messages from the UI to the expected in the requirements.
        assertEquals(documentValidationUi, documentValidationRequired);
    }





}
