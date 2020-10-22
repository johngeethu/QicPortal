package com.maximus.qicportaltestautomation.qic_app_manager;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class QicProjectProperties {
    private final Properties properties;


    public QicProjectProperties() {
        this.properties = new Properties();
        callProperties();
    }


    private void callProperties() {
        String target = System.getProperty("target", "qa");
        try {
            properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
        } catch (Exception ex) {
            System.out.println("Can not work with the file");
        }
    }

    public String getLogingUrl() {
        return properties.getProperty("web.loginUrl");
    }

    public String getPlanAdminLogin() {
        return properties.getProperty("web.planAdminEmail");
    }

    public String getPlanNonAdminLogin() {
        return properties.getProperty("web.planNonAdminEmail");
    }

    public String getProviderLogin() {
        return properties.getProperty("web.providerEmail");
    }

    public String getAssociatedProviderLogin() {
        return properties.getProperty("web.associatedProviderEmail");
    }

    public String getOtherRoleLogin() {
        return properties.getProperty("web.otherRoleEmail");
    }

    public String getAssociatedOtherRoleLogin() {
        return properties.getProperty("web.associatedOtherRoleEmail");
    }

    public String getAssociatedOtherSubmitterRoleLogin() {
        return properties.getProperty("web.otherSubmitterRoleEmail");
    }

    public String getDbQicActs() {
        return properties.getProperty("db.qicActs");
    }

    public String getDbLogin() {
        return properties.getProperty("db.user");
    }

    public String getDbPassword() {
        return properties.getProperty("db.password");
    }


}
