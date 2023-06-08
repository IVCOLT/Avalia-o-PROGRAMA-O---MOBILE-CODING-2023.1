package com.example.cristiano;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String NOME_VALIDO = "cristiano";
    private static final String SENHA_VALIDO = "123456";

    private EditText editTextNome;
    private EditText editTextSenha;
    private Button BTTLogin;
    private TextView TViewRegistro;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editNome);
        editTextSenha = findViewById(R.id.editSenha);
        BTTLogin = findViewById(R.id.btnLogin);
        TViewRegistro = findViewById(R.id.tVRegistro);

        BTTLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String senha = editTextSenha.getText().toString();

                if (nome.isEmpty()){
                    Toast.makeText(MainActivity.this, "Escreva seu Nome", Toast.LENGTH_SHORT).show();
                }
                else if (senha.isEmpty()){
                    Toast.makeText(MainActivity.this, "Escreva sua Senha", Toast.LENGTH_SHORT).show();
                }
                else if (nome.equals(NOME_VALIDO) && senha.equals(SENHA_VALIDO)) {

                    Intent x = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(x);
                } else {

                    Toast.makeText(MainActivity.this, "ACESSO NEGADO: USUARIO OU SENHA INVALIDO", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TViewRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent y = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(y);
            }
        });
    }
}