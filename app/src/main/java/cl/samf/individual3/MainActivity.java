package cl.samf.individual3;

import androidx.appcompat.app.AppCompatActivity;

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

        Button sumar = findViewById(R.id.buttonSumar);
        Button restar = findViewById(R.id.buttonMenos);
        Button multip = findViewById(R.id.buttonMulti);
        Button divid = findViewById(R.id.buttonDiv);
        Button cerrar = findViewById(R.id.buttonCerrar);
        EditText txtEntrada1 = findViewById(R.id.editTextNumero1);
        EditText txtEntrada2 = findViewById(R.id.editTextNumero2);
        TextView result = findViewById(R.id.textResultado);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = txtEntrada1.getText().toString().trim();
                String txt2 = txtEntrada2.getText().toString().trim();
                if (txt1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Primer Numero", Toast.LENGTH_SHORT).show();
                }else if (txt2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT).show();
                }else {
                    int nro1 = Integer.parseInt(txt1);
                    int nro2 = Integer.parseInt(txt2);
                    int resultado = nro1 + nro2;
                    result.setText(String.valueOf(resultado));
                    txtEntrada1.setText("");
                    txtEntrada2.setText("");
                }
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = txtEntrada1.getText().toString().trim();
                String txt2 = txtEntrada2.getText().toString().trim();
                if (txt1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Primer Numero", Toast.LENGTH_SHORT).show();
                }else if (txt2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT).show();
                }else {
                    int nro1 = Integer.parseInt(txt1);
                    int nro2 = Integer.parseInt(txt2);
                    int resultado = nro1 - nro2;
                    result.setText(String.valueOf(resultado));
                    txtEntrada1.setText("");
                    txtEntrada2.setText("");
                }
            }
        });

        multip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = txtEntrada1.getText().toString().trim();
                String txt2 = txtEntrada2.getText().toString().trim();
                if (txt1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Primer Numero", Toast.LENGTH_SHORT).show();
                }else if (txt2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT).show();
                }else {
                    int nro1 = Integer.parseInt(txt1);
                    int nro2 = Integer.parseInt(txt2);
                    int resultado = nro1 * nro2;
                    result.setText(String.valueOf(resultado));
                    txtEntrada1.setText("");
                    txtEntrada2.setText("");
                }
            }
        });

        divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1 = txtEntrada1.getText().toString().trim();
                String txt2 = txtEntrada2.getText().toString().trim();
                if (txt1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Primer Numero", Toast.LENGTH_SHORT).show();
                }else if (txt2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT).show();
                } else if (txt2.equals("0")) {
                    Toast.makeText(MainActivity.this, "El numero dos debe ser distinto a 0", Toast.LENGTH_SHORT).show();
                }else {
                    int nro1 = Integer.parseInt(txt1);
                    int nro2 = Integer.parseInt(txt2);
                    int resultado = nro1 / nro2;
                    result.setText(String.valueOf(resultado));
                    txtEntrada1.setText("");
                    txtEntrada2.setText("");
                }
            }
        });
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}