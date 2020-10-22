package com.maximus.qicportaltestautomation.qic_object_model;

import java.util.Objects;

public class PartDCaseData {
	
	
	private int contractnumberindex;
	private int planTypeindex;
	private String formularyId;
	private String planId;
	private String applicableCoverageyear;
	private int appealReqindex;
	private String medicare;
	private String enrolleeFirstName;
	private String enrolleeLastName;
	private String enrolleeAddress1;
	private String enrolleeCity;
	private String enrolleeZip;
	private String enrolleePhone;
	private String coverageDate;
	private String prescriberFirstName;
	private String prescriberLastName; 
	private String prescriberAddress;
	private String prescriberCity;
	private String prescriberPhone;
	private String prescriberFax;
	private String drugCode;
	private String drugName;
	private String drugStrength;
	private String drugDosage;
	private int drugretionaleindex;
	private String overview;
	private String timelineFacts;
	private String prescriberZipcode;
	private boolean autoForward;
	private String repFirstName;
	private String repLastName;
	private String repAddress1;
	private String repCity;
	private String repPhone;
	private String repZip;
	private String repEmail;
	private String repFax;
	
	
	public int ContractNumberIndex()
	{
		return contractnumberindex;
	}
	  public PartDCaseData withcontractnumberindex(int contractnumberindex) {
	        this.contractnumberindex = contractnumberindex;
	        return this;
	    }
	
	public int PlanTypeindex()
	{
		return planTypeindex;
	}
	 public PartDCaseData withplanTypeindex(int planTypeindex) {
	        this.planTypeindex = planTypeindex;
	        return this;
	    }
	 public boolean Autoforward()
		{
			return autoForward;
		}
	 public PartDCaseData withautoForward(boolean autoForward) {
	        this.autoForward = autoForward;
	        return this;
	    }
   
	public String FormularyId()
	{
		return formularyId;
	}
	
	 public PartDCaseData withformularyId(String formularyId) {
	        this.formularyId = formularyId;
	        return this;
	    }
   
	public String PlanId()
	{
		return planId;
	}
	 public PartDCaseData withplanId(String planId) {
	        this.planId = planId;
	        return this;
	    }
	
	public String ApplicableCoverageyear()
	{
		return applicableCoverageyear;
	}
	
	 public PartDCaseData withapplicableCoverageyear(String applicableCoverageyear) {
	        this.applicableCoverageyear = applicableCoverageyear;
	        return this;
	    }
	public int AppealReqindex()
	{
		return appealReqindex;
	}
	
	 public PartDCaseData withappealReqindex(int appealReqindex) {
	        this.appealReqindex = appealReqindex;
	        return this;
	    }
	
	
	public String Medicare()
	{
		return medicare;
	}
	
	public PartDCaseData medicare(String medicare) {
        this.medicare = medicare;
        return this;
    }
	
	public String EnrolleeFirstName()
	{
		return enrolleeFirstName;
	}
	
	public PartDCaseData enrolleeFirstName(String enrolleeFirstName) {
        this.enrolleeFirstName = enrolleeFirstName;
        return this;
    }
	
	public String EnrolleeLastName()
	{
		return enrolleeLastName;
	}
	public PartDCaseData enrolleeLastName(String enrolleeLastName) {
        this.enrolleeLastName = enrolleeLastName;
        return this;
    }
	
	public String EnrolleeAddress1()
	{
		return enrolleeAddress1;
	}
	public PartDCaseData EnrolleeAddress1(String enrolleeAddress1) {
        this.enrolleeAddress1 = enrolleeAddress1;
        return this;
    }
	
	public String EnrolleeCity()
	{
		return enrolleeCity;
	}
	public PartDCaseData EnrolleeCity(String enrolleeCity) {
        this.enrolleeCity = enrolleeCity;
        return this;
    }
	public String EnrolleeZip()
	{
		return enrolleeZip;
	}
	
	public PartDCaseData EnrolleeZip(String enrolleeZip) {
        this.enrolleeZip = enrolleeZip;
        return this;
    }
	public String EnrolleePhone()
	{
		return enrolleePhone;
	}
	public PartDCaseData EnrolleePhone(String enrolleePhone) {
        this.enrolleePhone = enrolleePhone;
        return this;
    }
	
	public String RepFirstName()
	{
		return repFirstName;
	}
	
	public PartDCaseData RepFirstName(String repFirstName) {
        this.repFirstName = repFirstName;
        return this;
    }
	public String RepLastName()
	{
		return repLastName;
	}
	
	public PartDCaseData RepLastName(String repLastName) {
        this.repLastName = repLastName;
        return this;
    }
	public String RepAddress1()
	{
		return repAddress1;
	}
	
