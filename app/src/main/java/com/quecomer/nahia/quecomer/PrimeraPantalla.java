package com.quecomer.nahia.quecomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimeraPantalla extends AppCompatActivity {


    Button inventario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);

        inventario = (Button) findViewById(R.id.binventario);
        inventario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrimeraPantalla.this, Inventario.class);
                startActivity(intent);
            }
        });
    }
}
