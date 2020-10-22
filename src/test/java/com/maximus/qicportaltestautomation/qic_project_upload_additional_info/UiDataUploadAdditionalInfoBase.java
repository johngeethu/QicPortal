package com.maximus.qicportaltestautomation.qic_project_upload_additional_info;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;
import com.maximus.qicportaltestautomation.qic_object_model.AdditionalInfoUploadData;

import java.util.concurrent.TimeUnit;


/**
 * This class contains methods to get info from the "Upload Additional Information" page of QIC portal
 */
public class UiDataUploadAdditionalInfoBase extends Utils {
    private static final By UPLOAD_ADDITIONAL_INFO_PAGE_TITLE_LOCATOR = By.xpath("//h3");
    private static final By UPLOAD_ADDITIONAL_INFO_FIRST_ROW_AFTER_TITLE_LOCATOR = By.xpath("//div[@class='panel-body']/div/b[1]");
    private static final By UPLOAD_ADDITIONAL_INFO_SECOND_ROW_AFTER_TITLE_LOCATOR = By.xpath("//div[@class='panel-body']/div/b[2]");
    private static final By UPLOAD_ADDITIONAL_INFO_THIRD_ROW_AFTER_TITLE_LOCATOR = By.xpath("//div[@class='panel-body']/span[@class='note']");
    private static final By UPLOAD_ADDITIONAL_INFO_FIRST_SECTION_NAME_LOCATOR = By.xpath("//div[@class='panel-body']/legend[1]");
    private static final By UPLOAD_ADDITIONAL_INFO_PROJECT_DROP_DOWN_NAME_LOCATOR = By.xpath("//label[@for='qic_Projects']");
    private static final By UPLOAD_ADDITIONAL_INFO_PROJECT_TEXT_VALUE_LOCATOR = By.id("qic_Projects");
    private static final By UPLOAD_ADDITIONAL_INFO_SECOND_SECTION_NAME_LOCATOR = By.xpath("//div[@class='panel-body']/legend[2]");
    private static final By UPLOAD_ADDITIONAL_INFO_FIRST_ROW_2_SECTION_LOCATOR = By.xpath("//div[@id='qic_appeal_tempid_frm']/div[1]");
    private static final By UPLOAD_ADDITIONAL_INFO_SECOND_ROW_2_SECTION_LOCATOR = By.xpath("//div[@id='qic_appeal_tempid_frm']/div[2]");
    private static final By UPLOAD_ADDITIONAL_INFO_THIRD_ROW_2_SECTION_LOCATOR = By.xpath("//div[@id='qic_appeal_tempid_frm']/div[3]/div/legend");
    private static final By UPLOAD_ADDITIONAL_INFO_QIC_APPEAL_FIELD_NAME_LOCATOR = By.xpath("//label[@for='qicAppealNumber']");
    private static final By UPLOAD_ADDITIONAL_INFO_QIC_APPEAL_NUMBER_TEXT_VALUE_LOCATOR = By.id("qicAppealNumber");
    private static final By UPLOAD_ADDITIONAL_INFO_TEMP_ID_FIELD_NAME_LOCATOR = By.xpath("//label[@for='addntl_project']");
    private static final By UPLOAD_ADDITIONAL_INFO_QIC_PORTAL_TEMP_ID_TEXT_VALUE_LOCATOR = By.id("qicTempIdNumber");
    private static final By UPLOAD_ADDITIONAL_INFO_THIRD_SECTION_NAME_LOCATOR = By.xpath("//div[@class='panel-body']/legend[3]");
    private static final By UPLOAD_ADDITIONAL_INFO_FIRST_ROW_3_SECTION_LOCATOR = By.xpath("//label[@for='addntl_project_details']");
    private static final By UPLOAD_ADDITIONAL_INFO_BRIEF_DESCRIPTION_TEXT_VALUE_LOCATOR = By.id("addInfoDocDetails");
    private static final By UPLOAD_ADDITIONAL_INFO_FOURTH_SECTION_NAME_LOCATOR = By.xpath("//div[@class='panel-body']/legend[4]");
    private static final By UPLOAD_ADDITIONAL_INFO_FIRST_ROW_4_SECTION_LOCATOR = By.xpath("//div[@id='case_file_upload']/div[1]");
    private static final By UPLOAD_ADDITIONAL_INFO_SECOND_ROW_4_SECTION_LOCATOR = By.xpath("//div[@id='case_file_upload']/div[2]");
    private static final By PROJECT_VALIDATION_MESSAGE_LOCATOR = By.xpath("//label[@id='qic_Projects-error']");
    private static final By QIC_APPEAL_NUMBER_VALIDATION_MESSAGE_LOCATOR = By.xpath("//label[@id='qicAppealNumber-error']");
    private static final By QIC_PORTAL_TEMP_ID_VALIDATION_MESSAGE_LOCATOR = By.xpath("//label[@id='qicTempIdNumber-error']");
    private static final By DOCUMENT_UPLOAD_VALIDATION_MESSAGE_LOCATOR = By.xpath("//div[@id='case_file_upload']/descendant::div[@class='ng-binding']");


