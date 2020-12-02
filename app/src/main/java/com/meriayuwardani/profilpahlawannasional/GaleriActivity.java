package com.meriayuwardani.profilpahlawannasional;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.meriayuwardani.profilpahlawannasional.model.Pahlawan;

import java.util.List;

public class GaleriActivity extends AppCompatActivity {

    List<Pahlawan> pahlawans;
    int indeksTampil = 0;
    String ProfilPahlawan;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txProfil,txAlamat,txTgl_lahir,txJudul;
    ImageView ivFotoPahlawan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_pahlawan);
        Intent intent = getIntent();
        ProfilPahlawan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        pahlawans = DataProvider.getPahlawansByTipe(this,ProfilPahlawan);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> pahlawanPertama());
        btnTerakhir.setOnClickListener(view -> pahlawanTerakhir());
        btnSebelumnya.setOnClickListener(view -> pahlawanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> pahlawanBerikutnya());

        txProfil = findViewById(R.id.txNama);
        txAlamat= findViewById(R.id.txAlamat);
        txTgl_lahir = findViewById(R.id.txTgl_lahir);
        ivFotoPahlawan = findViewById(R.id.gambarPahlawan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Beberapa Nama "+ProfilPahlawan);
    }


    private void tampilkanProfil() {
        Pahlawan k = pahlawans.get(indeksTampil);
        Log.d("PAHLAWAN_AMPERA","Menampilkan pahlawan_ampera "+k.getnama());
        txProfil.setText(k.getnama());
        txAlamat.setText(k.getalamat());
        txTgl_lahir.setText(k.gettgl_lahir());
        ivFotoPahlawan.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void pahlawanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void pahlawanTerakhir() {
        int posAkhir = pahlawans.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void pahlawanBerikutnya() {
        if (indeksTampil == pahlawans.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void pahlawanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}
