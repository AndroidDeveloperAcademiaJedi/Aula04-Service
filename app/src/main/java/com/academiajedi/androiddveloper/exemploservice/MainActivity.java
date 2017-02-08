package com.academiajedi.androiddveloper.exemploservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIniciar;
    private Button btnParar;
    private static final String ACTION_SERVICE = "com.academiajedi.androiddveloper.exemploservice.SERVICO_JEDI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ACTION_SERVICE);
                it.setPackage(getPackageName());
                startService(it);
            }
        });
        btnParar = (Button) findViewById(R.id.btnParar);
        btnParar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ACTION_SERVICE);
                it.setPackage(getPackageName());
                stopService(it);
            }
        });
    }
}
