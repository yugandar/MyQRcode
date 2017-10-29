package com.example.goa.myqrcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t=new Thread()
        {

            public void run()
            {

                try {

                    sleep(2000);
                    finish();
                    Intent cv=new Intent(SplashActivity.this,LoginActivity.class/*otherclass*/);
                    startActivity(cv);
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
