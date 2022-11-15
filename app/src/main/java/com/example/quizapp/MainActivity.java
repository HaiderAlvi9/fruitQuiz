package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4;
    ImageView iv;
  int[] images ={R.drawable.ap,R.drawable.av,R.drawable.ba,R.drawable.gr,R.drawable.gv};
    int answer=0;
    String [] a={"apple","avocado","banana","grapes","guava"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.img1);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
         b4=findViewById(R.id.btn4);
         b1.setOnClickListener(this);
        generateRandom();


    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btn1){
          generateRandom();
        }
    }
   public void generateRandom(){

        Random rnd = new Random();
        int var= rnd.nextInt(5);

        b2.setText(a[var]);
      iv.setImageResource(images[var]);

             b4.setText(""+var);

    }

}