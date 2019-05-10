package com.example.calcupro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText n1 , n2;
    Button btnsumar,btnrestar;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.et1);
        n2=(EditText)findViewById(R.id.et2);
        r=(TextView)findViewById(R.id.resultado);
        btnsumar=(Button)findViewById(R.id.btn1);
        btnrestar=(Button)findViewById(R.id.btn2);
        btnsumar.setOnClickListener(this);
        btnrestar.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int s = valor1+valor2;
        r.setText(s+"");
        int res = valor1-valor2;
        r.setText(res+"");
    }

}