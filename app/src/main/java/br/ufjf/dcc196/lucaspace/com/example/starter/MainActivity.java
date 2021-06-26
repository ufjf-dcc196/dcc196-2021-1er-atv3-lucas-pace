package br.ufjf.dcc196.lucaspace.com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

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


    public void setInputs(View view){
        input1D = Double.parseDouble(input1.getText().toString());
        input2D = Double.parseDouble(input2.getText().toString());
    }

    public void sum(View view){
        setInputs(view);
        Double resultSum = input1D + input2D;
        result.setText(resultSum.toString());
    }

    public void sub(View view){
        setInputs(view);
        Double resultSum = input1D - input2D;
        result.setText(resultSum.toString());
    }

    public void mult(View view){
        setInputs(view);
        Double resultSum = input1D * input2D;
        result.setText(resultSum.toString());
    }

    public void div(View view){
        setInputs(view);
        Double resultSum = input1D / input2D;
        result.setText(resultSum.toString());
    }


}