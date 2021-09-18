package com.df.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraIMC extends AppCompatActivity implements View.OnClickListener {

    ImageView imagenEstado;
    EditText txtAltura;
    EditText txtPeso;
    Button btnCalcularImc;
    TextView txtResultado;
    private String nombreUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("nombre");
        imagenEstado = findViewById(R.id.imageView2);
        txtAltura = findViewById(R.id.editTextAltura);
        txtPeso = findViewById(R.id.editTextPeso);
        btnCalcularImc = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcularImc.setOnClickListener(this);
        txtPeso.setOnClickListener(this);
        Toast.makeText(this, "Bienvenido a su calculo " + nombreUsuario, Toast.LENGTH_SHORT).show();

    }

    public Double calcularImc(double peso, double altura){
        double imc =0;
        imc = peso / (altura*altura);
        return imc;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalcular: {
                Double peso = Double.parseDouble(txtPeso.getText().toString());
                Double altura = Double.parseDouble(txtAltura.getText().toString());
                Double imc = calcularImc(peso, altura);
                Toast.makeText(this,"su imc es: "+ imc, Toast.LENGTH_LONG).show();
                txtResultado.setText("su imc es: "+ imc);
            }
        }
    }

}