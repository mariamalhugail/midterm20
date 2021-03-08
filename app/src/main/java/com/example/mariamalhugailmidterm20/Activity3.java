package com.example.mariamalhugailmidterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Button bttn5 = (Button) findViewById(R.id.button3);
        Button bttn6 = (Button) findViewById(R.id.button4);
        ImageView img = (ImageView) findViewById(R.id.imageView);


        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this, MainActivity.class));
            }
        });
        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this, Activity2.class));
            }
        });

        String[] items = {"pic", "item2", "item3", "item4"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_3, R.id.textView2, items));
    }

    protected void onListItemClick(ListView l, View view, int position, long id) {
        super.onListItemClick(l, view, position, id);
        switch (position) {
            case 0:
                startActivity(new Intent(Activity3.this, img.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://chocolatharlem.com/")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://chocolatharlem.com/")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://chocolatharlem.com/")));
        }

    }
}













    }
}