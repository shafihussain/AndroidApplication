package com.midterm.lasalle.project_android.Controller.DaycareController;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.midterm.lasalle.project_android.R;

public class ModifyDaycareSchedule extends AppCompatActivity implements View.OnClickListener{

    EditText editTextMeal;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_daycare_schedule);
        initialize();
    }

    private void initialize() {
        editTextMeal = findViewById(R.id.editTextMeal);
        btnResult = findViewById(R.id.btnReturn);

        btnResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();
        if (!editTextMeal.getText().toString().isEmpty()){
            intent.putExtra("tag", editTextMeal.getText().toString());
            setResult(RESULT_OK, intent);
        }
        else
            setResult(RESULT_CANCELED, intent);
        finish();


    }
}
