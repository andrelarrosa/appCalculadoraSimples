
package com.example.aluno.calculadorasimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtRes;
    private EditText cndNum;
    private Button btnC;
    private Button btnMais;
    private Button btnMenos;
    private Button btnVezes;
    private Button btnDiv;
    private Button btnIgual;
    private double n1, n2;
    private char c;

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

        //primeiro passo
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(cndNum.getText().toString());
                cndNum.setText(cndNum.getText().toString() + " + ");
                c = '+';
                btnMenos.setEnabled(false);
                btnDiv.setEnabled(false);
                btnVezes.setEnabled(false);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(cndNum.getText().toString());
                cndNum.setText(cndNum.getText().toString() + " / ");
                c = '/';
                btnMenos.setEnabled(false);
                btnMais.setEnabled(false);
                btnVezes.setEnabled(false);
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(cndNum.getText().toString());
                cndNum.setText(cndNum.getText().toString() + " - ");
                c = '-';
                btnMais.setEnabled(false);
                btnDiv.setEnabled(false);
                btnVezes.setEnabled(false);
            }
        });

        btnVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(cndNum.getText().toString());
                cndNum.setText(cndNum.getText().toString() + " X ");
                c = 'X';
                btnMenos.setEnabled(false);
                btnDiv.setEnabled(false);
                btnMais.setEnabled(false);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux = cndNum.getText().toString();
                String a[] = aux.split(" ");
                n2 = Double.parseDouble(a[2]);

                if(c == '+'){
                    txtRes.setText(""+(n1+n2));
                }
                else if(c == '-'){
                    txtRes.setText(""+(n1-n2));
                }
                else if(c == 'X'){
                    txtRes.setText(""+(n1*n2));
                }
                else if(c == '/'){
                    txtRes.setText(""+(n1/n2));
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
            }
        });


    }

}
