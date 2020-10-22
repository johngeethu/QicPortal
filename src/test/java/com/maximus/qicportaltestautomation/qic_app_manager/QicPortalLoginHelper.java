package com.maximus.qicportaltestautomation.qic_app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class QicPortalLoginHelper extends Utils {
    private static final By LOGOUT_LINK_LOCATOR = By.xpath("//a[@href='logout']");
    private static final By PART_A_ADMIN_ROLE_LOCATOR = By.xpath("//a[contains(@data-content, 'Admin')]");
    private static final By PART_A_OTHER_REQUESTOR_ROLE_LOCATOR = By.xpath("//a[contains(@data-content, 'Requestor')]");
    private static final By PART_A_PLAN_ROLE_LOCATOR = By.xpath("//a[contains(@data-content, 'Plan')]");
    private static final By PART_A_PROVIDER_ROLE_LOCATOR = By.xpath("//a[contains(@data-content, 'Provider')]");


    public QicPortalLoginHelper(WebDriver wd) throws IOException {
        super(wd);
    }

    QicProjectProperties pp = new QicProjectProperties();

    public String pickParty(String party) {
        String partyCtedentials = null;
        if (party.equalsIgnoreCase("primary provider") || party.equalsIgnoreCase("provider")) {
            partyCtedentials = pp.getProviderLogin();
        } else if (party.equalsIgnoreCase("associated provider")) {
            partyCtedentials = pp.getAssociatedProviderLogin();
        } else if (party.equalsIgnoreCase("plan admin") || party.equalsIgnoreCase("plan")) {
            partyCtedentials = pp.getPlanAdminLogin();
        } else if (party.equalsIgnoreCase("plan non admin")) {
            partyCtedentials = pp.getPlanNonAdminLogin();
        } else if (party.equalsIgnoreCase("primary other role") || party.equalsIgnoreCase("other role") || party.equalsIgnoreCase("other")) {
            partyCtedentials = pp.getOtherRoleLogin();
        } else if (party.equalsIgnoreCase("associated other role") || party.equalsIgnoreCase("associated other")) {
            partyCtedentials = pp.getAssociatedOtherRoleLogin();
        } else if (party.equalsIgnoreCase("associated other submitter role") || party.equalsIgnoreCase("other submitter")) {
            partyCtedentials = pp.getAssociatedOtherSubmitterRoleLogin();
        } else {
            System.out.println("Incorrect value to select a Party to login");
        }
        return partyCtedentials;
    }


    public void loginAsRole(By partyRoleOnScreen, String partyName) {
        if (!isElementPresent(partyRoleOnScreen)) {
            loginAsRole(partyName);
        }

    }

    public void loginAsRole(String partyName) {
        logOut();
       wd.manage().deleteAllCookies();
        wd.get(pp.getLogingUrl() + pickParty(partyName) + "#/dashboard/");
        waitBlockUiDisappears();
    }


    /**
     * This method is for initial login when you want to check data in My Account page and need to have email for the database query
     * @param email
     */
    public void initialLoginWithEmail(String email) {
        logOut();
        wd.manage().deleteAllCookies();
        wd.get(pp.getLogingUrl() + email + "#/dashboard/");
        waitBlockUiDisappears();
    }



    /**
     * This checks the following conditions:
     * 1) If the logged in user is  Admin
     * 2) If the logged in user has a specific role
     * 3) If it can be logged out
     * And it logs in if it's needed
     * @param partyRoleOnScreen
     * @param partyName
     */
    public void loginAsAdminRole(By partyRoleOnScreen, String partyName){
        if(isElementPresent(PART_A_ADMIN_ROLE_LOCATOR)){
            loginAsRole(partyRoleOnScreen, partyName);
        } else {
            loginAsRole(partyName);
        }
    }

    /**
     * This logs a user out
     */
    public void logOut() {
        if (isElementPresent(LOGOUT_LINK_LOCATOR)){
            click(LOGOUT_LINK_LOCATOR);
        }
    }


    public void loginAsProviderAdmin() {
        loginAsAdminRole(PART_A_PROVIDER_ROLE_LOCATOR, "provider");
    }


    public void loginAsProviderAssociatedUser() {
        loginAsRole(PART_A_PROVIDER_ROLE_LOCATOR,"associated provider");
    }


    public void loginAsPlanAdmin() {
        loginAsAdminRole(PART_A_PLAN_ROLE_LOCATOR,"plan");
    }


    public void loginAsPlanAssociatedUser() {
        loginAsRole(PART_A_PLAN_ROLE_LOCATOR,"plan non admin");
    }


    public void loginAsOtherAdmin() {
        loginAsAdminRole(PART_A_OTHER_REQUESTOR_ROLE_LOCATOR,"other");
    }


    public void loginAsOtherAssociatedRequestorUser() {
        loginAsRole(PART_A_OTHER_REQUESTOR_ROLE_LOCATOR,"associated other");
    }


    public void loginAsOtherAssociatedSubmitterUser() {
        loginAsRole(PART_A_OTHER_REQUESTOR_ROLE_LOCATOR,"other submitter");
    }

}
