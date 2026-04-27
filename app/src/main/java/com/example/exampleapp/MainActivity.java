package com.example.myfirstapp;  // ✅ پکیج درست

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // یک TextView ساده بساز
        TextView textView = new TextView(this);
        textView.setText("سلام! اولین برنامه من با GitHub Actions");
        textView.setTextSize(24);
        textView.setGravity(android.view.Gravity.CENTER);
        
        setContentView(textView);
    }
}
