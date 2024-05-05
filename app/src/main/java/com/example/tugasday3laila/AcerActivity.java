package com.example.tugasday3laila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AcerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acer);

        CardView cvAcer1 = findViewById(R.id.cvAcer1);
        CardView cvAcer2 = findViewById(R.id.cvAcer2);
        CardView cvAcer3 = findViewById(R.id.cvAcer3);
        CardView cvAcer4 = findViewById(R.id.cvAcer4);
        CardView cvAcer5 = findViewById(R.id.cvAcer5);

        cvAcer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AcerActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.acer_aspire5_spin14);
                intent.putExtra("nama_barang", "Acer Aspire 5 Spin 14");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i5-1335U, RAM 16 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.12.125.000");
                startActivity(intent);
            }
        });

        cvAcer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AcerActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.acer_aspire_slim5);
                intent.putExtra("nama_barang", "Acer Aspire 5 Slim");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i7-1355U, RAM 16 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.15.299.000");
                startActivity(intent);
            }
        });

        cvAcer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AcerActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.acer_swift_go14);
                intent.putExtra("nama_barang", "Acer Swift Go 14 Oled");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i7-13700H, RAM 16 GB SSD 1 TB");
                intent.putExtra("harga_barang", "Rp.18.499.000");
                startActivity(intent);
            }
        });

        cvAcer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AcerActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.acer_nitro16);
                intent.putExtra("nama_barang", "Acer Nitro 16 an 16");
                intent.putExtra("deskripsi_barang", "AMD Ryzen™ 5 7535HS, RAM 8 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.20.000.000");
                startActivity(intent);
            }
        });

        cvAcer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AcerActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.acer_predator);
                intent.putExtra("nama_barang", "Acer Predator Helios Neo 16");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i7-13700HX, RAM 2x8 GB SSD 1 TB");
                intent.putExtra("harga_barang", "Rp.26.999.000");
                startActivity(intent);
            }
        });
    }
}
