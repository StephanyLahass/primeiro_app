package silva.lahass.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionScene;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Le o arquivo de Layout e constroi a interface
        setContentView(R.layout.activity_main);
        //Obtem o botao
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //Define o evento do botao, on click e chamado quando se tem o click do botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //obtem o campo de texto
                EditText etDigiteAqui=findViewById(R.id.etDigiteAqui);
                //obtem i texto digitado pelo usuario na caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();
                //cria uma intencao de navgacao para a proxima tela
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                //coloca o texto dentro da intencao para levar para a proxima tela
                i.putExtra("texto", textoDigitado);
                //executa a intencao e navega para a proxima tela
                startActivity(i);

            }
        });
    }
}