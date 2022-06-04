package com.test.deltaind;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    TextView ans1, ans2, ans3, ans4, ans5;
    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
    ArrayList<TextView> textRandomNumbers = new ArrayList<TextView>();


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textRandomNumbers.add(findViewById(R.id.textView3));
        textRandomNumbers.add(findViewById(R.id.textView4));
        textRandomNumbers.add(findViewById(R.id.textView5));
        textRandomNumbers.add(findViewById(R.id.textView6));
        textRandomNumbers.add(findViewById(R.id.textView7));
        textRandomNumbers.add(findViewById(R.id.textView8));
        textRandomNumbers.add(findViewById(R.id.textView9));
        textRandomNumbers.add(findViewById(R.id.textView10));
        textRandomNumbers.add(findViewById(R.id.textView11));
        textRandomNumbers.add(findViewById(R.id.textView12));

        setRandomNumbers();

        //picking operands for equations
        Random r = new Random();
        int firstInt = r.nextInt(5);
        int secondInt = firstInt + 5;
        int val1 = randomNumbers.get(firstInt);
        int val2 = randomNumbers.get(secondInt);

        firstInt = (firstInt + 1) % 5;
        secondInt = firstInt + 5;
        int val3 = randomNumbers.get(firstInt);
        int val4 = randomNumbers.get(secondInt);

        firstInt = (firstInt + 1) % 5;
        secondInt = firstInt + 5;
        int val5 = randomNumbers.get(firstInt);
        int val6 = randomNumbers.get(secondInt);

        firstInt = (firstInt + 1) % 5;
        secondInt = firstInt + 5;
        int val7 = randomNumbers.get(firstInt);
        int val8 = randomNumbers.get(secondInt);

        firstInt = (firstInt + 1) % 5;
        secondInt = firstInt + 5;
        int val9 = randomNumbers.get(firstInt);
        int val10 = randomNumbers.get(secondInt);

        ans1 = findViewById(R.id.textView13);
        ans2 = findViewById(R.id.textView14);
        ans3 = findViewById(R.id.textView15);
        ans4 = findViewById(R.id.textView16);
        ans5 = findViewById(R.id.textView17);

        ans1.setText(Integer.toString(val1+val2));
        ans2.setText(Integer.toString(Math.abs(val3-val4)));
        ans3.setText(Integer.toString(val5*val6));
        ans4.setText(Integer.toString(val7/val8));
        ans5.setText(Integer.toString(val9+val10));

        Button btn = findViewById(R.id.backbutton);
        Button submitBtn = findViewById(R.id.submitButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(myInt);



            }

        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });



    }

    @SuppressLint("SetTextI18n")
    private void setRandomNumbers() {
        Random random = new Random();
        randomNumbers.clear();
        for(int i=0; i<10; i++) {
            randomNumbers.add(random.nextInt(100-1)+1);
            textRandomNumbers.get(i).setText(Integer.toString(randomNumbers.get(i)));


        }

    }
}