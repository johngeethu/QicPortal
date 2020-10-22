package com.maximus.qicportaltestautomation.qic_project_part_d_drug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;
import com.maximus.qicportaltestautomation.qic_object_model.PartDCaseData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FillOutPartD extends Utils{
	
	 private static final By CONTRACT_NUMBER = By.xpath("//select[@id='hpiContractNumber']");
	 private static final By LIST_CONTRACT_NUMBER_LOCATOR = By.xpath("(//select[@id='hpiContractNumber']/option[not(@class)])");
	    
	 private static final By PLAN_TYPE = By.xpath("(//select[@id='hpiPlanType'])");
	 private static final By LIST_PLAN_ID_LOCATOR = By.xpath("(//select[@id='hpiPlanType']/option[not(@class)])");
	    
	 private static final By PLAN_ID = By.xpath("(//input[@name='hpiPlanID'])");
	 private static final By PROVIDER_OTHER_TYPE = By.id("hpiOtherProviderPlanType");
	
	 private static final By FORMULARY_ID_NAME = By.xpath("(//input[@name='hpiFormularyIdName'])");
	 private static final By QIC_APPEAL_NUMBER_LOCATOR = By.id("qicAppealNumber");

	 private static final By APPEALPRIORIY_EXPEDIATED = By.id("appealPriority_yes");
	 private static final By APPEALPRIORIY_STANDARD = By.id("appealPriority_no");
	 private static final By APPEALTYPE_PROSPECTIVE =By.id("appealTypeProspective");
	 private static final By APPLICABLE_COVERAGE_YEAR = By.xpath("//*[@id='app_years_id']/div/div/input");
	 private static final By COST_SHARING_ISSUE_YES	= By.id("cost_sharing_issue_yes");
	 private static final By COST_SHARING_ISSUE_NO	= By.id("cost_sharing_issue_no");
	 private static final By APPEALAUTOFORWARD_YES	= By.id("appealAutoForward_yes");
	 private static final By APPEALAUTOFORWARD_NO	= By.id("appealAutoForward_no");
	 private static final By REDETERMINATION	= By.id("selectMissedProcessingLevel_P");
	 
	 private static final By APPEAL_REQUESTOR_LOCATOR = By.xpath("(//select[@name='requestorType'])");
	 private static final By LIST_APPEAL_REQUESTORS_LOCATOR = By.xpath("//select[@id='requestorType']/option[not(@style)]");
	 
	 private static final By CHK_ESTATE_DOC_FILE_YES	= By.id("estateDoc_yes");
	 private static final By CHK_ESTATE_DOC_FILE_NO	= By.id("estateDoc_no");
	
	 private static final By CHK_POWER_ATT_YES	= By.id("powerOfAtt_yes");
	 private static final By CHK_POWER_ATT_NO	= By.id("powerOfAtt_no");
	 private static final By ENROLLEE_MBI_LOCATOR	= By.id("ei_medicareNumber");
	 private static final By ENROLLEE_HIC_LOCATOR	= By.id("ei_hic");
	 private static final By ENROLLEE_FIRST_NAME_LOCATOR = By.id("enrolleeFirstName");
	 private static final By ENROLLEE_LAST_NAME_LOCATOR = By.id("enrolleeLastName");
	 private static final By ENROLLEE_ADDR1_LOCATOR = By.id("enrolleeAddress1");
	 private static final By ENROLLEE_ADDR2_LOCATOR = By.id("enrolleeAddress2");
	 private static final By ENROLLEE_CITY_LOCATOR = By.id("enrolleeCity");
	 private static final By ENROLLEE_STATE_LOCATOR = By.xpath("//select[@id='enrolleeState']");
	 private static final By ENROLLEE_LIST_OF_STATES_LOCATOR= By.xpath("//select[@id='enrolleeState']/optgroup/option[@ng-repeat='item in stateTerritoryGrp']");
	 private static final By ENROLLEE_ZIP_LOCATOR = By.id("enrolleeZip");
	 private static final By ENROLLEE_PHONE_LOCATOR = By.id("enrolleePhone");
	 private static final By ENROLLEE_LANG_YES = By.id("enrolleeRecndrtnComtnPrefsOthEng_yes");
	 private static final By ENROLLEE_LANG_NO = By.id("enrolleeRecndrtnComtnPrefsOthEng_no");
	 private static final By ENROLLEE_COMM_YES = By.id("enrolleeRecndrtnComtnPrefsAltFormatRequired_yes");
	 private static final By ENROLLEE_COMM_NO = By.id("enrolleeRecndrtnComtnPrefsAltFormatRequired_no");
	 
	 private static final By REPRESENTATIVE_FIRST_NAME = By.id("representativeFirstName");
	 private static final By REPRESENTATIVE_LAST_NAME = By.id("representativeLastName");
	 private static final By REPRESENTATIVE_ADDRESS1 = By.id("representativeAddress1");
	 private static final By REPRESENTATIVE_ADDRESS2 = By.id("representativeAddress2");
	 private static final By REPRESENTATIVE_CITY = By.id("representativeCity");
	 private static final By REPRESENTATIVE_ZIP = By.id("representativeZip");
	 private static final By REPRESENTATIVE_STATE = By.xpath("//select[@id='representativeState']");
	 private static final By REP_LIST_OF_STATES_LOCATOR= By.xpath("//select[@id='representativeState']/optgroup/option[@ng-repeat='item in stateTerritoryGrp']");
	 private static final By REPRESENTATIVE_EMAIL = By.id("representativeEmail");
	 private static final By REPRESENTATIVE_PHONE = By.id("representativePhone");
	 private static final By REPRESENTATIVE_DECISIONLETTER_FAX = By.id("representativeDecisionLetterFax");
	 private static final By REPRESENTATIVE_HLTHPLN_DCLRN = By.id("representativeHlthPlnDclrn");
	 
	 //Plan0
	 private static final By COVERAGE_DET_DATE_Plan0 = By.id("plZeroCvrgDtrmtnDt");
	 private static final By COVERAGE_UNTIMELY_YES_Plan0 = By.id("covDtrmntnUntimely_yes");
	 private static final By COVERAGE_UNTIMELY_NO_Plan0 = By.id("covDtrmntnUntimely_no");
	 private static final By DCSN_MADE_YES_Plan0 = By.id("plZeroDcsnMadeFlag_yes");
	 private static final By DCSN_MADE_NO_Plan0 = By.id("plZeroDcsnMadeFlag_no");
	 private static final By APPELLANT_PLN_EXPDT_YES_Plan0 = By.id("plZeroAppellantPlnExpdt_yes");
	 private static final By APPELLANT_PLN_EXPDT_NO_Plan0 = By.id("plZeroAppellantPlnExpdt_no");
	 private static final By APPELLANT_PLN_EXPDT_REVIEW_YES_Plan0 = By.id("plZeroCvrgDtrmntnExpdtRvw_yes");
	 private static final By APPELLANT_PLN_EXPDT_REVIEW_NO_Plan0 = By.id("plZeroCvrgDtrmntnExpdtRvw_no");
	 
	 
	//Plan1
	 private static final By COVERAGE_DET_DATE_Plan1 = By.id("redeterminationDate");
	 private static final By COVERAGE_UNTIMELY_YES_Plan1 = By.id("redeterminationDecisionMadeFlag_yes");
	 private static final By DCSN_MADE_YES_Plan1 = By.id("covReDtrmntnUntimely_yes");
	 private static final By DCSN_MADE_No_Plan1 = By.id("covReDtrmntnUntimely_no");
	 private static final By  DCSN_MADE_DATE_Plan1= By.id("redeterminationDecisionDate");
	 private static final By  APPELLANT_PLN_EXPDT_YES_Plan1= By.id("redeterminationAppellantAskExpedite_yes");
	 private static final By  APPELLANT_PLN_EXPDT_REVIEW_YES_Plan1= By.id("redeterminationPlanGrantExpediteReview_yes");
	 
	 
	 private static final By PRESCRIBER_FIRST_NAME = By.id("prescriberFirstName");
	 private static final By PRESCRIBER_LAST_NAME = By.id("prescriberLastName");
	 private static final By PRESCRIBER_ADDRESS1 = By.id("prescriberAddress1");
	 private static final By PRESCRIBER_ADDRESS2 = By.id("prescriberAddress2");
	 private static final By PRESCRIBER_CITY = By.id("prescriberCity");
	 
	 
	 private static final By PRESCRIBER_STATE = By.xpath("//select[@id='prescriberState']");
	 private static final By PRESCRIBER_LIST_OF_STATES_LOCATOR= By.xpath("//select[@id='prescriberState']/optgroup/option[@ng-repeat='item in stateTerritoryGrp']");
	 

	 private static final By PRESCRIBER_ZIPCODE = By.id("prescriberZipCode");
	 private static final By PRESCRIBER_PHONE = By.id("prescriberPhone");
	 private static final By PRESCRIBER_FAX = By.id("prescriberFax");
	 private static final By DRUG_NDC_CODE = By.id("drugBenefitDisputeNationalDrugCode");
	 private static final By DRUG_STRENGTH = By.id("drugBenefitDisputeStrength");
	 private static final By DRUG_DISPUTE_DRUGNAME = By.id("drugBenefitDisputeDrugName");
	 private static final By DRUG_DISPUTE_DOSAGE = By.id("drugBenefitDisputeDosage");
	 
	 private static final By DRUG_DISPUTE_DRUGTYPE = By.xpath("(//select[@name='drugBenefitDisputeDrugType'])");
	 private static final By LIST_DRUG_DISPUTE_DRUGTYPE = By.xpath("//select[@id='drugBenefitDisputeDrugType']/option[not(@class)]");
	 
	 private static final By DRUG_DISPUTE_OFFFORMULARY_YES = By.id("drugBenefitDisputeOffFormulary_yes");
	 private static final By DRUG_DISPUTE_OFFFORMULARY_NO = By.id("drugBenefitDisputeOffFormulary_no");
	 private static final By DRUG_DISPUTE_DENIAL_RATIONALE = By.id("drugBenefitDisputeDenialRationale");
	 private static final By LIST_DRUG_DISPUTE_DENIAL_RATIONALE = By.xpath("//select[@id='drugBenefitDisputeDenialRationale']/option[not(@class)]");
	 
	 
	 private static final By DRUG_DISPUTE_COVERAGETYPEREQUESTED_YES = By.id("drugBenefitDisputeCoverageTypeRequested_yes");
	 private static final By DRUG_DISPUTE_COVERAGETYPEREQUESTED_NO = By.id("drugBenefitDisputeCoverageTypeRequested_no");
	 
	 private static final By DRUG_DISPUTE_NETWORK_YES = By.id("drugBenefitDisputeInNetwork_yes");
	 private static final By DRUG_DISPUTE_NETWORK_NO = By.id("drugBenefitDisputeInNetwork_no");
	 private static final By DATE_OF_PURCHASE = By.id("dateOfPurchase");
	 private static final By AMOUNT_PAID = By.id("amountPaid");
	 private static final By DRUG_TIER = By.id("drugTier");
	 private static final By DRUG_DETAIL_ADD_BTN=By.id("addNewPurchaseDrugDetailsButton");
	 private static final By LIST_DRUG_TIER = By.xpath("//select[@id='drugTier']/option[not(@class)]");
	 
	   
	 private static final By DRUG_DISPUTE_PENDINGAPPEAL_YES = By.id("drugBenefitDisputeDrugPendingAppealPurchased_yes");
	 private static final By DRUG_DISPUTE_PENDINGAPPEAL_NO = By.id("drugBenefitDisputeDrugPendingAppealPurchased_no");
	 private static final By DRUGAPPROVEDASREQUESTED_YES = By.id("drugApprovedAsRequested_yes");
	 private static final By DRUGAPPROVEDASREQUESTED_NO = By.id("drugApprovedAsRequested_no");
	 private static final By ADD_PRESCRIBER_DRUG_BT = By.id("addPrescriberDrugBt");
	 private static final By ADD_MULTIPLE_PRESCRIBER_DRUG_BT = By.id("addNewPrescriberSectionBtn");
	 private static final By PROCEDURALDOCUMENTATION_1 = By.id("proceduralDocumentation_1");
	 private static final By PROCEDURALDOCUMENTATION_2 = By.id("proceduralDocumentation_2");
	 private static final By PROCEDURALDOCUMENTATION_3 = By.id("proceduralDocumentation_3");
	 private static final By PROCEDURALDOCUMENTATION_4 = By.id("proceduralDocumentation_4");
	 private static final By PROCEDURALDOCUMENTATION_5 = By.id("proceduralDocumentation_5");
	 private static final By PROCEDURALDOCUMENTATION_6 = By.id("proceduralDocumentation_6");
	 private static final By PROCEDURALDOCUMENTATION_7 = By.id("proceduralDocumentation_7");
	 private static final By EVIDENTIARYDOCUMENTATION_1 = By.id("evidentiaryDocumentation_1");
	 private static final By EVIDENTIARYDOCUMENTATION_2 = By.id("evidentiaryDocumentation_2");
	 private static final By EVIDENTIARYDOCUMENTATION_3 = By.id("evidentiaryDocumentation_3");
	 private static final By EVIDENTIARYDOCUMENTATION_4 = By.id("evidentiaryDocumentation_4");
	 private static final By EVIDENTIARYDOCUMENTATION_5 = By.id("evidentiaryDocumentation_5");
	 private static final By EVIDENTIARYDOCUMENTATION_6 = By.id("evidentiaryDocumentation_6");
	 private static final By EVIDENTIARYDOCUMENTATION_7 = By.id("evidentiaryDocumentation_7");
	 private static final By EVIDENTIARYDOCUMENTATION_8 = By.id("evidentiaryDocumentation_8");
	 private static final By OVERVIEW_ISSUES = By.id("overviewIssues");
	 private static final By TIMELINE_FACTS = By.id("timelineFacts");
	 private static final By CASE_FILE_DOC = By.xpath("(//*[@id='partd_caseFile_uploader']/div/input)");
	 private static final By EVIDENCE_COV_DOC = By.xpath("(//*[@id='partd_evdncOfCvrg_uploader']/div/input)");
	private static final By DRUG_FORMULARY_DOC = By.xpath("(//*[@id='partD_DocumentationFiles']/div/input)");
	 private static final By SUBMIT_PART_D_LOCATOR = By.id("partDSubmitButton");
	 private static final By SAVE_AS_PDF_BUTTON_LOCATOR = By.xpath("//a[@id='partDprintPdfBt']");
	 private static final By CASE_NUMBER_LOCATOR = By.xpath("//*[contains(text(), 'Please note ')]/preceding-sibling::p[1]/strong[2]");
	 private static final By CASE_FILE_UPLOAD_SUCESS = By.xpath("//*[@id='caseFileUploadTblPartD']/tbody/tr/td[3]/strong[1]");
	 private static final By EVIDE_UPLOAD_SUCESS = By.xpath("//*[@id='evidenceCoverageTblPartD']/tbody/tr/td[3]/strong[1]");
	 private static final By FORMULARY_UPLOAD_SUCESS = By.xpath("//*[@id='drugFormularyTblPartD']/tbody/tr/td[3]/strong[1]");
	 private static final By TXT_DATE_OF_BIRTH= By.id("enrolleeDateOfBirth");  
	 private static final By CHK_ENROLLEE_YES= By.id("enrolleRisk_yes");
	 private static final By CHK_ENROLLEE_NO= By.id("enrolleRisk_no");
	 private static final By CHK_ENROLLEE_LIMIT_YES= By.id("enrolleLimitation_yes");
	 private static final By CHK_ENROLLEE_LIMIT_NO= By.id("enrolleLimitation_no");
	 
	 
	private QicPortalProjectManager pm;
	
	public FillOutPartD (WebDriver wd, QicPortalProjectManager pm) {
        super(wd);
        this.pm = pm;
        
    }
	
	 public void selectContractNumber(int numberInDropdown)  {
	        click(CONTRACT_NUMBER);
	        selectOptionFromDropDownByIndex(LIST_CONTRACT_NUMBER_LOCATOR, numberInDropdown);
	    }
	 
	 public void enterPlanType(String planType)  {
		 clearAndType(PLAN_TYPE, planType);
	    }
	 public void enterEnrolleeDateOfBirth(String dateOfbirth)  {
		 clearAndType(TXT_DATE_OF_BIRTH, dateOfbirth);
	    }
	 public void selectPlanType(int numberInDropdown)  {
	        click(PLAN_TYPE);
	        selectOptionFromDropDownByIndex(LIST_PLAN_ID_LOCATOR, numberInDropdown);
	    }
	 
	 public void enterQicAppealNumber()   {
	        typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR, "1-" + randomStringDigitsOnly(11));
	    }
	 public void enterProviderOtherType()   {
	        typeIfPresent(PROVIDER_OTHER_TYPE,randomStringLettersDigits(12));
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
	    
	    public void enterRepFirstName(String repFirstName) {
	        typeIfPresent(REPRESENTATIVE_FIRST_NAME, repFirstName);
	    }

	    public void enterRepLastName(String repLastName) {
	    	typeIfPresent(REPRESENTATIVE_LAST_NAME, repLastName);
	    }

	    public void enterRepAddr(String repAddr1) {
	    	typeIfPresent(REPRESENTATIVE_ADDRESS1, repAddr1);
	    }
	    public void enterRepAddr2(String repAddr2) {
	    	typeIfPresent(REPRESENTATIVE_ADDRESS2, repAddr2);
	    }

	    public void enterRepCity(String repCity) {
	    	typeIfPresent(REPRESENTATIVE_CITY, repCity);
	    }
	    public void enterRepZip(String repZip) {
	    	typeIfPresent(REPRESENTATIVE_ZIP, repZip);
	    }
	    public void enterRepEmail(String repEmail) {
	    	typeIfPresent(REPRESENTATIVE_EMAIL, repEmail);
	    }
	    public void enterRepPhone(String repPhone) {
	    	typeIfPresent(REPRESENTATIVE_PHONE, repPhone);
	    }
	    public void enterRepFax(String repFax) {
	    	typeIfPresent(REPRESENTATIVE_DECISIONLETTER_FAX, repFax);
	    }
	    public void clickRepChk() {
	    	clickIfPresent(REPRESENTATIVE_HLTHPLN_DCLRN);
	    	}

	    public void selectRandomRepState() throws InterruptedException {
	       if (isElementPresent(REPRESENTATIVE_STATE))
	       {
	    	clickIfPresent(REPRESENTATIVE_STATE);
	    	selectRandomOption(REP_LIST_OF_STATES_LOCATOR);
	       }
	    }

	    public void clickRedetermination()
	    {
	    	clickIfPresent(REDETERMINATION);
	    }
	    public void clickEstateDocYes()
	    {
	    	clickIfPresent(CHK_ESTATE_DOC_FILE_YES);
	    }
	    public void clickEstateDocNo()
	    {
	    	clickIfPresent(CHK_ESTATE_DOC_FILE_NO);
	    }
	    public void clickEnrolleeYes()
	    {
	    	clickIfPresent(CHK_ENROLLEE_YES);
	    }
	    public void clickEnrolleeNo()
	    {
	    	clickIfPresent(CHK_ENROLLEE_NO);
	    }
	    public void clickPowerAttYes()
	    {
	    	clickIfPresent(CHK_POWER_ATT_YES);
	    }
	    public void clickPowerAttNo()
	    {
	    	clickIfPresent(CHK_POWER_ATT_NO);
	    }
	    
	    public void clickEnrolleeLimitYes()
	    {
	    	clickIfPresent(CHK_ENROLLEE_LIMIT_YES);
	    }
	    public void clickEnrolleeLimitNo()
	    {
	    	clickIfPresent(CHK_ENROLLEE_LIMIT_NO);
	    }
	   
	    public void selectRandomEnroleeState() throws InterruptedException {
	        click(ENROLLEE_STATE_LOCATOR);
	        selectRandomOption(ENROLLEE_LIST_OF_STATES_LOCATOR);
	    }
	    public void selectRandomPrescriberState() throws InterruptedException {
	        click(PRESCRIBER_STATE);
	        selectRandomOption(PRESCRIBER_LIST_OF_STATES_LOCATOR);
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
	    
	    public void enterPlanId(String plan_id) {
	        clearAndType(PLAN_ID, plan_id);
	    }
	    public void enterFormularyId(String formulary_id) {
	        clearAndType(FORMULARY_ID_NAME, formulary_id);
	    }
	    public void selectAppealPriorityExpediated() {
	    	 clickIfPresent(APPEALPRIORIY_EXPEDIATED);
	    }
	    public void selectAppealPriorityStandard() {
	    	 clickIfPresent(APPEALPRIORIY_STANDARD);
	    }
	    public void selectAppealTypeProspective() {
	    	 clickIfPresent(APPEALTYPE_PROSPECTIVE);
	    }
	    
	    public void enterDrugDisputeetworkYes() {
	    	clickIfPresent(DRUG_DISPUTE_NETWORK_YES);
	    }
		 public void enterDateOfPurchase(String date) {
		    	clearAndType(DATE_OF_PURCHASE, date);
		    }
		 public void enterAmountPaid(String amount) {
		    	clearAndType(AMOUNT_PAID, amount);
		    }
		 public void enterDrugTier() {
			 clickIfPresent(DRUG_TIER);
			 selectOptionFromDropDownByIndex(LIST_DRUG_TIER, 1);
		    }
		 public void enterDrugDetailBtn() {
			 clickIfPresent(DRUG_DETAIL_ADD_BTN);
		    }
		 
	    public void enterApplicableCoverageYear(String year) {
	    	clearAndType(APPLICABLE_COVERAGE_YEAR, year);
	    }
	    public void selectCostSharingIssueYes() {
	    	clickIfPresent(COST_SHARING_ISSUE_YES);
	    }
	    public void selectCostSharingIssueNo() {
	    	clickIfPresent(COST_SHARING_ISSUE_NO);
	    }
	    public void selectAppealautoforwardYes() {
	    	clickIfPresent(APPEALAUTOFORWARD_YES);
	    }
	    public void selectAppealautoforwardNo() {
	    	clickIfPresent(APPEALAUTOFORWARD_NO);
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
	    
	    public void selectEnrolleeLangYes() {
	    	clickIfPresent(ENROLLEE_LANG_YES);
	    }
	    
	    public void selectEnrolleeLangNo() {
	    	clickIfPresent(ENROLLEE_LANG_NO);
	    }
	    public void selectEnrolleeCommYes() {
	    	clickIfPresent(ENROLLEE_COMM_YES);
	    }
	    public void selectEnrolleeCommNo() {
	    	clickIfPresent(ENROLLEE_COMM_NO);
	    }
	    
	    public void enterCoverageDatePlan0(String coverageDate) {
	        clearAndType(COVERAGE_DET_DATE_Plan0, coverageDate);
	    }
	    
	    public void selectCoverageUntimelyYesPlan0() {
	    	clickIfPresent(COVERAGE_UNTIMELY_YES_Plan0);
	    }
	    
	    public void selectCoverageUntimelyNoPlan0() {
	    	clickIfPresent(COVERAGE_UNTIMELY_NO_Plan0);
	    }
	    
	    public void selectDcsnMadeYesPlan0() {
	    	clickIfPresent(DCSN_MADE_YES_Plan0);
	    }
	    
	    public void selectDcsnMadeNoPlan0() {
	    	clickIfPresent(DCSN_MADE_NO_Plan0);
	    }
	    
	    public void selectAppellantPlnExpdtYesPlan0() {
	    	clickIfPresent(APPELLANT_PLN_EXPDT_YES_Plan0);
	    }
	    
	    public void selectAppellantPlnExpdtNoPlan0() {
	    	clickIfPresent(APPELLANT_PLN_EXPDT_NO_Plan0);
	    }
	    
	    public void selectAppellantPlnExpdtReviewYesPlan0() {
	    	clickIfPresent(APPELLANT_PLN_EXPDT_REVIEW_YES_Plan0);
	    }
	    
	    public void selectAppellantPlnExpdtReviewNoPlan0() {
	    	clickIfPresent(APPELLANT_PLN_EXPDT_REVIEW_NO_Plan0);
	    }
	    
	    //Plan1
	    public void enterCoverageDatePlan1(String coverageDate) {
	        typeIfPresent(COVERAGE_DET_DATE_Plan1, coverageDate);
	    }
	    
	    public void enterDescisonMadeDatePlan1(String coverageDate1) {
	    	typeIfPresent(DCSN_MADE_DATE_Plan1, coverageDate1);
	    }
	    public void selectCoverageUntimelyYesPlan1() {
	    	clickIfPresent(COVERAGE_UNTIMELY_YES_Plan1);
	    }
	 
	    
	    public void selectDcsnMadeYesPlan1() {
	    	clickIfPresent(DCSN_MADE_YES_Plan1);
	    }
	  
	    
	    public void selectAppellantPlnExpdtYesPlan1() {
	    	clickIfPresent(APPELLANT_PLN_EXPDT_YES_Plan1);
	    }
	   
	 	    
	    public void selectAppellantPlnExpdtReviewYesPlan1() {
	    	clickIfPresent(APPELLANT_PLN_EXPDT_REVIEW_YES_Plan1);
	    }
	 
	    
	    public void enterPrescriberFirstName(String prescriberFirstName) {
	        clearAndType(PRESCRIBER_FIRST_NAME, prescriberFirstName);
	    }
	    
	    public void enterPrescriberLarstName(String prescriberLastName) {
	        clearAndType(PRESCRIBER_LAST_NAME, prescriberLastName);
	    }
	    
	    public void enterPrescriberAddress1(String prescriberAddress) {
	        clearAndType(PRESCRIBER_ADDRESS1, prescriberAddress);
	    }
	    
	    public void enterPrescriberAddress2(String prescriberAddress2) {
	        clearAndType(PRESCRIBER_ADDRESS2, prescriberAddress2);
	    }
	    
	    public void enterPrescriberCity(String prescriberCity) {
	        clearAndType(PRESCRIBER_CITY, prescriberCity);
	    }
	    
	   
	    
	    public void enterPrescriberZipcode(String prescriberZip) {
	        clearAndType(PRESCRIBER_ZIPCODE, prescriberZip);
	    }

	    public void enterPrescriberPhone(String prescriberPhone) {
	        clearAndType(PRESCRIBER_PHONE, prescriberPhone);
	    }
	    
	    public void enterPrescriberFax(String prescriberFax) {
	        clearAndType(PRESCRIBER_FAX, prescriberFax);
	    }
	    
	    public void enterDrugNdcCode(String drugCode) {
	        clearAndType(DRUG_NDC_CODE, drugCode);
	    }
	    
	    public void enterDrugName(String drugName) {
	        clearAndType(DRUG_DISPUTE_DRUGNAME, drugName);
	    }
	    
	    public void enterDrugDosage(String drugDosage) {
	        clearAndType(DRUG_DISPUTE_DOSAGE, drugDosage);
	    }
	    public void enterDrugStrength(String drugStrength) {
	        clearAndType(DRUG_STRENGTH, drugStrength);
	    }
	    
	    public void selectDrugDisputeDrugtype() throws InterruptedException {
	        click(DRUG_DISPUTE_DRUGTYPE);
	        selectRandomOption(LIST_DRUG_DISPUTE_DRUGTYPE);
	    }
	    
	   
	    
    
	    public void selectDrugDisputeOffformularyNo() {
	    	clickIfPresent(DRUG_DISPUTE_OFFFORMULARY_NO);
	    }
	  
	    
	    public void selectDrugDisputeDenialRationale(int drugDenialRationale) throws InterruptedException {
	        click(DRUG_DISPUTE_DENIAL_RATIONALE);
	        selectOptionFromDropDownByIndex(LIST_DRUG_DISPUTE_DENIAL_RATIONALE, drugDenialRationale);
	    }
	    
	    public void selectDrugDisputeCoveragetyperequestedYes() {
	    	clickIfPresent(DRUG_DISPUTE_COVERAGETYPEREQUESTED_YES);
	    }
	  
	    
	    
	    public void selectDrugDisputeCoverageTypeRequested_no() {
	    	clickIfPresent(DRUG_DISPUTE_COVERAGETYPEREQUESTED_NO);
	    }
	    public void selectDrugDisputePendingAppeal_no() {
	    	clickIfPresent(DRUG_DISPUTE_PENDINGAPPEAL_NO);
	    }
	    public void selectDrugapprovedasrequested_no() {
	    	clickIfPresent(DRUGAPPROVEDASREQUESTED_NO);
	    }
	    
	    public void selectAddPrescriberDrugBt() {
	    	clickIfPresent(ADD_PRESCRIBER_DRUG_BT);
	    }
	    public void AddMultiplePrescriberDrugBt() {
	    	clickIfPresent(ADD_MULTIPLE_PRESCRIBER_DRUG_BT);
	    }
	    
	    public void selectProceduralDocumentation_2() {
	    	clickIfPresent(PROCEDURALDOCUMENTATION_2);
	    }
	    public void selectProceduralDocumentation_7() {
	    	clickIfPresent(PROCEDURALDOCUMENTATION_7);
	    }
	    
	    public void selectevidentiarydocumentation_1() {
	    	clickIfPresent(EVIDENTIARYDOCUMENTATION_1);
	    }
	    
	    public void selectevidentiarydocumentation_8() {
	    	clickIfPresent(EVIDENTIARYDOCUMENTATION_8);
	    }
	    
	    public void enterOverviewIssues(String overviewIssues) {
	        clearAndType(OVERVIEW_ISSUES, overviewIssues);
	    }
	    
	    public void enterTimelineFacts(String timelineFacts) {
	        clearAndType(TIMELINE_FACTS, timelineFacts);
	    }
	    
	    
	    
	    public void uploadCaseFileDoc() throws InterruptedException
	    {
	    	 File document = new File("src/test/resources/test.pdf");
	    	 //js.executeScript("arguments[0].click();", CASE_FILE_DOC);
	    	 clickIfPresent(CASE_FILE_DOC);
			    Thread.sleep(1000);
			    uploadFile(document);
				//Thread.sleep(1000);
			    waitUntilVisibleLong(CASE_FILE_UPLOAD_SUCESS);
	    }
	    
	    public void uploadEvidenceCovDoc() throws InterruptedException
	    {
	    	System.out.println("uploadEvidenceCovDoc");
	    	scrollToElementAndClick(EVIDENCE_COV_DOC,wd);
	    	 File document = new File("src/test/resources/performanceReport-300.pdf");
	    	 //js.executeScript("arguments[0].click();", CASE_FILE_DOC);
	    	// clickIfPresent(EVIDENCE_COV_DOC);
			    Thread.sleep(1000);
			    uploadFile(document);
			    waitUntilVisibleLong(EVIDE_UPLOAD_SUCESS);
				
	    }
	    public void uploadDrugFormularyDoc() throws InterruptedException
	    {
	    	
	    	 System.out.println("uploadDrugFormularyDoc");
	    	 File document = new File("src/test/resources/Q19.pdf");
	    	 //js.executeScript("arguments[0].click();", CASE_FILE_DOC);
	    	 scrollToElementAndClick(DRUG_FORMULARY_DOC,wd);
			    Thread.sleep(1000);
			    uploadFile(document);
			    waitUntilVisibleLong(FORMULARY_UPLOAD_SUCESS);
	    }
	    /**
	     * This method clicks on Submit button on Part D page
	     */
	    public void submitPartDCase() {
	       // clickIfPresent(SUBMIT_PART_D_LOCATOR);
	    	 scrollToElementAndClick(SUBMIT_PART_D_LOCATOR,wd);
	        waitBlockUiDisappears();
	    }
	    
	    
	    
	    /**
	     * This method clicks on Part D tab and fills out all required fields using provided data
	     *
	     * @param getFromDateOfService
	     * @param getToDateOfService
	     * @param getFormularyId
	     * @param getPlanId
	     * @param getyear
	     * @param getAppealReqindex
	     * @param getMedicare
	     * @param getEnrolleeFirstName,
	     * @param getEnrolleeLastName,
	     * @param getEnrolleeAddress1,
	     * @param getEnrolleeCity,
	     * @param getEnrolleeZip,
	     * @param getEnrolleePhone,
	     * @param getCoverageDate
	     * @param getPrescriberFirstName,
	     * @param getPrescriberLastName
	     * @param getprescriberAddress,
	     * @param getPrescriberCity,
	     * @param getPrescriberPhone,
	     * @param getPrescriberFax,
	     * @param getdrugCode,
	     * @param getdrugName,
	     * @param getdrugStrength,
	     * @param getdrugDosage,
	     * @throws InterruptedException
	     */
	    public void enterCaseData(int numberOfPrescriber, int numberOfDrugs,int getContractnumberindex,int getPlanTypeindex,String getFormularyId,
	    		String getyear,int getAppealReqindex,String getMedicare,String getEnrolleeFirstName,String getEnrolleeLastName, String getEnrolleeAddress1,String getEnrolleeCity,
	    		String getEnrolleeZip,String getEnrolleePhone,String getCoverageDate,String getoverview,String gettimelineFacts,String getPlanId,boolean autoforward,
	    		String getPrescriberFirstName,String getPrescriberLastName, String getprescriberAddress,String getPrescriberCity,String getPrescriberPhone,
	    		String getPrescriberFax,String getdrugCode, String getdrugName, String getdrugStrength,String getdrugDosage,
	    		int drugretionaleindex,String repFirstName,String repLastName,String repAddress1,String repCity,String repPhone, String repEmail, String repFax, String repZip) throws InterruptedException {
	    	
	    	 waitBlockUiDisappears();
	         pm.getQicPortalTabNavigationHelper().clickOnPartDTab();
	         waitBlockUiDisappears();
	         waitWhenOverlayInvisible();
	    	selectContractNumber(getContractnumberindex);
	    	selectPlanType(getPlanTypeindex);
	    	//enterPlanType(getPlanType);
	    	enterPlanId(getPlanId);
	    	enterFormularyId(getFormularyId);
	    	enterProviderOtherType();
	    	enterQicAppealNumber();
	    	selectAppealPriorityExpediated();
	    	selectAppealTypeProspective();
	    	enterApplicableCoverageYear(getyear);
	    	selectCostSharingIssueYes();
	    	/*if (autoforward)
	    	{*/
	    	selectAppealautoforwardNo();
	    	
	    	/*}else
	    	    		{
	    		selectAppealautoforwardYes();
	    	    		}*/
	    	clickRedetermination();
	    	
	    	selectAppealRequestor(getAppealReqindex);
	    	clickEstateDocYes();
	    	clickPowerAttYes();
	    	
	        enterRepFirstName(repFirstName);
	         enterRepLastName(repLastName);
	         enterRepAddr(repAddress1);
	         
	         enterRepCity(repCity);
	         selectRandomRepState();
	         enterRepPhone(repPhone);
	         enterRepZip(repZip);
	         enterRepEmail(repEmail);
	         enterRepFax(repFax);
	         clickRepChk();
	    	enterEnrolleeMbi(getMedicare);
	    	 enterEnrolleeFirstName(getEnrolleeFirstName);
	         enterEnrolleeLastName(getEnrolleeLastName);
	         enterEnrolleeAddr(getEnrolleeAddress1);
	         enterEnrolleeCity(getEnrolleeCity);
	         selectRandomEnroleeState();
	         enterEnrolleeZip(getEnrolleeZip);
	         enterEnrolleePhone(getEnrolleePhone);
	         enterEnrolleeDateOfBirth("03/03/1990");
	         
	     
	         selectEnrolleeLangNo();
	         selectEnrolleeCommNo();
	         enterCoverageDatePlan0(getCoverageDate);
	         selectCoverageUntimelyYesPlan0();
	         selectDcsnMadeNoPlan0();
	         selectAppellantPlnExpdtYesPlan0();
	         selectAppellantPlnExpdtReviewNoPlan0();
	         //Plan Level 1
	       enterCoverageDatePlan1(getCoverageDate);
	         selectCoverageUntimelyYesPlan1();
	         selectDcsnMadeYesPlan1();
	         enterDescisonMadeDatePlan1(getCoverageDate);
	         selectAppellantPlnExpdtYesPlan1();
	         selectAppellantPlnExpdtReviewYesPlan1();
	         
	         enterPrescriberandDrugData(numberOfPrescriber, numberOfDrugs, getPrescriberFirstName,
	 	    		 getPrescriberLastName,  getprescriberAddress, getPrescriberCity, getPrescriberPhone,
		    		 getPrescriberFax, getdrugCode,  getdrugName,  getdrugStrength, getdrugDosage,
		    		 drugretionaleindex, getEnrolleeZip, getCoverageDate);
	         
	      
	         selectProceduralDocumentation_2();
	         selectProceduralDocumentation_7();
	         selectevidentiarydocumentation_1();
	         selectevidentiarydocumentation_8();
	         enterOverviewIssues(getoverview);
	         enterTimelineFacts(gettimelineFacts);
	         
	         uploadCaseFileDoc();
	         uploadEvidenceCovDoc();
	         uploadDrugFormularyDoc();
	         
	    }
	    
	    public void enterPrescriberandDrugData(int numberOfPrescriber,int numberOfDrugs,String getPrescriberFirstName,
	    		String getPrescriberLastName, String getprescriberAddress,String getPrescriberCity,String getPrescriberPhone,
	    		String getPrescriberFax,String getdrugCode, String getdrugName, String getdrugStrength,String getdrugDosage,
	    		int drugretionaleindex,String getEnrolleeZip,String getCoverageDate) throws InterruptedException
	    {
	    	for (int i=0;i<numberOfPrescriber;i++)
	    	{
	    		enterPrescriberFirstName(getPrescriberFirstName +i);
		         enterPrescriberLarstName(getPrescriberLastName +i);
		         enterPrescriberAddress1(getprescriberAddress);
		         enterPrescriberCity(getPrescriberCity+i);
		         selectRandomPrescriberState();
		         enterPrescriberPhone(getPrescriberPhone+i);
		         enterPrescriberFax(getPrescriberFax+i);
		         enterPrescriberZipcode(getEnrolleeZip+i);
		         enterDrugNdcCode(getdrugCode+i);
		         enterDrugName(getdrugName+i);;
		         enterDrugStrength(getdrugStrength);
		         enterDrugDosage(getdrugDosage);
		         selectDrugDisputeDrugtype();
		         selectDrugDisputeOffformularyNo();
		         selectDrugDisputeDenialRationale(drugretionaleindex);
		         //selectDrugDisputeCoveragetyperequestedYes();
		         selectDrugDisputeCoverageTypeRequested_no();
		         enterDrugDisputeetworkYes();
		         enterDateOfPurchase(getCoverageDate);
		         enterAmountPaid("1000");
		         enterDrugTier();
		         enterDrugDetailBtn();
		        // clickEnrolleeNo();
		         clickEnrolleeYes();
		         clickEnrolleeLimitYes();
		         //clickEnrolleeLimitYes();
		         selectDrugDisputePendingAppeal_no();
		         selectDrugapprovedasrequested_no();
		       
		         selectAddPrescriberDrugBt();
		         if ((numberOfPrescriber>1)&&(i!=numberOfPrescriber))
		        	 AddMultiplePrescriberDrugBt();
		      
	    	}
	    }
	    
	    public void enterCaseDataAndSubmit1(int numberOfCases,int numberOfPrescriber, int numberOfDrugs) throws InterruptedException, IOException {
	        pm.getQicPortalDataGenerator().generatePartDClaimData(numberOfCases);

	        PartDCaseData claim = new PartDCaseData();
	        List<Object[]> listClaims = new ArrayList<Object[]>();
	        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/part_d_claims.csv")));
	        String line = reader.readLine();
	        for (int i = 0; i < numberOfCases; i++) {
	            String[] split = line.split(";");
	            listClaims.add(new Object[]{claim
	            		.withcontractnumberindex(Integer.parseInt(split[0]))
	            		.withplanTypeindex(Integer.parseInt(split[1]))
	            		.withformularyId(split[2])
	            		.withapplicableCoverageyear(split[3])
	    	            .withappealReqindex(Integer.parseInt(split[4]))
	    	            .medicare(split[5])
	    	            .enrolleeFirstName(split[6])
	    	            .enrolleeLastName(split[7])
	    	            .EnrolleeAddress1(split[8])
	    	            .EnrolleeCity(split[9])
	    	            .EnrolleeZip(split[10])
	    	            .EnrolleePhone(split[11])
	    	            .coverageDate(split[12])
	    	            .PrescriberFirstName(split[13])
	            		.PrescriberLastName(split[14])
	            		.PrescriberAddress(split[15])
	            		.PrescriberCity(split[16])
	            		.PrescriberPhone(split[17])
	            		.PrescriberFax(split[18])
	            		.DrugCode(split[19])
	            		.DrugName(split[20])
	            		.DrugStrength(split[21])
	            		.DrugDosage(split[22])
	            		.Drugretionaleindex(Integer.parseInt(split[23]))
	            		.Overview(split[24])
	            		.TimelineFacts(split[25])
	            		.withplanId(split[26])
	            		.RepFirstName(split[28])
	            		.RepLastName(split[29])
	            		.RepAddress1(split[30])
	            		.RepCity(split[31])
	            		.RepPhone(split[32])
	            		.RepEmail(split[33])
	            		.RepFax(split[34])
	            		.RepZip(split[35])
	            });
	            	

	            enterCaseData(numberOfPrescriber, numberOfDrugs,claim.ContractNumberIndex(), claim.PlanTypeindex(), claim.FormularyId(), claim.ApplicableCoverageyear(), claim.AppealReqindex()
	                    , claim.Medicare(),claim.EnrolleeFirstName(), claim.EnrolleeLastName(), claim.EnrolleeAddress1(), claim.EnrolleeCity(), claim.EnrolleeZip()
	                    , claim.EnrolleePhone(), claim.coverageDate(), claim.Overview(),claim.TimelineFacts(),claim.PlanId(),claim.Autoforward(),claim.PrescriberFirstName(), claim.PrescriberLastName(), claim.PrescriberAddress(), claim.PrescriberCity(), claim.PrescriberPhone(), claim.PrescriberFax(),claim.DrugCode(),claim.DrugName(),claim.DrugStrength(),claim.DrugDosage()
	                    , claim.Drugretionaleindex(),claim.RepFirstName(),claim.RepLastName(),claim.RepAddress1(),claim.RepCity(),claim.RepPhone(), claim.RepEmail(), claim.RepFax(), claim.RepZip());
	            
	            submitPartDCase();
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
