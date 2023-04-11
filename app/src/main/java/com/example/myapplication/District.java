package com.example.myapplication;

import java.io.Serializable;

public class District implements Serializable {

    private String countryName;

    // Image name (Without extension)
    private int flagName;

    public District(String countryName, int flagName) {
        this.countryName= countryName;
        this.flagName= flagName;
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getFlagName() {
        return flagName;
    }

    public void setFlagName(int flagName) {
        this.flagName = flagName;
    }

}