package com.maximus.qicportaltestautomation.qic_my_account;

import com.maximus.qicportaltestautomation.qic_app_manager.QicPortalProjectManager;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * This class contains methods to get info from the database to test "My Acoount" page in QIC portal
 */
public class MyAccountDatabaseHelper {
    private static final String SQL_QUERY_BASE_PART_FOR_SUBMITTER = " from appealcase apc join ad_user_actsqic_participant adap on apc.creat_user = adap.ad_user_email join address addr on adap.contact_id = addr.contact_id join phone_number pn on pn.contact_id = adap.contact_id join contact con on con.contact_id = adap.contact_id and con.entity_id = adap.entity_id where apc.casenumber = '";


    private QicPortalProjectManager pm;
    private ResultSet resultSet;

    public MyAccountDatabaseHelper(QicPortalProjectManager pm) {
        this.pm = pm;
    }


    /**
     * This method returns a submitter first name for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterFirstNameFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select con.first_name_txt " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }

    /**
     * This method returns a submitter last name for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterLastNameFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select con.last_name_txt " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }



    /**
     * This method returns a submitter address 1 for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterAddress1FromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select addr.addr_line1_txt " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }


    /**
     * This method returns a submitter address 2 for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterAddress2FromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select addr.addr_line2_txt "  + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }


    /**
     * This method returns a submitter City for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterCityFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select addr.addr_city_nm " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }



    /**
     * This method returns a submitter State for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterStateFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select addr.addr_st_cd " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }

    /**
     * This method returns a submitter ZIP for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterZipFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterZip";
        try {
            resultSet = pm.getDbConnector().executeQuery("select addr.addr_zip_cd, addr.addr_zip_plus4_cd " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            String firstPart = resultSet.getString(1);
            String secondPart = resultSet.getString(2);
            text = firstPart + "-" + secondPart;
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }


    /**
     * This method returns a submitter Phone for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterPhoneFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select pn.appeal_cont_ph_num " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }

    /**
     * This method returns a submitter Fax for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterFaxFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select pn.fax_num " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }


    /**
     * This method returns a submitter Email for the given submission Temp Id (case number)
     * @param submissionTempId
     * @return
     */
    public String getSubmitterEmailFromDb(String submissionTempId) {
        String text = "SQL error - cannot get SubmitterAddress1";
        try {
            resultSet = pm.getDbConnector().executeQuery("select apc.creat_user " + SQL_QUERY_BASE_PART_FOR_SUBMITTER + submissionTempId + "'");
            text = resultSet.getString(1);
            return text;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return text;
    }




}
