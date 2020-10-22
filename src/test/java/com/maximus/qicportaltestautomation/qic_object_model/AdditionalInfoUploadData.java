package com.maximus.qicportaltestautomation.qic_object_model;

import java.util.Objects;

public class AdditionalInfoUploadData {

    private String submissionDate;
    private String submissionTempId;

    private String qicProject;
    private String qicAppealNumber;
    private String qicPortalTempId;

    private String submitterName;
    private String submitterAddress1;
    private String submitterAddress2;
    private String submitterCity;
    private String submitterState;
    private String submitterZip;
    private String submitterPhone;
    private String submitterFax;
    private String submitterEmail;

    private String briefDescription;

    public String getSubmissionDate() {
        return submissionDate;
    }

    public AdditionalInfoUploadData withSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
        return  this;
    }

    public String getSubmissionTempId() {
        return submissionTempId;
    }

    public AdditionalInfoUploadData withSubmissionTempId(String submissionTempId) {
        this.submissionTempId = submissionTempId;
        return  this;
    }

    public String getQicProject() {
        return qicProject;
    }

    public AdditionalInfoUploadData withQicProject(String qicProject) {
        this.qicProject = qicProject;
        return  this;
    }

    public String getQicAppealNumber() {
        return qicAppealNumber;
    }

    public AdditionalInfoUploadData withQicAppealNumber(String qicAppealNumber) {
        this.qicAppealNumber = qicAppealNumber;
        return  this;
    }

    public String getQicPortalTempId() {
        return qicPortalTempId;
    }

    public AdditionalInfoUploadData withQicPortalTempId(String qicPortalTempId) {
        this.qicPortalTempId = qicPortalTempId;
        return  this;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public AdditionalInfoUploadData withSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return  this;
    }

    public String getSubmitterAddress1() {
        return submitterAddress1;
    }

    public AdditionalInfoUploadData withSubmitterAddress1(String submitterAddress1) {
        this.submitterAddress1 = submitterAddress1;
        return  this;
    }

    public String getSubmitterAddress2() {
        return submitterAddress2;
    }

    public AdditionalInfoUploadData withSubmitterAddress2(String submitterAddress2) {
        this.submitterAddress2 = submitterAddress2;
        return  this;
    }

    public String getSubmitterCity() {
        return submitterCity;
    }

    public AdditionalInfoUploadData withSubmitterCity(String submitterCity) {
        this.submitterCity = submitterCity;
        return  this;
    }

    public String getSubmitterState() {
        return submitterState;
    }

    public AdditionalInfoUploadData withSubmitterState(String submitterState) {
        this.submitterState = submitterState;
        return  this;
    }

    public String getSubmitterZip() {
        return submitterZip;
    }

    public AdditionalInfoUploadData withSubmitterZip(String submitterZip) {
        this.submitterZip = submitterZip;
        return  this;
    }

    public String getSubmitterPhone() {
        return submitterPhone;
    }

    public AdditionalInfoUploadData withSubmitterPhone(String submitterPhone) {
        this.submitterPhone = submitterPhone;
        return  this;
    }

    public String getSubmitterFax() {
        return submitterFax;
    }

    public AdditionalInfoUploadData withSubmitterFax(String submitterFax) {
        this.submitterFax = submitterFax;
        return  this;
    }

    public String getSubmitterEmail() {
        return submitterEmail;
    }

    public AdditionalInfoUploadData withSubmitterEmail(String submitterEmail) {
        this.submitterEmail = submitterEmail;
        return  this;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public AdditionalInfoUploadData withBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
        return  this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalInfoUploadData that = (AdditionalInfoUploadData) o;
        return Objects.equals(submissionDate, that.submissionDate) &&
                Objects.equals(submissionTempId, that.submissionTempId) &&
                Objects.equals(qicProject, that.qicProject) &&
                Objects.equals(qicAppealNumber, that.qicAppealNumber) &&
                Objects.equals(qicPortalTempId, that.qicPortalTempId) &&
                Objects.equals(submitterName, that.submitterName) &&
                Objects.equals(submitterAddress1, that.submitterAddress1) &&
                Objects.equals(submitterAddress2, that.submitterAddress2) &&
                Objects.equals(submitterCity, that.submitterCity) &&
                Objects.equals(submitterState, that.submitterState) &&
                Objects.equals(submitterZip, that.submitterZip) &&
                Objects.equals(submitterPhone, that.submitterPhone) &&
                Objects.equals(submitterFax, that.submitterFax) &&
                Objects.equals(submitterEmail, that.submitterEmail) &&
                Objects.equals(briefDescription, that.briefDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submissionDate, submissionTempId, qicProject, qicAppealNumber, qicPortalTempId, submitterName, submitterAddress1, submitterAddress2, submitterCity, submitterState, submitterZip, submitterPhone, submitterFax, submitterEmail, briefDescription);
    }


    @Override
    public String toString() {
        return "AdditionalInfoUploadData{" +
                "submissionDate='" + submissionDate + '\'' +
                ", submissionTempId='" + submissionTempId + '\'' +
                ", qicProject='" + qicProject + '\'' +
                ", qicAppealNumber='" + qicAppealNumber + '\'' +
                ", qicPortalTempId='" + qicPortalTempId + '\'' +
                ", submitterName='" + submitterName + '\'' +
                ", submitterAddress1='" + submitterAddress1 + '\'' +
                ", submitterAddress2='" + submitterAddress2 + '\'' +
                ", submitterCity='" + submitterCity + '\'' +
                ", submitterState='" + submitterState + '\'' +
                ", submitterZip='" + submitterZip + '\'' +
                ", submitterPhone='" + submitterPhone + '\'' +
                ", submitterFax='" + submitterFax + '\'' +
                ", submitterEmail='" + submitterEmail + '\'' +
                ", briefDescription='" + briefDescription + '\'' +
                '}';
    }
}
