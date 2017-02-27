package com.android.vik.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    RadioButton radioFlag, radioColor;
    EditText countryEditText;
    CheckBox checkBoxOne, checkBoxTwo, checkBoxThree, checkBoxOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioFlag = (RadioButton) findViewById(R.id.radio_solution);
        countryEditText = (EditText) findViewById(R.id.editText_solution);
        checkBoxOne = (CheckBox) findViewById(R.id.checkbox_solution_first);
        checkBoxTwo = (CheckBox) findViewById(R.id.checkbox_solution_second);
        checkBoxThree = (CheckBox) findViewById(R.id.checkbox_solution_third);
        checkBoxOther = (CheckBox) findViewById(R.id.checkbox_another);
        radioColor = (RadioButton) findViewById(R.id.second_radio_solution);

    }

    public void checkScore(View v){

        if (radioFlag.isChecked())
            score += 1;
        if (countryEditText.getText().toString().equals("Russia") || countryEditText.getText().toString().equals("russia"))
            score += 1;
        if (checkBoxOne.isChecked() && checkBoxTwo.isChecked() && checkBoxThree.isChecked() && !checkBoxOther.isChecked())
            score += 1;
        if (radioColor.isChecked())
            score += 1;

        Toast.makeText(getApplicationContext(), String.valueOf(score), Toast.LENGTH_SHORT).show();

        score = 0;
    }
}
