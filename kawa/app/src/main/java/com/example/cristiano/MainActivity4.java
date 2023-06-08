package com.example.cristiano;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    private EditText EDTTAREFA;
    private Button BTTREGISTRO;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        EDTTAREFA = findViewById(R.id.editTarefa);
        BTTREGISTRO = findViewById(R.id.btnRegistro);

        BTTREGISTRO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String taskDescription = EDTTAREFA.getText().toString();


                Intent k = new Intent();
                k.putExtra("task", taskDescription);
                setResult(RESULT_OK,k);
                finish();
            }
        });
    }
}