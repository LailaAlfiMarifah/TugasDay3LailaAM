package com.example.tugasday3laila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Mendapatkan data yang dikirim dari AcerActivity
        int gambarBarang = getIntent().getIntExtra("gambar_barang", 0);
        String namaBarang = getIntent().getStringExtra("nama_barang");
        String deskripsiBarang = getIntent().getStringExtra("deskripsi_barang");
        String hargaBarang = getIntent().getStringExtra("harga_barang");

        // Menampilkan data pada layout detail
        ImageView ivGambarBarang = findViewById(R.id.ivGambarBarang);
        ivGambarBarang.setImageResource(gambarBarang);

        TextView tvNamaBarang = findViewById(R.id.tvNamaBarang);
        tvNamaBarang.setText(namaBarang);

        TextView tvDeskripsiBarang = findViewById(R.id.tvDeskripsiBarang);
        tvDeskripsiBarang.setText(deskripsiBarang);

        TextView tvHargaBarang = findViewById(R.id.tvHargaBarang);
        tvHargaBarang.setText(hargaBarang);

        // Mendefinisikan fungsi onClick untuk tombol share
        findViewById(R.id.btnShare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat pesan yang akan dibagikan
                String shareMessage = "Nama Barang: " + namaBarang + "\n" +
                        "Deskripsi: " + deskripsiBarang + "\n" +
                        "Harga: " + hargaBarang;

                // Membuat intent untuk membagikan pesan
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Informasi Barang");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                // Menampilkan dialog untuk memilih aplikasi yang akan digunakan untuk berbagi pesan
                startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"));
            }
        });
    }
}
