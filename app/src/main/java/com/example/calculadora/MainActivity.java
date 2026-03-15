package com.example.calculadora;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;

    double numero1;
    double numero2;
    String operador;
    boolean nuevoNumero = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        Button btnSum = findViewById(R.id.btnSum);
        Button btnRes = findViewById(R.id.btnSubtract);
        Button btnMul = findViewById(R.id.btnMultiply);
        Button btnDiv = findViewById(R.id.btnDivide);
        Button btnIgual = findViewById(R.id.btnEqual);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnPercent = findViewById(R.id.btnPercent);
        Button btnSign = findViewById(R.id.btnSign);
        Button btnDecimal = findViewById(R.id.btnDecimal);

        btn0.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("0");
                nuevoNumero = false;
            } else {
                txtResultado.append("0");
            }
        });

        btn1.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("1");
                nuevoNumero = false;
            } else {
                txtResultado.append("1");
            }
        });

        btn2.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("2");
                nuevoNumero = false;
            } else {
                txtResultado.append("2");
            }
        });

        btn3.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("3");
                nuevoNumero = false;
            } else {
                txtResultado.append("3");
            }
        });

        btn4.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("4");
                nuevoNumero = false;
            } else {
                txtResultado.append("4");
            }
        });

        btn5.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("5");
                nuevoNumero = false;
            } else {
                txtResultado.append("5");
            }
        });

        btn6.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("6");
                nuevoNumero = false;
            } else {
                txtResultado.append("6");
            }
        });

        btn7.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("7");
                nuevoNumero = false;
            } else {
                txtResultado.append("7");
            }
        });

        btn8.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("8");
                nuevoNumero = false;
            } else {
                txtResultado.append("8");
            }
        });

        btn9.setOnClickListener(v -> {
            if (nuevoNumero) {
                txtResultado.setText("9");
                nuevoNumero = false;
            } else {
                txtResultado.append("9");
            }
        });



        btnClear.setOnClickListener(v -> {
            txtResultado.setText("0");
            numero1 = 0;
            numero2 = 0;
            operador = "";
            nuevoNumero = true;
        });

        btnPercent.setOnClickListener(v -> {
            String texto = txtResultado.getText().toString();

            if (texto.isEmpty()) {
                return;
            }

            double valor = Double.parseDouble(texto);
            valor = valor / 100.0;

            if (valor == (int) valor) {
                txtResultado.setText(String.valueOf((int) valor));
            } else {
                txtResultado.setText(String.valueOf(valor));
            }

            nuevoNumero = true;
        });

        btnSign.setOnClickListener(v -> {
            String texto = txtResultado.getText().toString();

            if (texto.isEmpty()) {
                return;
            }

            double valor = Double.parseDouble(texto);
            valor = valor * -1;

            if (valor == (int) valor) {
                txtResultado.setText(String.valueOf((int) valor));
            } else {
                txtResultado.setText(String.valueOf(valor));
            }
        });

        btnDecimal.setOnClickListener(v -> {
            String texto = txtResultado.getText().toString();

            if (!texto.contains(".")) {
                txtResultado.setText(texto + ".");
                nuevoNumero = false;
            }
        });

        btnSum.setOnClickListener(v -> {
            numero1 = Double.parseDouble(txtResultado.getText().toString());
            operador = "+";
            txtResultado.setText("");
            nuevoNumero = true;
        });

        btnRes.setOnClickListener(v -> {
            numero1 = Double.parseDouble(txtResultado.getText().toString());
            operador = "-";
            txtResultado.setText("");
            nuevoNumero = true;
        });

        btnMul.setOnClickListener(v -> {
            numero1 = Double.parseDouble(txtResultado.getText().toString());
            operador = "*";
            txtResultado.setText("");
            nuevoNumero = true;
        });

        btnDiv.setOnClickListener(v -> {
            numero1 = Double.parseDouble(txtResultado.getText().toString());
            operador = "/";
            txtResultado.setText("");
            nuevoNumero = true;
        });

        btnIgual.setOnClickListener(v -> {

            numero2 = Double.parseDouble(txtResultado.getText().toString());
            double resultado = 0;
            if (operador == null || operador.equals("")) {
                return;
            }

            if (operador.equals("+")) {
                resultado = numero1 + numero2;
            }

            if (operador.equals("-")) {
                resultado = numero1 - numero2;
            }

            if (operador.equals("*")) {
                resultado = numero1 * numero2;
            }

            if (operador.equals("/")) {
                resultado = numero1 / numero2;
            }

            if (resultado == (int) resultado) {
                txtResultado.setText(String.valueOf((int) resultado));
            } else {
                txtResultado.setText(String.valueOf(resultado));
            }
            nuevoNumero = true;
        });
    }
}