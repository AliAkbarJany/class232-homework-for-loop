package com.rafsan.class232homeworkforloop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Palindrome extends AppCompatActivity {


    EditText editPalindrome;
    Button buttonPalindrome;
    TextView textPalindrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        buttonPalindrome = findViewById(R.id.buttonPalindrome);
        textPalindrome = findViewById(R.id.textPalindrome);
        editPalindrome = findViewById(R.id.editPalindrome);

        buttonPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = editPalindrome.getText().toString();

                if ( s1.length() >0 ){

                    StringBuffer sb = new StringBuffer(s1);

                    String s2 = sb.reverse().toString();

                    if (s1.equals(s2)){
                        textPalindrome.setText(""+s1+" is palindrome");
                    }
                    else{
                        textPalindrome.setText(""+s1+" is NOT palindrome");
                    }

                }

                else{
                    textPalindrome.setText("PLease, enter any WORD");
                }



            }
        });

    }
}