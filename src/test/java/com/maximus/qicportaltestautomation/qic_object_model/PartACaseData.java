package com.maximus.qicportaltestautomation.qic_object_model;

import java.util.Objects;

public class PartACaseData {
    private int numberInMacList;
    private String valueOfMac;
    private String reasonForAppeal;

    private String beneficiaryFirstName;
    private String beneficiaryLastName;
    private String beneficiaryMbi;
    private String beneficiaryHic;

    private String requestorPartyAppealing;
    private String requestorOrganization;
    private String requestorEin;
    private String requestorName;
    private String submitterName;
    private String requestorAddress1;
    private String requestorCity;
    private String requestorState;
    private int requestorStateNumberInDropdown;
    private String requestorZip;
    private String requestorEmail;
    private String requestorAppealContactPhone;

    private String provider;

    private String claimNumber;
    private String claimItemServiceType;
    private int claimItemServiceTypeNumberInDropdown;
    private String claimDateOfServiceFrom;
    private String claimDateOfServiceTo;

    public int getNumberInMacList() {
        return numberInMacList;
    }

    public PartACaseData withNumberInMacList(int numberInMacList) {
        this.numberInMacList = numberInMacList;
        return this;
    }

    public String getValueOfMac() {
        return valueOfMac;
    }

    public PartACaseData withValueOfMac(String valueOfMac) {
        this.valueOfMac = valueOfMac;
        return this;
    }

    public String getReasonForAppeal() {
        return reasonForAppeal;
    }

    public PartACaseData withReasonForAppeal(String reasonForAppeal) {
        this.reasonForAppeal = reasonForAppeal;
        return this;
    }

    public String getBeneficiaryFirstName() {
        return beneficiaryFirstName;
    }

    public PartACaseData withBeneficiaryFirstName(String beneficiaryFirstName) {
        this.beneficiaryFirstName = beneficiaryFirstName;
        return this;
    }

    public String getBeneficiaryLastName() {
        return beneficiaryLastName;
    }

    public PartACaseData withBeneficiaryLastName(String beneficiaryLastName) {
        this.beneficiaryLastName = beneficiaryLastName;
        return this;
    }

    public String getBeneficiaryMbi() {
        return beneficiaryMbi;
    }

    public PartACaseData withBeneficiaryMbi(String beneficiaryMbi) {
        this.beneficiaryMbi = beneficiaryMbi;
        return this;
    }

    public String getBeneficiaryHic() {
        return beneficiaryHic;
    }

    public PartACaseData withBeneficiaryHic(String beneficiaryHic) {
        this.beneficiaryHic = beneficiaryHic;
        return this;
    }

    public String getRequestorPartyAppealing() {
        return requestorPartyAppealing;
    }

    public PartACaseData withRequestorPartyAppealing(String requestorPartyAppealing) {
        this.requestorPartyAppealing = requestorPartyAppealing;
        return this;
    }

    public String getRequestorOrganization() {
        return requestorOrganization;
    }

    public PartACaseData withRequestorOrganization(String requestorOrganization) {
        this.requestorOrganization = requestorOrganization;
        return this;
    }

    public String getRequestorEin() {
        return requestorEin;
    }

    public PartACaseData withRequestorEin(String requestorEin) {
        this.requestorEin = requestorEin;
        return this;
    }

    public String getRequestorName() {
        return requestorName;
    }

    public PartACaseData withRequestorName(String requestorName) {
        this.requestorName = requestorName;
        return this;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public PartACaseData withSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }

    public String getRequestorAddress1() {
        return requestorAddress1;
    }

    public PartACaseData withRequestorAddress1(String requestorAddress1) {
        this.requestorAddress1 = requestorAddress1;
        return this;
    }

    public String getRequestorCity() {
        return requestorCity;
    }

    public PartACaseData withRequestorCity(String requestorCity) {
        this.requestorCity = requestorCity;
        return this;
    }

    public String getRequestorState() {
        return requestorState;
    }

    public PartACaseData withRequestorState(String requestorState) {
        this.requestorState = requestorState;
        return this;
    }

    public int getRequestorStateNumberInDropdown() {
        return requestorStateNumberInDropdown;
    }

    public PartACaseData withRequestorStateNumberInDropdown(int requestorStateNumberInDropdown) {
        this.requestorStateNumberInDropdown = requestorStateNumberInDropdown;
        return this;
    }

