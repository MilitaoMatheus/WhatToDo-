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

public class TelaEntrar extends AppCompatActivity {

    EditText NomeUsuario;
    EditText SenhaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_entrar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.TelaEntrar), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Entrar (View view){
        if(NomeUsuario.getText().toString().matches("") || SenhaUsuario.getText().toString().matches("")){
            Toast.makeText(this, "Por favor, preencha os dados corretamente!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(this, TelaMenu.class);
            startActivity(intent);
        }
    }
}