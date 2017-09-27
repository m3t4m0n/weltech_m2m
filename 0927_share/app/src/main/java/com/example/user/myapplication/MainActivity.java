package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.main_Btn2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Schedule1.class);
                startActivity(intent);
            }
        });


    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    private boolean onOptionItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(this, "내용1", Toast.LENGTH_SHORT).show();
                //해당 페이지로 이동.
                return true;

            case R.id.menu2:
                Toast.makeText(this, "내용2", Toast.LENGTH_SHORT).show();
                //해당 페이지로 이동.
                return true;

            case R.id.menu3:
                Toast.makeText(this, "내용3", Toast.LENGTH_SHORT).show();
                //해당 페이지로 이동.
                return true;

            case R.id.menu4:
                Toast.makeText(this, "내용4", Toast.LENGTH_SHORT).show();
                //해당 페이지로 이동.
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }*/
}