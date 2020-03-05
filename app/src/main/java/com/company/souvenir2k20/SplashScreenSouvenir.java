package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenSouvenir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_souvenir);

        ImageView ivLogo = findViewById(R.id.ivLogo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_transition);
        ivLogo.startAnimation(animation);
        final Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//        Thread thread = new Thread(){
//            public void run(){
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//                finally {
//
//                }
//            }
//        }; thread.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 4000);

    }
}
