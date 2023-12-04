package com.rafsan.class232homeworkforloop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editSquare;
    Button buttonSquare,button_EVEN_Sum,buttonAnotherActivity,buttonGoToPalindrome;
    TextView textViewSquare,textShowEven,textSum_of_Even,textViewSumSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editSquare = findViewById(R.id.editSquare);
        buttonSquare = findViewById(R.id.buttonSquare);
        textViewSquare = findViewById(R.id.textViewSquare);
        textViewSumSquare = findViewById(R.id.textViewSumSquare);

        button_EVEN_Sum = findViewById(R.id.button_EVEN_Sum);
        textShowEven = findViewById(R.id.textShowEven);
        textSum_of_Even = findViewById(R.id.textSum_of_Even);

        buttonAnotherActivity = findViewById(R.id.buttonAnotherActivity);
        buttonGoToPalindrome = findViewById(R.id.buttonGoToPalindrome);


        //===================== SQUARE calculation =====================
        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String my_string = editSquare.getText().toString();

                if (my_string.length() > 0){

                    int my_int_number = Integer.parseInt(my_string);

                    int sum_of_square=0;

                    textViewSquare.setText("");

                    for (int x = 1; x<= my_int_number; x++){

                        int my_square = x*x;

                        sum_of_square = sum_of_square + my_square;

                        textViewSquare.append(", "+my_square);
                        textViewSumSquare.setText("sum of square = "+sum_of_square);


                    }

                }
            }
        });

        //==================================================================


        button_EVEN_Sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum_of_even = 0;
                for (int x = 2; x <= 5*2; x+=2){

                    sum_of_even = sum_of_even+ x;
                    textShowEven.append(" "+x);

                }
                textSum_of_Even.setText(""+sum_of_even);

            }
        });



        //==================================================================

        //=================== GO to another Activity=====================

        buttonAnotherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent= new Intent(MainActivity.this, SumOfSeries.class);
                startActivity(myIntent);

            }
        });

        //==================== Palindrome====================

        buttonGoToPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Palindrome.class);
                startActivity(myIntent);

            }
        });


    }
}