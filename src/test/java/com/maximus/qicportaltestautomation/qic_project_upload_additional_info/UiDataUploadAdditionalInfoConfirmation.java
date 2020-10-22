package com.maximus.qicportaltestautomation.qic_project_upload_additional_info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;
import com.maximus.qicportaltestautomation.qic_object_model.AdditionalInfoUploadData;

import java.util.concurrent.TimeUnit;


/**
 * This class contains methods which help to get information from a confirmation page for Additional Information submissions
 */
public class UiDataUploadAdditionalInfoConfirmation extends Utils {
    private static final By SAVE_AS_PDF_BUTTON_LOCATOR = By.xpath("//a[@id='uploadAdditionalInfoprintPdfBt']");
    private static final By CASE_NUMBER_LOCATOR = By.xpath("//p[contains(text(), 'Please note ')]/preceding-sibling::p[1]/strong[@class='ng-binding']");
    private static final By DATA_LOCATOR = By.xpath("//p[contains(text(), 'Thank you')]/strong[@class='ng-binding']");

    public UiDataUploadAdditionalInfoConfirmation(WebDriver wd) {
        super(wd);
    }


    /**
     * This method provides data for the submission from the QIC portal UI
     * @return
     */
    public String additionalInfoSubmissionDate() {
        String fullTempId = anyTextFromUiByLocator(DATA_LOCATOR);
        return fullTempId.substring(0, fullTempId.length() - 1);
    }

    /**
     * This method provides Temp ID for the submission from the QIC portal UI
     * @return
     */
    public String additionalInfoSubmissionTempId() {
        String fullTempId = anyTextFromUiByLocator(CASE_NUMBER_LOCATOR);
        return fullTempId.substring(0, fullTempId.length() - 1);
    }




    /**
     * This method downloads a case PDF and saves it to resources with the TempId Name
     */
    public void downloadPdfForTheSubmission(String party) {
        downloadFromUrl(SAVE_AS_PDF_BUTTON_LOCATOR, party, additionalInfoSubmissionTempId());
    }


    /**
     * This method returns an AdditionalInfoUploadData object with base info from the UI of the Upload Additional Information page and the confirmation pages
     * @param additionalInfoUploadDataFromUi
     * @return
     */
    public AdditionalInfoUploadData submissionInfoDuringCreation(AdditionalInfoUploadData additionalInfoUploadDataFromUi){
        wd.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        return additionalInfoUploadDataFromUi.withSubmissionDate(additionalInfoSubmissionDate()).withSubmissionTempId(additionalInfoSubmissionTempId());
    }

}
