package com.test.deltaind;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.startbutton);
        TextView txt = findViewById(R.id.textView3);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Intent myInt1 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(myInt1);
                Random random = new Random();
                int val = random.nextInt(100-1)+1;
                txt.setText(Integer.toString(val));
            }
        });


    }
}