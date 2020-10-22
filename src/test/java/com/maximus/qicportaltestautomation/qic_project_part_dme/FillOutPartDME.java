package com.maximus.qicportaltestautomation.qic_project_part_dme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;
import com.maximus.qicportaltestautomation.qic_object_model.PartACaseData;
import com.maximus.qicportaltestautomation.qic_object_model.PartDMECaseData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * This class contains helper methods to create Part A cases in QIC portal
 */
public class FillOutPartDME extends Utils {
    private static final By PART_DME_TAB_LOCATOR = By.xpath("//a[@href='#/dmeAppeal']");
    private static final By SELECT_MAC_LOCATOR = By.xpath("//select[@id='macOption']");
    private static final By LIST_MAC_VALUES_LOCATOR = By.xpath("//select[@id='macOption']/option[@label]");
    private static final By REASON_FOR_APPEAL_LOCATOR = By.xpath("//textarea[@id='appealReason']");
    private static final By REDETERMINATION_NUMBER = By.id("redeterminationNumber");
    private static final By REDETERMINATION_DATE = By.id("redeterminationDate");
    private static final By OVERPAYMENT_RADIO_YES = By.id("radio-inline-yes");
    private static final By OVERPAYMENT_RADIO_NO = By.id("radio-inline-no");
    
    private static final By BENEFICIARY_FIRST_NAME_LOCATOR = By.xpath("//input[@id='beneficiaryFirstName']");
    private static final By BENEFICIARY_LAST_NAME_LOCATOR = By.xpath("//input[@id='beneficiaryLastName']");
    private static final By BENEFICIARY_MBI_LOCATOR = By.xpath("//input[@id='ei_medicareNumber']");
    private static final By BENEFICIARY_HIC_LOCATOR = By.xpath("//input[@id='ei_hic']");
    
    private static final By SELECT_REQUESTOR_PARTY_APPEALING_LOCATOR = By.xpath("//select[@id='partyappealing']");
    private static final By LIST_REQUESTOR_PARTY_APPEALING_VALUES_LOCATOR = By.xpath("//select[@id='partyappealing']/option[@label]");
    private static final By REQUESTOR_ORGANIZATION_LOCATOR = By.xpath("//input[@id='requestorOrganization']");
    private static final By SUBMIT_OTHER_BEHALFCHKBOX = By.id("submitOtherBehalfChkBox");
    
    private static final By SELECT_REQUESTOR_NAME_COMBO = By.xpath("//select[@id='requestorNameComboDme']");
    private static final By LIST_REQUESTOR_NAME_COMBO = By.xpath("//select[@id='requestorNameComboDme']/option[@label]");
    private static final By REQUESTOR_NPI_LOCATOR = By.xpath("//input[@id='requestorNpi']");
    private static final By REQUESTOR_NAME_LOCATOR = By.xpath("//input[@id='requestorName']");
    private static final By REQUESTOR_ADDRESS_1_LOCATOR = By.xpath("//input[@id='requestorAddress1']");
    private static final By REQUESTOR_CITY_LOCATOR = By.xpath("//input[@id='requestorCity']");
    private static final By REQUESTOR_STATE_LOCATOR = By.xpath("//select[@id='requestor-state']");
    private static final By REQUESTOR_LIST_OF_STATES_LOCATOR = By.xpath("//select[@id='requestor-state']/optgroup/option[@aria-label]");
    private static final By REQUESTOR_ZIP_LOCATOR = By.xpath("//input[@id='requestorZip']");
    private static final By REQUESTOR_EMAIL_LOCATOR = By.xpath("//input[@id='requestor-email']");
    private static final By REQUESTOR_PHONE_LOCATOR = By.xpath("//input[@id='requestor-phone']");
    private static final By REQUESTOR_FAX_LOCATOR = By.xpath("//input[@id='requestor-fax']");
    private static final By SIGNATURE_ACKNOWLEDGEMENT_LOCATOR = By.xpath("//input[@id='requestorSignatureAcknowledgment']");
    private static final By PROVIDER_LOCATOR = By.xpath("//input[@id='providerName']");
    private static final By CLAIM_NUMBER_LOCATOR = By.xpath("//input[@id='claimItemNumber']");
    private static final By ITEM_SERVICE_TYPE_LOCATOR = By.xpath("//select[@id='itemServiceType']");
    //private static final By LIST_OF_ITEM_SERVICE_TYPES_LOCATOR = By.xpath("//select[@id='itemServiceType']/option[not(@class)])");
    private static final By LIST_OF_ITEM_SERVICE_TYPES_LOCATOR = By.xpath("//select[@id='itemServiceType']/option[@label]");
    private static final By AOR_YES = By.id("requestor-aor-yes");
    private static final By AOR_NO = By.id("requestor-aor-no");
    
