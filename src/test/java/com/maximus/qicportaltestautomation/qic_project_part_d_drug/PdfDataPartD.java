package com.maximus.qicportaltestautomation.qic_project_part_d_drug;

import com.maximus.qicportaltestautomation.qic_app_manager.PdfHelper;

public class PdfDataPartD extends PdfHelper {

    private static final String CASE_PRIORITY = "Part D - Case File Transmittal Form";
    private static final String temporaryAppealNumber = "Temporary Appeal Number";
    private static final String submissionReceived = "Submission Received";

    private static final String APPEAL_PRIORITY = "Appeal Information|Appeal Priority";
    private static final String APPEAL_TYPE = "Appeal Information|Appeal Type";
    private static final String AUTO_FORWARD = "Appeal Information|Is this case an Auto-Forward?";
    private static final String COVERAGE_YEAR = "Appeal Information|Applicable Coverage Year(s)";
    private static final String QIC_APPEAL_NUMBER = "Appeal Information|QIC Appeal Number";
    private static final String COST_SHARING_ISSUE = "Appeal Information|Does this case involve a cost sharing issue?";
    
    private static final String Auto_Forward_DESCRIPTION = "Auto-Forward";
    
    private static final String CONTRACT_NUMBER = "Health Plan Info|Contract Number";
    private static final String PLAN_NAME = "Health Plan Info|Plan Name";
    private static final String PLAN_TPE = "Health Plan Info|Plan Type";
    private static final String OTHER = "Health Plan Info|Other";
    private static final String PLAN_ID = "Health Plan Info|Plan Id";
    private static final String FORMULARY_ID = "Health Plan Info|Formulary Name/ID";

   


    public String getCasePriority(String caseNumber) {
        String value = getTextFromPdf(caseNumber, CASE_PRIORITY);
        return value;
    }

  /*  public String getEnrolleeDataMbi(String caseNumber) {
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
*/





}