    public UiDataUploadAdditionalInfoBase(WebDriver wd) {
        super(wd);
    }


    /**
     * This method returns the text of the "title" element on the page, which has H3 heading
     * @return
     */
    public String getPageTitle(){
        return getText(UPLOAD_ADDITIONAL_INFO_PAGE_TITLE_LOCATOR);
    }


    /**
     * This method returns the text of the first row after the page title (H3 heading)
     * @return
     */
    public String getTextFirstRowAfterTitle(){
        return getText(UPLOAD_ADDITIONAL_INFO_FIRST_ROW_AFTER_TITLE_LOCATOR);
    }


    /**
     * This method returns the text of the second row after the page title (H3 heading)
     * @return
     */
    public String getTextSecondRowAfterTitle(){
        return getText(UPLOAD_ADDITIONAL_INFO_SECOND_ROW_AFTER_TITLE_LOCATOR);
    }


    /**
     * This method returns the text of the third row after the page title (H3 heading)
     * @return
     */
    public String getTextThirdRowAfterTitle(){
        return getText(UPLOAD_ADDITIONAL_INFO_THIRD_ROW_AFTER_TITLE_LOCATOR);
    }


    /**
     * This method returns the name of the first section on the page
     * @return
     */
    public String getFirstSectionName(){
        return getText(UPLOAD_ADDITIONAL_INFO_FIRST_SECTION_NAME_LOCATOR);
    }


    /**
     * This method returns the name for the drop-down menu on the "QIC Project you are submitting documentation for" section
     * @return
     */
    public String getQicProjectDropDownName(){
        return getText(UPLOAD_ADDITIONAL_INFO_PROJECT_DROP_DOWN_NAME_LOCATOR);
    }


    /**
     * This method returns the text-value of the selected project
     * @return
     */
    public String getSelectedQicProjectValue(){
        return getProjectValue(UPLOAD_ADDITIONAL_INFO_PROJECT_TEXT_VALUE_LOCATOR);
    }


    /**
     * This method returns the name of the second section on the page
     * @return
     */
    public String getSecondSectionName(){
        return getText(UPLOAD_ADDITIONAL_INFO_SECOND_SECTION_NAME_LOCATOR);
    }

    /**
     * This method returns the text of the first row of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String getFirstRow2SectionText(){
        return getText(UPLOAD_ADDITIONAL_INFO_FIRST_ROW_2_SECTION_LOCATOR);
    }


    /**
     * This method returns the text of the second row of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String getSecondRow2SectionText(){
        return getText(UPLOAD_ADDITIONAL_INFO_SECOND_ROW_2_SECTION_LOCATOR);
    }


    /**
     * This method returns the text of the third row of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String getThirdRow2SectionText(){
        return getText(UPLOAD_ADDITIONAL_INFO_THIRD_ROW_2_SECTION_LOCATOR);
    }


    /**
     * This method returns the name of the QIC Appeal number field of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String getQicAppealNumberFieldName(){
        return getText(UPLOAD_ADDITIONAL_INFO_QIC_APPEAL_FIELD_NAME_LOCATOR);
    }


    /**
     * This method returns the text-value of the entered QIC Appeal number
     * @return
     */
    public String getEnteredQicAppealNumberValue(){
        return getTextFromValueOrNa(UPLOAD_ADDITIONAL_INFO_QIC_APPEAL_NUMBER_TEXT_VALUE_LOCATOR);
    }


    /**
     * This method returns the name of the QIC Portal Temp ID number field of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String getQicPortalTempIdNumberFieldName(){
        return getText(UPLOAD_ADDITIONAL_INFO_TEMP_ID_FIELD_NAME_LOCATOR);
    }


    /**
     * This method returns the text-value of the entered QIC Portal Temp ID number
     * @return
     */
    public String getEnteredQicPortalTempIdValue(){
        return getTextFromValueOrNa(UPLOAD_ADDITIONAL_INFO_QIC_PORTAL_TEMP_ID_TEXT_VALUE_LOCATOR);
    }


