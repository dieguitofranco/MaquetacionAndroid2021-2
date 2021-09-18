package com.df.clase1dm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalculadoraIMC;
    private Button btnConversorUnidades;
    private Button btnCalculadoraGeneral;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnCalculadoraIMC = findViewById(R.id.btnCalcularImc);
        btnConversorUnidades = findViewById(R.id.btnConversor);
        btnCalculadoraGeneral = findViewById(R.id.btnCalculadora);
        txtNombre = findViewById(R.id.txtNombreUsuario);
        btnCalculadoraGeneral.setOnClickListener(this);
        btnConversorUnidades.setOnClickListener(this);
        btnCalculadoraIMC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
           case  R.id.btnCalcularImc :
               intent = new Intent(this, CalculadoraIMC.class);
               intent.putExtra("nombre",txtNombre.getText().toString());
               startActivity(intent);
               break;
           case R.id.btnCalculadora:
                Toast.makeText(this, "Entro por medio de la Calculadora", Toast.LENGTH_LONG).show();
               break;
           case R.id.btnConversor:
               intent = new Intent(this,Conversor.class);
               intent.putExtra("nombreUsuario",txtNombre.getText().toString());
               startActivity(intent);
               Toast.makeText(this, "Entro por medio del conversor", Toast.LENGTH_LONG).show();
               break;

       }
    }
}