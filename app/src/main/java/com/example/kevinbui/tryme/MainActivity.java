package com.example.kevinbui.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View windowView; // Background behind the button
    private Button tryMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowView = findViewById(R.id.windowViewId);

        windowView.setBackgroundColor(Color.RED); // Sets the background color to red
        tryMeButton = (Button) findViewById(R.id.tryMeButton);


    }
}