    public String getRequestorZip() {
        return requestorZip;
    }

    public PartACaseData withRequestorZip(String requestorZip) {
        this.requestorZip = requestorZip;
        return this;
    }

    public String getRequestorEmail() {
        return requestorEmail;
    }

    public PartACaseData withRequestorEmail(String requestorEmail) {
        this.requestorEmail = requestorEmail;
        return this;
    }

    public String getRequestorAppealContactPhone() {
        return requestorAppealContactPhone;
    }

    public PartACaseData withRequestorAppealContactPhone(String requestorAppealContactPhone) {
        this.requestorAppealContactPhone = requestorAppealContactPhone;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public PartACaseData withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public PartACaseData withClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
        return this;
    }

    public String getClaimItemServiceType() {
        return claimItemServiceType;
    }

    public PartACaseData withClaimItemServiceType(String claimItemServiceType) {
        this.claimItemServiceType = claimItemServiceType;
        return this;
    }

    public int getClaimItemServiceTypeNumberInDropdown() {
        return claimItemServiceTypeNumberInDropdown;
    }

    public PartACaseData withClaimItemServiceTypeNumberInDropdown(int claimItemServiceTypeNumberInDropdown) {
        this.claimItemServiceTypeNumberInDropdown = claimItemServiceTypeNumberInDropdown;
        return this;
    }

    public String getClaimDateOfServiceFrom() {
        return claimDateOfServiceFrom;
    }

    public PartACaseData withClaimDateOfServiceFrom(String claimDateOfServiceFrom) {
        this.claimDateOfServiceFrom = claimDateOfServiceFrom;
        return this;
    }

    public String getClaimDateOfServiceTo() {
        return claimDateOfServiceTo;
    }

    public PartACaseData withClaimDateOfServiceTo(String claimDateOfServiceTo) {
        this.claimDateOfServiceTo = claimDateOfServiceTo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartACaseData that = (PartACaseData) o;
        return numberInMacList == that.numberInMacList &&
                requestorStateNumberInDropdown == that.requestorStateNumberInDropdown &&
                claimItemServiceTypeNumberInDropdown == that.claimItemServiceTypeNumberInDropdown &&
                Objects.equals(valueOfMac, that.valueOfMac) &&
                Objects.equals(reasonForAppeal, that.reasonForAppeal) &&
                Objects.equals(beneficiaryFirstName, that.beneficiaryFirstName) &&
                Objects.equals(beneficiaryLastName, that.beneficiaryLastName) &&
                Objects.equals(beneficiaryMbi, that.beneficiaryMbi) &&
                Objects.equals(beneficiaryHic, that.beneficiaryHic) &&
                Objects.equals(requestorPartyAppealing, that.requestorPartyAppealing) &&
                Objects.equals(requestorOrganization, that.requestorOrganization) &&
                Objects.equals(requestorEin, that.requestorEin) &&
                Objects.equals(requestorName, that.requestorName) &&
                Objects.equals(submitterName, that.submitterName) &&
                Objects.equals(requestorAddress1, that.requestorAddress1) &&
                Objects.equals(requestorCity, that.requestorCity) &&
                Objects.equals(requestorState, that.requestorState) &&
                Objects.equals(requestorZip, that.requestorZip) &&
                Objects.equals(requestorEmail, that.requestorEmail) &&
                Objects.equals(requestorAppealContactPhone, that.requestorAppealContactPhone) &&
                Objects.equals(provider, that.provider) &&
                Objects.equals(claimNumber, that.claimNumber) &&
                Objects.equals(claimItemServiceType, that.claimItemServiceType) &&
                Objects.equals(claimDateOfServiceFrom, that.claimDateOfServiceFrom) &&
                Objects.equals(claimDateOfServiceTo, that.claimDateOfServiceTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberInMacList, valueOfMac, reasonForAppeal, beneficiaryFirstName, beneficiaryLastName, beneficiaryMbi, beneficiaryHic, requestorPartyAppealing, requestorOrganization, requestorEin, requestorName, submitterName, requestorAddress1, requestorCity, requestorState, requestorStateNumberInDropdown, requestorZip, requestorEmail, requestorAppealContactPhone, provider, claimNumber, claimItemServiceType, claimItemServiceTypeNumberInDropdown, claimDateOfServiceFrom, claimDateOfServiceTo);
    }
}
