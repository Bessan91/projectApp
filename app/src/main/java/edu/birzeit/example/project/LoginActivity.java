package edu.birzeit.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
private Button buttonLogin;
private EditText editemail;
private  EditText editpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editemail=findViewById(R.id.email);
        editpass=findViewById(R.id.editpass);


    }

    public void btnLogin(View view) {
        String dataEmail = editemail.getText().toString();
        String dataPass = editpass.getText().toString();
        if (((!dataEmail.isEmpty()) && (!dataPass.isEmpty()))) {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(LoginActivity.this, testActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 100);
        }

    if (((dataEmail.isEmpty())&&(dataPass.isEmpty())))

    {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent2 = new Intent(LoginActivity.this, LoginActivity.class);
                startActivity(intent2);
                finish();
            }
        }, 1000);
    }
    }

}