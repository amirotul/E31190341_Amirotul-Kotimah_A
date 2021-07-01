package com.example.tokooleh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTentang extends AppCompatActivity {
    Button btnbelanja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        btnbelanja = (Button) findViewById(R.id.btnbelanja);

        btnbelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent produk = new Intent(ActivityTentang.this,ActivityProduk.class);
                startActivity(produk);
            }
        });
    }
    }
