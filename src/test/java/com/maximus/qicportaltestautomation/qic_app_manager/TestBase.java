package com.maximus.qicportaltestautomation.qic_app_manager;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    /**
     * You can send the browser parameter as a system property like "-Dbrowser=firefox" in the Configuration or
     * like ".\gradlew -Pbrowser=chrome testAdditionalInfoUpload" in the CLI
     */
    protected static final QicPortalProjectManager pm = new QicPortalProjectManager(System.getProperty("browser", BrowserType.CHROME));


    @BeforeSuite
    public void setUp() throws Exception {
    	
        pm.init();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        pm.stop();
    }

}