    private static final By DATES_OF_SERVICE_FROM_LOCATOR = By.xpath("//input[@id='dateOfServiceFromDmeId']");
    private static final By DATES_OF_SERVICE_TO_LOCATOR = By.xpath("//input[@id='dateOfServiceToDmeId']");
    private static final By SAVE_CLAIM_BUTTON_LOCATOR = By.xpath("//button[@id='dynAddClaim']");
    private static final By ADD_ANOTHER_CLAIM_BUTTON_LOCATOR = By.xpath("//button[@id='addAnotherClaimBtn']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//button[@id='submitDMEid']");
    private static final By CASE_NUMBER_LOCATOR = By.xpath("//p[contains(text(), 'Please note ')]/preceding-sibling::p[1]/strong[@class='ng-binding'][2]");
    private static final By CASE_FILE_DOC = By.xpath("(//*[@id='caseFileDocs']/div/input)");
    private static final By CASE_FILE_UPLOAD_SUCESS = By.xpath("//*[@id='uploadTableDMEAppeal']/tbody/tr/td[3]/strong[1]");
   // private static final By DRUG_FORMULAE_UPLOAD_SUCESS = By.xpath("[@id='drugFormularyTblPartD']/tbody/tr/td[3]/strong[1]");
	

    private QicPortalProjectManager pm;

    public FillOutPartDME(WebDriver wd, QicPortalProjectManager pm) {
        super(wd);
        this.pm = pm;
    }

    public void clickOnPartDMETab() {
        click(PART_DME_TAB_LOCATOR);
    }

    public void selectMac(int mac) throws InterruptedException {
        selectOptionFromDropDownByIndex(LIST_MAC_VALUES_LOCATOR, mac);
    }

    public void selectRandomMac() throws InterruptedException {
        click(SELECT_MAC_LOCATOR);
        selectRandomOption(LIST_MAC_VALUES_LOCATOR);
    }
    public void selectAORYes() throws InterruptedException {
        click(AOR_YES);
        
    }
    
    public void selectAORNo() throws InterruptedException {
        click(AOR_NO);
        
    }
    

    public void enterReasonForAppeal(String text) {
        clearAndType(REASON_FOR_APPEAL_LOCATOR, text);
    }


    public void enterBeneficiaryFirstName(String text) {
        clearAndType(BENEFICIARY_FIRST_NAME_LOCATOR, text);
    }


    public void enterBeneficiaryLastName(String text) {
        clearAndType(BENEFICIARY_LAST_NAME_LOCATOR, text);
    }


    public void enterBeneficiaryMbi(String text) {
        clearAndType(BENEFICIARY_MBI_LOCATOR, text);
    }


    public void enterBeneficiaryHic(String text) {
        clearAndType(BENEFICIARY_HIC_LOCATOR, text);
    }


    public void selectRandomPartyAppealing() throws InterruptedException {
        selectRandomOption(LIST_REQUESTOR_PARTY_APPEALING_VALUES_LOCATOR);
    }

    public void selectProviderAsPartyAppealing() throws InterruptedException {
        selectOptionFromDropDownByIndex(LIST_REQUESTOR_PARTY_APPEALING_VALUES_LOCATOR, 0);
    }
    public void selectProviderRepAsPartyAppealing() throws InterruptedException {
        selectOptionFromDropDownByIndex(LIST_REQUESTOR_PARTY_APPEALING_VALUES_LOCATOR, 1);
    }



    public void clickOnSignatureAcknowledgement() {
        clickIfPresent(SIGNATURE_ACKNOWLEDGEMENT_LOCATOR);
    }

    public void enteProviderData(String providerName) {
        type(PROVIDER_LOCATOR, providerName);
    }

    public void enterClaimNumber(String claimNumber) {
        type(CLAIM_NUMBER_LOCATOR, claimNumber);
    }

    public void selectItemServiceType(int numberInDropdown) throws InterruptedException {
    	click(ITEM_SERVICE_TYPE_LOCATOR);
        selectOptionFromDropDownByIndex(LIST_OF_ITEM_SERVICE_TYPES_LOCATOR, numberInDropdown);
    }

    public void selectByIndexServiceType(int numberInDropdown)
    {
    	selectByIndex(ITEM_SERVICE_TYPE_LOCATOR, numberInDropdown);
    }
    
    public void selectRandomServiceType() throws InterruptedException {
        click(ITEM_SERVICE_TYPE_LOCATOR);
        selectRandomOption(LIST_OF_ITEM_SERVICE_TYPES_LOCATOR);
    }
    
    public void enterDateOfServiceFrom(String from) {
        type(DATES_OF_SERVICE_FROM_LOCATOR, from);
    }

    public void enterDateOfServiceTo(String to) {
        type(DATES_OF_SERVICE_TO_LOCATOR, to);
    }

    public void saveClaim() {
        click(SAVE_CLAIM_BUTTON_LOCATOR);
    }

