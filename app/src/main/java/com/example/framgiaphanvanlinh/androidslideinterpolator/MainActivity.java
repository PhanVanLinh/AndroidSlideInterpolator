package com.example.framgiaphanvanlinh.androidslideinterpolator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    View view1;
    View view2;
    View view3;
    View view4;
    View view5;
    View view6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = findViewById(R.id.view_1);
        view2 = findViewById(R.id.view_2);
        view3 = findViewById(R.id.view_3);
        view4 = findViewById(R.id.view_4);
        view5 = findViewById(R.id.view_5);
        view6 = findViewById(R.id.view_6);

        findViewById(R.id.button_animate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation slideQuad = AnimationUtils.loadAnimation(MainActivity.this,
                        R.anim.slide_down_decelerate_quad);
                Animation slideCubic = AnimationUtils.loadAnimation(MainActivity.this,
                        R.anim.slide_down_decelerate_cubic);
                Animation slideQuint = AnimationUtils.loadAnimation(MainActivity.this,
                        R.anim.slide_down_decelerate_quint);
                Animation slideAccelerateDecelerate =
                        AnimationUtils.loadAnimation(MainActivity.this,
                                R.anim.slide_down_accelerate_decelerate);
                Animation slideLinear = AnimationUtils.loadAnimation(MainActivity.this,
                        R.anim.slide_down_linear);
                Animation slideCustom = AnimationUtils.loadAnimation(MainActivity.this,
                        R.anim.slide_down_decelerate_custom);

//                int delay = (int) (slideQuad.getDuration() / 5);
//                final Timer timer = new Timer();
//                timer.schedule(new TimerTask() {
//                    int count = 0;
//                    @Override
//                    public void run() {
//
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                count++;
//                                if (count ==3) {
//                                    Log.i("Timer", "");
//                                }
//                                Log.i("Timer", "run" + count);
//                            }
//                        });
//                    }
//                }, delay, delay);

                view1.startAnimation(slideQuad);
                view2.startAnimation(slideCubic);
                view3.startAnimation(slideQuint);
                view4.startAnimation(slideAccelerateDecelerate);
                view5.startAnimation(slideLinear);
                view6.startAnimation(slideCustom);
            }
        });
    }
}
