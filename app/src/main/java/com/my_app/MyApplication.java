package com.my_app;

import android.app.Application;

public class MyApplication extends Application
{
    private String myPhoneNumber = "054111111";

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }
}
