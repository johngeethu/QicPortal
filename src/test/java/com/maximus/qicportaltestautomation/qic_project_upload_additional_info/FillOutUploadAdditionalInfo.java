package com.maximus.qicportaltestautomation.qic_project_upload_additional_info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;

import java.io.File;


/**
 * This class contains methods which help select and/or fill out fields on the page
 */
public class FillOutUploadAdditionalInfo extends Utils {
    private static final By PROJECT_DROP_DOWN_LOCATOR = By.xpath("//select[@id='qic_Projects']");
    private static final By LIST_OF_PROJECT_VALUES_LOCATOR = By.xpath("(//select[@id='qic_Projects']/option[not(@style)])");
    private static final By QIC_APPEAL_NUMBER_FIELD_LOCATOR = By.xpath("(//input[@id='qicAppealNumber'])");
    private static final By QIC_PORTAL_TEMP_ID_FIELD_LOCATOR = By.xpath("(//input[@id='qicTempIdNumber'])");
    private static final By BRIEF_DESCRIPTION_FIELD_LOCATOR = By.xpath("(//textarea[@id='addInfoDocDetails'])");
    private static final By DOCUMENT_FILE_LOCATOR = By.xpath("//input[@type='file']");
    private static final By SUBMIT_UPLOAD_ADDITIONAL_INFO_LOCATOR = By.xpath("//button[@id='AddtnlInfo_submit_btn']");
    private static final By RESET_UPLOAD_ADDITIONAL_INFO_LOCATOR = By.xpath("//button[@id='AddtnlInfo_reset_btn']");
    private static final By CASE_NUMBER_LOCATOR = By.xpath("//p[contains(text(), 'Please note ')]/preceding-sibling::p[1]/strong[@class='ng-binding']");

    private QicPortalProjectManager pm;

    public FillOutUploadAdditionalInfo(WebDriver wd, QicPortalProjectManager pm) {
        super(wd);
        this.pm = pm;
    }


    /**
     * This method selects a random value for the Project dropdown
     */
    public void selectRandomProject() {
        clickJS(PROJECT_DROP_DOWN_LOCATOR, wd);
        selectRandomOption(LIST_OF_PROJECT_VALUES_LOCATOR);
    }


    /**
     * This method clicks on the value of the dropdown by index
     *
     * @param numberInDropdown
     */
    public void selectProjectByIndex(int numberInDropdown) {
        click(PROJECT_DROP_DOWN_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_OF_PROJECT_VALUES_LOCATOR, numberInDropdown);
    }


    /**
     * This method fills the QIC Appeal number field out with 10 random digits
     * @param qicAppealNumber This is needed to be added
     */
    public void enterQicAppealNumber(String qicAppealNumber) {
        clearAndType(QIC_APPEAL_NUMBER_FIELD_LOCATOR, qicAppealNumber);
    }


    /**
     * This method fills the QIC Appeal number field out with 9 random digits
     */
    public void enterQicAppealNumber() {
        clearAndType(QIC_APPEAL_NUMBER_FIELD_LOCATOR, randomStringDigitsOnly(9));
    }



    /**
     * This method fills the QIC Appeal number field out with 10 random digits
     */
    public void enterQicPortalTempId(String qicPortalTempId) {
        clearAndType(QIC_PORTAL_TEMP_ID_FIELD_LOCATOR, qicPortalTempId);
    }


    /**
     * This method enters some infor into the brief description of what is being uploaded and why field at Additional Information Document details
     */
    public void enterBriefDescription(String briefDescription) {
        clearAndType(BRIEF_DESCRIPTION_FIELD_LOCATOR, briefDescription);
    }


    /**
     * This method uploads a documents from the resources
     **/
    public void uploadDocument() {
        File document = new File("src/test/resources/QIC_Upload_Additional_Info.pdf");
        attach(DOCUMENT_FILE_LOCATOR, document);
    }


    /**
     * This method clicks on Submit button on Upload Additional Information page
     */
    public void submitUploadAdditionalInfo() {
        clickJS(SUBMIT_UPLOAD_ADDITIONAL_INFO_LOCATOR, wd);
        waitBlockUiDisappears();
    }




    /**
     * This method clicks on Reset button on Upload Additional Information page
     */
    public void resetUploadAdditionalInfo() {
        clickJS(RESET_UPLOAD_ADDITIONAL_INFO_LOCATOR, wd);
        waitBlockUiDisappears();
    }
    /**
     * This method fills out basic required fields for the additional information submission
     */
    public void enterUploadAdditionalInfoData() {
        waitBlockUiDisappears();
        pm.getQicPortalTabNavigationHelper().clickOnUploadAdditionalInformationTab();
        waitBlockUiDisappears();
        selectRandomProject();
        enterQicAppealNumber(randomStringDigitsOnly(10));
        enterQicPortalTempId(pm.getDatabaseDataUploadAdditionalInfo().getQicPortalTempIdFromDatabase());
        enterBriefDescription("This is test description, which was entered on " + timeStampDate());
        uploadDocument();
    }

    /**
     *  This method fills out basic required fields for the additional information submission and submits as many times as requested
     */
    public void enterDataAndSubmitUploadAdditionalInfo(int numberOfCases) {
        for (int i = 0; i < numberOfCases; i++) {
            enterUploadAdditionalInfoData();
            submitUploadAdditionalInfo();
            System.out.println("The new submission number is: " + anyTextFromUiByLocator(CASE_NUMBER_LOCATOR));
        }
    }



}
