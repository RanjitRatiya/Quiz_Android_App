package com.example.quizjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity
{
    TextView nameperson , resultmark;
    Button startAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        nameperson = findViewById(R.id.nameperson);
        startAgain = findViewById(R.id.startagain);
        resultmark = findViewById(R.id.resultmark);

        //Fetch the name of User
        String username = getIntent().getStringExtra("keyname");
        nameperson.setText(username);

        //Fetch the Marks of the User
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("resultquiz", 0);
        resultmark.setText("Your marks : " + intValue);


        //OnclickListener to start the Quiz game again
        startAgain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(ResultActivity.this , HomeActivity.class);
                startActivity(i);
            }
        });
    }
}