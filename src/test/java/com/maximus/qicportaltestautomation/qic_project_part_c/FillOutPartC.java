package com.maximus.qicportaltestautomation.qic_project_part_c;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;
import com.maximus.qicportaltestautomation.qic_object_model.PartCCaseData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * This class contains helper methods to create Part C cases in QIC portal
 */
public class FillOutPartC extends Utils {
    private static final By CASE_PRIORITY_LOCATOR = By.xpath("//select[@id='mmc_casePriority']");
    private static final By APPEALAUTOFORWARD_YES = By.id("appealAutoForward_yes");
    private static final By APPEALAUTOFORWARD_NO = By.id("appealAutoForward_no");
    private static final By LIST_CASE_PRIORITY_VALUES_LOCATOR = By.xpath("(//select[@id='mmc_casePriority']/option[not(@style)])");
    private static final By FROM_DATE_OF_SERVICE_LOCATOR = By.xpath("//div[contains(@ng-show, 'PartC') and @aria-hidden='false']/descendant::input[@id='mmc_dosInQuestionFromDate']");
    private static final By TO_DATE_OF_SERVICE_LOCATOR = By.xpath("//div[contains(@ng-show, 'PartC') and @aria-hidden='false']/descendant::input[@id='mmc_dosInQuestionToDate']");
    private static final By ISSUE_CATEGORY_LOCATOR = By.xpath("//select[@id='mmc_issueCategory']");
    private static final By LIST_ISSUE_CATEGORIES_LOCATOR = By.xpath("(//select[@id='mmc_issueCategory']/option[not(@style)])");
    private static final By OTHER_ISSUE_CATEGORY_VALUE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='mmc_issueCategoryTxt']");
    private static final By QIC_APPEAL_NUMBER_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='mmc_appealNum']");
    private static final By PLANS_DISMISSAL_REASON_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::select[@id='mmc_planDismissalReason']");
    private static final By LIST_PLANS_DISMISSAL_REASONS_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::select[@id='mmc_planDismissalReason']/option[not(@style)]");
    private static final By OTHER_PLANS_DISMISSAL_REASON_VALUE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='mmc_planDismissalReasonTxt']");
    private static final By MEDICAL_NECESSITY_REVIEW_VALUES_LOCATOR = By.xpath("//div[@aria-labelledby='medicalNecessityReviewLbl']/div/div/input");
    private static final By ENROLLEE_FIRST_NAME_LOCATOR = By.xpath("//input[@id='ei_fName']");
    private static final By ENROLLEE_LAST_NAME_LOCATOR = By.xpath("//input[@id='ei_lName']");
    private static final By ENROLLEE_ADDR1_LOCATOR = By.xpath("//input[@id='ei_add1']");
    private static final By ENROLLEE_CITY_LOCATOR = By.xpath("//input[@id='ei_city']");
    private static final By ENROLLEE_STATE_LOCATOR = By.xpath("//select[@id='ei_state']");
    private static final By ENROLLEE_LIST_OF_STATES_LOCATOR = By.xpath("//select[@id='ei_state']/optgroup/option[@ng-repeat='item in stateTerritoryGrp']");
    private static final By ENROLLEE_ZIP_LOCATOR = By.xpath("//input[@id='ei_zip']");
    private static final By ENROLLEE_PHONE_LOCATOR = By.xpath("//input[@id='ei_phone']");
    private static final By ENROLLEE_MBI_LOCATOR = By.xpath("//input[@id='ei_medicareNumber']");
    private static final By ENROLLEE_HIC_LOCATOR = By.xpath("//input[@id='ei_hic']");
    private static final By ENROLLEE_IS_DECEASED_NO_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='ei_isEnrleDcsd_no']");
    private static final By ENROLLEE_IN_HOSPICE_NO_LOCATOR = By.xpath("//input[@id='ei_wasEiHospice_no']");
    private static final By ENROLLEE_ANOTHER_LANGUAGE_FDN_NO_LOCATOR = By.xpath("//input[@id='ei_othrDtrmnNtcLangReq_no']");
    private static final By ENROLLEE_COMMUNICATION_ALTERNATE_FORMAT_NO_LOCATOR = By.xpath("//input[@id='ei_isAltCommReq_no']");
    private static final By APPEAL_REQUESTOR_LOCATOR = By.xpath("//select[@id='ar_requestor']");
    private static final By LIST_APPEAL_REQUESTORS_LOCATOR = By.xpath("//select[@id='ar_requestor']/option[not(@style)]");
    private static final By IS_AOR_IN_FILE_LOCATOR = By.xpath("//label[@id='aorPowerOfAttorneyLbl']/parent::div/parent::div[@aria-hidden='false']");
    private static final By YES_AOR_IN_FILE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='ar_isAorPoaInFile_yes']");
    private static final By NO_AOR_IN_FILE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='ar_isAorPoaInFile_no']");
    private static final By YES_ESTATE_DOCUMENTATION_IN_FILE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='ar_isEstDocInFile_yes']");
    private static final By NO_ESTATE_DOCUMENTATION_IN_FILE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='ar_isEstDocInFile_no']");
    private static final By YES_WAIVER_LIABILITY_IN_FILE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='ar_isWvrLiabInFile_yes']");
    private static final By NO_WAIVER_LIABILITY_IN_FILE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='ar_isWvrLiabInFile_no']");
    private static final By BLOCKED_TEXT_FIELD_LOCATOR = By.xpath("//*[@readonly='readonly']");
    private static final By APPEAL_REQUESTOR_FIRST_NAME_LOCATOR = By.xpath("//input[@id='ar_fName' and not(@readonly)]");
    private static final By APPEAL_REQUESTOR_LAST_NAME_LOCATOR = By.xpath("//input[@id='ar_lName' and not(@readonly)]");
    private static final By APPEAL_REQUESTOR_COMPANY_NAME_LOCATOR = By.xpath("//input[@id='ar_organisation']");
    private static final By APPEAL_REQUESTOR_ADDR1_LOCATOR = By.xpath("//input[@id='ar_add1' and not(@readonly)]");
    private static final By APPEAL_REQUESTOR_CITY_LOCATOR = By.xpath("//input[@id='ar_city' and not(@readonly)]");
    private static final By APPEAL_REQUESTOR_STATE_LOCATOR = By.xpath("//select[@id='ar_state' and not(@readonly)]");
    private static final By APPEAL_REQUESTOR_LIST_OF_STATES_LOCATOR = By.xpath("//select[@id='ar_state' and not(@readonly)]/optgroup/option[@ng-repeat='item in stateTerritoryGrp']");
    private static final By APPEAL_REQUESTOR_ZIP_LOCATOR = By.xpath("//input[@id='ar_zip' and not(@readonly)]");
    private static final By APPEAL_REQUESTOR_PHONE_LOCATOR = By.xpath("//input[@id='ar_phone' and not(@readonly)]");
    private static final By HEALTH_PLAN_CMS_CONTRACT_LOCATOR = By.xpath("//select[@id='mhp_contract_num']");
    private static final By LIST_HEALTH_PLAN_CMS_CONTRACTS_LOCATOR = By.xpath("//select[@id='mhp_contract_num']/option[not(@style)]");
    private static final By HEALTH_PLAN_TYPE_LOCATOR = By.xpath("//select[@id='mhp_pType']");
    private static final By LIST_HEALTH_PLAN_TYPES_LOCATOR = By.xpath("//select[@id='mhp_pType']/option[not(@style)]");
    private static final By OD_INITIAL_REQUEST_DATE_LOCATOR = By.xpath("//input[@id='mhp_od_initAuthDate']");
    private static final By OD_INITIAL_DENIAL_DATE_LOCATOR = By.xpath("//input[@id='mhp_od_initDenialDate']");
    private static final By OD_WAS_EXPEDITED_REQUEST_MADE_QUESTION_LOCATOR = By.xpath("//label[@id='expeditedRequestLbl']/parent::div/parent::div[@aria-hidden='false']");
    private static final By OD_LIST_ANSWERS_WAS_EXPEDITED_REQUEST_MADE_LOCATOR = By.xpath("//input[@name='mhp_od_WsExpeditedReqMd']");
    private static final By OD_WAS_EXPEDITED_REQUEST_GRANTED_QUESTION_LOCATOR = By.xpath("//label[@id='expeditedGrantedLbl']/parent::div/parent::div[@aria-hidden='false']");
    private static final By OD_LIST_ANSWERS_WAS_EXPEDITED_REQUEST_GRANTED_LOCATOR = By.xpath("//input[@name='mhp_od_WsExpeditedReqGrtd']");
    private static final By OD_DID_PLAN_TAKE_EXTENSION_QUESTION_LOCATOR = By.xpath("//label[@id='planExtensionLbl']/parent::div/parent::div[@aria-hidden='false']");
    private static final By OD_LIST_ANSWERS_DID_PLAN_TAKE_EXTENSION_LOCATOR = By.xpath("//input[@name='mhp_od_DidPlanExtended']");
    private static final By RECONSIDERATION_REQUEST_DATE_LOCATOR = By.xpath("//input[@id='mhp_recon_reqDate']");
    private static final By RECONSIDERATION_DETERMINATION_DATE_LOCATOR = By.xpath("//input[@id='mhp_recon_dtrmnDate']");
    private static final By RECONSIDERATION_WAS_EXPEDITED_REQUEST_MADE_QUESTION_LOCATOR = By.xpath("//label[@id='expeditedRequestMadeRecconLbl']/parent::div/parent::div[@aria-hidden='false']");
    private static final By RECONSIDERATION_LIST_ANSWERS_WAS_EXPEDITED_REQUEST_MADE_LOCATOR = By.xpath("//input[@name='mhp_recon_WsExpeditedReqMd']");
    private static final By RECONSIDERATION_WAS_EXPEDITED_REQUEST_GRANTED_QUESTION_LOCATOR = By.xpath("//label[@id='mhpReconWsExpeditedReqGrtdLbl']/parent::div/parent::div[@aria-hidden='false']");
    private static final By RECONSIDERATION_NO_EXPEDITED_REQUEST_GRANTED_LOCATOR = By.xpath("//input[@id='mhp_recon_WsExpeditedReqGrtd_no']");
    private static final By RECONSIDERATION_DID_PLAN_TAKE_EXTENSION_QUESTION_LOCATOR = By.xpath("//label[@id='mhp_recon_DidPlanExtendedLbl']/parent::div/parent::div[@aria-hidden='false']");
    private static final By RECONSIDERATION_LIST_ANSWERS_DID_PLAN_TAKE_EXTENSION_LOCATOR = By.xpath("//input[@name='mhp_recon_DidPlanExtended']");
    private static final By ITEMS_SERVICES_IN_DISPUTE_LOCATOR = By.xpath("//select[@id='dod_svc_in_dspt']");
    private static final By LIST_ITEMS_SERVICES_IN_DISPUTE_LOCATOR = By.xpath("(//select[@id='dod_svc_in_dspt']/optgroup/option)");
    private static final By OTHER_ITEM_SERVICE_VALUE_LOCATOR = By.xpath("//div[@aria-hidden='false']/descendant::input[@id='dod_svc_in_dspt_other']");
    private static final By SUBMIT_PART_C_LOCATOR = By.xpath("//button[@id='partC_submit_btn']");
    private static final By SAVE_AS_PDF_BUTTON_LOCATOR = By.xpath("//a[@id='partCprintPdfBt']");
    private static final By CASE_NUMBER_LOCATOR = By.xpath("//*[contains(text(), 'Please note ')]/preceding-sibling::p[1]/strong[2]");
    private static final By CASE_FILE_DOC = By.xpath("//*[@id='caseFileDocs']/div/input");
    private static final By PLAN_CONTRACT_DOC=By.xpath("//*[@id='plnContractDocs']/div/input");


    private QicPortalProjectManager pm;

    public FillOutPartC(WebDriver wd, QicPortalProjectManager pm) {
        super(wd);
        this.pm = pm;
    }

    public void selectCasePriority(int numberInDropdown)  {
        click(CASE_PRIORITY_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_CASE_PRIORITY_VALUES_LOCATOR, numberInDropdown);
    }

    public void selectRandomCasePriority()  {
        click(CASE_PRIORITY_LOCATOR);
        selectRandomOption(LIST_CASE_PRIORITY_VALUES_LOCATOR);
    }

    public void enterFromDateOfService(String date) {
        typeIfPresent(FROM_DATE_OF_SERVICE_LOCATOR, date);
    }

    public void enterToDateOfService(String date) {
        typeIfPresent(TO_DATE_OF_SERVICE_LOCATOR, date);
    }
    
    public void enterAutoForward_yes() {
    	click(APPEALAUTOFORWARD_YES);
    }

    public void selectIssueCategory(int numberIssueCategory) {
        click(ISSUE_CATEGORY_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_ISSUE_CATEGORIES_LOCATOR, numberIssueCategory);
    }

    public void selectRandomIssueCategory()  {
        click(ISSUE_CATEGORY_LOCATOR);
        selectRandomOption(LIST_ISSUE_CATEGORIES_LOCATOR);
    }


    public void enterOtherIssueCategoryValue()  {
        typeIfPresent(OTHER_ISSUE_CATEGORY_VALUE_LOCATOR, "Test of other Issue Category");
    }

    public void enterQicAppealNumber()   {
        typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR, "1-" + randomStringDigitsOnly(10));
    }

    public void selectRandomPlanDismissalReason() {
        if (isElementPresent(PLANS_DISMISSAL_REASON_LOCATOR)) {
            click(PLANS_DISMISSAL_REASON_LOCATOR);
            selectRandomOption(LIST_PLANS_DISMISSAL_REASONS_LOCATOR);
        }
    }

    public void selectPlanDismissalReason(int numberPlanDismissalreason)  {
        if (isElementPresent(PLANS_DISMISSAL_REASON_LOCATOR)) {
            click(PLANS_DISMISSAL_REASON_LOCATOR);
            selectOptionFromDropDownByIndex(LIST_PLANS_DISMISSAL_REASONS_LOCATOR, numberPlanDismissalreason);
        }
    }

    public void enterOtherPlanDismissalReasonValue() {
        typeIfPresent(OTHER_PLANS_DISMISSAL_REASON_VALUE_LOCATOR, "Test of other Plans Dismissal Reason");
    }


    public void selectRandomAnswerMedicalNecessityReview()  {
        selectRandomOption(MEDICAL_NECESSITY_REVIEW_VALUES_LOCATOR);
    }

    public void enterEnrolleeFirstName(String enrolleeFirstName) {
        clearAndType(ENROLLEE_FIRST_NAME_LOCATOR, enrolleeFirstName);
    }

    public void enterEnrolleeLastName(String enrolleeLastName) {
        clearAndType(ENROLLEE_LAST_NAME_LOCATOR, enrolleeLastName);
    }

    public void enterEnrolleeAddr(String enrolleeAddr1) {
        clearAndType(ENROLLEE_ADDR1_LOCATOR, enrolleeAddr1);
    }

    public void enterEnrolleeCity(String enrolleeCity) {
        clearAndType(ENROLLEE_CITY_LOCATOR, enrolleeCity);
    }

    public void selectEnrolleeState(int numberInDropdown) throws InterruptedException {
        click(ENROLLEE_STATE_LOCATOR);
        selectOptionFromDropDownByIndex(ENROLLEE_LIST_OF_STATES_LOCATOR, numberInDropdown);
    }

    public void selectRandomEnroleeState() throws InterruptedException {
        click(ENROLLEE_STATE_LOCATOR);
        selectRandomOption(ENROLLEE_LIST_OF_STATES_LOCATOR);
    }

    public void enterEnrolleeZip(String enrolleeZip) {
        clearAndType(ENROLLEE_ZIP_LOCATOR, enrolleeZip);
    }

    public void enterEnrolleePhone(String enrolleePhone) {
        clearAndType(ENROLLEE_PHONE_LOCATOR, enrolleePhone);
    }

    public void enterEnrolleeMbi(String mbi) {
        clearAndType(ENROLLEE_MBI_LOCATOR, mbi);
    }

    public void enterEnrolleeHic(String hic) {
        clearAndType(ENROLLEE_HIC_LOCATOR, hic);
    }

    public void selectNoEnrolleeDeceased() {
        clickIfNotBlocked(ENROLLEE_IS_DECEASED_NO_LOCATOR);
    }

    public void selectNoEnrolleeInHospice() {
        clickIfPresent(ENROLLEE_IN_HOSPICE_NO_LOCATOR);
    }

    public void selectNoAnotherLanguageFdn() {
        clickIfPresent(ENROLLEE_ANOTHER_LANGUAGE_FDN_NO_LOCATOR);
    }

    public void selectNoAlernateCommunicationFormat() {
        clickIfPresent(ENROLLEE_COMMUNICATION_ALTERNATE_FORMAT_NO_LOCATOR);
    }

    public void selectAppealRequestor(int numberAppealRequestor) throws InterruptedException {
        click(APPEAL_REQUESTOR_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_APPEAL_REQUESTORS_LOCATOR, numberAppealRequestor);
    }

    /**
     * This selects random value of an Appeal Requestor.
     *
     * @throws InterruptedException
     */
    public void selectRandomAppealRequestor() throws InterruptedException {
        click(APPEAL_REQUESTOR_LOCATOR);
        selectRandomOption(LIST_APPEAL_REQUESTORS_LOCATOR);
    }

    /**
     * This selects random value of an Appeal Requestor. "No" answer is being selected, if the Representative was selected as an Appeal Requestor
     *
     * @throws InterruptedException
     */
    public void selectRandomAppealRequestorWithNoAorInFile() throws InterruptedException {
        click(APPEAL_REQUESTOR_LOCATOR);
        selectRandomOption(LIST_APPEAL_REQUESTORS_LOCATOR);
        selectNoAorPowerAttorneyIsInFile();
    }

    /**
     * This selects "No" for "Is an AOR or Power of Attorney in the File?" question if the Representative was selected as an Appeal Requestor
     */
    public void selectNoAorPowerAttorneyIsInFile() {
        clickIfPresent(NO_AOR_IN_FILE_LOCATOR);

    }

    /**
     * This selects "Yes" for "Is an AOR or Power of Attorney in the File?" question if the Representative was selected as an Appeal Requestor
     */
    public void selectYesAorPowerAttorneyIsInFile() {
        clickIfPresent(YES_AOR_IN_FILE_LOCATOR);

    }


    /**
     * This selects "No" for "Is estate documentation in the file?" question if the Representative was selected as an Appeal Requestor
     */
    public void selectNoEstateDocumentationInFile() {
        clickIfPresent(NO_ESTATE_DOCUMENTATION_IN_FILE_LOCATOR);

    }

    /**
     * This selects "Yes" for "Is estate documentation in the file?" question if the Representative was selected as an Appeal Requestor
     */
    public void selectYesEstateDocumentationInFile() {
        clickIfPresent(YES_ESTATE_DOCUMENTATION_IN_FILE_LOCATOR);

    }

    /**
     * This selects "No" for "Is a Waiver of Liability in the file?" question if the Representative was selected as an Appeal Requestor
     */
    public void selectNoWaiverLiabilityInFile() {
        clickIfPresent(NO_WAIVER_LIABILITY_IN_FILE_LOCATOR);

    }

    /**
     * This selects "Yes" for "Is a Waiver of Liability in the file?" question if the Representative was selected as an Appeal Requestor
     */
    public void selectYesWaiverLiabilityInFile() {
        clickIfPresent(YES_WAIVER_LIABILITY_IN_FILE_LOCATOR);

    }


    public void enterAppealRequestorFirstName(String appealRequestorFirstName) {
        typeIfPresent(APPEAL_REQUESTOR_FIRST_NAME_LOCATOR, appealRequestorFirstName);
    }

    public void enterAppealRequestorLastName(String appealRequestorLastName) {
        typeIfPresent(APPEAL_REQUESTOR_LAST_NAME_LOCATOR, appealRequestorLastName);
    }


    public void enterAppealRequestorCompanyName() {
        typeIfPresent(APPEAL_REQUESTOR_COMPANY_NAME_LOCATOR, "AR Company Name " + timeStampDateHour());
    }


    public void enterAppealRequestorAddr1(String appealRequestorAddr1) {
        typeIfPresent(APPEAL_REQUESTOR_ADDR1_LOCATOR, appealRequestorAddr1);
    }

    public void enterAppealRequestorCity(String appealRequestorCity) {
        typeIfPresent(APPEAL_REQUESTOR_CITY_LOCATOR, appealRequestorCity);
    }

    public void selectAppealRequestorState(int numberInDropdown) throws InterruptedException {
        if (isElementPresent(APPEAL_REQUESTOR_STATE_LOCATOR)) {
            clickIfNotBlocked(APPEAL_REQUESTOR_STATE_LOCATOR);
            selectOptionFromDropDownByIndex(APPEAL_REQUESTOR_LIST_OF_STATES_LOCATOR, numberInDropdown);
        }
    }

    public void selectRandomAppealRequestorState() throws InterruptedException {
        if (isElementPresent(APPEAL_REQUESTOR_STATE_LOCATOR)) {
            clickIfNotBlocked(APPEAL_REQUESTOR_STATE_LOCATOR);
            selectRandomOption(APPEAL_REQUESTOR_LIST_OF_STATES_LOCATOR);
        }
    }

    public void enterAppealRequestorZip(String appealRequestorZip) {
        typeIfPresent(APPEAL_REQUESTOR_ZIP_LOCATOR, appealRequestorZip);
    }

    public void enterAppealRequestorPhone(String appealRequestorPhone) {
        typeIfPresent(APPEAL_REQUESTOR_PHONE_LOCATOR, appealRequestorPhone);
    }

    public void selectRandomCmsContract() throws InterruptedException {
        clickIfPresent(HEALTH_PLAN_CMS_CONTRACT_LOCATOR);
        selectRandomOption(LIST_HEALTH_PLAN_CMS_CONTRACTS_LOCATOR);
    }

    public void selectPlanTypeState(int numberInDropdown) throws InterruptedException {
        click(HEALTH_PLAN_TYPE_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_HEALTH_PLAN_TYPES_LOCATOR, numberInDropdown);
    }

    public void selectRandomPlanType() throws InterruptedException {
        click(HEALTH_PLAN_TYPE_LOCATOR);
        selectRandomOption(LIST_HEALTH_PLAN_TYPES_LOCATOR);
    }

    public void enterInitialRequestDate(String date) {
    	if (isElementVisble(OD_INITIAL_REQUEST_DATE_LOCATOR))
        typeIfPresent(OD_INITIAL_REQUEST_DATE_LOCATOR, date);
    }

    public void enterInitialDenialDate(String date) {
    	if (isElementVisble(OD_INITIAL_DENIAL_DATE_LOCATOR))
    	typeIfPresent(OD_INITIAL_DENIAL_DATE_LOCATOR, date);
    }

    public void selectWasExpeditedRequestMadeOrganizationDetermination() throws InterruptedException {
        if (isElementVisble(OD_WAS_EXPEDITED_REQUEST_MADE_QUESTION_LOCATOR)) {
            selectRandomOption(OD_LIST_ANSWERS_WAS_EXPEDITED_REQUEST_MADE_LOCATOR);
        }
    }

    public void selectWasExpeditedRequestGrantedOrganizationDetermination() throws InterruptedException {
        if (isElementVisble(OD_WAS_EXPEDITED_REQUEST_GRANTED_QUESTION_LOCATOR)) {
            selectRandomOption(OD_LIST_ANSWERS_WAS_EXPEDITED_REQUEST_GRANTED_LOCATOR);
        }
    }

    public void selectDidPlanTakeExtensionOrganizationDetermination() throws InterruptedException {
        if (isElementVisble(OD_DID_PLAN_TAKE_EXTENSION_QUESTION_LOCATOR)) {
            selectRandomOption(OD_LIST_ANSWERS_DID_PLAN_TAKE_EXTENSION_LOCATOR);
        }
    }

    public void enterReconsiderationRequestDate(String date) {
    	 if (isElementVisble(RECONSIDERATION_REQUEST_DATE_LOCATOR))
    	typeIfPresent(RECONSIDERATION_REQUEST_DATE_LOCATOR, date);
    }

    public void enterReconsiderationDeterminationDate(String date) {
    	 if (isElementVisble(RECONSIDERATION_DETERMINATION_DATE_LOCATOR))
    	typeIfPresent(RECONSIDERATION_DETERMINATION_DATE_LOCATOR, date);
    }

    public void selectWasExpeditedRequestMadeReconsideration() throws InterruptedException {
        if (isElementVisble(RECONSIDERATION_WAS_EXPEDITED_REQUEST_MADE_QUESTION_LOCATOR)) {
            selectRandomOption(RECONSIDERATION_LIST_ANSWERS_WAS_EXPEDITED_REQUEST_MADE_LOCATOR);
        }
    }

    public void selectWasExpeditedRequestGrantedReconsideration() throws InterruptedException {
        if (isElementVisble(RECONSIDERATION_WAS_EXPEDITED_REQUEST_GRANTED_QUESTION_LOCATOR)) {
            selectRandomOption(RECONSIDERATION_NO_EXPEDITED_REQUEST_GRANTED_LOCATOR);
        }
    }

    public void selectDidPlanTakeExtensionReconsideration() throws InterruptedException {
        if (isElementVisble(RECONSIDERATION_DID_PLAN_TAKE_EXTENSION_QUESTION_LOCATOR)) {
            selectRandomOption(RECONSIDERATION_LIST_ANSWERS_DID_PLAN_TAKE_EXTENSION_LOCATOR);
        }
    }

    public void selectItemsServicesInDispute(int numberInDropdown) throws InterruptedException {
        clickIfPresent(ITEMS_SERVICES_IN_DISPUTE_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_ITEMS_SERVICES_IN_DISPUTE_LOCATOR, numberInDropdown);
    }

    public void selectRandomItemsServicesInDispute() throws InterruptedException {
        click(ITEMS_SERVICES_IN_DISPUTE_LOCATOR);
        selectRandomOption(LIST_ITEMS_SERVICES_IN_DISPUTE_LOCATOR);
    }

    public void selectItemsServicesInDisputeByText(String text) {
        selectOptionFromDropDownByText(ITEMS_SERVICES_IN_DISPUTE_LOCATOR, text);
    }

    public void selectItemsServicesInDisputeByIndex(int numberInDropdown) throws InterruptedException {
        click(ITEMS_SERVICES_IN_DISPUTE_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_ITEMS_SERVICES_IN_DISPUTE_LOCATOR, numberInDropdown);
    }


    public void enterOtherItemServiceValue() {
        typeIfPresent(OTHER_ITEM_SERVICE_VALUE_LOCATOR, "Test of Other Item Service");
    }
    
    public void uploadCaseFileDoc() throws InterruptedException
    {
    	 File document = new File("src/test/resources/test.pdf");
    	 //js.executeScript("arguments[0].click();", CASE_FILE_DOC);
    	 clickIfPresent(CASE_FILE_DOC);
		    Thread.sleep(1000);
		    uploadFile(document);
			Thread.sleep(1000);
    }
    
    public void uploadPlanContractDoc() throws InterruptedException
    {
    	System.out.println("uploadEvidenceCovDoc");
    	scrollToElementAndClick(PLAN_CONTRACT_DOC,wd);
    	 File document = new File("src/test/resources/performanceReport-300.pdf");
    	 //js.executeScript("arguments[0].click();", CASE_FILE_DOC);
    	// clickIfPresent(EVIDENCE_COV_DOC);
		    Thread.sleep(1000);
		    uploadFile(document);
			Thread.sleep(1000);
    }


    /**
     * This method clicks on Submit button on Part C page
     */
    public void submitPartCCase() {
        clickIfPresent(SUBMIT_PART_C_LOCATOR);
        waitBlockUiDisappears();
    }

    /**
     * This method clicks on Part C tab and fills out all required fields using provided data
     *
     * @param getFromDateOfService
     * @param getToDateOfService
     * @param getEnrolleeFirstName
     * @param getEnrolleeLastName
     * @param getEnrolleeAddress1
     * @param getEnrolleeCity
     * @param getEnrolleeZip
     * @param getEnrolleePhone
     * @param getMbi
     * @param getHic
     * @param getAppealRequestorFirstName
     * @param getAppealRequestorLastName
     * @param getAppealRequestorAddress1
     * @param getAppealRequestorCity
     * @param getAppealRequestorZip
     * @param getAppealRequestorPhone
     * @param getInitialRequestDate
     * @param getInitialDenialDate
     * @param getReconsiderationRequestDate
     * @param getReconsoderationDeterminationDate
     * @throws InterruptedException
     */
    public void enterCaseData(String getFromDateOfService, String getToDateOfService, String getEnrolleeFirstName, String getEnrolleeLastName, String getEnrolleeAddress1, String getEnrolleeCity
            , String getEnrolleeZip, String getEnrolleePhone, String getMbi, String getHic, String getAppealRequestorFirstName, String getAppealRequestorLastName, String getAppealRequestorAddress1
            , String getAppealRequestorCity, String getAppealRequestorZip, String getAppealRequestorPhone, String getInitialRequestDate, String getInitialDenialDate, String getReconsiderationRequestDate
            , String getReconsoderationDeterminationDate) throws InterruptedException {

        waitBlockUiDisappears();
        pm.getQicPortalTabNavigationHelper().clickOnPartCTab();
        waitBlockUiDisappears();
        waitWhenOverlayInvisible();
       selectRandomCasePriority();
       
        //selectCasePriority(1);
        enterFromDateOfService(getFromDateOfService);
        enterToDateOfService(getToDateOfService);
        waitBlockUiDisappears();
        waitWhenOverlayInvisible();
        enterAutoForward_yes();
       // selectRandomIssueCategory();
        selectIssueCategory(2);
        enterOtherIssueCategoryValue();
        enterQicAppealNumber();
       selectRandomPlanDismissalReason();
       // selectPlanDismissalReason(0);
        enterOtherPlanDismissalReasonValue();
        selectRandomAnswerMedicalNecessityReview();
        enterEnrolleeFirstName(getEnrolleeFirstName);
        enterEnrolleeLastName(getEnrolleeLastName);
        enterEnrolleeAddr(getEnrolleeAddress1);
        enterEnrolleeCity(getEnrolleeCity);
        selectRandomEnroleeState();
        enterEnrolleeZip(getEnrolleeZip);
        enterEnrolleePhone(getEnrolleePhone);
        enterEnrolleeMbi(getMbi);
        enterEnrolleeHic(getHic);
        selectNoEnrolleeDeceased();
        selectNoEnrolleeInHospice();
        selectNoAnotherLanguageFdn();
        selectNoAlernateCommunicationFormat();
        //selectRandomAppealRequestor();
      selectAppealRequestor(2);
        selectNoAorPowerAttorneyIsInFile();
        selectYesEstateDocumentationInFile();
        selectNoWaiverLiabilityInFile();
        enterAppealRequestorFirstName(getAppealRequestorFirstName);
        enterAppealRequestorLastName(getAppealRequestorLastName);
        enterAppealRequestorCompanyName();
        enterAppealRequestorAddr1(getAppealRequestorAddress1);
        enterAppealRequestorCity(getAppealRequestorCity);
        selectRandomAppealRequestorState();
        enterAppealRequestorZip(getAppealRequestorZip);
        enterAppealRequestorPhone(getAppealRequestorPhone);
        selectRandomCmsContract();
        selectRandomPlanType();
        enterInitialRequestDate(getInitialRequestDate);
        enterInitialDenialDate(getInitialDenialDate);
        selectWasExpeditedRequestMadeOrganizationDetermination();
        selectWasExpeditedRequestGrantedOrganizationDetermination();
        selectDidPlanTakeExtensionOrganizationDetermination();
        enterReconsiderationRequestDate(getReconsiderationRequestDate);
        enterReconsiderationDeterminationDate(getReconsoderationDeterminationDate);
        selectWasExpeditedRequestMadeReconsideration();
        selectWasExpeditedRequestGrantedReconsideration();
        selectDidPlanTakeExtensionReconsideration();
        selectRandomItemsServicesInDispute();
        //selectItemsServicesInDisputeByText("Neck/Back");
        enterOtherItemServiceValue();
        uploadCaseFileDoc();
        uploadPlanContractDoc();
    }


    public void enterCaseDataAndSubmit1(int numberOfCases) throws InterruptedException, IOException {
        pm.getQicPortalDataGenerator().generatePartCClaimData(numberOfCases);

        PartCCaseData claim = new PartCCaseData();
        List<Object[]> listClaims = new ArrayList<Object[]>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/part_c_claims.csv")));
        String line = reader.readLine();
        for (int i = 0; i < numberOfCases; i++) {
            String[] split = line.split(";");
            listClaims.add(new Object[]{claim
                    .withEnrolleeFirstName(split[3]).withEnrolleeLastName(split[4]).withEnrolleeAddress1(split[5]).withEnrolleeCity(split[6]).withEnrolleeZip(split[8]).withEnrolleePhone(split[9])
                    .withMbi(split[10]).withHic(split[11]).withAppealRequestorFirstName((split[12])).withAppealRequestorLastName((split[13])).withAppealRequestorAddress1((split[14]))
                    .withAppealRequestorCity((split[15])).withAppealRequestorZip((split[17])).withAppealRequestorPhone((split[18])).withInitialRequestDate((split[21])).withInitialDenialDate((split[22]))
                    .withReconsiderationRequestDate((split[23])).withReconsoderationDeterminationDate((split[24])).withFromDateOfService((split[26])).withToDateOfService((split[27]))});

            enterCaseData(claim.getFromDateOfService(), claim.getToDateOfService(), claim.getEnrolleeFirstName(), claim.getEnrolleeLastName(), claim.getEnrolleeAddress1(), claim.getEnrolleeCity()
                    , claim.getEnrolleeZip(), claim.getEnrolleePhone(), claim.getMbi(), claim.getHic(), claim.getAppealRequestorFirstName(), claim.getAppealRequestorLastName()
                    , claim.getAppealRequestorAddress1(), claim.getAppealRequestorCity(), claim.getAppealRequestorZip(), claim.getAppealRequestorPhone(), claim.getInitialRequestDate()
                    , claim.getInitialDenialDate(), claim.getReconsiderationRequestDate(), claim.getReconsoderationDeterminationDate());
            submitPartCCase();
            System.out.println("The submitted case number is: " + anyTextFromUiByLocator(CASE_NUMBER_LOCATOR));
        }
    }


    /**
     * This method downloads a case PDF and saves it to resources
     */
    public void downLoadPdfForTheCase()  {
        downloadFromUrl(SAVE_AS_PDF_BUTTON_LOCATOR, pm.getProjectProperties().getPlanAdminLogin(), anyTextFromUiByLocator(CASE_NUMBER_LOCATOR));
    }







}
