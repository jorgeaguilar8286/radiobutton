package com.example.ejercicio_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor1 , et_valor2;
    private TextView tv_resultado;
    private RadioButton rb1 , rb2 , rb3 , rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1 = (EditText)findViewById(R.id.txt_v1);
        et_valor2 = (EditText)findViewById(R.id.txt_v2);
        tv_resultado = (TextView)findViewById(R.id.txt_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
        rb3 = (RadioButton)findViewById(R.id.rb_multiplicar);
        rb4 = (RadioButton)findViewById(R.id.rb_dividir);

    }
    //Metodo para boton calcular
    public void Calcular(View view) {
        String valor1_String = et_valor1.getText().toString();
        String valor2_String = et_valor2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if (rb1.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv_resultado.setText(resultado);
        } else if (rb2.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv_resultado.setText(resultado);
        } else if (rb3.isChecked() == true) {
            int multiplicacion = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicacion);
            tv_resultado.setText(resultado);
        } else if (rb4.isChecked() == true) {
            if (valor2_int != 0) {
                int division = valor1_int / valor2_int;
                String resultado = String.valueOf(division);
                tv_resultado.setText(resultado);
            } else {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_LONG).show();

            }
        }

    }
}