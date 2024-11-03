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
import android.util.Patterns;

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

        NomeUsuario = findViewById(R.id.NomeUsuario);
        EmailUsuario = findViewById(R.id.EmailUsuario);
        SenhaUsuario = findViewById(R.id.SenhaUsuario);
    }

    // Função para validar o email
    private boolean isValidEmail(String email) {
        return email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public void Cadastrar(View view) {
        String email = EmailUsuario.getText().toString();
        String nome = NomeUsuario.getText().toString();
        String senha = SenhaUsuario.getText().toString();

        // Verifica se os campos estão preenchidos e se o email é válido
        if (nome.equals("") || email.equals("") || senha.equals("")) {
            Toast.makeText(this, "Por favor, preencha todos os campos!", Toast.LENGTH_SHORT).show();
        } else if (!isValidEmail(email)) {
            Toast.makeText(this, "Por favor, insira um email válido!", Toast.LENGTH_SHORT).show();
        } else {
            // Se todos os dados estão corretos, prossegue para a próxima tela
            Intent intent = new Intent(this, TelaMenu.class);
            startActivity(intent);
        }
    }
}
