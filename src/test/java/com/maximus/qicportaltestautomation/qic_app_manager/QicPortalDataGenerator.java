package com.maximus.qicportaltestautomation.qic_app_manager;

import com.maximus.qicportaltestautomation.qic_object_model.PartACaseData;
import com.maximus.qicportaltestautomation.qic_object_model.PartDMECaseData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import com.maximus.qicportaltestautomation.qic_object_model.PartCCaseData;
import com.maximus.qicportaltestautomation.qic_object_model.PartDCaseData;
import com.maximus.qicportaltestautomation.qic_object_model.PartDLEPCaseData;

public class QicPortalDataGenerator {
    private static QicPortalProjectManager pm;

    public QicPortalDataGenerator(QicPortalProjectManager pm){
        this.pm=pm;
    }

//    public static void main(String[] args) throws IOException {
//
//
//        int count = Integer.parseInt(args[0]);
//        File file = new File(args[1]);
//
//        /*Program arguments : 50 src/test/resources/claims.csv */
//        List<PartACaseData> claims = generatePartACaseDetails(count);
//        savePartAClaimsData(claims, file);
//
//
//    }


    /**
     * This generates ans saves the Part A case data into the resources
     * @param dataLines
     * @throws IOException
     */
    public static void generatePartAClaimData(int dataLines,int claimNumber) throws IOException {
        File file = new File("src/test/resources/part_a_claims.csv");

        List<PartACaseData> claims = generatePartACaseDetails(dataLines,claimNumber);
        savePartAClaimsData(claims, file);
    }


