package com.example.mariamalhugailmidterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String strgName;
        int birthDate;
        String gender;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);
            Button bttn3=(Button)findViewById(R.id.button3);
            Button bttn4=(Button)findViewById(R.id.button4);
            Button bttnSubmit=(Button)findViewById(R.id.submitbttn);

            EditText name=(EditText)findViewById(R.id.editTextTextPersonName);
            EditText birth=(EditText)findViewById(R.id.editTextNumber);
            RadioButton radButtonMale=(RadioButton)findViewById(R.id.radioButton);
            RadioButton radButtonFemale=(RadioButton)findViewById(R.id.radioButton2);
            RadioButton radButtons=(RadioButton)findViewById(R.id.radioButton3);
            RadioButton radButtonp=(RadioButton)findViewById(R.id.radioButton4);
            TextView rslt=(TextView)findViewById(R.id.result);

            bttnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    strgName=name.getText().toString();
                    birthDate=Integer.parseInt(birth.getText().toString());


                    if(radButtonFemale.isChecked())
                        gender="Mrs.";
                    else if (radButtonMale.isChecked())
                        gender="Mr.";

                    }

            });


            bttn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Activity2.this,MainActivity.class));
                }
            });
            bttn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Activity2.this,Activity3.class));
                }
            });
        }
    }





    }
}