package com.example.mariamalhugailmidterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttn1=(Button)findViewById(R.id.button);
        Button bttn2=(Button)findViewById(R.id.button2);




            ImageView img=(ImageView)findViewById(R.id.imageView2);
            song =new MediaPlayer();
            x=0;



            song=MediaPlayer.create(this,R.raw.track1);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch(x){
                        case 0:

                            song.start();
                            x=1;
                            break;
                        case 1:
                            song.pause();
                            x=0;

                            break;
                    }}
            });


        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Activity2.class));
            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Activity3.class));
            }
        });



    }
}