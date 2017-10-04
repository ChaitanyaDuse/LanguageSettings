package com.example.cduse.languagesettings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class ActivityStep2 extends BaseActivity implements View.OnClickListener {


    TextView tv_step2;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
        tv_step2 = (TextView) findViewById(R.id.tv_step2);
        tv_step2.setText(getResources().getString(R.string.step_2, Locale.getDefault().getDisplayLanguage()));
        btn_next = (Button) findViewById(R.id.btn_next);

        btn_next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(ActivityStep2.this, LangaugeSelectionActivity.class);
        startActivity(i);

    }


}
