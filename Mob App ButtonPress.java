package com.example.mobapph05_swapperchecker_prefi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class ButtonPress extends AppCompatActivity {
       @Override     protected void onCreate(Bundle savedInstanceState) {         super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_button_press);//initialize layout file
           String s1;
           TextView tv;
           tv = findViewById(R.id.tvName);
        s1 = getIntent().getExtras().getString("id");
        tv.setText(s1);
       }
}