	public PartDCaseData RepAddress1(String repAddress1) {
        this.repAddress1 = repAddress1;
        return this;
    }
	public String RepCity()
	{
		return repCity;
	}
	
	public PartDCaseData RepCity(String repCity) {
        this.repCity = repCity;
        return this;
    }
	public String RepZip()
	{
		return repZip;
	}
	
	public PartDCaseData RepZip(String repZip) {
        this.repZip = repZip;
        return this;
    }
	public String RepEmail()
	{
		return repEmail;
	}
	
	public PartDCaseData RepEmail(String repEmail) {
        this.repEmail = repEmail;
        return this;
    }
	
	public String RepPhone()
	{
		return repPhone;
	}
	
	public PartDCaseData RepPhone(String repPhone) {
        this.repPhone = repPhone;
        return this;
    }
	
	public String RepFax()
	{
		return repFax;
	}
	
	public PartDCaseData RepFax(String repFax) {
        this.repFax = repFax;
        return this;
    }
	public String coverageDate()
	{
		return coverageDate;
	}
	
	public PartDCaseData coverageDate(String coverageDate) {
        this.coverageDate = coverageDate;
        return this;
    }
	
	public String PrescriberFirstName()
	{
		return prescriberFirstName;
	}
	
	public PartDCaseData PrescriberFirstName(String prescriberFirstName) {
        this.prescriberFirstName = prescriberFirstName;
        return this;
    }
	public String PrescriberLastName()
	{
		return prescriberLastName;
	}
	public PartDCaseData PrescriberLastName(String prescriberLastName) {
        this.prescriberLastName = prescriberLastName;
        return this;
    }
	
	public String PrescriberAddress()
	{
		return prescriberAddress;
	}
	public PartDCaseData PrescriberAddress(String prescriberAddress) {
        this.prescriberAddress = prescriberAddress;
        return this;
    }
	
