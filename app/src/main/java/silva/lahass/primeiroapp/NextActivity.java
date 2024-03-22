package silva.lahass.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        //obtem o intent que criou essa tela
        Intent i = getIntent();
        //obtem o texto que veio junto com o intent
        String texto = i.getStringExtra("texto");
        //obtem o elemento de interface do textview
        TextView tvTexto = findViewById(R.id.tvTexto);
        //ceta o texto dentro do textview
        tvTexto.setText(texto);
    }
}