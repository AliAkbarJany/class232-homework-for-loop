package com.rafsan.class232homeworkforloop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumOfSeries extends AppCompatActivity {


    EditText editSeriesSum;
    Button buttonSumOfSeries;
    TextView textViewSeries,textViewSumSeries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_of_series);


        editSeriesSum = findViewById(R.id.editSeriesSum);
        buttonSumOfSeries = findViewById(R.id.buttonSumOfSeries);
        textViewSeries = findViewById(R.id.textViewSeries);
        textViewSumSeries = findViewById(R.id.textViewSumSeries);

        buttonSumOfSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String myString = editSeriesSum.getText().toString();

                if ( myString.length() >0  ){

                    int my_Series = Integer.parseInt(myString);

                    int seriesNum = 9;

                    long sum_of_series = 9;

                    textViewSeries.setText("");

                    textViewSeries.append(""+seriesNum+"\n");


                    for ( int series=1; series < my_Series; series++ ){

                            seriesNum = seriesNum * 10 +9;
                            textViewSeries.append(""+seriesNum+"\n");

                        sum_of_series = sum_of_series + seriesNum;
                        textViewSumSeries.setText("Sum of Series = "+sum_of_series);


                    }




                }

            }
        });

    }
}