package com.maximus.qicportaltestautomation.qic_project_upload_additional_info;

public class RequirementsDataUploadAdditionalInfo {

    /**
     * This method returns a required static text for the title of the page
     * @return
     */
    public String pageTitle(){
        String title = "Upload Additional Information";
        return title;
    }

    /**
     * This method returns a required static text for the first row after the title of the page
     * @return
     */
    public String firstRowAfterTitleText(){
        String text = "Note: Additional documentation can only be submitted for Appeals or Portal submissions which MAXIMUS has already received.";
        return text;
    }

    /**
     * This method returns a required static text for the second row after the title of the page
     * @return
     */
    public String secondRowAfterTitleText(){
        String text = "Please DO NOT submit a new appeal or new case file submission on this page as it may delay processing.";
        return text;
    }

    /**
     * This method returns a required static text for the third row after the title of the page
     * @return
     */
    public String thirdRowAfterTitleText(){
        String text = "All fields are required except as noted.";
        return text;
    }


    /**
     * This method returns a required static name for the first section on the page
     * @return
     */
    public String firstSectionName(){
        String text = "QIC Project you are submitting documentation for:";
        return text;
    }


    /**
     * This method returns a required name for the drop-down menu on the "QIC Project you are submitting documentation for" section
     * @return
     */
    public String qicProjectDropDownName(){
        String text = "Project";
        return text;
    }


    /**
     * This method returns a required static name for the second section on the page
     * @return
     */
    public String secondSectionName(){
        String text = "QIC Appeal number or QIC Portal Temp ID";
        return text;
    }


    /**
     * This method returns a required static text for the first row of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String firstRow2SectionText(){
        String text = "Please enter the QIC Appeal number or Portal temp ID number for which you are submitting additional information.";
        return text;
    }


    /**
     * This method returns a required static text for the second row of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String secondRow2SectionText(){
        String text = "All documents uploaded will be associated to this number.";
        return text;
    }


    /**
     * This method returns a required static text for the third row of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String thirdRow2SectionText(){
        String text = "Please input QIC Appeal number or QIC Portal Temp ID number - only one is required";
        return text;
    }


    /**
     * This method returns a required name for the QIC Appeal number field of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String qicAppealNumberFieldName(){
        String text = "QIC Appeal number(example: 1-1234567890)";
        return text;
    }


    /**
     * This method returns a required name for the QIC Portal Temp ID number field of the second (QIC Appeal number or QIC Portal Temp ID) section
     * @return
     */
    public String qicPortalTempIdNumberFieldName(){
        String text = "QIC Portal Temp ID number(example: Q18-00001234)";
        return text;
    }



    /**
     * This method returns a required static name for the third section on the page
     * @return
     */
    public String thirdSectionName(){
        String text = "Additional Information Document details";
        return text;
    }


    /**
     * This method returns a required name for the brief description field of the third (Additional Information Document details) section
     * @return
     */
    public String qicPortalBriefDescriptionFieldName(){
        String text = "Please provide a brief description of what is being uploaded and why (optional):";
        return text;
    }


    /**
     * This method returns a required static name for the fourth section on the page
     * @return
     */
    public String fourthSectionName(){
        String text = "Document Upload";
        return text;
    }




    /**
     * This method returns a required text in the fourth (Document Upload) section
     * @return
     */
    public String qicPortalDocumentUploadNote(){
        String text = "Note: If multiple files are attached, they will all be combined and associated with the number above. If you need to submit documents for multiple appeals please submit them separately.";
        return text;
    }


    /**
     * This method returns a required text in the fourth (Document Upload) section
     * @return
     */
    public String qicPortalAcceptableFileTypes(){
        String text = "Acceptable file types include: .PDF only";
        return text;
    }


    /**
     * This method returns a required validation message under the Project dropdown, when the value was not selected
     *
     * @return
     */
    public String requiredProjectValidation(){
        String text = "This field is required.";
        return text;
    }


    /**
     * This method returns a required validation message under the QIC Appeal number and QIC Portal Temp ID number fields, when the value was not entered in any of them
     *
     * @return
     */
    public String requiredQicAppealNumberOrTempIdValidation(){
        String text = "Please enter QIC Appeal Number or QIC Portal Temp ID.";
        return text;
    }




    /**
     * This method returns a required validation message at the Document Upload section, if no document has been uploaded
     *
     * @return
     */
    public String requiredDocumentValidation(){
        String text = "Document upload is required.";
        return text;
    }







}
