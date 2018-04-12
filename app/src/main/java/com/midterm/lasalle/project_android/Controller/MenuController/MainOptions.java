package com.midterm.lasalle.project_android.Controller.MenuController;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.midterm.lasalle.project_android.Controller.CalculatorController.CalculatorGame;
import com.midterm.lasalle.project_android.Controller.DaycareController.DaycareSchedule;
import com.midterm.lasalle.project_android.Controller.GroceryListController.GroceryList;
import com.midterm.lasalle.project_android.Controller.TempMetricController.TempMetricOptions;
import com.midterm.lasalle.project_android.R;

public class MainOptions extends AppCompatActivity implements View.OnClickListener{

    Button btnTempMetric, btnCalculation, btnDaycareMenu, btnGroceryList, btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_options);
        initialize();
    }

    private void initialize() {
        btnTempMetric = findViewById(R.id.btnTempMetric);
        btnCalculation = findViewById(R.id.btnCalculation);
        btnDaycareMenu = findViewById(R.id.btnDaycareMenu);
        btnGroceryList = findViewById(R.id.btnGroceryList);
        btnReturn = findViewById(R.id.btnReturn);

        btnTempMetric.setOnClickListener(this);
        btnCalculation.setOnClickListener(this);
        btnDaycareMenu.setOnClickListener(this);
        btnGroceryList.setOnClickListener(this);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int btnId = view.getId();


        switch(btnId){
            case R.id.btnTempMetric:
                Intent intent = new Intent(this,TempMetricOptions.class);
                startActivity(intent);
                break;
            case R.id.btnCalculation:
                intent = new Intent(this,CalculatorGame.class);
                startActivity(intent);
                break;
            case R.id.btnDaycareMenu:
                intent = new Intent(this,DaycareSchedule.class);
                startActivity(intent);
                break;
            case R.id.btnGroceryList:
                intent = new Intent(this,GroceryList.class);
                startActivity(intent);
                break;
            case R.id.btnReturn:
                //Button Exit Application
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainOptions.this);
                builder.setTitle("Return");
                builder.setMessage("Do you want to return to welcome page ?");
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
