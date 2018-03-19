package com.neisha.imagerecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class WelComeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel_come);
        findViewById(R.id.button).setOnClickListener(v ->
                startActivity(new Intent(WelComeActivity.this, MainActivity.class)));
        findViewById(R.id.button2).setOnClickListener(v ->
                startActivity(new Intent(WelComeActivity.this, SecondActivity.class)));

        findViewById(R.id.button3).setOnClickListener(v ->
                startActivity(new Intent(WelComeActivity.this, ThirdActivity.class)));
    }
}
