package com.alexa.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {
    void numPresionado(String digito){
        TxtVwAnswer.append(digito);
    }

    Button Btn1;
    Button Btn2;
    Button Btn3;
    Button Btn4;
    Button Btn5;
    Button Btn6;
    Button Btn7;
    Button Btn8;
    Button Btn9;
    Button Btn0;
    Button Btndiv;
    Button Btnmult;
    Button BtnPlus;
    Button BtnMenus;
    Button BtnPoint;
    Button BtnClear;
    Button BtnEqual;
    TextView TxtVwAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn1 = (Button) findViewById(R.id.BtnOne);
        Btn2 = (Button) findViewById(R.id.BtnTwo);
        Btn3 = (Button) findViewById(R.id.BtnThree);
        Btn4 = (Button) findViewById(R.id.BtnFour);
        Btn5 = (Button) findViewById(R.id.BtnFive);
        Btn6 = (Button) findViewById(R.id.BtnSix);
        Btn7 = (Button) findViewById(R.id.BtnSeven);
        Btn8 = (Button) findViewById(R.id.BtnEight);
        Btn9 = (Button) findViewById(R.id.BtnNine);
        Btn0 = (Button) findViewById(R.id.BtnCero);
        Btndiv = (Button) findViewById(R.id.BtnDiv);
        Btnmult = (Button) findViewById(R.id.BtnMult);
        BtnPlus = (Button) findViewById(R.id.BtnPlus);
        BtnMenus = (Button) findViewById(R.id.BtnMenus);
        BtnPoint = (Button) findViewById(R.id.BtnPoint);
        BtnClear = (Button) findViewById(R.id.BtnAC);
        BtnEqual = (Button) findViewById(R.id.BtnEqual);
        TxtVwAnswer = (TextView) findViewById(R.id.textView);

        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("0");
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("1");
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("2");
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("3");
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("4");
            }
        });

        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("5");
            }
        });

        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("6");
            }
        });

        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("7");
            }
        });

        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("8");
            }
        });

        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("9");
            }
        });

        BtnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado(".");
            }
        });

        Btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("÷");
            }
        });

        Btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("×");
            }
        });

        BtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("+");
            }
        });

        BtnMenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numPresionado("-");
            }
        });

        BtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TxtVwAnswer.setText("");
            }
        });

        BtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Expression text = new Expression(TxtVwAnswer.getText().toString()
                        .replace("÷", "/")
                        .replace("×", "*"));

                double result = text.calculate();

                TxtVwAnswer.setText(String.valueOf(result));

            }
        });
    }
}