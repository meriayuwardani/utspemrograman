package com.meriayuwardani.profilpahlawannasional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPahlawan_ampera,btnPahlawan_nasional,btnPahlawan_revolusi;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnPahlawan_ampera = findViewById(R.id.btn_buka_profil_pahlawan_ampera);
        btnPahlawan_nasional= findViewById(R.id.btn_buka_profil_pahlawan_nasional);
        btnPahlawan_revolusi = findViewById(R.id.btn_buka_profil_pahlawan_revolusi);
        btnPahlawan_ampera.setOnClickListener(view -> bukaGaleri("Pahlawan_ampera"));
        btnPahlawan_nasional.setOnClickListener(view -> bukaGaleri("Pahlawan_nasional"));
        btnPahlawan_revolusi.setOnClickListener(view -> bukaGaleri("Pahlawan_revolusi"));
    }

    private void bukaGaleri(String namaPahlawan) {
        Log.d("MAIN","Buka activity pahlawan_ampera");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, namaPahlawan);
        startActivity(intent);
    }
}