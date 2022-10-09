package com.example.myapplication_1;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer a = 0;
    String op;
    String result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onTestClick(View view) {
        TextView out = (TextView) findViewById(R.id.output);
        switch (view.getId()) {
            case R.id.one:
                out.setText(out.getText() + "1");
                break;
            case R.id.two:
                out.setText(out.getText() + "2");
                break;
            case R.id.three:
                out.setText(out.getText() + "3");
                break;
            case R.id.four:
                out.setText(out.getText() + "4");
                break;
            case R.id.five:
                out.setText(out.getText() + "5");
                break;
            case R.id.six:
                out.setText(out.getText() + "6");
                break;
            case R.id.seven:
                out.setText(out.getText() + "7");
                break;
            case R.id.eight:
                out.setText(out.getText() + "8");
                break;
            case R.id.nine:
                out.setText(out.getText() + "9");
                break;
            case R.id.zero:
                out.setText(out.getText() + "0");
                break;
        }
    }
    public void operation(View view) {
        TextView out = (TextView) findViewById(R.id.output);
        switch (view.getId()) {
            case R.id.plus:
                a = Integer.valueOf(String.valueOf(out.getText()));
                out.setText("");
                op = "+";
                break;
            case R.id.minus:
                a = Integer.valueOf(String.valueOf(out.getText()));
                out.setText("");
                op = "-";
                break;
            case R.id.multiply:
                a = Integer.valueOf(String.valueOf(out.getText()));
                out.setText("");
                op = "*";
                break;
            case R.id.divide:
                a = Integer.valueOf(String.valueOf(out.getText()));
                out.setText("");
                op = "/";
                break;
        }
    }
    public void ClickQe(View view) {
        TextView out = (TextView) findViewById(R.id.output);
        Integer b = Integer.valueOf(String.valueOf(out.getText()));
        switch (op) {
            case "-":
                result = String.valueOf(a - b);
                break;
            case "+":
                result = String.valueOf(a + b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case "/":
                result = String.valueOf(a / b);
                break;
            }
        switch (view.getId()) {
            case R.id.qe: {
                out.setText(String.valueOf(result));
                break;
            }
        }
    }
}










