package br.ufjf.dcc196.lucaspace.com.example.starter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView saida = findViewById(R.id.labelinput1);
        //saida.setText("Bem vindo");
    }


    public void sum(View view){

        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);


        Double input1D = Double.parseDouble(input1.getText().toString());
        Double input2D = Double.parseDouble(input2.getText().toString());
        Double resultSum = input1D + input2D;

        TextView result  = findViewById(R.id.result);
        result.setText(resultSum.toString());
    }
}