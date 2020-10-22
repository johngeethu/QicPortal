package com.maximus.qicportaltestautomation.qic_project_part_a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maximus.qicportaltestautomation.qic_app_manager.Utils;

import java.util.List;

public class QicPortalPartAHelper extends Utils {
    private static final By MAC_DROP_DOWN_LOCATOR = By.xpath("//select[@id='macOption']");


    public QicPortalPartAHelper(WebDriver wd) {
        super(wd);
    }

    public List<String> getListOfMac(){
        List<String> macs = getListOfSelectDropdownOptions(MAC_DROP_DOWN_LOCATOR);
        return macs;
    }
}



