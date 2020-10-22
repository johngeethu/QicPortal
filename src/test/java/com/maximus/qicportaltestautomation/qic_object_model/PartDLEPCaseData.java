package com.maximus.qicportaltestautomation.qic_object_model;

import java.util.Objects;

public class PartDLEPCaseData {
	
	
	private int contractnumberindex;
	private int planTypeindex;
	private String enrolleeBirthDate;
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
	//private String coverageDateFrom;
	
	private String qicappealDate;
	private String coveragedateFrom;
	private String coveragedateTo;
	private String lepDate;
	private String lepFromDate;
	private String lepToDate;
	private String entity;
	private String overview;
	private String timelineFacts;
	//private String prescriberZipcode;

	
	
	
	public int ContractNumberIndex()
	{
		return contractnumberindex;
	}
	  public PartDLEPCaseData withcontractnumberindex(int contractnumberindex) {
	        this.contractnumberindex = contractnumberindex;
	        return this;
	    }
	
	public int PlanTypeindex()
	{
		return planTypeindex;
	}
	 public PartDLEPCaseData withplanTypeindex(int planTypeindex) {
	        this.planTypeindex = planTypeindex;
	        return this;
	    }
	 
	
   

   
	public String PlanId()
	{
		return planId;
	}
	 public PartDLEPCaseData withplanId(String planId) {
	        this.planId = planId;
	        return this;
	    }
	


	
	
	public String Medicare()
	{
		return medicare;
	}
	
	public PartDLEPCaseData medicare(String medicare) {
        this.medicare = medicare;
        return this;
    }
	
	public String EnrolleeFirstName()
	{
		return enrolleeFirstName;
	}
	
	public PartDLEPCaseData enrolleeFirstName(String enrolleeFirstName) {
        this.enrolleeFirstName = enrolleeFirstName;
        return this;
    }
	
	public String EnrolleeLastName()
	{
		return enrolleeLastName;
	}
	public PartDLEPCaseData enrolleeLastName(String enrolleeLastName) {
        this.enrolleeLastName = enrolleeLastName;
        return this;
    }
	
	public String EnrolleeAddress1()
	{
		return enrolleeAddress1;
	}
	public PartDLEPCaseData EnrolleeAddress1(String enrolleeAddress1) {
        this.enrolleeAddress1 = enrolleeAddress1;
        return this;
    }
	
	public String EnrolleeCity()
	{
		return enrolleeCity;
	}
	public PartDLEPCaseData EnrolleeCity(String enrolleeCity) {
        this.enrolleeCity = enrolleeCity;
        return this;
    }
	public String EnrolleeZip()
	{
		return enrolleeZip;
	}
	
	public PartDLEPCaseData EnrolleeZip(String enrolleeZip) {
        this.enrolleeZip = enrolleeZip;
        return this;
    }
	public String EnrolleePhone()
	{
		return enrolleePhone;
	}
	public PartDLEPCaseData EnrolleePhone(String enrolleePhone) {
        this.enrolleePhone = enrolleePhone;
        return this;
    }
	public String EnrolleeBirthDate()
	{
		return enrolleeBirthDate;
	}
	public PartDLEPCaseData withenrolleeBirthDate(String enrolleeBirthDate) {
        this.enrolleeBirthDate = enrolleeBirthDate;
        return this;
    }
	
	public String qicappealDate()
	{
		return qicappealDate;
	}
	
	public PartDLEPCaseData withqicappealDate(String qicappealDate) {
        this.qicappealDate = qicappealDate;
        return this;
    }
	
	public String coveragedateFrom()
	{
		return coveragedateFrom;
	}
	
	public PartDLEPCaseData withCoveragedateFrom(String coveragedateFrom) {
        this.coveragedateFrom = coveragedateFrom;
        return this;
    }
	
	public String coveragedateTo()
	{
		return coveragedateTo;
	}
	
	public PartDLEPCaseData withCoveragedateTo(String coveragedateTo) {
        this.coveragedateTo = coveragedateTo;
        return this;
    }
	
	
	public String lepDate()
	{
		return lepDate;
	}
	
	public PartDLEPCaseData withlepDate(String lepDate) {
        this.lepDate = lepDate;
        return this;
    }
	
	public String lepFromDate()
	{
		return lepFromDate;
	}
	
	public PartDLEPCaseData withlepFromDate(String lepFromDate) {
        this.lepFromDate = lepFromDate;
        return this;
    }
	
	public String lepToDate()
	{
		return lepToDate;
	}
	
	public PartDLEPCaseData withlepToDate(String lepToDate) {
        this.lepToDate = lepToDate;
        return this;
    }
	public String entity()
	{
		return entity;
	}
	
	public PartDLEPCaseData withentity(String entity) {
        this.entity = entity;
        return this;
    }
	
	public String Overview()
	{
		return overview;
	}
	public PartDLEPCaseData Overview(String overview) {
        this.overview = overview;
        return this;
    }
	public String TimelineFacts()
	{
		return timelineFacts;
	}
	
	public PartDLEPCaseData TimelineFacts(String timelineFacts) {
        this.timelineFacts = timelineFacts;
        return this;
    }
	

	 
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        PartDLEPCaseData that = (PartDLEPCaseData) o;
	        return contractnumberindex== that.contractnumberindex &&
			planTypeindex== that.planTypeindex &&
					Objects.equals(planId, that.planId) &&
					Objects.equals(medicare ,that.medicare) &&
					Objects.equals(enrolleeFirstName,that.enrolleeFirstName) &&
					Objects.equals(enrolleeLastName,that.enrolleeLastName) &&
					Objects.equals(enrolleeAddress1, that.enrolleeAddress1) &&
					Objects.equals(enrolleeCity,that.enrolleeCity) &&
					Objects.equals(enrolleeZip,that.enrolleeZip) &&
					Objects.equals(enrolleePhone,that.enrolleePhone) &&
					Objects.equals(enrolleeBirthDate,that.enrolleeBirthDate) &&
					Objects.equals(coveragedateFrom,that.coveragedateFrom) &&
					Objects.equals(coveragedateTo,that.coveragedateTo) &&
					Objects.equals(lepDate,that.lepDate) &&
					Objects.equals(lepFromDate,that.lepFromDate) &&
					Objects.equals(lepToDate,that.lepToDate) &&
					Objects.equals(entity,that.entity) &&
			Objects.equals(overview,that.overview) &&
			Objects.equals(timelineFacts,that.timelineFacts)&&
	        Objects.equals(planId,that.planId);
	       
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash( contractnumberindex, planTypeindex,
	    			planId, medicare,
	    			enrolleeFirstName,enrolleeLastName, enrolleeAddress1,enrolleeCity,
	    			enrolleeZip,enrolleePhone,enrolleeBirthDate,qicappealDate,
	    			coveragedateFrom,
	    			coveragedateTo,
	    			lepDate,
	    			lepFromDate,
	    			lepToDate,
	    			entity,overview,timelineFacts,planId);
	    }
}
