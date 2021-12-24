package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String firstNumText;
    private String secondNumText;
    private int num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNum = (EditText) findViewById(R.id.first_view);
        EditText secondNum = (EditText) findViewById(R.id.second_view);
        TextView result = (TextView) findViewById(R.id.result);


        Button addBtn = (Button) findViewById(R.id.add);
        Button subtarctBtn = (Button) findViewById(R.id.subtract);



        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumText = firstNum.getText().toString();
                System.out.println("First num text : " + firstNumText);
                secondNumText = secondNum.getText().toString();
                System.out.println("Second num Text : " + secondNumText);

                num1 = Integer.parseInt(firstNumText);
                System.out.println("num 1 : " + num1);
                num2 = Integer.parseInt(secondNumText);
                System.out.println("num 2 : " + num2);
                res = sum(num1, num2);
                result.setText(Integer.toString(res));
            }
        });
        subtarctBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumText = firstNum.getText().toString();
                System.out.println("First num text : " + firstNumText);
                secondNumText = secondNum.getText().toString();
                System.out.println("Second num Text : " + secondNumText);

                num1 = Integer.parseInt(firstNumText);
                System.out.println("num 1 : " + num1);
                num2 = Integer.parseInt(secondNumText);
                System.out.println("num 2 : " + num2);
                res = subtract(num1, num2);

                result.setText(Integer.toString(res));
            }
        });

    }

    private int sum(int a, int b) {
        return a + b;
    }
    private int subtract(int a, int b) {
        return a - b;
    }
    private String fun(int j) {
        String s = "";
        for(int i = 0; i < j; i++) {
            s += Integer.toString(i);
        }
        return s;
    }

}