package com.example.cduse.languagesettings;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.example.cduse.languagesettings.language.LocaleHelper;

import static com.example.cduse.languagesettings.language.SupportedLangauges.ARABIC;
import static com.example.cduse.languagesettings.language.SupportedLangauges.ENGLISH;
import static com.example.cduse.languagesettings.language.SupportedLangauges.RUSSIAN;

public class LangaugeSelectionActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langauge_selection);
        if (oldLocaleLangCode.equals(ENGLISH.getValue().getCode())) {
            ((RadioButton) (findViewById(R.id.radio_en))).setChecked(true);

        } else if (oldLocaleLangCode.equals(ARABIC.getValue().getCode())) {
            ((RadioButton) (findViewById(R.id.radio_ar))).setChecked(true);
        } else if (oldLocaleLangCode.equals(RUSSIAN.getValue().getCode())) {
            ((RadioButton) (findViewById(R.id.radio_ru))).setChecked(true);
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_ar:
                if (checked) {
                    LocaleHelper.setLocale(this, "ar");
                }

                break;
            case R.id.radio_en:
                if (checked) {
                    LocaleHelper.setLocale(this, "en");
                }

                break;
            case R.id.radio_ru:
                if (checked) {
                    LocaleHelper.setLocale(this, "ru");
                }

                break;

            default:
                break;


        }
        recreate();
    }
}
