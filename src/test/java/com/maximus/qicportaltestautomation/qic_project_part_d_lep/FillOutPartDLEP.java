package com.maximus.qicportaltestautomation.qic_project_part_d_lep;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;
import com.maximus.qicportaltestautomation.qic_object_model.PartDCaseData;
import com.maximus.qicportaltestautomation.qic_object_model.PartDLEPCaseData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FillOutPartDLEP extends Utils{
	
	 private static final By CONTRACT_NUMBER = By.xpath("//select[@id='partDlep_hpi_contract_num']");
	 private static final By LIST_CONTRACT_NUMBER_LOCATOR = By.xpath("(//select[@id='partDlep_hpi_contract_num']/option[not(@class)])");
	 private static final By PLAN_ID = By.xpath("(//input[@name='partDlep_hpi_planId'])");
	 
	 private static final By PLAN_TYPE = By.xpath("(//select[@id='partDlep_hpi_planType'])");
	 private static final By LIST_PLAN_ID_LOCATOR = By.xpath("(//select[@id='partDlep_hpi_planType']/option[not(@class)])");
	    
	
	 private static final By PROVIDER_OTHER_TYPE = By.id("partDlep_hpi_otherPlanType");
	
	// private static final By FORMULARY_ID_NAME = By.xpath("(//input[@name='hpiFormularyIdName'])");
	 private static final By QIC_APPEAL_NUMBER_LOCATOR = By.id("partDlep_ai_appealNum");
	 private static final By QIC_APPEAL_DATE = By.id("partDlep_appealDate");
	 private static final By QIC_APPEAL_COVERAGE_DATE_FRM = By.id("partDlep_ai_covrgGapListForm_frm");
	 private static final By QIC_APPEAL_COVERGAE_DATE_TO = By.id("partDlep_ai_covrgGapListForm_to");
	 private static final By QIC_APPEAL_COVERGAE_GAP_BTN = By.id("partDlep_ai_covrgGapListForm_btn");
	 
	 
	/* private static final By APPEALPRIORIY_EXPEDIATED = By.id("appealPriority_yes");
	 private static final By APPEALPRIORIY_STANDARD = By.id("appealPriority_no");
	 private static final By APPEALTYPE_PROSPECTIVE =By.id("appealTypeProspective");
	 private static final By APPLICABLE_COVERAGE_YEAR = By.xpath("//*[@id='app_years_id']/div/div/input");
	 private static final By COST_SHARING_ISSUE_YES	= By.id("cost_sharing_issue_yes");
	 private static final By COST_SHARING_ISSUE_NO	= By.id("cost_sharing_issue_no");
	 private static final By APPEALAUTOFORWARD_YES	= By.id("appealAutoForward_yes");
	 private static final By APPEALAUTOFORWARD_NO	= By.id("appealAutoForward_no");
	 private static final By REDETERMINATION	= By.id("selectMissedProcessingLevel_P");
	 
	 private static final By APPEAL_REQUESTOR_LOCATOR = By.xpath("(//select[@name='requestorType'])");
	 private static final By LIST_APPEAL_REQUESTORS_LOCATOR = By.xpath("//select[@id='requestorType']/option[not(@style)]");*/
	 
	 private static final By ENROLLEE_MBI_LOCATOR	= By.id("ei_medicareNumber");
	 private static final By ENROLLEE_HIC_LOCATOR	= By.id("ei_hic");
	 private static final By ENROLLEE_FIRST_NAME_LOCATOR = By.id("partDlep_ei_fName");
	 private static final By ENROLLEE_LAST_NAME_LOCATOR = By.id("partDlep_ei_lName");
	 private static final By ENROLLEE_ADDR1_LOCATOR = By.id("partDlep_ei_add1");
	 private static final By ENROLLEE_ADDR2_LOCATOR = By.id("partDlep_ei_add2");
	 private static final By ENROLLEE_CITY_LOCATOR = By.id("partDlep_ei_city");
	 private static final By ENROLLEE_STATE_LOCATOR = By.xpath("//select[@id='partDlep_ei_state']");
	 private static final By ENROLLEE_LIST_OF_STATES_LOCATOR= By.xpath("//select[@id='partDlep_ei_state']/optgroup/option[@ng-repeat='item in stateTerritoryGrp']");
	 private static final By ENROLLEE_ZIP_LOCATOR = By.id("partDlep_ei_zip");
	 private static final By ENROLLEE_PHONE_LOCATOR = By.id("partDlep_ei_phone");
	 private static final By ENROLLEE_BIRTHDAY_LOCATOR = By.id("partDlep_ei_bDay");
	 private static final By ENROLLEE_LANG_YES = By.id("partDlep_ei_othrDtrmnNtcLangReq_yes");
	 private static final By ENROLLEE_LANG_NO = By.id("partDlep_ei_othrDtrmnNtcLangReq_no");
	 private static final By ENROLLEE_COMM_YES = By.id("partDlep_ei_isAltCommReq_yes");
	 private static final By ENROLLEE_COMM_NO = By.id("partDlep_ei_isAltCommReq_no");
	 
	 private static final By LEP_DEC_DATE = By.id("partDlep_lep_info_declaration_date");
	 private static final By LEP_RECEIVE_DATE = By.id("partDlep_lep_info_receive_date");
	 private static final By LEP_BENE_ATTEST_FROM = By.id("partDlep_lep_beneficiaryAttestationForm_from");
	 private static final By LEP_BENE_ATTEST_TO = By.id("partDlep_lep_beneficiaryAttestationForm_to");
	 private static final By LEP_BENE_ENTITY = By.id("partDlep_lep_beneficiaryAttestationForm_entity");
	 private static final By LEP_BENE_ATTEST_BTN = By.id("partDlep_lep_beneficiaryAttestationForm_btn");
	 private static final By LEP_CREDITABLE_COVERAGE_YES = By.id("partDlep_lep_info_prior_creditable_coverage_yes");
	 private static final By LEP_CREDITABLE_COVERAGE_NO = By.id(" partDlep_lep_info_prior_creditable_coverage_no");
	 private static final By LEP_CREDITABLE_COVERAGE_FRM = By.id("partDlep_lep_info_creditableCovrgListForm_frm");
	
	 private static final By LEP_CREDITABLE_COVERAGE_TO = By.id("partDlep_lep_info_creditableCovrgListForm_to");
	 private static final By LEP_CREDITABLE_COVERAGE_BTN = By.id("partDlep_lep_info_creditableCovrgListForm_btn");
	 
	 private static final By LEP_DISENROLLMENTFORM_DATE = By.id("partDlep_lep_info_disenrollmentForm_date");
	 private static final By LEP_DISENROLLMENTFORM_REASON = By.id("partDlep_lep_info_disenrollmentForm_reason");
	 private static final By LEP_COVRGGAPLISTFORM_BTN = By.id("partDlep_ai_covrgGapListForm_btn");
	 
	
	 private static final By PROCEDURALDOCUMENTATION_1 = By.id("partDlep_exhibit_apdl");
	 private static final By PROCEDURALDOCUMENTATION_2 = By.id("partDlep_exhibit_bpdl");
	 private static final By PROCEDURALDOCUMENTATION_3 = By.id("partDlep_exhibit_cpdl");
	 
	 private static final By EVIDENTIARYDOCUMENTATION_1 = By.id("partDlep_exhibit_eddl");
	 private static final By EVIDENTIARYDOCUMENTATION_2 = By.id("partDlep_exhibit_fddl");
	 private static final By EVIDENTIARYDOCUMENTATION_3 = By.id("partDlep_exhibit_hddl");
	 private static final By EVIDENTIARYDOCUMENTATION_4 = By.id("partDlep_exhibit_iddl");
	 
	 private static final By OVERVIEW_ISSUES = By.id("partDlep_overviewIssuesNm");
	 private static final By TIMELINE_FACTS = By.id("partDlep_timelineFactsNm");
	 
	 private static final By CASE_FILE_DOC = By.xpath("(//*[@id='partDlep_DocumentationFiles']/div/input)");
	
	 private static final By SUBMIT_PART_D_LEP_LOCATOR = By.xpath("//*[@id='partDlepForm']/div[2]/div/div/button[1]");
	 private static final By SAVE_AS_PDF_BUTTON_LOCATOR = By.xpath("//a[@id='partDprintPdfBt']");
	 private static final By CASE_NUMBER_LOCATOR = By.xpath("//*[contains(text(), 'Please note ')]/preceding-sibling::p[1]/strong[2]");
	 private static final By CASE_FILE_DOC_UPLOAD_SUCESS = By.xpath("//*[@id='documentationTblPartDLep']/tbody/tr/td[3]/strong[1]");
	 
	private QicPortalProjectManager pm;
	
	public FillOutPartDLEP (WebDriver wd, QicPortalProjectManager pm) {
        super(wd);
        this.pm = pm;
        
    }
	
	 public void selectContractNumber(int numberInDropdown)  {
	        click(CONTRACT_NUMBER);
	        selectOptionFromDropDownByIndex(LIST_CONTRACT_NUMBER_LOCATOR, numberInDropdown);
	    }
	 
	
	 public void selectPlanType(int numberInDropdown)  {
	        click(PLAN_TYPE);
	        selectOptionFromDropDownByIndex(LIST_PLAN_ID_LOCATOR, numberInDropdown);
	    }
	  public void enterPlanId(String plan_id) {
	        clearAndType(PLAN_ID, plan_id);
	    }
	 
	 public void enterProviderOtherType()   {
	        typeIfPresent(PROVIDER_OTHER_TYPE,randomStringLettersDigits(12));
	    }
	 
	 public void enterQicAppealNumber()   {
		 //typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR, "1-" + randomStringDigitsOnly(9));
		//typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR, "1-" + randomStringDigitsOnly(11));
		 //typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR, "1-" + randomStringDigitsOnly(10));
		 //typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR, "1-" + randomStringDigitsOnly(9)+randomStringLettersDigits(1)+randomStringDigitsOnly(1));
		// typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR,randomStringDigitsOnly(1)+ "-" + randomStringDigitsOnly(10)+RandomStringUtils.randomAlphabetic(1)+randomStringDigitsOnly(1));
		    
		 typeIfPresent(QIC_APPEAL_NUMBER_LOCATOR,randomStringDigitsOnly(1)+ "-" + randomStringDigitsOnly(11)+RandomStringUtils.randomAlphabetic(1)+randomStringDigitsOnly(1));
	    
	    }
	
	 public void  enterQicAppealDate(String date)
	 {
		 clearAndType(QIC_APPEAL_DATE, date);
	 }
	 
	 public void  enterQicCoverageDateFrm(String date)
	 {
		 clearAndType(QIC_APPEAL_COVERAGE_DATE_FRM, date);
	 }
	 public void  enterQicCoverageDateTo(String date)
	 {
		 clearAndType(QIC_APPEAL_COVERGAE_DATE_TO, date);
	 }
	 
	 public void  SaveQicCoverageDate()
	 {
		 click(QIC_APPEAL_COVERGAE_GAP_BTN);
	 }
	  public void enterEnrolleeMbi(String mbi) {
	        clearAndType(ENROLLEE_MBI_LOCATOR, mbi);
	    }

	    public void enterEnrolleeHic(String hic) {
	        clearAndType(ENROLLEE_HIC_LOCATOR, hic);
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
	    public void enterEnrolleeBirthDate(String birthdate) {
	        clearAndType(ENROLLEE_BIRTHDAY_LOCATOR, birthdate);
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
	    public void enterLepDecDate(String lepdate) {
	        clearAndType(LEP_DEC_DATE, lepdate);
	    }
	    public void enterLepReceiveDate(String lepReceivedate) {
	        clearAndType(LEP_RECEIVE_DATE, lepReceivedate);
	    }
	    public void enterLepBneAttestFrom(String lepFromdate) {
	        clearAndType(LEP_BENE_ATTEST_FROM, lepFromdate);
	    }
	    public void enterLepBneAttestTo(String lepTodate) {
	        clearAndType(LEP_BENE_ATTEST_TO, lepTodate);
	    }
	    public void enterLepBeneEntity(String entity) {
	        clearAndType(LEP_BENE_ENTITY, entity);
	    }
	    
	    public void enterLepSave() {
	    	clickIfPresent(LEP_BENE_ATTEST_BTN);
	    }
	    public void enterLepCreditableNo() {
	    	clickIfPresent(LEP_CREDITABLE_COVERAGE_NO);
	    }
	    
	    public void enterLepCreditableYes() {
	    	clickIfPresent(LEP_CREDITABLE_COVERAGE_YES);
	    }
	    
	    public void selectProceduralDocumentation_2() {
	    	clickIfPresent(PROCEDURALDOCUMENTATION_2);
	    }
	   
	    
	    public void selectevidentiarydocumentation_1() {
	    	clickIfPresent(EVIDENTIARYDOCUMENTATION_1);
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
	    	 scrollToElement(CASE_FILE_DOC, wd);
	    	 clickIfPresent(CASE_FILE_DOC);
			    Thread.sleep(1000);
			    uploadFile(document);
				//Thread.sleep(1000);
			    waitUntilVisibleLong(CASE_FILE_DOC_UPLOAD_SUCESS);
	    }
	    
	  
	   
	    /**
	     * This method clicks on Submit button on Part D page
	     */
	    public void submitPartDDrugCase() {
	        clickIfPresent(SUBMIT_PART_D_LEP_LOCATOR);
	    	 scrollToElementAndClick(SUBMIT_PART_D_LEP_LOCATOR,wd);
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
	    public void enterCaseData(int getContractnumberindex,int getPlanTypeindex,String getMedicare,
	    		String getEnrolleeFirstName,String getEnrolleeLastName, String getEnrolleeAddress1,String getEnrolleeCity,
	    		String getEnrolleeZip,String getEnrolleePhone,String getoverview,String gettimelineFacts,String getPlanId,String getqicappealDate,
	    		String getCoveragedateFrom,String getCoveragedateTo,String getbirthdate,String getlepdate,String getlepReceivedate,
	    		String getlepFromdate,String getlepTodate,String getentity) throws InterruptedException {
	    	
	    	 waitBlockUiDisappears();
	         pm.getQicPortalTabNavigationHelper().clickOnPartDDrugTab();
	         waitBlockUiDisappears();
	    	selectContractNumber(getContractnumberindex);
	    	selectPlanType(getPlanTypeindex);
	    	enterPlanId(getPlanId);
	    	selectPlanType(4);
	    	enterProviderOtherType();
	    	enterQicAppealNumber();
	    	enterQicAppealDate(getqicappealDate);
	    	enterQicCoverageDateFrm(getCoveragedateFrom);
	    	enterQicCoverageDateTo(getCoveragedateTo);
	    	SaveQicCoverageDate();
	    	
	    	enterEnrolleeMbi(getMedicare);
	    	 enterEnrolleeFirstName(getEnrolleeFirstName);
	         enterEnrolleeLastName(getEnrolleeLastName);
	         enterEnrolleeAddr(getEnrolleeAddress1);
	         enterEnrolleeCity(getEnrolleeCity);
	         selectRandomEnroleeState();
	         enterEnrolleeZip(getEnrolleeZip);
	         enterEnrolleePhone(getEnrolleePhone);
	         enterEnrolleeBirthDate(getbirthdate);
	         selectEnrolleeLangNo();
	         selectEnrolleeCommNo();
	   
	         enterLepDecDate(getlepdate);
	         enterLepReceiveDate(getlepReceivedate);
	         enterLepBneAttestFrom(getlepFromdate);
	         enterLepBneAttestTo(getlepTodate);
	         enterLepBeneEntity(getentity);
	         enterLepSave();
	         enterLepCreditableNo();
	  
	     
	         selectProceduralDocumentation_2();
	        // selectProceduralDocumentation_7();
	         selectevidentiarydocumentation_1();
	       //  selectevidentiarydocumentation_8();
	         enterOverviewIssues(getoverview);
	         enterTimelineFacts(gettimelineFacts);
	         
	         uploadCaseFileDoc();
	        // uploadEvidenceCovDoc();
	        // uploadDrugFormularyDoc();
	         
	    }
	    
	    public void enterCaseDataAndSubmit(int numberOfCases) throws InterruptedException, IOException {
	        pm.getQicPortalDataGenerator().generatePartDDrugClaimData(numberOfCases);

	        PartDLEPCaseData claim = new PartDLEPCaseData();
	        List<Object[]> listClaims = new ArrayList<Object[]>();
	        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/part_d_drug_claims.csv")));
	        String line = reader.readLine();
	        for (int i = 0; i < numberOfCases; i++) {
	            String[] split = line.split(";");
	            listClaims.add(new Object[]{claim
	            		.withcontractnumberindex(Integer.parseInt(split[0]))
	            		.withplanTypeindex(Integer.parseInt(split[1]))
	            		.medicare(split[2])
	    	            .enrolleeFirstName(split[3])
	    	            .enrolleeLastName(split[4])
	    	            .EnrolleeAddress1(split[5])
	    	            .EnrolleeCity(split[6])
	    	            .EnrolleeZip(split[7])
	    	            .EnrolleePhone(split[8])
	            		.Overview(split[9])
	            		.TimelineFacts(split[10])
	            		.withplanId(split[11])
						.withenrolleeBirthDate(split[12])
						.withlepDate(split[13])
						.withlepFromDate(split[14])
						.withlepToDate(split[15])
						.withentity(split[16])
						.withCoveragedateFrom(split[17])
						.withCoveragedateTo(split[18])
	            });
	            
	          
	            

	            enterCaseData(claim.ContractNumberIndex(), claim.PlanTypeindex(),  claim.Medicare(),claim.EnrolleeFirstName(), claim.EnrolleeLastName(), claim.EnrolleeAddress1(), claim.EnrolleeCity(), claim.EnrolleeZip()
	                    , claim.EnrolleePhone(), claim.Overview(),claim.TimelineFacts(),claim.PlanId(),claim.lepDate(),claim.coveragedateFrom(),
	                    claim.coveragedateTo(),claim.EnrolleeBirthDate(),claim.lepDate(),claim.lepDate(),claim.lepFromDate(),claim.lepToDate(),claim.entity());
	            submitPartDDrugCase();
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
