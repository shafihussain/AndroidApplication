package com.midterm.lasalle.project_android.Controller.TempMetricController.Metric;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.midterm.lasalle.project_android.R;

public class MetricConvert extends AppCompatActivity implements View.OnClickListener{

    EditText editTextMeter, editTextKm, editTextCm;
    Button btnConvert, btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metric_convert);
        initialize();
    }

    private void initialize() {

        editTextMeter = findViewById(R.id.editTextMeter);
        editTextKm = findViewById(R.id.editTextKm);
        editTextCm = findViewById(R.id.editTextCm);

        btnConvert = findViewById(R.id.btnConvert);
        btnReturn = findViewById(R.id.btnReturn);

        btnConvert.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int btnId = view.getId();

        switch(btnId){

            case R.id.btnConvert:
                break;
            case R.id.btnReturn:
                final AlertDialog.Builder builder = new AlertDialog.Builder(MetricConvert.this);
                builder.setTitle("Return");
                builder.setMessage("Do you want to return to previous page ?");
                builder.setPositiveButton("Yes.Return Now!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("Not now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
                break;
        }

    }
}
