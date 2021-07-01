package com.example.tokooleh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
    }
    public void produk (View view){
        Intent produk = new Intent(CourseActivity.this, ActivityProduk.class);
        startActivity(produk);
    }
    public void konfirmasi (View view){
        Intent konfirmasi = new Intent(CourseActivity.this, ActivityKonfirmasi.class);
        startActivity(konfirmasi);
    }
    public void tentang(View view){
        Intent tentang = new Intent(CourseActivity.this, ActivityTentang.class);
        startActivity(tentang);
    }
    public void keranjang (View view){
        Intent keranjang = new Intent(CourseActivity.this, ActivityKeranjang.class);
        startActivity(keranjang);
    }
    public void telepon (View view){
        Intent telepon = new Intent(CourseActivity.this, ActivityTelepon.class);
        startActivity(telepon);
    }
    public void profil (View view){
        Intent profil = new Intent(CourseActivity.this, ActivityProfil.class);
        startActivity(profil);
    }
}
