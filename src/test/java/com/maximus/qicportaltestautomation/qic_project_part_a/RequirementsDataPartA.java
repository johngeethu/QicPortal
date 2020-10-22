package com.maximus.qicportaltestautomation.qic_project_part_a;

import java.util.Arrays;
import java.util.List;

public class RequirementsDataPartA {

    public List<String> getListOfMac(){
        List<String> macs = Arrays.asList("Please choose", "Wisconsin Physician Services (Part A West)", "Meridian (Part A West)", "CGS (Part A West)" , "Palmetto (Part A West)");
        return macs;
    }

    public String getTabNamePartA(){
        String tabName = "Part A - Reconsideration Appeal Request";
        return tabName;
    }

    public String screenNamePartA(){
        String screenName = "Part A - Reconsideration Appeal Request";
        return screenName;
    }

}
