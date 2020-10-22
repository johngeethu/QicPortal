package com.maximus.qicportaltestautomation.qic_app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QicPortalTabNavigationHelper extends Utils {
    private static final By PART_A_TAB_LOCATOR = By.xpath("//a[@href='#/partA']");
    private static final By PART_A_TAB_ACTIVE_LOCATOR = By.xpath("//li[@class='ng-scope active']/a[@href='#/partA']");
    
    private static final By PART_DME_TAB_LOCATOR = By.xpath("//a[@href='#/dmeAppeal']");
    private static final By PART_DME_TAB_ACTIVE_LOCATOR = By.xpath("//li[@class='ng-scope active']/a[@href='#/dmeAppeal']");
    
    private static final By PART_A_SCREEN_NAME_LOCATOR = By.xpath("//h3[@id='partAHeading']");
    private static final By PART_DME_SCREEN_NAME_LOCATOR = By.xpath("//h3[@id='dmeAppealHeading']");
    
    
    private static final By PART_C_TAB_LOCATOR = By.xpath("//a[@href='#/partC']");
    private static final By PART_C_TAB_ACTIVE_LOCATOR = By.xpath("//li[@class='ng-scope active']/a[@href='#/partC']");
    private static final By PART_D_TAB_LOCATOR = By.xpath("//a[@href='#/partD']");
    private static final By PART_D_TAB_ACTIVE_LOCATOR = By.xpath("//li[@class='ng-scope active']/a[@href='#/partD']");
    private static final By PART_D_LEP_TAB_LOCATOR = By.xpath("//a[@href='#/partDLep']");
    private static final By PART_D_LEP_TAB_ACTIVE_LOCATOR = By.xpath("//li[@class='ng-scope active']/a[@href='#/partDLep']");
    
    private static final By UPLOAD_ADDITIONAL_INFO_TAB_LOCATOR = By.xpath("//a[@href='#/uploadAddtnlInfo']");
    private static final By UPLOAD_ADDITIONAL_INFO_TAB_ACTIVE_LOCATOR = By.xpath("//li[@class='ng-scope active']/a[@href='#/uploadAddtnlInfo']");
    private static final By MY_ACCOUNT_TAB_ACTIVE_LOCATOR = By.xpath("//li[@class='ng-scope active']/a[@href='#/myAccount']");
    private static final By MY_ACCOUNT_TAB_LOCATOR = By.xpath("//a[@href='#/myAccount']");

    public QicPortalTabNavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void clickOnPartATab() {
        if (!isElementPresent(PART_A_TAB_ACTIVE_LOCATOR)) {
            click(PART_A_TAB_LOCATOR);
            waitBlockUiDisappears();
        }
    }

    public String getPartATabText() {
        String tabName = getText(PART_A_TAB_LOCATOR).trim();
        return tabName;
    }
    
    public void clickOnPartDMETab() {
        if (!isElementPresent(PART_DME_TAB_ACTIVE_LOCATOR)) {
            click(PART_DME_TAB_LOCATOR);
            waitBlockUiDisappears();
        }
    }
    public String getPartDMETabText() {
        String tabName = getText(PART_DME_TAB_LOCATOR).trim();
        return tabName;
    }



    public String getPartAScreenNameText() {
        String name = getText(PART_A_SCREEN_NAME_LOCATOR).trim();
        return name;
    }
    
    public String getPartDMEScreenNameText() {
        String name = getText(PART_DME_SCREEN_NAME_LOCATOR).trim();
        return name;
    }

    public void clickOnPartCTab() {
        if (!isElementPresent(PART_C_TAB_ACTIVE_LOCATOR)) {
            click(PART_C_TAB_LOCATOR);
            waitBlockUiDisappears();
        }
    }
    
    public void clickOnPartDTab() {
        if (!isElementPresent(PART_D_TAB_ACTIVE_LOCATOR)) {
            click(PART_D_TAB_LOCATOR);
            waitBlockUiDisappears();
        }
    }
    
    public void clickOnPartDDrugTab() {
        if (!isElementPresent(PART_D_LEP_TAB_ACTIVE_LOCATOR)) {
            click(PART_D_LEP_TAB_LOCATOR);
            waitBlockUiDisappears();
        }
    }

    public void clickOnUploadAdditionalInformationTab() {
        if (!isElementPresent(UPLOAD_ADDITIONAL_INFO_TAB_ACTIVE_LOCATOR)) {
            click(UPLOAD_ADDITIONAL_INFO_TAB_LOCATOR);
            waitBlockUiDisappears();
        }
    }


    public void clickOnMyAccountTab(){
        if (!isElementPresent(MY_ACCOUNT_TAB_ACTIVE_LOCATOR)) {
            click(MY_ACCOUNT_TAB_LOCATOR);
            waitBlockUiDisappears();
        }
    }


}
