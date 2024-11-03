package com.example.whattodo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaEntrar extends AppCompatActivity {

    EditText EmailUsuario;
    EditText SenhaUsuario;

    @SuppressLint("MissingInflatedId")
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

        EmailUsuario = findViewById(R.id.EmailUsuario);
        SenhaUsuario = findViewById(R.id.SenhaUsuario);
    }

    private boolean isValidEmail(String email) {
        return email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public void Entrar (View view){
        String email = EmailUsuario.getText().toString();
        String senha = SenhaUsuario.getText().toString();

        if(email.equals("") || senha.equals("")){
            Toast.makeText(this, "Por favor, preencha os dados corretamente!", Toast.LENGTH_SHORT).show();
        } else if (!isValidEmail(email)) {
            Toast.makeText(this, "Por favor, insira um email válido!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, TelaMenu.class);
            startActivity(intent);
        }
    }
}