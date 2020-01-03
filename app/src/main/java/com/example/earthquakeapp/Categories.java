package com.example.earthquakeapp;

public class Categories {


    private  double mMagnitude ;

    private String mCity;

    private  long mDate;
    /** Website URL of the earthquake */
    private String mUrl;

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmCity() {
        return mCity;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    public Categories(double mMagnitude, String mCity, long mDate, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mCity = mCity;
        this.mDate = mDate;
        this.mUrl =mUrl;



    }
}
