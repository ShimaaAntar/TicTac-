package com.example.tictac;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goToScreen();
            }
        }, 2000);
    }
    void goToScreen(){
        Intent intent=new Intent(Splash.this,XoActivity.class);
        startActivity(intent);
        finish();
    }
}
