package br.senac.go.marcelosouto.ui.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

import br.senac.go.marcelosouto.R;

public class CronogramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma);

        Intent intent = getIntent();
        if(intent.hasExtra("teste")){
            Bundle extras = intent.getExtras();
            int argInt = extras.getInt("teste", -1);
            if(argInt == -1){
                throw new IllegalStateException("Argumento não é inteiro");
            }

            TextView textToBold = findViewById(argInt);
            textToBold.setTypeface(textToBold.getTypeface(), Typeface.BOLD);

        }
    }
}
