package com.sheygam.java_23_20_03_19_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String arg1="", arg2 = "", oper;
    TextView resultTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button oneBtn = findViewById(R.id.one_btn);
        Button twoBtn = findViewById(R.id.two_btn);
        Button equalBtn = findViewById(R.id.equal_btn);
        Button plusBtn = findViewById(R.id.plus_btn);
        resultTxt = findViewById(R.id.result_txt);

        oneBtn.setOnClickListener(this);
        twoBtn.setOnClickListener(this);
        equalBtn.setOnClickListener(this);
        plusBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one_btn:
                if(oper == null){
                   arg1 += "1";
                    resultTxt.setText(arg1);
                }else{
                    arg2 += "1";
                    resultTxt.setText(arg2);
                }

                break;
            case R.id.two_btn:
                if(oper == null){
                    arg1 += "2";
                    resultTxt.setText(arg1);
                }else{
                    arg2 += "2";
                    resultTxt.setText(arg2);
                }
                break;
            case R.id.equal_btn:
                int a = Integer.parseInt(arg1);
                int b = Integer.parseInt(arg2);
                int res = calc(a,b,oper);
                resultTxt.setText(String.valueOf(res));
                arg1 = "";
                arg2 = "";
                oper = null;
                break;
            case R.id.plus_btn:
                oper = "+";
                break;
        }
    }

    private int calc(int a, int b, String oper) {
        int res = 0;
        switch (oper){
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
        }
        return res;
    }
}
