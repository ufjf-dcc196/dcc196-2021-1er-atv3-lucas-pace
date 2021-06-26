package br.ufjf.dcc196.lucaspace.com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private Double input1D;
    private Double input2D;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView saida = findViewById(R.id.labelinput1);
        //saida.setText("Bem vindo");
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);


        result = findViewById(R.id.result);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public boolean setInputs(View view){


        if(isNumeric(input1.getText().toString()) && isNumeric(input2.getText().toString())) {
            input1D = Double.parseDouble(input1.getText().toString());
            input2D = Double.parseDouble(input2.getText().toString());
            return true;
        }  else {
            result.setText("erro de entrada");
            return false;
        }
    }

    public void sum(View view){
        if(setInputs(view)) {
            Double resultSum = input1D + input2D;
            result.setText(resultSum.toString());
        }
    }

    public void sub(View view){
        if(setInputs(view)) {
            Double resultSum = input1D - input2D;
            result.setText(resultSum.toString());
        }
    }

    public void mult(View view){
        if(setInputs(view)) {
            Double resultSum = input1D * input2D;
            result.setText(resultSum.toString());
        }
    }

    public void div(View view){
        if(setInputs(view) && input2D != 0) {
            Double resultSum = input1D / input2D;
            result.setText(resultSum.toString());
        }
    }


}