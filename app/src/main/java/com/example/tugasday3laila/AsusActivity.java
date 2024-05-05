package com.example.tugasday3laila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AsusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus);

        CardView cvAsus1 = findViewById(R.id.cvAsus1);
        CardView cvAsus2 = findViewById(R.id.cvAsus2);
        CardView cvAsus3 = findViewById(R.id.cvAsus3);
        CardView cvAsus4 = findViewById(R.id.cvAsus4);
        CardView cvAsus5 = findViewById(R.id.cvAsus5);

        cvAsus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AsusActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.asus_vivobook_14xoled);
                intent.putExtra("nama_barang", "Asus Vivobook 14X Oled");
                intent.putExtra("deskripsi_barang", "AMD Ryzen™ 7 5800H, RAM 8 GB SSD 256 GB");
                intent.putExtra("harga_barang", "Rp.10.271.000");
                startActivity(intent);
            }
        });

        cvAsus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AsusActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.asus_vivobook_13slate);
                intent.putExtra("nama_barang", "Asus Vivobook 13 Slate Oled T3304");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i3-N300, RAM 8 GB SSD 256 GB");
                intent.putExtra("harga_barang", "Rp.11.599.000");
                startActivity(intent);
            }
        });

        cvAsus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AsusActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.asus_vivobook15);
                intent.putExtra("nama_barang", "Asus Vivobook 15");
                intent.putExtra("deskripsi_barang", "AMD Ryzen™ 7 7735HS, RAM 8 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.17.645.000");
                startActivity(intent);
            }
        });

        cvAsus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AsusActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.asus_zenbook_s13oled);
                intent.putExtra("nama_barang", "Asus Zenbook S 13 Oled UX5304");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i7-1355U, RAM 16 GB SSD 1 T");
                intent.putExtra("harga_barang", "Rp.23.999.000");
                startActivity(intent);
            }
        });

        cvAsus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(AsusActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.asus_zenbook_pro14);
                intent.putExtra("nama_barang", "Asus Zenbook Pro 14 Duo Oled UX8402ZE");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i7-12700H, RAM 16 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.33.499.000");
                startActivity(intent);
            }
        });
    }
}