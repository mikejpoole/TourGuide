package com.android.example.tourguide;

/**
 * Created by mike on 23/03/2018.
 */

public class POI {

    private String sTitle;
    private String sDescription;

    public POI(String title, String description){
        sTitle = title;
        sDescription = description;
    }

    public String getTitle(){
        return sTitle;
    }

    public String getDescription(){
        return sDescription;
    }

}
