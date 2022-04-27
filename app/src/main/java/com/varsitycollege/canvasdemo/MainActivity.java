package com.varsitycollege.canvasdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MyView myView;
    Button Left, Right, Up, Down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(new MyView(this));
        myView = (MyView)findViewById(R.id.my_view);
        Left = findViewById(R.id.left_btn);
        Right = findViewById(R.id.right_btn);
        Up = findViewById(R.id.up_btn);
        Down = findViewById(R.id.down_btn);

        Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                myView.check = true;
                myView.left = true;
                myView.right = false;
                myView.up = false;
                myView.down = false;
                myView.invalidate();
            }
        });

        Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                myView.check = true;
                myView.left = false;
                myView.right = true;
                myView.up = false;
                myView.down = false;
                myView.invalidate();
            }
        });

        Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                myView.check = true;
                myView.left = false;
                myView.right = false;
                myView.up = true;
                myView.down = false;
                myView.invalidate();
            }
        });

        Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                myView.check = true;
                myView.left = false;
                myView.right = false;
                myView.up = false;
                myView.down = true;
                myView.invalidate();
            }
        });

    }

}