package com.midterm.lasalle.project_android.Controller.CalculatorController;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.midterm.lasalle.project_android.R;

import java.util.Random;

import Model.Numbers;

public class CalculatorGame extends AppCompatActivity implements View.OnClickListener{

    ImageButton btnStart,btnValidate;
    ImageView imageViewOp1, imageViewOperator, imageViewOp2, imageViewState;
    EditText editTextResult;

    int digits[]={R.drawable.zero,R.drawable.one,R.drawable.two,
            R.drawable.three,R.drawable.four,R.drawable.five,
            R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine};

    int operatorArray[]={R.drawable.add,R.drawable.minus,R.drawable.multiplication,R.drawable.division};

    int operand1,operand2;
    int operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_game);
        initialize();

    }
    private void initialize() {

        imageViewOp1 = findViewById(R.id.imageViewOp1);
        imageViewOp2 = findViewById(R.id.imageViewOp2);
        imageViewOperator = findViewById(R.id.imageViewOperator);
        imageViewState = findViewById(R.id.imageViewState);
        editTextResult = findViewById(R.id.editTextNumber);

        btnStart = findViewById(R.id.btnStart);
        btnValidate = findViewById(R.id.btnValidate);
        btnStart.setOnClickListener(this);
        btnValidate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnStart :

                editTextResult.setEnabled(false);
                displayRandomOperation();
                break;

            case R.id.btnValidate :

                doValidate();

                break;
        }

    }

    private void displayRandomOperation() {

        CountDownTimer countDownTimer = new CountDownTimer(3000,500) {

            Random random = new Random();

            @Override
            public void onTick(long millisUntilFinished) {

                operand1 = random.nextInt(10);
                imageViewOp1.setImageResource(digits[operand1]);

                operand2 = random.nextInt(10);
                imageViewOp2.setImageResource(digits[operand2]);

                operator = random.nextInt(3);
                imageViewOperator.setImageResource(operatorArray[operator]);

            }

            @Override
            public void onFinish() {

                editTextResult.setEnabled(true);
            }
        };
        countDownTimer.start();

    }

    private void doValidate() {

        int userResult = Integer.valueOf(editTextResult.getText().toString());

        Numbers aNumber = new Numbers(operand1,operand2,operator);
        if (userResult==aNumber.getResult())
            imageViewState.setImageResource(R.drawable.check);
        else
            imageViewState.setImageResource(R.drawable.incorrect);


    }
}
