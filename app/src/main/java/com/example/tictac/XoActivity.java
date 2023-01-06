package com.example.tictac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class XoActivity extends AppCompatActivity {
    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;
    Button but7;
    Button but8;
    Button but9;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xo);
        textView=findViewById(R.id.text_1);
        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        but5=findViewById(R.id.but5);
        but6=findViewById(R.id.but6);
        but7=findViewById(R.id.but7);
        but8=findViewById(R.id.but8);
        but9=findViewById(R.id.but9);


    }



    public void checkResult(){
        String res1= but1.getText().toString();
        String res2= but2.getText().toString();
        String res3= but3.getText().toString();
        String res4= but4.getText().toString();
        String res5= but5.getText().toString();
        String res6= but6.getText().toString();
        String res7= but7.getText().toString();
        String res8= but8.getText().toString();
        String res9= but9.getText().toString();

        if(res1=="X"){
            if (res1==res2&&res1==res3||res1==res4&&res1==res7){
                textView.setText("player1 Win");
            }
        }
        else if(res1=="O"){
            if (res1==res2&&res1==res3||res1==res4&&res1==res7){
                textView.setText("player2 Win");
            }
        }
       if(res5=="X"){
            if (res5==res4&&res5==res6||res5==res2&&res5==res8){
                textView.setText("player1 Win");
            }
        }
        else if(res5=="O"){
            if (res5==res4&&res5==res6||res5==res2&&res5==res8){
                textView.setText("player2 Win");
            }
        }
        if(res9=="X"){
            if (res9==res7&&res9==res8||res9==res3&&res9==res6){
                textView.setText("player1 Win");
            }
        }
        else if(res9=="O"){
            if (res9==res7&&res9==res8||res9==res3&&res9==res6){
                textView.setText("player2 Win");
            }
        }
        if(res1=="X"){
            if (res1==res5&&res1==res9){
                textView.setText("player1 Win");
            }
        }
        else if(res1=="O"){
            if (res1==res5&&res1==res5){
                textView.setText("player2 Win");
            }
        }
        if(res3=="X"){
            if (res3==res5&&res3==res7){
                textView.setText("player1 Win");
            }
        }
        else if(res3=="O"){
            if (res3==res5&&res3==res7){
                textView.setText("player2 Win");
            }
        }

    }



    int counter = 0;
    public void onClick(View view) {
        Button onClick = ((Button) view);
        if (counter == 0) {
            onClick.setText("X");
            counter = 1;
        }
        else if (counter == 1) {
            onClick.setText("O");
            counter = 0;
        }
        checkResult();
    }
    public void delete(View view){
        but1.setText("");
        but2.setText("");
        but3.setText("");
        but4.setText("");
        but5.setText("");
        but6.setText("");
        but7.setText("");
        but8.setText("");
        but9.setText("");
        textView.setText("");
        counter=0;
    }

}