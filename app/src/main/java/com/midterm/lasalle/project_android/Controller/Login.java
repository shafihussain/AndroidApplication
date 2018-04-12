package com.midterm.lasalle.project_android.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.midterm.lasalle.project_android.Controller.MenuController.MainActivity;
import com.midterm.lasalle.project_android.R;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button btnLogin, btnLearnMore;
    EditText editTextUsername, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    private void initialize() {
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLearnMore = findViewById(R.id.btnLearnMore);

        btnLogin.setOnClickListener(this);
        btnLearnMore.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch(id){
            case R.id.btnLogin:
                if(editTextUsername.getText().toString().equals("username") &&
                    editTextPassword.getText().toString().equals("password")){
                Toast.makeText(getApplicationContext(), " Login Successful! ",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                }
                else{
                Toast.makeText(getApplicationContext(), " Wrong Username or Password, Please try again. ",
                        Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnLearnMore:
                startActivity(new Intent(Login.this, LearnMore.class));
                break;
        }


    }
}
