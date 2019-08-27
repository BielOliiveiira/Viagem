package com.example.exerccio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText txtTempoGasto;
    EditText txtVelMedia;
    EditText txtRenVei;
    TextView lblDistancia2;
    TextView lblConsumo2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTempoGasto = findViewById(R.id.txtTempoGasto);
        txtVelMedia = findViewById(R.id.txtVelMedia);
        txtRenVei = findViewById(R.id.txtRenVei);
        lblDistancia2 = findViewById(R.id.lblDistancia2);
        lblConsumo2 = findViewById(R.id.lblConsumo2);

    }

    public void OnCalcular (View v){
        double tg = Double.parseDouble((txtTempoGasto.getText().toString()));
        int vm = Integer.parseInt((txtVelMedia.getText().toString()));
        int rv = Integer.parseInt((txtRenVei.getText().toString()));
        double distanciaa = (tg * vm);
        double consumoo = (distanciaa / rv);
        lblDistancia2.setText(String.valueOf(distanciaa));
        lblConsumo2.setText(String.valueOf(consumoo));
    }
}
