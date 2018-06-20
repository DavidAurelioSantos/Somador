package david.somador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView texto = (TextView) findViewById(R.id.texto);

        final EditText text1 = (EditText) findViewById(R.id.text1);
        final EditText text2 = (EditText) findViewById(R.id.text2);

        Button  somar = (Button) findViewById(R.id.somar);
        Button subtrair = (Button) findViewById(R.id.subtrair);
        Button concatena = (Button) findViewById(R.id.concatena);

        // Evento no botão somar
        somar.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                int resultado = Integer.parseInt(texto.getText().toString()) + 1;
                Toast.makeText(MainActivity.this, "O valor é: " + resultado, Toast.LENGTH_SHORT ).show();
                String a = String.valueOf(resultado);
                texto.setText(a);
            }
        });

        //Evento no botão subtrair

        subtrair.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                int resultado = Integer.parseInt(texto.getText().toString()) - 1;
                Toast.makeText(MainActivity.this, "O valor é: " + resultado, Toast.LENGTH_SHORT ).show();
                String b = String.valueOf(resultado);
                texto.setText(b);
            }
        });

        // Evento no botão Concatenar

        concatena.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Concatenados: " + text1.getText() + text2.getText(), Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
