package com.midterm.lasalle.project_android.Controller.GroceryListController;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.midterm.lasalle.project_android.R;

public class AddGrocery extends AppCompatActivity implements View.OnClickListener{

    Button btnAdd;
    EditText editTextAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_grocery);
        Initialize();
    }

    private void Initialize() {
        btnAdd = findViewById(R.id.btnAdd);
        editTextAdd = findViewById(R.id.editTextAdd);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
