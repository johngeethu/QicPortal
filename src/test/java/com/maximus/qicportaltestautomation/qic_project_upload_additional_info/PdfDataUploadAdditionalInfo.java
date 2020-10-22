package com.maximus.qicportaltestautomation.qic_project_upload_additional_info;

import com.maximus.qicportaltestautomation.qic_object_model.AdditionalInfoUploadData;
import com.maximus.qicportaltestautomation.qic_app_manager.PdfHelper;

public class PdfDataUploadAdditionalInfo extends PdfHelper {
    private static final String DATE_TIME_OF_SUBMISSION = "Additional Information Submitted via QIC Portal|Date/time of submission";
    private static final String TEMP_ID_OF_SUBMISSION = "Additional Information Submitted via QIC Portal|Temp ID of this submission";

    private static final String QIC_PROJECT_OF_SUBMISSION = "Additional Information Submitted via QIC Portal|QIC Project";
    private static final String QIC_APPEAL_NUMBER_IN_SUBMISSION = "Additional Information Submitted via QIC Portal|QIC Appeal number to be associated to";
    private static final String QIC_PORTAL_TEMP_ID_IN_SUBMISSION = "Additional Information Submitted via QIC Portal|QIC Portal Temp ID to be associated to";

    private static final String SUBMITTER_NAME = "Additional Information Submitted via QIC Portal|Submitter Name";
    private static final String SUBMITTER_ADDRESS1 = "Additional Information Submitted via QIC Portal|Address line 1";
    private static final String SUBMITTER_ADDRESS2 = "Additional Information Submitted via QIC Portal|Address line 2";
    private static final String SUBMITTER_CITY = "Additional Information Submitted via QIC Portal|City";
    private static final String SUBMITTER_STATE = "Additional Information Submitted via QIC Portal|State";
    private static final String SUBMITTER_ZIP = "Additional Information Submitted via QIC Portal|Zip Code";
    private static final String SUBMITTER_PHONE = "Additional Information Submitted via QIC Portal|Phone";
    private static final String SUBMITTER_FAX = "Additional Information Submitted via QIC Portal|Fax";
    private static final String SUBMITTER_EMAIL = "Additional Information Submitted via QIC Portal|Email";

    private static final String DOCUMENT_BRIEF_DESCRIPTION_IN_SUBMISSION = "Additional Information Submitted via QIC Portal|Document Description";




    /**
     * This returns an object of AdditionalInfoUploadData with the data from the PDF, except for the Submitter data
     * Spaces were removed from the text of some fields for ease of comparison
     *
     * @param submissionTempId The string which provides the name of the saved PDF-file, where the information is stored
     * @return AdditionalInfoUploadData data
     */
    public AdditionalInfoUploadData infoUploadPdf1(String submissionTempId) {
        return new AdditionalInfoUploadData().withSubmissionDate(getTextFromPdf(submissionTempId, DATE_TIME_OF_SUBMISSION))
                .withSubmissionTempId(getTextFromPdf(submissionTempId, TEMP_ID_OF_SUBMISSION))
                .withQicProject(getTextFromPdf(submissionTempId, QIC_PROJECT_OF_SUBMISSION))
                .withQicAppealNumber(getTextFromPdf(submissionTempId, QIC_APPEAL_NUMBER_IN_SUBMISSION))
                .withQicPortalTempId(getTextFromPdf(submissionTempId, QIC_PORTAL_TEMP_ID_IN_SUBMISSION))
                .withBriefDescription(getTextFromPdf(submissionTempId, DOCUMENT_BRIEF_DESCRIPTION_IN_SUBMISSION).replaceAll("\\s", ""));
    }

    /**
     * This returns an object of AdditionalInfoUploadData with the full data from the PDF (including Submitter data)
     * Spaces and dashes were removed from the text of some fields for ease of comparison
     *
     * @param submissionTempId The string which provides the name of the saved PDF-file, where the information is stored
     * @return AdditionalInfoUploadData data
     */
    public AdditionalInfoUploadData infoUploadPdfWithSubmitter1(String submissionTempId) {
        return infoUploadPdf1(submissionTempId)
                .withSubmitterName(getTextFromPdf(submissionTempId, SUBMITTER_NAME).replaceAll("\\s", ""))
                .withSubmitterAddress1(getTextFromPdf(submissionTempId, SUBMITTER_ADDRESS1).replaceAll("\\s", ""))
                .withSubmitterAddress2(getTextFromPdf(submissionTempId, SUBMITTER_ADDRESS2).replaceAll("\\s", ""))
                .withSubmitterCity(getTextFromPdf(submissionTempId, SUBMITTER_CITY).replaceAll("\\s", ""))
                .withSubmitterState(getTextFromPdf(submissionTempId, SUBMITTER_STATE))
                .withSubmitterZip(getTextFromPdf(submissionTempId, SUBMITTER_ZIP).replaceAll("\\D", ""))
                .withSubmitterPhone(getTextFromPdf(submissionTempId, SUBMITTER_PHONE).replaceAll("\\D", ""))
                .withSubmitterFax(getTextFromPdf(submissionTempId, SUBMITTER_FAX).replaceAll("\\D", ""))
                .withSubmitterEmail(getTextFromPdf(submissionTempId, SUBMITTER_EMAIL));
    }

}
