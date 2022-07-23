package com.example.quizjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
{
    Button startbtn;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        startbtn = findViewById(R.id.btn_start);
        username = findViewById(R.id.et_name);

        String uname = username.getText().toString();

        startbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (username.getText().toString().isEmpty())
                {
                    Toast.makeText(HomeActivity.this, "Please Enter the Name...", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String personname = username.getText().toString();

                    Intent intent = new Intent(HomeActivity.this , MainActivity.class);
                    intent.putExtra("keyname" , personname);
                    startActivity(intent);
                }
            }
        });
    }
}