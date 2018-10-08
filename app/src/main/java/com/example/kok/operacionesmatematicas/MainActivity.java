package com.example.kok.operacionesmatematicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNumero1, txtNumero2;
    TextView txvResultado;
    int intNumero1, intNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = (EditText) findViewById(R.id.txtNumero1);
        txtNumero2 = (EditText) findViewById(R.id.txtNumero2);
        txvResultado = (TextView) findViewById(R.id.txvResultado);
    }

    public void onClick(View view){

        intNumero1 = Integer.parseInt(txtNumero1.getText().toString());
        intNumero2 = Integer.parseInt(txtNumero2.getText().toString());

        switch (view.getId()){
            case R.id.btnSumar:
                sumar();
                break;
            case R.id.btnRestar:
                resta();
                break;
            case  R.id.btnMultiplicar:
                multiplicacion();
                break;
            case  R.id.btnDividir:
                division();
                break;
        }
    }


    public void sumar(){
        int resultado = intNumero1 + intNumero2;
        txvResultado.setText("Resultado de la suma es: " + resultado);

    }

    public void resta(){
        int resultado = intNumero1 - intNumero2;
        txvResultado.setText("Resultado de la resta es: " + resultado);

    }

    public void multiplicacion(){
        int resultado = intNumero1 * intNumero2;
        txvResultado.setText("Resultado de la multiplicacion es: " + resultado);

    }

    public void division(){

        if(intNumero2 !=0 ){
            int resultado = intNumero1 / intNumero2;
            txvResultado.setText("Resultado de la division es: " + resultado);
        }
        else{
            Toast.makeText(this,"En numero 2 debe ser mayor a 0", Toast.LENGTH_LONG).show();
        }



    }

}
