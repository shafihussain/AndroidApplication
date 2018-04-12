package com.midterm.lasalle.project_android.Controller.TempMetricController;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.midterm.lasalle.project_android.Controller.TempMetricController.Metric.MetricConvert;
import com.midterm.lasalle.project_android.Controller.TempMetricController.Temperature.TemperatureConvert;
import com.midterm.lasalle.project_android.R;

public class TempMetricOptions extends AppCompatActivity implements View.OnClickListener {

    Button btnTmpConvert, btnMetricConvert, btnReturnMainOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_metric_options);
        initialize();
    }

    private void initialize() {

        btnTmpConvert = findViewById(R.id.btnTmpConvert);
        btnMetricConvert = findViewById(R.id.btnMetricConvert);
        btnReturnMainOptions = findViewById(R.id.btnReturnMainOptions);

        btnTmpConvert.setOnClickListener(this);
        btnMetricConvert.setOnClickListener(this);
        btnReturnMainOptions.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

            int btnId = view.getId();

            switch(btnId){
                case R.id.btnTmpConvert:
                    Intent intent = new Intent(this,TemperatureConvert.class);
                    startActivity(intent);
                    break;
                case R.id.btnMetricConvert:
                    intent = new Intent(this,MetricConvert.class);
                    startActivity(intent);
                    break;
                case R.id.btnReturnMainOptions:
                    final AlertDialog.Builder builder = new AlertDialog.Builder(TempMetricOptions.this);
                    builder.setTitle("Return");
                    builder.setMessage("Do you want to return to main menu?");
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
