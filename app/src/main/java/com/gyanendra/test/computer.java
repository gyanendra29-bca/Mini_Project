package com.gyanendra.test;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class computer extends AppCompatActivity {

    private static int computer = 5000;
    Animation topanim,bottomanim;
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        textView=findViewById(R.id.textView1);
        topanim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        textView.setAnimation(topanim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, computer);
    }
}