    /**
     * This method returns the name of the third section on the page
     * @return
     */
    public String getThirdSectionName(){
        return getText(UPLOAD_ADDITIONAL_INFO_THIRD_SECTION_NAME_LOCATOR);
    }


    /**
     * This method returns the name of the brief description field of the third (Additional Information Document details) section
     * @return
     */
    public String getQicPortalBriefDescriptionFieldName(){
        return getText(UPLOAD_ADDITIONAL_INFO_FIRST_ROW_3_SECTION_LOCATOR);
    }


    /**
     * This method returns the text-value of the entered brief description of what is being uploaded and why
     * @return
     */
    public String getEnteredBriefDescriptionTextValue(){
        return getTextFromValue(UPLOAD_ADDITIONAL_INFO_BRIEF_DESCRIPTION_TEXT_VALUE_LOCATOR).replaceAll("\\s", "");
    }


    /**
     * This method returns the name of the fourth section on the page
     * @return
     */
    public String getFourthSectionName(){
        return getText(UPLOAD_ADDITIONAL_INFO_FOURTH_SECTION_NAME_LOCATOR);
    }


    /**
     * This method returns the note text of the fourth (Document Upload) section
     * @return
     */
    public String getQicPortalDocumentUploadNoteText(){
        return getText(UPLOAD_ADDITIONAL_INFO_FIRST_ROW_4_SECTION_LOCATOR);
    }


    /**
     * This method returns the acceptable file format text of the fourth (Document Upload) section
     * @return
     */
    public String getQicPortalDocumentUploadAcceptableFileTypes(){
        return getText(UPLOAD_ADDITIONAL_INFO_SECOND_ROW_4_SECTION_LOCATOR);
    }


    /**
     * This method takes an AdditionalInfoUploadData object, adds to it the following fields filled by data from the UI and returns the updated object:
     * - withQicProject
     * - withQicAppealNumber
     * - withQicPortalTempId
     * - withBriefDescription
     *
     * @param additionalInfoUploadData any AdditionalInfoUploadData object
     * @return an AdditionalInfoUploadData object
     */
    public AdditionalInfoUploadData submissionInfoDuringCreation(AdditionalInfoUploadData additionalInfoUploadData){
        if(additionalInfoUploadData==null){
            additionalInfoUploadData = new AdditionalInfoUploadData();
        }
        wd.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        return additionalInfoUploadData.withQicProject(getSelectedQicProjectValue()).withQicAppealNumber(getEnteredQicAppealNumberValue())
                .withQicPortalTempId(getEnteredQicPortalTempIdValue()).withBriefDescription(getEnteredBriefDescriptionTextValue());
    }


    /**
     * This method returns an AdditionalInfoUploadData object with the following fields, filled by data from the UI:
     * - withQicProject
     * - withQicAppealNumber
     * - withQicPortalTempId
     * - withBriefDescription
     *
     * @return an AdditionalInfoUploadData object
     */
    public AdditionalInfoUploadData submissionInfoDuringCreation(){
        wd.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
        return new AdditionalInfoUploadData().withQicProject(getSelectedQicProjectValue()).withQicAppealNumber(getEnteredQicAppealNumberValue())
                .withQicPortalTempId(getEnteredQicPortalTempIdValue()).withBriefDescription(getEnteredBriefDescriptionTextValue());
    }


    /**
     * This method returns a text of the required field validation message for the Project drop-down in the UI
     * @return a text of the required field validation message
     */
    public String getProjectValidationMessageUi(){
        return getText(PROJECT_VALIDATION_MESSAGE_LOCATOR);
    }


    /**
     * This method returns a text of the required field validation message for the QIC Appeal number field in the UI
     * @return a text of the required field validation message
     */
    public String getQicAppealNumberValidationMessageUi(){
        return getText(QIC_APPEAL_NUMBER_VALIDATION_MESSAGE_LOCATOR);
    }


    /**
     * This method returns a text of the required field validation message for the QIC Portal Temp ID number field in the UI
     * @return a text of the required field validation message
     */
    public String getQicPortalTempIdValidationMessageUi(){
        return getText(QIC_PORTAL_TEMP_ID_VALIDATION_MESSAGE_LOCATOR);
    }


    /**
     * This method returns a text of the required field validation message for the Document Upload section in the UI
     * @return a text of the required field validation message
     */
    public String getDocumentValidationMessageUi(){
        return getText(DOCUMENT_UPLOAD_VALIDATION_MESSAGE_LOCATOR);
    }










}
