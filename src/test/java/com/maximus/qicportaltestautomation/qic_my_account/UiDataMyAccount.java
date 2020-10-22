package com.maximus.qicportaltestautomation.qic_my_account;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;

/**
 * This class contains methods to get info from the "My Account" page of QIC portal
 */
public class UiDataMyAccount extends Utils {
    private static final By SUBMITTER_FIRST_NAME_VALUE_LOCATOR = By.id("myAccount_firstName");
    private static final By SUBMITTER_LAST_NAME_VALUE_LOCATOR = By.id("myAccount_lastName");
    private static final By SUBMITTER_ADDRESS1_VALUE_LOCATOR = By.id("myAccount_streetAdd1");
    private static final By SUBMITTER_ADDRESS2_VALUE_LOCATOR = By.id("myAccount_streetAdd2");
    private static final By SUBMITTER_CITY_VALUE_LOCATOR = By.id("myAccount_city");
    private static final By SUBMITTER_STATE_VALUE_LOCATOR = By.id("myAccountAddNewPlanStateCombo");
    private static final By SUBMITTER_ZIP_VALUE_LOCATOR = By.id("myAccount_zipCode");
    private static final By SUBMITTER_PHONE_VALUE_LOCATOR = By.id("myAccount_appealPhoneNumber");
    private static final By SUBMITTER_FAX_VALUE_LOCATOR = By.id("myAccount_decision_fax");
    private static final By SUBMITTER_EMAIL_VALUE_LOCATOR = By.id("myAccount_email");




    private QicPortalProjectManager pm;

    public UiDataMyAccount(WebDriver wd, QicPortalProjectManager pm) {
        super(wd);
        this.pm = pm;
    }


    public String getSubmitterFirstName(){
        return getTextFromValue(SUBMITTER_FIRST_NAME_VALUE_LOCATOR);
    }

    public String getSubmitterLastName(){
        return getTextFromValue(SUBMITTER_LAST_NAME_VALUE_LOCATOR);
    }


    public String getSubmitterAddress1(){
        return getTextFromValue(SUBMITTER_ADDRESS1_VALUE_LOCATOR);
    }


    public String getSubmitterAddress2(){
        return getTextFromValue(SUBMITTER_ADDRESS2_VALUE_LOCATOR);
    }


    public String getSubmitterCity(){
        return getTextFromValue(SUBMITTER_CITY_VALUE_LOCATOR);
    }


    public String getSubmitterState(){
        return getTextFromValue(SUBMITTER_STATE_VALUE_LOCATOR);
    }



    public String getSubmitterZip(){
        return getTextFromValue(SUBMITTER_ZIP_VALUE_LOCATOR);
    }


    public String getSubmitterPhone(){
        return getTextFromValue(SUBMITTER_PHONE_VALUE_LOCATOR);
    }


    public String getSubmitterFax(){
        return getTextFromValue(SUBMITTER_FAX_VALUE_LOCATOR);
    }


    public String getSubmitterEmail(){
        return getTextFromValue(SUBMITTER_EMAIL_VALUE_LOCATOR);
    }



}
