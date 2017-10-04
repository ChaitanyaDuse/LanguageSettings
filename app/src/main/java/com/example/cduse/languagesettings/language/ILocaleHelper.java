package com.example.cduse.languagesettings.language;

import android.content.Context;


public interface ILocaleHelper {
     String getLangaugeFromDeviceLocale(Context context);
    void setLocaleOnStartup(String usersPref,String deviceDefaultLocale);

}