    public void addAnotherClaim() {
        click(ADD_ANOTHER_CLAIM_BUTTON_LOCATOR);
    }


    public void submitPartDMECase() {
        click(SUBMIT_BUTTON_LOCATOR);
        waitBlockUiDisappears();
    }
    
    public void uploadCaseFileDoc() throws InterruptedException
    {
    	File document = new File("src/test/resources/performanceReport-300.pdf");
    	 //js.executeScript("arguments[0].click();", CASE_FILE_DOC);
    	 clickIfPresent(CASE_FILE_DOC);
		    Thread.sleep(500);
		    uploadFile(document);
		    waitUntilVisibleLong(CASE_FILE_UPLOAD_SUCESS);
		  //*[@id="drugFormularyTblPartD"]/tbody/tr/td[3]/strong[1]
			//Thread.sleep(1000);
    }

    public void enterClaimDetails(int claimNumber) throws InterruptedException, IOException {
        PartDMECaseData claim = new PartDMECaseData();
        List<Object[]> listClaims = new ArrayList<Object[]>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/claims.csv")));
        String line = reader.readLine();
      
            String[] split = line.split(";");
            listClaims.add(new Object[]{claim.withClaimNumber(split[9]).withClaimItemServiceTypeNumberInDropdown(Integer.parseInt(split[10]))
                    .withClaimDateOfServiceFrom(split[11]).withClaimDateOfServiceTo(split[12])});
            line = reader.readLine();
            for (int i = 0; i < claimNumber; i++) {
            enterClaimNumber(claim.getClaimNumber()+" Claim"+i);
           // selectItemServiceType(claim.getClaimItemServiceTypeNumberInDropdown());
            //selectByIndexServiceType(claim.getClaimItemServiceTypeNumberInDropdown());
            selectRandomServiceType();
            enterDateOfServiceFrom(claim.getClaimDateOfServiceFrom());
            enterDateOfServiceTo(claim.getClaimDateOfServiceTo());
            saveClaim();
            addAnotherClaim();
            
        }
    }

    public void enterCaseData(int casesNumber, int claimsNumber) throws InterruptedException, IOException {
        PartACaseData claim = new PartACaseData();
        List<Object[]> listClaims = new ArrayList<Object[]>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/part_dme_claims.csv")));
        String line = reader.readLine();
        for (int i = 0; i < casesNumber; i++) {
            String[] split = line.split(";");
            listClaims.add(new Object[]{claim.withReasonForAppeal(split[1]).withBeneficiaryFirstName(split[2])
                    .withBeneficiaryLastName(split[3]).withBeneficiaryMbi(split[4]).withBeneficiaryHic(split[5]).withProvider(split[8])});
            line = reader.readLine();
            waitBlockUiDisappears();
	         pm.getQicPortalTabNavigationHelper().clickOnPartDMETab();
	         waitBlockUiDisappears();
           // selectRandomMac();
	         selectMac(claim.getNumberInMacList());
            enterReasonForAppeal(claim.getReasonForAppeal());
            enterBeneficiaryFirstName(claim.getBeneficiaryFirstName());
            enterBeneficiaryLastName(claim.getBeneficiaryLastName());
            enterBeneficiaryMbi(claim.getBeneficiaryMbi());
            enterBeneficiaryHic(claim.getBeneficiaryHic());
            //selectProviderAsPartyAppealing();
            selectProviderRepAsPartyAppealing();
            Boolean flag=false;
            if (!flag)
            {
            	selectAORYes();
            	flag=true;
            }
            else
            {
            	 selectAORNo();
            	 flag=false;
            }
            clickOnSignatureAcknowledgement();
            enteProviderData(claim.getProvider());
            enterClaimDetails(claimsNumber);
            uploadCaseFileDoc();
            submitPartDMECase();
            System.out.println(pm.getFillOutPartDME().caseNumber());
            }
    }

 public void prepareCase(int totalNeededCases, int claimsNumber) throws IOException, InterruptedException {
        pm.getQicPortalDataGenerator().generatePartDMEClaimData(totalNeededCases,claimsNumber);
        //clickOnPartATab();
        waitBlockUiDisappears();
        enterCaseData(totalNeededCases, claimsNumber);
    }

    public void submitOneCase(int claimsNumber) throws IOException, InterruptedException {
        prepareCase(1, claimsNumber);
        //submitPartDMECase();
    }


    public void submitSeveralCases(int totalNeededCases, int claimsNumber) throws IOException, InterruptedException {
        for (int i = 1; i <= totalNeededCases; i++) {
            prepareCase(totalNeededCases, claimsNumber);
           // submitPartDMECase();
        }
    }

    public String caseNumber() {
        String casenumber = getText(CASE_NUMBER_LOCATOR);
        return casenumber;
    }


}
