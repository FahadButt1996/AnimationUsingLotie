package com.example.mfahad.e_lottie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.text);
        LottieAnimationView animaion = (LottieAnimationView)findViewById(R.id.animation_view);
        animaion.setAnimation("E.json");
        animaion.loop(false);
        animaion.setSpeed(0.3f);
        animaion.playAnimation();
    }
}
