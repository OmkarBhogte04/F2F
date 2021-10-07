package com.example.f2ffattofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);



        button1 = findViewById(R.id.start1);
        button2 = findViewById(R.id.start2);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);

            }
        });





    }



    public void beforage18(View view) {

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);



    }

    public void afterage18(View view) {


        Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(MainActivity.this,foodActivity.class);
        startActivity(intent);



    }
}