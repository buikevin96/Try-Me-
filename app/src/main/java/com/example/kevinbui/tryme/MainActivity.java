package com.example.kevinbui.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView; // Background behind the button
    private Button tryMeButton;
    private int[] colors; // Array of colors

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.BLUE, Color.BLACK, Color.DKGRAY,
        Color.LTGRAY, Color.MAGENTA, Color.YELLOW, Color.WHITE};

        windowView = findViewById(R.id.windowViewId); // Connect window to ID
        windowView.setBackgroundColor(colors[2]);

        tryMeButton = (Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic that will be called when button is tapped
                int colorArrayLength = colors.length;

                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);

                windowView.setBackgroundColor(colors[randomNum]); // Set background to color array

                Log.d("Random", String.valueOf(randomNum));
            }
        });


    }
}
