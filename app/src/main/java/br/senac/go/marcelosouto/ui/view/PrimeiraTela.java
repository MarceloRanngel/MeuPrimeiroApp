package br.senac.go.marcelosouto.ui.view;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import br.senac.go.marcelosouto.R;

public class PrimeiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);

        ImageButton cronogramaButton= findViewById(R.id.imageButton);
        cronogramaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), CronogramaActivity.class);
                intent.putExtra("teste",R.id.textView9);
                startActivity(intent);
            }
        });
    }
}
