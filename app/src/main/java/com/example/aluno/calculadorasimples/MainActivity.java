
package com.example.aluno.calculadorasimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtRes;
    private EditText cndNum;
    private Button btnC;
    private Button btnMais;
    private Button btnMenos;
    private Button btnVezes;
    private Button btnDiv;
    private Button btnIgual;
    private Button btnNum1;
    private Button btnNum2;
    private Button btnNum3;
    private Button btnNum4;
    private Button btnNum5;
    private Button btnNum6;
    private Button btnNum7;
    private Button btnNum8;
    private Button btnNum9;
    private Button btnNum0;
    private Button btnDecimal;
    private double n1, n2;
    private char c;
    private byte contDec = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtRes = (TextView) findViewById(R.id.txtRes);
        cndNum = (EditText) findViewById(R.id.cndNum);
        btnC = (Button) findViewById(R.id.btnC);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMais = (Button) findViewById(R.id.btnMais);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnVezes = (Button) findViewById(R.id.btnVezes);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnNum1 = (Button) findViewById(R.id.btnNum1);
        btnNum2 = (Button) findViewById(R.id.btnNum2);
        btnNum3 = (Button) findViewById(R.id.btnNum3);
        btnNum4 = (Button) findViewById(R.id.btnNum4);
        btnNum5 = (Button) findViewById(R.id.btnNum5);
        btnNum6 = (Button) findViewById(R.id.btnNum6);
        btnNum7 = (Button) findViewById(R.id.btnNum7);
        btnNum8 = (Button) findViewById(R.id.btnNum8);
        btnNum9 = (Button) findViewById(R.id.btnNum9);
        btnNum0 = (Button) findViewById(R.id.btnNum0);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);


        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "1");
            }
        });

        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "2");
            }
        });

        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "3");
            }
        });

        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "4");
            }
        });

        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "5");
            }
        });

        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "6");
            }
        });

        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "7");
            }
        });

        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "8");
            }
        });

        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "9");
            }
        });

        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText(cndNum.getText().toString() + "0");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contDec <1){
                    cndNum.setText(cndNum.getText().toString() + ",");
                    contDec = 1;
                }
            }
        });

        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n1 = Double.parseDouble(cndNum.getText().toString().replace(',','.'));
                    cndNum.setText(cndNum.getText().toString() + " + ");
                    c = '+';
                    bloquearOperacoes();
                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Informe um valor", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n1 = Double.parseDouble(cndNum.getText().toString().replace(',','.'));
                    cndNum.setText(cndNum.getText().toString() + " / ");
                    c = '/';
                    bloquearOperacoes();
                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Informe um valor", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n1 = Double.parseDouble(cndNum.getText().toString().replace(',','.'));
                    cndNum.setText(cndNum.getText().toString() + " - ");
                    c = '-';
                    bloquearOperacoes();
                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Informe um valor", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    n1 = Double.parseDouble(cndNum.getText().toString().replace(',','.'));
                    cndNum.setText(cndNum.getText().toString() + " X ");
                    c = 'X';
                    bloquearOperacoes();

                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Informe um valor", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String aux = cndNum.getText().toString();
                    String a[] = aux.split(" ");
                    n2 = Double.parseDouble(a[2].replace(',','.'));

                    if (c == '+') {
                        txtRes.setText("" + (n1 + n2));
                    } else if (c == '-') {
                        txtRes.setText("" + (n1 - n2));
                    } else if (c == 'X') {
                        txtRes.setText("" + (n1 * n2));
                    } else if (c == '/') {
                        txtRes.setText("" + (n1 / n2));
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Informe o segundo valor", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cndNum.setText("");
                n1 = 0;
                n2 = 0;
                txtRes.setText("");
                btnMenos.setEnabled(true);
                btnDiv.setEnabled(true);
                btnVezes.setEnabled(true);
                btnMais.setEnabled(true);
                contDec = 0;
            }
        });


    }

    private void bloquearOperacoes(){
        btnMenos.setEnabled(false);
        btnDiv.setEnabled(false);
        btnMais.setEnabled(false);
        btnVezes.setEnabled(false);
        contDec = 0;
    }

}
