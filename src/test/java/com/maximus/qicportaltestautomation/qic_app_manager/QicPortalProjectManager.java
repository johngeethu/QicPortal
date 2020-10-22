package com.maximus.qicportaltestautomation.qic_app_manager;

import com.maximus.qicportaltestautomation.qic_my_account.MyAccountDatabaseHelper;
import com.maximus.qicportaltestautomation.qic_project_part_c.FillOutPartC;
import com.maximus.qicportaltestautomation.qic_project_part_c.PdfDataPartC;
import com.maximus.qicportaltestautomation.qic_project_part_d_drug.FillOutPartD;
import com.maximus.qicportaltestautomation.qic_project_part_d_drug.PdfDataPartD;
import com.maximus.qicportaltestautomation.qic_project_part_d_lep.FillOutPartDLEP;
import com.maximus.qicportaltestautomation.qic_project_part_dme.FillOutPartDME;
import com.maximus.qicportaltestautomation.qic_project_upload_additional_info.DatabaseDataUploadAdditionalInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import com.maximus.qicportaltestautomation.qic_project_part_a.FillOutPartA;
import com.maximus.qicportaltestautomation.qic_project_upload_additional_info.UiDataUploadAdditionalInfoConfirmation;
import com.maximus.qicportaltestautomation.qic_my_account.UiDataMyAccount;
import com.maximus.qicportaltestautomation.qic_project_upload_additional_info.UiDataUploadAdditionalInfoBase;
import com.maximus.qicportaltestautomation.qic_project_part_a.QicPortalPartAHelper;
import com.maximus.qicportaltestautomation.qic_project_upload_additional_info.PdfDataUploadAdditionalInfo;
import com.maximus.qicportaltestautomation.qic_project_part_a.RequirementsDataPartA;
import com.maximus.qicportaltestautomation.qic_project_upload_additional_info.RequirementsDataUploadAdditionalInfo;
import com.maximus.qicportaltestautomation.qic_project_upload_additional_info.FillOutUploadAdditionalInfo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class QicPortalProjectManager {

    WebDriver wd;
    private String browser;
    private QicProjectProperties pp;
    private QicHttpSession httpSession;
    private QicDbConnector dbConnector;
    private QicPortalLoginHelper qicPortalLoginHelper;
    private QicPortalDataGenerator qicPortalDataGenerator;
    private QicPortalTabNavigationHelper qicPortalTabNavigationHelper;
    private QicPortalPartAHelper qicPortalPartAHelper;
    private RequirementsDataPartA requirementsDataPartA;
    private FillOutPartA fillOutPartA;
    private FillOutPartC fillOutPartC;
    private PdfDataPartC pdfDataPartC;
    private FillOutPartD fillOutPartD;
    private FillOutPartDLEP fillOutPartDLep;
    private FillOutPartDME fillOutPartDME;
   private PdfDataPartD pdfDataPartD;
    private RequirementsDataUploadAdditionalInfo requirementsDataUploadAdditionalInfo;
    private UiDataUploadAdditionalInfoBase uiDataUploadAdditionalInfoBase;
    private FillOutUploadAdditionalInfo fillOutUploadAdditionalInfo;
    private UiDataMyAccount uiDataMyAccount;
    private MyAccountDatabaseHelper myAccountDatabaseHelper;
    private DatabaseDataUploadAdditionalInfo databaseDataUploadAdditionalInfo;
    private UiDataUploadAdditionalInfoConfirmation uiDataUploadAdditionalInfoConfirmation;
    private PdfDataUploadAdditionalInfo pdfDataUploadAdditionalInfo;



    public QicPortalProjectManager(String browser) {
        this.browser = browser;
    }



    public void init() throws IOException, SQLException, ClassNotFoundException {
        pp = new QicProjectProperties();
        httpSession = new QicHttpSession(this);
        dbConnector = new QicDbConnector(pp.getDbQicActs(), pp.getDbLogin(), pp.getDbPassword());
        dbConnector.initializeDbConnection();
        wd = new ChromeDriver();
        
       /*if (browser.equals(BrowserType.CHROME)) {
        	wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        } else if (browser.equals(BrowserType.EDGE)) {
            wd = new EdgeDriver();
        }
*/
        wd.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        wd.manage().window().maximize();
        qicPortalDataGenerator = new QicPortalDataGenerator(this);
        qicPortalLoginHelper = new QicPortalLoginHelper(wd);
        qicPortalTabNavigationHelper = new QicPortalTabNavigationHelper(wd);
        qicPortalPartAHelper = new QicPortalPartAHelper(wd);
        requirementsDataPartA = new RequirementsDataPartA();
        fillOutPartA = new FillOutPartA(wd, this);
        fillOutPartDME = new FillOutPartDME(wd, this);
        fillOutPartC = new FillOutPartC(wd, this);
        pdfDataPartC = new PdfDataPartC();
        fillOutPartD = new FillOutPartD(wd, this);
        fillOutPartDLep= new FillOutPartDLEP(wd, this);
        requirementsDataUploadAdditionalInfo = new RequirementsDataUploadAdditionalInfo();
        uiDataUploadAdditionalInfoBase = new UiDataUploadAdditionalInfoBase(wd);
        fillOutUploadAdditionalInfo = new FillOutUploadAdditionalInfo(wd, this);
        uiDataMyAccount = new UiDataMyAccount(wd, this);
        myAccountDatabaseHelper = new MyAccountDatabaseHelper(this);
        databaseDataUploadAdditionalInfo = new DatabaseDataUploadAdditionalInfo(this);
        uiDataUploadAdditionalInfoConfirmation = new UiDataUploadAdditionalInfoConfirmation(wd);
        pdfDataUploadAdditionalInfo = new PdfDataUploadAdditionalInfo();

    }

    public void stop() {
       // wd.quit();
        dbConnector.closeDbConnAll();
        httpSession.closeHttpSession();
    }

    public QicProjectProperties getProjectProperties() {
        return pp;
    }

    public QicHttpSession getHttpSession() {
        return httpSession;
    }

    public QicDbConnector getDbConnector() {
        return dbConnector;
    }

    public QicPortalLoginHelper getQicPortalLoginHelper() {
        return qicPortalLoginHelper;
    }

    public QicPortalTabNavigationHelper getQicPortalTabNavigationHelper() {
        return qicPortalTabNavigationHelper;
    }

    public QicPortalPartAHelper getQicPortalPartAHelper() {
        return qicPortalPartAHelper;
    }

    public RequirementsDataPartA getRequirementsDataPartA() {
        return requirementsDataPartA;
    }
    
     public QicPortalDataGenerator getQicPortalDataGenerator() {
        return qicPortalDataGenerator;
    }

    public FillOutPartA getFillOutPartA() {
        return fillOutPartA;
    }
    
    public FillOutPartDME getFillOutPartDME() {
        return fillOutPartDME;
    }

    public FillOutPartC getFillOutPartC() {
        return fillOutPartC;
    }

    public PdfDataPartC getPdfDataPartC() {
        return pdfDataPartC;
    }
    public FillOutPartD getFillOutPartD() {
        return fillOutPartD;
    }
    public FillOutPartDLEP getFillOutPartDLEP() {
        return fillOutPartDLep;
    }

    public RequirementsDataUploadAdditionalInfo getRequirementsDataUploadAdditionalInfo() {
        return requirementsDataUploadAdditionalInfo;
    }

    public UiDataUploadAdditionalInfoBase getUiDataUploadAdditionalInfoBase() {
        return uiDataUploadAdditionalInfoBase;
    }

    public FillOutUploadAdditionalInfo getFillOutUploadAdditionalInfo() {
        return fillOutUploadAdditionalInfo;
    }

    public UiDataMyAccount getUiDataMyAccount() {
        return uiDataMyAccount;
    }

    public MyAccountDatabaseHelper getMyAccountDatabaseHelper() {
        return myAccountDatabaseHelper;
    }

    public DatabaseDataUploadAdditionalInfo getDatabaseDataUploadAdditionalInfo() {
        return databaseDataUploadAdditionalInfo;
    }

    public UiDataUploadAdditionalInfoConfirmation getUiDataUploadAdditionalInfoConfirmation() {
        return uiDataUploadAdditionalInfoConfirmation;
    }

    public PdfDataUploadAdditionalInfo getPdfDataUploadAdditionalInfo() {
        return pdfDataUploadAdditionalInfo;
    }

}
