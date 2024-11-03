package com.example.whattodo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaMateriais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_materiais);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Livros (View view) {
        Uri uri = Uri.parse("https://vestibular.brasilescola.uol.com.br/livros-vestibulares");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void Gabaritos (View view) {
        Uri uri = Uri.parse("https://vestibular.mundoeducacao.uol.com.br/downloads");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void Videos (View view) {
        Uri uri = Uri.parse("https://www.youtube.com/@ProENEMOficial");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void NavegarMenu (View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }

    public void NavegarVestibulares (View view) {
        Intent intent = new Intent(this, TelaVestibulares.class);
        startActivity(intent);
    }

    public void NavegarMateriais (View view) {
        Intent intent = new Intent(this, TelaMateriais.class);
        startActivity(intent);
    }
}