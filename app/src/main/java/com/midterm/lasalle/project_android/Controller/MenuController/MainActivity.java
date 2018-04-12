package com.midterm.lasalle.project_android.Controller.MenuController;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.midterm.lasalle.project_android.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnStart, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        btnStart = findViewById(R.id.btnStart);
        btnLogout = findViewById(R.id.btnLogout);

        btnStart.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int btnId = view.getId();

        switch(btnId){
            case R.id.btnStart:
                Intent intent = new Intent(this,MainOptions.class);
                startActivity(intent);
                break;
            case R.id.btnLogout:
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Logout");
                builder.setMessage("Do you want to Logout ??");
                builder.setPositiveButton("Yes.Logout Now!", new DialogInterface.OnClickListener() {
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
