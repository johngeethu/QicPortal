package com.maximus.qicportaltestautomation.qic_project_upload_additional_info;

import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;
import com.maximus.qicportaltestautomation.qic_object_model.AdditionalInfoUploadData;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseDataUploadAdditionalInfo {
    private QicPortalProjectManager pm;
    private ResultSet resultSet;

    public DatabaseDataUploadAdditionalInfo(QicPortalProjectManager pm) {
        this.pm = pm;
    }


    /**
     * This method returns a Qic Appeal Number, which is associated with the Additional information submission
     *
     * @param submissionTempId Temp Id number for which a Qic Appeal Number is needed
     * @return a Qic Appeal Number from the database
     */
    public String getQicAppealNumberFromDb(String submissionTempId) {
        String text = "SQL error - cannot get QicAppealNumber";
        try {
            resultSet = pm.getDbConnector().executeQuery("select referencenumber from appealcase where casenumber = '" + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }

    /**
     * This method returns a new AdditionalInfoUploadData object with data from the database, which is related to the user email of the signed in user
     * The following fields were cleared up from "spaces", because they will be compared to data from the PDF file, where spaces are independent and need to be cleared al well:
     * - withSubmitterName
     * - withSubmitterAddress1
     * - withSubmitterAddress2
     * - withSubmitterCity
     * The field withSubmitterAddress2 is being filled with the empty string, if the resultSet is null for it
     *
     * @param emailOfLoggedinUser En email of signed in user
     * @return a new AdditionalInfoUploadData object with data from the database
     */
    public AdditionalInfoUploadData getSubmitterInfoFromDatabase(String emailOfLoggedinUser) {
        AdditionalInfoUploadData additionalInfoUploadData = new AdditionalInfoUploadData();

        try {
            resultSet = pm.getDbConnector().executeQuery("select distinct apc.creat_user, con.first_name_txt, con.last_name_txt, addr.addr_line1_txt, addr.addr_line2_txt, addr.addr_city_nm, \n" +
                    "addr.addr_st_cd, addr.addr_zip_cd, addr.addr_zip_plus4_cd, pn.appeal_cont_ph_num, pn.fax_num\n" +
                    "from appealcase apc join ad_user_actsqic_participant adap on apc.creat_user = adap.ad_user_email \n" +
                    "join address addr on adap.contact_id = addr.contact_id join phone_number pn on pn.contact_id = adap.contact_id \n" +
                    "join contact con on con.contact_id = adap.contact_id and con.entity_id = adap.entity_id \n" +
                    "where apc.creat_user = '" + emailOfLoggedinUser + "'");

            return additionalInfoUploadData
                    .withSubmitterName(resultSet.getString(2).replaceAll("\\s", "") + resultSet.getString(3).replaceAll("\\s", ""))
                    .withSubmitterAddress1(resultSet.getString(4).replaceAll("\\s", ""))
                    .withSubmitterAddress2(resultSet.getString(5)==null?"":resultSet.getString(5).replaceAll("\\s", ""))
                    .withSubmitterCity(resultSet.getString(6).replaceAll("\\s", ""))
                    .withSubmitterState(resultSet.getString(7))
                    .withSubmitterZip((resultSet.getString(8)) + (resultSet.getString(9)==null?"":resultSet.getString(9)))
                    .withSubmitterPhone(resultSet.getString(10))
                    .withSubmitterFax(resultSet.getString(11)==null?"":resultSet.getString(11))
                    .withSubmitterEmail(resultSet.getString(1));

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
       return additionalInfoUploadData;
    }


    /**
     * This method returns a new AdditionalInfoUploadData object with data from the database, which is related to the user email of the signed in user
     * The following fields were cleared up from "spaces", because they will be compared to data from the PDF file, where spaces are independent and need to be cleared al well:
     * - withSubmitterName
     * - withSubmitterAddress1
     * - withSubmitterAddress2
     * - withSubmitterCity
     * The field withSubmitterAddress2 is being filled with the empty string, if the resultSet is null for it
     *
     * @param emailOfLoggedinUser En email of signed in user
     * @param additionalInfoUploadData An AdditionalInfoUploadData object which is supposed to be updated
     * @return an updated AdditionalInfoUploadData object with data from the database
     */
    public AdditionalInfoUploadData getSubmitterInfoFromDatabase(String emailOfLoggedinUser, AdditionalInfoUploadData additionalInfoUploadData) {

        if(additionalInfoUploadData==null){
            additionalInfoUploadData = new AdditionalInfoUploadData();
        }
        try {
            resultSet = pm.getDbConnector().executeQuery("select distinct apc.creat_user, con.first_name_txt, con.last_name_txt, addr.addr_line1_txt, addr.addr_line2_txt, addr.addr_city_nm, \n" +
                    "addr.addr_st_cd, addr.addr_zip_cd, addr.addr_zip_plus4_cd, pn.appeal_cont_ph_num, pn.fax_num\n" +
                    "from appealcase apc join ad_user_actsqic_participant adap on apc.creat_user = adap.ad_user_email \n" +
                    "join address addr on adap.contact_id = addr.contact_id join phone_number pn on pn.contact_id = adap.contact_id \n" +
                    "join contact con on con.contact_id = adap.contact_id and con.entity_id = adap.entity_id \n" +
                    "where apc.creat_user = '" + emailOfLoggedinUser + "'");

            return additionalInfoUploadData
                    .withSubmitterName(resultSet.getString(2).replaceAll("\\s", "") + resultSet.getString(3).replaceAll("\\s", ""))
                    .withSubmitterAddress1(resultSet.getString(4).replaceAll("\\s", ""))
                    .withSubmitterAddress2(resultSet.getString(5)==null?"":resultSet.getString(5).replaceAll("\\s", ""))
                    .withSubmitterCity(resultSet.getString(6).replaceAll("\\s", ""))
                    .withSubmitterState(resultSet.getString(7))
                    .withSubmitterZip((resultSet.getString(8)) + (resultSet.getString(9)==null?"":resultSet.getString(9)))
                    .withSubmitterPhone(resultSet.getString(10))
                    .withSubmitterFax(resultSet.getString(11)==null?"":resultSet.getString(11))
                    .withSubmitterEmail(resultSet.getString(1));

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
        return additionalInfoUploadData;
    }



    /**
     * This method returns any value of QIC portal Temp Id from the database,
     * which can be used to fill out the corresponding field on Upload Additional Information screen
     *
     * @return QIC portal Temp Id text value
     */
    public String getQicPortalTempIdFromDatabase() {
        String text = "SQL error - cannot get QicPortalTempId";
        try {
            resultSet = pm.getDbConnector().executeQuery("select * from (select casenumber from appealcase order by casenumber) where ROWNUM = 1");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }
}
