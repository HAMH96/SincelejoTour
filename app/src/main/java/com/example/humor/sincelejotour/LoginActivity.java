package com.example.humor.sincelejotour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user,pass;
    Button iniciar,registr;
    String username="",password="",email="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        iniciar = (Button) findViewById(R.id.iniciar);
        registr = (Button) findViewById(R.id.registr);

        //Bundle extras = getIntent().getExtras();
    }

    public void regist(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivityForResult(intent,1);
    }

    public void iniciarSes(View view) {
        String userInput,passInput;
        userInput= user.getText().toString();
        passInput= pass.getText().toString();
        if((userInput.isEmpty())||(passInput.isEmpty())){
            Toast.makeText(getApplicationContext(),R.string.emptyFields,Toast.LENGTH_SHORT).show();
        }
        else {
            // Con Master User
            if((userInput.equals(username))&&(passInput.equals(password))||(((userInput.equals("Y"))&&(passInput.equals("Y"))))){
            // Sin Master User
            //if((userInput.equals(username))&&(passInput.equals(password))){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("email",email);
                startActivityForResult(intent, 2);
                finish();
            }
            else{
                Toast.makeText(getApplicationContext(),R.string.noEquals,Toast.LENGTH_SHORT).show();
            }

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((requestCode == 1)&&(resultCode == RESULT_OK)){
            username = data.getExtras().getString("username");
            password = data.getExtras().getString("password");
            email = data.getExtras().getString("email");
            user.setText(username);
            pass.setText(password);
        }else if((requestCode == 1)&&(resultCode == RESULT_CANCELED)){
            Toast.makeText(getApplicationContext(),R.string.cancelregist,Toast.LENGTH_SHORT).show();
        }else if((requestCode == 2)&&(resultCode == RESULT_CANCELED)){
            Toast.makeText(getApplicationContext(),R.string.sesClosed,Toast.LENGTH_SHORT).show();
        }
    }
}
