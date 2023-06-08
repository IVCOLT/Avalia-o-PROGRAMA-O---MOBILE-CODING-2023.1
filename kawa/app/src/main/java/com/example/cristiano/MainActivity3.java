package com.example.cristiano;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText eTNome;
    private EditText eTSenha;
    private EditText eTRSenha;
    private Button BTTRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        eTNome = findViewById(R.id.editNome);
        eTSenha = findViewById(R.id.editSenha);
        eTRSenha = findViewById(R.id.editRSenha);
        BTTRegistro = findViewById(R.id.btnRegistro);

        BTTRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Nome = eTNome.getText().toString();
                String Senha = eTSenha.getText().toString();
                String RSenha = eTRSenha.getText().toString();


                if (Nome.isEmpty()) {
                    Toast.makeText(MainActivity3.this, "Escreva seu Nome", Toast.LENGTH_SHORT).show();

                }
                else if (Senha.isEmpty()) {
                    Toast.makeText(MainActivity3.this, "Escreva sua Senha", Toast.LENGTH_SHORT).show();
                }
                else if (RSenha.isEmpty()) {
                    Toast.makeText(MainActivity3.this, "Reescreva sua Senha", Toast.LENGTH_SHORT).show();
                }
                else if (!RSenha.equals(Senha)) {
                    Toast.makeText(MainActivity3.this, "senhas não são iguais, por favor reescreva", Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent x = new Intent(MainActivity3.this, MainActivity.class);
                    startActivity(x);

                }
            }
        });
    }
}