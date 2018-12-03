package com.example.skyapps.mybluekoala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button IdEmpezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // getSupportActionBar().hide();

        IdEmpezar = (Button) findViewById(R.id.IdEmpezar);

        IdEmpezar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent i = new Intent(LoginActivity.this, DispositivosBT.class);//<-<- PARTE A MODIFICAR >->-A
                startActivity(i);
            }
        });

    }
}
