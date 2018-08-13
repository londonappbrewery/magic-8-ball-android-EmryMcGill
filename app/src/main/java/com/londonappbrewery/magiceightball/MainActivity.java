package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String tag = "MainActivity";
        final Button button = (Button) findViewById(R.id.shakeButton);
        final ImageView ballImage = (ImageView) findViewById(R.id.ballImage);
        final int[] ballImages = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Log.d(tag, "button is being pressed");
                Random ranGen = new Random();
                int randomNum = ranGen.nextInt(5);

                ballImage.setImageResource(ballImages[randomNum]);
            }
        });
    }







}
