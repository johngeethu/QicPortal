package com.maximus.qicportaltestautomation.qic_project_part_c;

import com.maximus.qicportaltestautomation.qic_app_manager.PdfHelper;
import org.apache.pdfbox.pdfparser.PDFParser;  


public class PdfDataPartC extends PdfHelper {

    private static final String CASE_PRIORITY = "Part C Case File Submission - Output to SQID|Case Priority";

    private static final String ENROLLEE_DATA_MBI = "Enrollee Data|Medicare Number (MBI)";
    private static final String ENROLLEE_DATA_HIC = "Enrollee Data|HIC#";
    private static final String ENROLLEE_DATA_FIRST_NAME = "Enrollee Data|First Name";
    private static final String ENROLLEE_DATA_LAST_NAME = "Enrollee Data|Last Name";
    private static final String ENROLLEE_DATA_MIDDLE_NAME = "Enrollee Data|Middle Initial";
    private static final String ENROLLEE_DATA_ADDRESS_1 = "Enrollee Data|Address 1";
    private static final String ENROLLEE_DATA_ADDRESS_2 = "Enrollee Data|Address 2";
    private static final String ENROLLEE_DATA_CITY = "Enrollee Data|City";
    private static final String ENROLLEE_DATA_STATE = "Enrollee Data|State";
    private static final String ENROLLEE_DATA_ZIP = "Enrollee Data|Zip";
    private static final String ENROLLEE_DATA_PHONE = "Enrollee Data|Phone";

    private static final String ENROLLEE_DATA_REQUEST_RECEIVED_DATE = "Enrollee Data|Request Received Date";
    private static final String ISSUE_CATEGORY_ITEM_SERVICE_CATEGORY = "Appeal Category & Appeal Type/Item Service|Issue Category/Item Service Category";
    private static final String CLAIMS_APPEAL_TYPE = "Definition of Denied Services or Claims|Appeal Type";
    private static final String PLAN_CONTACT_FIRST_NAME = "Plan Contact|First Name";
    private static final String PLAN_ALTERNATE_CONTACT_FIRST_NAME = "Plan Alternate Contact|First Name";



    public String getCasePriority(String caseNumber) {
        String value = getTextFromPdf(caseNumber, CASE_PRIORITY);
        return value;
    }

    public String getEnrolleeDataMbi(String caseNumber) {
        String value = getTextFromPdf(caseNumber, ENROLLEE_DATA_MBI);
        return value;
    }

    public String getEnrolleeDataHic(String caseNumber) {
        String value = getTextFromPdf(caseNumber, ENROLLEE_DATA_HIC);
        return value;
    }

    public String getEnrolleeDataFirstName(String caseNumber) {
        String value = getTextFromPdf(caseNumber, ENROLLEE_DATA_HIC);
        return value;
    }






}
