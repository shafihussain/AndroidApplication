package com.midterm.lasalle.project_android.Controller.TempMetricController.Temperature;

import android.content.DialogInterface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.midterm.lasalle.project_android.R;

import java.util.Locale;

public class TemperatureConvert extends AppCompatActivity implements View.OnClickListener{

        TextView tempC, tempF;

        SeekBar seekBar;

        double c, f;

        Button btnReturn;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_convert);
        initialize();
    }

    private void initialize() {
        tempC = (TextView) findViewById(R.id.tempC);
        tempF = (TextView) findViewById(R.id.tempF);

        seekBar = (SeekBar) findViewById(R.id.seekBar);

        btnReturn = findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(this);

        seekBar.setMax(400);
        seekBar.setProgress(200);

        c = seekBar.getProgress() - 200;
        f = c * 1.8 + 32;

        tempC.setText(String.format(Locale.getDefault(), "0.1f C", c));
        tempF.setText(String.format(Locale.getDefault(), "0.1f F", f));

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                c = progress - 200;
                f = c * 1.8 + 32;

                tempC.setText(String.format(Locale.getDefault(), "0.1f", c));
                tempF.setText(String.format(Locale.getDefault(), "0.1f", f));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    @Override
    public void onClick(View view) {

        int btnId = view.getId();

        switch(btnId){
            case R.id.btnConvert :
                break;
            case R.id.btnReturn:
                final AlertDialog.Builder builder = new AlertDialog.Builder(TemperatureConvert.this);
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
