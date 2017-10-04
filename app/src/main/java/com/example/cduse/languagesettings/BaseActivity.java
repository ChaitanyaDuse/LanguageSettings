package com.example.cduse.languagesettings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.cduse.languagesettings.language.LocaleHelper;

import static android.content.pm.PackageManager.GET_META_DATA;

/**
 * Created by cduse on 10/4/2017.
 */

public class BaseActivity extends AppCompatActivity {
     String oldLocaleLangCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        oldLocaleLangCode = LocaleHelper.getLanguage(this);
        resetTitle();
    }
    @Override

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base));
    }
    private void resetTitle() {
        try {
            int label = getPackageManager().getActivityInfo(getComponentName(), GET_META_DATA).labelRes;
            if (label != 0) {
                setTitle(label);
            }
        } catch (PackageManager.NameNotFoundException e) {  }
    }
    @Override
    protected void onResume() {
        super.onResume();
        if(oldLocaleLangCode!=null &&
                !oldLocaleLangCode.equals(LocaleHelper.getLanguage(this)))
        {

            recreate();
        }
    }
}
