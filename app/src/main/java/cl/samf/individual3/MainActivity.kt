package cl.samf.individual3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sumar = findViewById<Button>(R.id.buttonSumar)
        val restar = findViewById<Button>(R.id.buttonMenos)
        val multip = findViewById<Button>(R.id.buttonMulti)
        val divid = findViewById<Button>(R.id.buttonDiv)
        val cerrar = findViewById<Button>(R.id.buttonCerrar)
        val txtEntrada1 = findViewById<EditText>(R.id.editTextNumero1)
        val txtEntrada2 = findViewById<EditText>(R.id.editTextNumero2)
        val result = findViewById<TextView>(R.id.textResultado)
        sumar.setOnClickListener {
            val txt1 = txtEntrada1.text.toString().trim { it <= ' ' }
            val txt2 = txtEntrada2.text.toString().trim { it <= ' ' }
            if (txt1.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Primer Numero", Toast.LENGTH_SHORT)
                    .show()
            } else if (txt2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val nro1 = txt1.toInt()
                val nro2 = txt2.toInt()
                val resultado = nro1 + nro2
                result.text = resultado.toString()
                txtEntrada1.setText("")
                txtEntrada2.setText("")
            }
        }
        restar.setOnClickListener {
            val txt1 = txtEntrada1.text.toString().trim { it <= ' ' }
            val txt2 = txtEntrada2.text.toString().trim { it <= ' ' }
            if (txt1.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Primer Numero", Toast.LENGTH_SHORT)
                    .show()
            } else if (txt2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val nro1 = txt1.toInt()
                val nro2 = txt2.toInt()
                val resultado = nro1 - nro2
                result.text = resultado.toString()
                txtEntrada1.setText("")
                txtEntrada2.setText("")
            }
        }
        multip.setOnClickListener {
            val txt1 = txtEntrada1.text.toString().trim { it <= ' ' }
            val txt2 = txtEntrada2.text.toString().trim { it <= ' ' }
            if (txt1.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Primer Numero", Toast.LENGTH_SHORT)
                    .show()
            } else if (txt2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val nro1 = txt1.toInt()
                val nro2 = txt2.toInt()
                val resultado = nro1 * nro2
                result.text = resultado.toString()
                txtEntrada1.setText("")
                txtEntrada2.setText("")
            }
        }
        divid.setOnClickListener {
            val txt1 = txtEntrada1.text.toString().trim { it <= ' ' }
            val txt2 = txtEntrada2.text.toString().trim { it <= ' ' }
            if (txt1.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Primer Numero", Toast.LENGTH_SHORT)
                    .show()
            } else if (txt2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Ingresa un Segundo Numero", Toast.LENGTH_SHORT)
                    .show()
            } else if (txt2 == "0") {
                Toast.makeText(
                    this@MainActivity,
                    "El numero dos debe ser distinto a 0",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val nro1 = txt1.toInt()
                val nro2 = txt2.toInt()
                val resultado = nro1 / nro2
                result.text = resultado.toString()
                txtEntrada1.setText("")
                txtEntrada2.setText("")
            }
        }
        cerrar.setOnClickListener { finish() }
    }
}