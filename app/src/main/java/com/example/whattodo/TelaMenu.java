package com.example.whattodo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaMenu extends AppCompatActivity {

    Button btnVerMais;
    Button btnVerMais2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Pesquisar (View view) {
        Uri uri = Uri.parse("https://www.gov.br/mec/pt-br/assuntos/noticias/2024/junho/enem-2024-periodo-de-inscricao-se-encerra-nesta-sexta-14#:~:text=Termina%20nesta%20sexta%2Dfeira%2C%2014,social%2C%20se%20for%20o%20caso.");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void Pesquisar1 (View view) {
        Uri uri = Uri.parse("https://blog.belasartes.br/como-estudar-para-o-enem/");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}