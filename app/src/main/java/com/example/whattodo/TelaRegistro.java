package com.example.whattodo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaRegistro extends AppCompatActivity {

    EditText NomeUsuario;
    EditText SenhaUsuario;
    EditText EmailUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_registro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.TelaRegistro), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        NomeUsuario = (EditText) findViewById(R.id.NomeUsuario);
        EmailUsuario = (EditText) findViewById(R.id.EmailUsuario);
        SenhaUsuario = (EditText) findViewById(R.id.SenhaUsuario);
    }
    public void Cadastrar (View view){
        if (NomeUsuario.getText().toString().matches("") || EmailUsuario.getText().toString().matches("") || SenhaUsuario.getText().toString().matches("")) {
            Toast.makeText(this, "Por favor, preencha os dados corretamente!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, TelaMenu.class);
            startActivity(intent);
        }
    }
}