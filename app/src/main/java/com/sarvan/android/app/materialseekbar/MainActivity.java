package com.sarvan.android.app.materialseekbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sarvan.android.app.materialseekbar.materialseekbar.SwagPoints;

public class MainActivity extends AppCompatActivity {

    SwagPoints swagPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.title);
        toolbar.setTitleTextColor(Color.WHITE);

        swagPoints = (SwagPoints) findViewById(R.id.seekbar_point);

        /*Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                swagPoints.setPoints(56);
            }
        },100);*/

        /*for (int i=1;i<=72;i++){
            *//*Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    swagPoints.setPoints(56);
                }
            },1000);*//*
            try {
                Thread.sleep(1000);
                swagPoints.setPoints(56);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        swagPoints.setPoints(56);
        //startThread();

    }

    float max = 100;
    int update = 0;
    boolean threadRunning = false;;
    private void startThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                threadRunning = true;
                while(update <= max){
                    update += 1;

                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){

                    }
                    /*Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if(update<=88)
                                swagPoints.setPoints(update);
                        }
                    },1000);*/
                }
                threadRunning = false;
            }
        }).start();
    }
}