	public String PrescriberCity()
	{
		return prescriberCity;
	}
	public PartDCaseData PrescriberCity(String prescriberCity) {
        this.prescriberCity = prescriberCity;
        return this;
    }
	public String PrescriberPhone()
	{
		return prescriberPhone;
	}
	public PartDCaseData PrescriberPhone(String prescriberPhone) {
        this.prescriberPhone = prescriberPhone;
        return this;
    }
	public String PrescriberZipCode()
	{
		return prescriberZipcode;
	}
	public PartDCaseData PrescriberZipCode(String prescriberZipcode) {
        this.prescriberZipcode = prescriberZipcode;
        return this;
    }
	public String PrescriberFax()
	{
		return prescriberFax;
	}
	public PartDCaseData PrescriberFax(String prescriberFax) {
        this.prescriberFax = prescriberFax;
        return this;
    }
	public String DrugCode()
	{
		return drugCode;
	}
	public PartDCaseData DrugCode(String drugCode) {
        this.drugCode = drugCode;
        return this;
    }
	public String DrugName()
	{
		return drugName;
	}
	public PartDCaseData DrugName(String drugName) {
        this.drugName = drugName;
        return this;
    }
	public String DrugStrength()
	{
		return drugStrength;
	}
	public PartDCaseData DrugStrength(String drugStrength) {
        this.drugStrength = drugStrength;
        return this;
    }
	public String DrugDosage()
	{
		return drugDosage;
	}
	public PartDCaseData DrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
        return this;
    }
	public int Drugretionaleindex()
	{
		return drugretionaleindex;
	}
	public PartDCaseData Drugretionaleindex(int drugretionaleindex) {
        this.drugretionaleindex = drugretionaleindex;
        return this;
    }
	public String Overview()
	{
		return overview;
	}
	public PartDCaseData Overview(String overview) {
        this.overview = overview;
        return this;
    }
	public String TimelineFacts()
	{
		return timelineFacts;
	}
	
	public PartDCaseData TimelineFacts(String timelineFacts) {
        this.timelineFacts = timelineFacts;
        return this;
    }
	
	/*public PartDCaseData(int getContractnumberindex,int getPlanTypeindex,String getFormularyId,
			String getPlanId,String getyear,int getAppealReqindex,String getMedicare,
			String getEnrolleeFirstName,String getEnrolleeLastName, String getEnrolleeAddress1,String getEnrolleeCity,
			String getEnrolleeZip,String getEnrolleePhone,String getCoverageDate,String getPrescriberFirstName,
			String getPrescriberLastName, String getprescriberAddress,String getPrescriberCity,String getPrescriberPhone,
			String getPrescriberFax,String getdrugCode, String getdrugName, String getdrugStrength,String getdrugDosage,
			int drugretionaleindex,String getoverview,String gettimelineFacts)
	{
		
		this.contractnumberindex= getContractnumberindex;
		this.planTypeindex= getPlanTypeindex;
		this.formularyId=  getFormularyId;
		this.planId= getPlanId;
		this.applicableCoverageyear= getyear;
		this.appealReqindex= getAppealReqindex;
		this.medicare= getMedicare;
		this.enrolleeFirstName= getEnrolleeFirstName;
		this.enrolleeLastName= getEnrolleeLastName;
		this.enrolleeAddress1= getEnrolleeAddress1;
		this.enrolleeCity= getEnrolleeCity;
		this.enrolleeZip= getEnrolleeZip;
		this.enrolleePhone= getEnrolleePhone;
		this.coverageDate= getCoverageDate;
		this.prescriberFirstName= getPrescriberFirstName;
		this.prescriberLastName= getPrescriberLastName;
		this.prescriberAddress= getprescriberAddress;
		this.prescriberCity= getPrescriberCity;
		this.prescriberPhone= getPrescriberPhone;
		this.prescriberFax= getPrescriberFax;
		this.drugCode= getdrugCode;
		this.drugName=getdrugName;
		this.drugStrength= getdrugStrength;
		this.drugDosage= getdrugDosage;
		this.drugretionaleindex= drugretionaleindex;
		this.overview=getoverview;
		this.timelineFacts= gettimelineFacts;
	}
	*/
	 
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        PartDCaseData that = (PartDCaseData) o;
	        return contractnumberindex== that.contractnumberindex &&
			planTypeindex== that.planTypeindex &&
					Objects.equals(formularyId, that.formularyId) &&
					Objects.equals(planId, that.planId) &&
					Objects.equals(applicableCoverageyear,that.applicableCoverageyear) &&
			appealReqindex== that.appealReqindex &&
					Objects.equals(medicare ,that.medicare) &&
					Objects.equals(enrolleeFirstName,that.enrolleeFirstName) &&
					Objects.equals(enrolleeLastName,that.enrolleeLastName) &&
					Objects.equals(enrolleeAddress1, that.enrolleeAddress1) &&
					Objects.equals(enrolleeCity,that.enrolleeCity) &&
					Objects.equals(enrolleeZip,that.enrolleeZip) &&
					Objects.equals(enrolleePhone,that.enrolleePhone) &&
					Objects.equals(coverageDate,that.coverageDate) &&
					Objects.equals(prescriberFirstName,that.prescriberFirstName) &&
					Objects.equals(prescriberLastName,that.prescriberLastName) &&
					Objects.equals(prescriberAddress,that.prescriberAddress) &&
					Objects.equals(prescriberCity,that.prescriberCity) &&
					Objects.equals(prescriberPhone,that.prescriberPhone) &&
					Objects.equals(prescriberFax,that.prescriberFax) &&
					Objects.equals(drugCode,that.drugCode) &&
					Objects.equals(drugName,that.drugName) &&
					Objects.equals(drugStrength,that.drugStrength) &&
					Objects.equals(drugDosage,that.drugDosage) &&
					drugretionaleindex== that.drugretionaleindex &&
					Objects.equals(overview,that.overview) &&
					Objects.equals(timelineFacts,that.timelineFacts)&&
			        Objects.equals(planId,that.planId)&&
			        Objects.equals(prescriberZipcode,that.prescriberZipcode)&&
			        Objects.equals(autoForward, that.autoForward)&&
			        Objects.equals(repFirstName, that.repFirstName)&&
			        Objects.equals(repLastName, that.repLastName)&&
			        Objects.equals(repAddress1, that.repAddress1)&&
			        Objects.equals(repCity, that.repCity)&&
			    	 Objects.equals(repPhone, that.repPhone)&&
			        Objects.equals(repZip, that.repZip)&&
			        Objects.equals(repEmail, that.repEmail)&&
			        Objects.equals(repFax, that.repFax);
	    	
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash( contractnumberindex, planTypeindex,formularyId,
	    			planId, applicableCoverageyear,appealReqindex,medicare,
	    			enrolleeFirstName,enrolleeLastName, enrolleeAddress1,enrolleeCity,
	    			enrolleeZip,enrolleePhone,coverageDate,prescriberFirstName,
	    			prescriberLastName, prescriberAddress,prescriberCity,prescriberPhone,
	    			prescriberFax,drugCode, drugName, drugStrength,drugDosage,
	    			drugretionaleindex,overview,timelineFacts,planId,prescriberZipcode,autoForward,
	    			repFirstName,repLastName,repAddress1,repCity,repPhone,repZip,repEmail,repFax);
	    }
}
