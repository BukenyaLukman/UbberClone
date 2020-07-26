package com.example.ubberclone;

import com.example.ubberclone.Model.DriverInfoModel;

public class Common {

    public static final String DRIVER_INFO_REFERENCE = "DriverInfo";
    public static final String DRIVER_LOCATION_REFERENCE = "DriversLocation";


    public static DriverInfoModel currentUser;


    public static String buildWelcomeMessage() {
        if(Common.currentUser != null){
            return new StringBuilder("Welcome")
                    .append(Common.currentUser.getFirstName())
                    .append(" ")
                    .append(Common.currentUser.getLastName()).toString();
        }else
            return "";

    }
}
