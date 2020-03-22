package com.example.firstlaba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class FirstActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        Thread toNext = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    Intent intent = new Intent(FirstActivity.this, Million.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                    e.getLocalizedMessage();
                }
            }
        });
        toNext.start();

    }
}
