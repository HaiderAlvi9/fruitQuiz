package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4;
    ImageView iv;
    TextView textView;
    int rightCount,wrongCount;
    int oriAns;
  int[] images ={R.drawable.img1,
          R.drawable.img2,
          R.drawable.img3,
          R.drawable.img4,
          R.drawable.img5,
          R.drawable.img6,
          R.drawable.img7,
          R.drawable.img8,
          R.drawable.img9
         };

    String [] a={"apple","oranges","grapes","guava","banana",
            "mango","melon","water melon","strawberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= findViewById(R.id.img);
        b1= findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        textView=findViewById(R.id.textView1);
         b4=findViewById(R.id.btn4);
         b1.setOnClickListener(this);
         b2.setOnClickListener(this);
         b3.setOnClickListener(this);
        generateRandom();


    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btn1){
          String btnText=b1.getText().toString();
          if(btnText.equals(a[oriAns])){
              b4.setText("Awesome");
              b4.setBackgroundColor(getResources().getColor(R.color.green));
                   rightCount++;
          }
          else{
              b4.setText("OOPs");
              b4.setBackgroundColor(getResources().getColor(R.color.red));
              wrongCount++;
          }
        }
        if (view.getId()==R.id.btn2){
            String btnText=b2.getText().toString();
            if(btnText.equals(a[oriAns])){
                b4.setText("Awesome");
                b4.setBackgroundColor(getResources().getColor(R.color.green));
                rightCount++;
            }
            else{
                b4.setText("OOPs");
                b4.setBackgroundColor(getResources().getColor(R.color.red));
                wrongCount++;
            }
        }
        if (view.getId()==R.id.btn3){
            String btnText=b3.getText().toString();
            if(btnText.equals(a[oriAns])){
                b4.setText("Awesome");
                b4.setBackgroundColor(getResources().getColor(R.color.green));
                rightCount++;
            }
            else{
                b4.setText("OOPs");
                b4.setBackgroundColor(getResources().getColor(R.color.red));
            wrongCount++;
            }
        }
        textView.setText("Right " + rightCount + "\nWrong " + wrongCount);
        generateRandom();
    }
   public void generateRandom(){

        Random rand = new Random();
         oriAns= rand.nextInt(images.length);
        int w_ans1;
        int w_ans2;
        while(true){
            int r=rand.nextInt(images.length);
            if(r!=oriAns){
                w_ans1=r;
                break;
            }
        }
       while(true){
           int r=rand.nextInt(images.length);
           if(r!=oriAns && r!=w_ans1){
               w_ans2=r;
               break;
           }
       }
        int r_btn=rand.nextInt(3);
       switch (r_btn){
           case 0:
               b1.setText(a[oriAns]);
               b2.setText(a[w_ans1]);
               b3.setText(a[w_ans2]);
               break;
           case 1:
               b1.setText(a[w_ans1]);
               b2.setText(a[oriAns]);
               b3.setText(a[w_ans2]);
               break;
           case 2:
               b1.setText(a[w_ans2]);
               b2.setText(a[w_ans1]);
               b3.setText(a[oriAns]);
               break;
       }
      iv.setImageResource(images[oriAns]);





    }

}