    /**
     *
     * @param cases
     * @param file
     * @throws IOException
     */
    private static void savePartAClaimsData(List<PartACaseData> cases, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (PartACaseData claim : cases) {
            writer.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n"
                    , claim.getNumberInMacList(), claim.getReasonForAppeal(), claim.getBeneficiaryFirstName(), claim.getBeneficiaryLastName()
                    , claim.getBeneficiaryMbi(), claim.getBeneficiaryHic(), claim.getRequestorStateNumberInDropdown(), claim.getRequestorZip(), claim.getProvider()
                    , claim.getClaimNumber(), claim.getClaimItemServiceTypeNumberInDropdown(), claim.getClaimDateOfServiceFrom(), claim.getClaimDateOfServiceTo()));
        }
        writer.close();
    }

    /**
     * This is to generate case data except for the following fields:
     * - withRequestorPartyAppealing
     *
     * @param count
     * @return
     */
    private static List<PartACaseData> generatePartACaseDetails(int count,int claimNumber) {
        List<PartACaseData> claims = new ArrayList<PartACaseData>();

        int macDropdown = 1;
        int stateDropdown = 1;
        int itemServiceTypeDropdown = 1;

        for (int i = 0; i < count; i++) {
        	macDropdown = 2;

            claims.add(new PartACaseData().
                    withNumberInMacList(macDropdown)
                    .withReasonForAppeal(String.format("%sThis is test reason for appeal generated on " + timeStamp(), i + 1))
                    .withBeneficiaryFirstName(String.format("%sBeneficiary First Name" + timeStamp(), i + 1)).withBeneficiaryLastName(String.format("%sBeneficiary Last Name" + timeStamp(), i + 1))
                    .withBeneficiaryMbi(String.format(randomStringLettersDigits(11))).withBeneficiaryHic(randomStringLettersDigits(20)).withRequestorStateNumberInDropdown(stateDropdown++)
                    .withRequestorZip(randomStringDigitsOnly(9)).withProvider("Provider _ ' . &" + randomStringLettersDigits(10) + " " + timeStamp())
                    
                    
                    .withClaimNumber(String.format("%s Claim number", i + 1) + timeStamp()).withClaimItemServiceTypeNumberInDropdown(itemServiceTypeDropdown++)
                    .withClaimDateOfServiceFrom(flexibleDate(i + 110)).withClaimDateOfServiceTo(flexibleDate(i + 100)));

            if (macDropdown > 4) {
                macDropdown = 1;
            }

            if (stateDropdown > 59) {
                stateDropdown = 1;
            }

            if (itemServiceTypeDropdown > 23) {
                itemServiceTypeDropdown = 1;
            }

        }
        return claims;
    }
    
    
    public static void generatePartDMEClaimData(int dataLines,int numberofclaims) throws IOException {
        File file = new File("src/test/resources/part_dme_claims.csv");

        List<PartDMECaseData> claims = generatePartDMECaseDetails(dataLines,numberofclaims);
        savePartDMEClaimsData(claims, file);
    }


    /**
     *
     * @param cases
     * @param file
     * @throws IOException
     */
    private static void savePartDMEClaimsData(List<PartDMECaseData> cases, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (PartDMECaseData claim : cases) {
            writer.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n"
                    , claim.getNumberInMacList(), claim.getReasonForAppeal(), claim.getBeneficiaryFirstName(), claim.getBeneficiaryLastName()
                    , claim.getBeneficiaryMbi(), claim.getBeneficiaryHic(), claim.getRequestorStateNumberInDropdown(), claim.getRequestorZip(), claim.getProvider()
                    , claim.getClaimNumber(), claim.getClaimItemServiceTypeNumberInDropdown(), claim.getClaimDateOfServiceFrom(), claim.getClaimDateOfServiceTo()));
        }
        writer.close();
    }

    /**
     * This is to generate case data except for the following fields:
     * - withRequestorPartyAppealing
     *
     * @param count
     * @return
     */
    private static List<PartDMECaseData> generatePartDMECaseDetails(int count,int claimcount) {
        List<PartDMECaseData> claims = new ArrayList<PartDMECaseData>();

        int macDropdown = 1;
        int stateDropdown = 1;
        int itemServiceTypeDropdown = 3;

        for (int i = 0; i < count; i++) {
        	 macDropdown = 4;
            claims.add(new PartDMECaseData().
                    withNumberInMacList(macDropdown)
                    .withReasonForAppeal(String.format("%sThis is test reason for appeal generated on " + timeStamp(), i + 1))
                    .withBeneficiaryFirstName(String.format("%sBeneficiary First Name" + timeStamp(), i + 1)).withBeneficiaryLastName(String.format("%sBeneficiary Last Name" + timeStamp(), i + 1))
                    .withBeneficiaryMbi(String.format(randomStringLettersDigits(11))).withBeneficiaryHic(randomStringLettersDigits(20)).withRequestorStateNumberInDropdown(stateDropdown++)
                    .withRequestorZip(randomStringDigitsOnly(9)).withProvider("Provider _ ' . &" + randomStringLettersDigits(10) + " " + timeStamp())
                    .withClaimNumber(String.format("%s Claim number", i + 1) + timeStamp()).withClaimItemServiceTypeNumberInDropdown(itemServiceTypeDropdown++)
                    .withClaimDateOfServiceFrom(flexibleDate(i + 110)).withClaimDateOfServiceTo(flexibleDate(i + 100)));
                   

            if (macDropdown > 4) {
                macDropdown = 1;
            }

            if (stateDropdown > 59) {
                stateDropdown = 1;
            }

            if (itemServiceTypeDropdown > 23) {
                itemServiceTypeDropdown = 1;
            }

        }
        return claims;
    }


    public void generatePartCClaimData(int dataLines) throws IOException {
        File file = new File("src/test/resources/part_c_claims.csv");

        List<PartCCaseData> claims = generatePartCCaseDetails(dataLines);
        savePartCClaimsData(claims, file);
    }
    
    public void generatePartDClaimData(int dataLines) throws IOException {
        File file = new File("src/test/resources/part_d_claims.csv");

        List<PartDCaseData> claims = generatePartDCaseDetails(dataLines);
        savePartDClaimsData(claims, file);
    }


    private static void savePartCClaimsData(List<PartCCaseData> cases, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (PartCCaseData claim : cases) {
            writer.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;\n"
                    , claim.getCasePriorityInDropdown(), claim.getIssueCategoryInDropdown(), claim.getTextOtherIssueCategory(), claim.getEnrolleeFirstName(), claim.getEnrolleeLastName()//5
                    , claim.getEnrolleeAddress1(), claim.getEnrolleeCity(), claim.getEnrolleeStateInDropdown(), claim.getEnrolleeZip(), claim.getEnrolleePhone()//5
                    , claim.getMbi(), claim.getHic(), claim.getAppealRequestorFirstName(), claim.getAppealRequestorLastName(), claim.getAppealRequestorAddress1() //5
                    , claim.getAppealRequestorCity(), claim.getAppealRequestorStateInDropdown(), claim.getAppealRequestorZip(), claim.getAppealRequestorPhone() //4
                    , claim.getHealthPlanCmsContractNumberInDropdown(), claim.getHealthPlanTypeInDropdown(), claim.getInitialRequestDate(), claim.getInitialDenialDate() //4
                    , claim.getReconsiderationRequestDate(), claim.getReconsoderationDeterminationDate(), claim.getItemsServicesInDisputeInDropdown() //3
            , claim.getFromDateOfService(), claim.getToDateOfService())); //2
        }
        writer.close();
    }

    private List<PartCCaseData> generatePartCCaseDetails(int count) {
        List<PartCCaseData> claims = new ArrayList<PartCCaseData>();
        int casePriorityDropdown = 0;
        int issueCategoryDropdown = 0;
        int stateDropdown = 1;
        int fdnAndCommunicationDropdown = 1;
        int healthPlanTypeDropdown = 1;
        int itemServiceTypeDropdown = 1;

        for (int i = 0; i < count; i++) {
        	   casePriorityDropdown = 3;
        	   issueCategoryDropdown = 5;

            claims.add(new PartCCaseData().
                    withCasePriorityInDropdown(casePriorityDropdown).withIssueCategoryInDropdown(issueCategoryDropdown).withTextOtherIssueCategory(String.format("%sOther issue category", i+1))
                    .withEnrolleeFirstName(String.format("%sEnrollee First Name" + timeStamp(), i + 1)).withEnrolleeLastName(String.format("%sEnrollee Last Name" + timeStamp(), i + 1))
                    .withEnrolleeAddress1(String.format("%sEnrollee Address 1", i + 1)).withEnrolleeCity(String.format("%sEnrolleeCity", i + 1)).withEnrolleeStateInDropdown(stateDropdown++)
                    .withEnrolleeZip(randomStringDigitsOnly(9)).withEnrolleePhone(randomStringDigitsOnly(10))
                    .withMbi(String.format("MBI" + randomStringLettersDigits(8))).withHic(String.format("%sHIC" + randomStringLettersDigits(11), i+1))
                    .withAppealRequestorFirstName(String.format("%sAppeal Requestor First Name", i + 1)).withAppealRequestorLastName(String.format("%sAppeal Requestor Last Name", i + 1))
                    .withAppealRequestorAddress1(String.format("%sAppeal Requestor Address 1", i + 1)).withAppealRequestorCity(String.format("%sAppeal Requestor City", i + 1))
                    .withAppealRequestorStateInDropdown(stateDropdown++).withAppealRequestorZip(randomStringDigitsOnly(9)).withAppealRequestorPhone(randomStringDigitsOnly(10))
                    .withHealthPlanCmsContractNumberInDropdown(1).withHealthPlanTypeInDropdown(healthPlanTypeDropdown++)
                    .withInitialRequestDate(flexibleDate(i + 100)).withInitialDenialDate(flexibleDate(i + 90))
                    .withReconsiderationRequestDate(flexibleDate(i + 80)).withReconsoderationDeterminationDate(flexibleDate(i + 70))
                    .withItemsServicesInDisputeInDropdown(itemServiceTypeDropdown++).withFromDateOfService(flexibleDate(i + 120)).withToDateOfService(flexibleDate(i + 110)));

            //casePriorityDropdown++;
            //issueCategoryDropdown++;
            
            
           // if (casePriorityDropdown > 3) {
                casePriorityDropdown = 3;
//            }

            //if(issueCategoryDropdown >6){
                issueCategoryDropdown = 5;
            //}

            if (stateDropdown > 59) {
                stateDropdown = 1;
            }

            if (fdnAndCommunicationDropdown > 4){
                fdnAndCommunicationDropdown = 1;
            }

            if (healthPlanTypeDropdown >14){
                healthPlanTypeDropdown = 1;
            }

            if (itemServiceTypeDropdown > 14) {
                itemServiceTypeDropdown = 1;
            }

        }
        return claims;
    }
    
    private List<PartDCaseData> generatePartDCaseDetails(int count) {
        List<PartDCaseData> claims = new ArrayList<PartDCaseData>();
      int plantype=0;
      int appealreqindex=1;
        int stateDropdown = 1;
        int fdnAndCommunicationDropdown = 1;
        int healthPlanTypeDropdown = 1;
        int itemServiceTypeDropdown = 1;
        boolean autoforward=true;

        for (int i = 1; i <= count; i++) {
        	//plantype=4;
        	appealreqindex=5;
            claims.add(new PartDCaseData()
            		.withcontractnumberindex(0)
            		.withplanTypeindex(plantype)//Other
            		.withformularyId(String.format("%sFormulary Id" + timeStamp(), i + 1))
               		.withapplicableCoverageyear("2000,2001,2019")
    	            .withappealReqindex(appealreqindex)
    	            .medicare(String.format("MBI" + randomStringLettersDigits(8)))
    	            .enrolleeFirstName(String.format("%sEnrollee First Name" + timeStamp(), i + 1))
    	            .enrolleeLastName(String.format("%sEnrollee Last Name" + timeStamp(), i + 1))
    	            .EnrolleeAddress1(String.format("%sEnrollee Address1" + timeStamp(), i + 1))
    	            .EnrolleeCity(String.format("%sLos Angeles" + timeStamp(), i + 1))
    	            .EnrolleeZip(randomStringDigitsOnly(9))
    	            .EnrolleePhone(randomStringDigitsOnly(10))
    	            .coverageDate(flexibleDate(i + 80))
    	            .PrescriberFirstName(String.format("%sPrescriber First Name"+ timeStamp(), i + 1))
            		.PrescriberLastName(String.format("%sPrescriber Last Name" + timeStamp(), i + 1))
            		.PrescriberAddress(String.format("%sPrescriber Address" + timeStamp(), i + 1))
            		.PrescriberCity(String.format("%sPrescriber City" + timeStamp(), i + 1))
            		.PrescriberPhone(randomStringDigitsOnly(10))
            		.PrescriberFax(randomStringDigitsOnly(10))
            		.DrugCode(randomStringDigitsOnly(10))
            		.DrugName(String.format("%sDrug Name" + timeStamp(), i + 1))
            		.DrugStrength(String.format("%s20mg" + timeStamp(), i + 1))
            		.DrugDosage(String.format("%s5ml" + timeStamp(), i + 1))
            		.Drugretionaleindex(2)
            		.Overview(String.format("%sOverview" + timeStamp(), i + 1))
            		.TimelineFacts(String.format("%sTimelineFacts" + timeStamp(), i + 1))
            		.withplanId(String.format("%s101" + timeStamp(), i + 1))
            		.withautoForward(autoforward)
            		.RepFirstName(String.format("%sRep First Name"+ timeStamp(), i + 1))
             		.RepLastName(String.format("%sRep Last Name" + timeStamp(), i + 1))
             		.RepAddress1(String.format("%sRep Address" + timeStamp(), i + 1))
             		.RepCity(String.format("%sRep City" + timeStamp(), i + 1))
             		.RepPhone(randomStringDigitsOnly(10))
             		.RepEmail("gg1232@gmail.com")
             		.RepFax(randomStringDigitsOnly(10))
             		.RepZip(randomStringDigitsOnly(9))
            		);
            		
            plantype++;
           // appealreqindex++;

            if (plantype > 6) {
            	plantype = 0;
            }
            if (appealreqindex > 4) {
            	appealreqindex = 0;
            }


            if (stateDropdown > 59) {
                stateDropdown = 1;
            }
            
            autoforward=!autoforward;
            

            if (fdnAndCommunicationDropdown > 4){
                fdnAndCommunicationDropdown = 1;
            }

            if (healthPlanTypeDropdown >14){
                healthPlanTypeDropdown = 1;
            }

            if (itemServiceTypeDropdown > 14) {
                itemServiceTypeDropdown = 1;
            }

        }
        return claims;
    }

    private static void savePartDClaimsData(List<PartDCaseData> cases, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (PartDCaseData claim : cases) {
            writer.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n"
                    , claim.ContractNumberIndex(), claim.PlanTypeindex(), claim.FormularyId(), claim.ApplicableCoverageyear(), claim.AppealReqindex()
                    , claim.Medicare(),claim.EnrolleeFirstName(), claim.EnrolleeLastName(), claim.EnrolleeAddress1(), claim.EnrolleeCity(), claim.EnrolleeZip()
                    , claim.EnrolleePhone(), claim.coverageDate(), claim.PrescriberFirstName(), claim.PrescriberLastName(), claim.PrescriberAddress()
                    , claim.PrescriberCity(), claim.PrescriberPhone(), claim.PrescriberFax(),claim.DrugCode(),claim.DrugName(),claim.DrugStrength(),claim.DrugDosage()
                    , claim.Drugretionaleindex(),claim.Overview(),claim.TimelineFacts(),claim.PlanId(),claim.Autoforward()
                    ,claim.RepFirstName(),claim.RepLastName(),claim.RepAddress1(),claim.RepCity(),claim.RepPhone(),claim.RepEmail(),claim.RepFax(),claim.RepZip()
            		)); //2
        }
        writer.close();
    }
    
    public void generatePartDDrugClaimData(int dataLines) throws IOException {
        File file = new File("src/test/resources/part_d_drug_claims.csv");

        List<PartDLEPCaseData> claims = generatePartDDrugCaseDetails(dataLines);
        savePartDDrugClaimsData(claims, file);
    }

    
    private List<PartDLEPCaseData> generatePartDDrugCaseDetails(int count) {
        List<PartDLEPCaseData> claims = new ArrayList<PartDLEPCaseData>();
      int plantype=0;
        int stateDropdown = 1;
        int fdnAndCommunicationDropdown = 1;
        int healthPlanTypeDropdown = 1;
        int itemServiceTypeDropdown = 1;

        for (int i = 0; i < count; i++) {
        	  plantype=0;
            claims.add(new PartDLEPCaseData()
            		.withcontractnumberindex(0)
            		.withplanTypeindex(plantype)//Other
            		.medicare(String.format("MBI" + randomStringLettersDigits(8)))
    	            .enrolleeFirstName(String.format("%sEnrollee First Name" + timeStamp(), i + 1))
    	            .enrolleeLastName(String.format("%sEnrollee Last Name" + timeStamp(), i + 1))
    	            .EnrolleeAddress1(String.format("%sEnrollee Address1" + timeStamp(), i + 1))
    	            .EnrolleeCity(String.format("%sLos Angeles" + timeStamp(), i + 1))
    	            .EnrolleeZip(randomStringDigitsOnly(9))
    	            .EnrolleePhone(randomStringDigitsOnly(10))
            		.Overview(String.format("%sOverview" + timeStamp(), i + 1))
            		.TimelineFacts(String.format("%sTimelineFacts" + timeStamp(), i + 1))
            		.withplanId(String.format("%sUnited Health Care" + timeStamp(), i + 1))
            		.withenrolleeBirthDate("03/03/1987")
            		.withlepDate(flexibleDate(i + 110))
					.withlepFromDate(flexibleDate(i + 110))
					.withlepToDate(flexibleDate(i + 100))
					.withentity(String.format("%sBlue Health Care" + timeStamp(), i + 1))
					.withCoveragedateFrom(flexibleDate(i+110))
					.withCoveragedateTo(flexibleDate(i+100))
            		);
            		
            plantype++;

            if (plantype > 5) {
            	plantype = 0;
            }

           
            if (stateDropdown > 59) {
                stateDropdown = 1;
            }

            if (fdnAndCommunicationDropdown > 4){
                fdnAndCommunicationDropdown = 1;
            }

            if (healthPlanTypeDropdown >14){
                healthPlanTypeDropdown = 1;
            }

            if (itemServiceTypeDropdown > 14) {
                itemServiceTypeDropdown = 1;
            }

        }
        return claims;
    }

    private static void savePartDDrugClaimsData(List<PartDLEPCaseData> cases, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (PartDLEPCaseData claim : cases) {
            writer.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n"
                    , claim.ContractNumberIndex(), claim.PlanTypeindex(),  claim.Medicare(),claim.EnrolleeFirstName(), claim.EnrolleeLastName(), claim.EnrolleeAddress1(), claim.EnrolleeCity(), claim.EnrolleeZip()
                    , claim.EnrolleePhone(), claim.Overview(),claim.TimelineFacts(),claim.PlanId(),claim.EnrolleeBirthDate(), claim.lepDate(),
                    claim.lepFromDate(),claim.lepToDate(),claim.entity(),claim.coveragedateFrom(),claim.coveragedateTo()                                   
            		)); //2
        }
        writer.close();
    }

    public static String timeStamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy HHmm");
        String string = dateFormat.format(new Date());
        return string;
    }

    public static String flexibleDate(int minusDays) {
        LocalDate date = LocalDate.now().minusDays(minusDays);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateString = date.format(formatters);
        return dateString;
    }

    public static String randomStringLettersDigits(int length) {
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        return generatedString;
    }

    public static String randomStringDigitsOnly(int length) {
        boolean useLetters = false;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);

        return generatedString;
    }

}
