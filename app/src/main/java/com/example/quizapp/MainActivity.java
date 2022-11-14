package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button b1;
    ImageView iv;
    boolean flag;
    int[] images ={R.drawable.ap,R.drawable.ba,R.drawable.gr,R.drawable.gv
    };
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.img1);
        b1=findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[i]);
                i++;
                if(i==4)
                    i=0;
            }
        });

    }
}