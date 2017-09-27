package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Schedule1 extends Activity {

    protected  void onCreate2(Bundle savedInstanceState) {
        setContentView(R.layout.activity_schedule1);

        Button b = (Button)findViewById(R.id.sch_backBtn);
        b.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View view){
            finish();//이전 페이지는 어떻게하나요??
        }
        });
    }


}

