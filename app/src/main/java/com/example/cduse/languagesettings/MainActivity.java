package com.example.cduse.languagesettings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cduse.languagesettings.language.SupportedLangauges;

import java.util.Locale;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActivityStep2.class);
                startActivity(i);
            }
        });

        String selectedLanguage = Locale.getDefault().getLanguage();
        if (SupportedLangauges.isSupported(selectedLanguage)) {
            Toast.makeText(this, "Yey", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No!!", Toast.LENGTH_SHORT).show();
        }

    }


}
