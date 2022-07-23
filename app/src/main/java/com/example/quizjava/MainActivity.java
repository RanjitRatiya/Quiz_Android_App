package com.example.quizjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizjava.ModelClass.QuestionClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    //set Controls
    TextView tvQueCenter , tvTimer , tvQue;
    Button btOpt1 , btOpt2 , btOpt3 , btOpt4;
    Button submitbtn;

    //list for Que
    ArrayList<QuestionClass> queList = new ArrayList<>();

    int conter=0;

    CountDownTimer tm;

    //Right Answer
    int rightanswer = 0;

    //Text
    TextView personname;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findviewbyIds
        tvQue = findViewById(R.id.tvQue);
        tvQueCenter = findViewById(R.id.tvQueCenter);
        tvTimer = findViewById(R.id.tvTimer);

        btOpt1 = findViewById(R.id.btOpt1);
        btOpt2 = findViewById(R.id.btOpt2);
        btOpt3 = findViewById(R.id.btOpt3);
        btOpt4 = findViewById(R.id.btOpt4);

        personname = findViewById(R.id.pname);

        submitbtn = findViewById(R.id.submitbtn);

        String username = getIntent().getStringExtra("keyname");
        personname.setText(username);



        //load data
        queList.add(new QuestionClass("What is Colour of Apple ?" , "Red" , "Yellow" , "Blue" , "Green" , "Red"));
        queList.add(new QuestionClass("Who is richest man of India ?" , "Anil Ambani" , "Ratan Tata" , "Mukesh Ambani" , "Dilip Sanghvi" , "Mukesh Ambani"));
        queList.add(new QuestionClass("What is capital of India ?" , "Mumbai" , "Ahmedabad" , "Delhi" , "Kolkata" , "Delhi"));
        queList.add(new QuestionClass("Which animal is known as the 'Ship of the Desert" , "Camel" , "Deer" , "Donkey" , "Horse" , "Camel"));
        queList.add(new QuestionClass("How many days are there in a WEEK" , "5-Days" , "6-Days" , "7-Days" , "8-Days" , "7-Days"));
        queList.add(new QuestionClass("How many hours are there in a Day" , "21-Hours" , "22-Hours" , "23-Hours" , "24-Hours" , "24-Hours"));
        queList.add(new QuestionClass("How many letters are there in the English alphabet?" , "32" , "54" , "26" , "28" , "26"));
        queList.add(new QuestionClass("Rainbow consist of how many colors ?" , "5 Colors" , "8 Colors" , "10 Colors" , "7 Colors" , "7 Colors"));
        queList.add(new QuestionClass("How many years are there in a year ?" , "365Days" , "363Days" , "380Days" , "400Days" , "365Days"));
        queList.add(new QuestionClass("What is the capital of Gujarat ?" , "Ahmedabad" , "Ghandhinagar" , "Surat" , "Rajkot" , "Ghandhinagar"));
        queList.add(new QuestionClass("How many minutes are there in an hour ?" , "50" , "60" , "70" , "80" , "60"));
        //init conter
        conter = 0;

        //load ques and ans
        loadQuestion(conter);

        tvTimer.setText("12");
        //CountDown Timer
        tm = new CountDownTimer(12*1000 , 1000)
        {
            @Override
            public void onTick(long millisUntilFinished)
            {
                tvTimer.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish()
            {
                Toast.makeText(MainActivity.this, "Quiz Over", Toast.LENGTH_SHORT).show();
            }
        };
    }

    public void loadQuestion(int n)
    {
        final QuestionClass q = queList.get(n);

        tvQueCenter.setText((n+1) + "/" + queList.size());

        tvTimer.setText("" + 12);

        if (tm != null)
        {
            tm.start();
        }



        tvQue.setText("#" + (n +1) + " " + q.getQue());

        btOpt1.setText("" + q.getOpt1());
        btOpt2.setText("" + q.getOpt2());
        btOpt3.setText("" + q.getOpt3());
        btOpt4.setText("" + q.getOpt4());

        btOpt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (btOpt1.getText().equals(q.getRightOpt()))
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }

                    rightanswer++;
                }
                else
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }
                }

            }
        });

        btOpt2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (btOpt2.getText().equals(q.getRightOpt()))
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }

                    rightanswer++;
                }
                else
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        btOpt3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (btOpt3.getText().equals(q.getRightOpt()))
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }
                    rightanswer++;
                }
                else
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        btOpt4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (btOpt4.getText().equals(q.getRightOpt()))
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }
                    rightanswer++;
                }
                else
                {
                    if (conter < (queList.size() - 1))
                    {
                        tm.cancel();
                        conter++;
                        loadQuestion(conter);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "All Question Completed", Toast.LENGTH_SHORT).show();
                        submitbtn.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        submitbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String username123 = getIntent().getStringExtra("keyname");

                Toast.makeText(MainActivity.this, "Right Answer is : " + rightanswer, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this , ResultActivity.class);
                intent.putExtra("resultquiz" , rightanswer);
                intent.putExtra("keyname" , username123);
                startActivity(intent);
            }
        });
    }
}