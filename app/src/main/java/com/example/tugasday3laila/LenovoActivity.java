package com.example.tugasday3laila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LenovoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovo);

        CardView cvLenovo1 = findViewById(R.id.cvLenovo1);
        CardView cvLenovo2 = findViewById(R.id.cvLenovo2);
        CardView cvLenovo3 = findViewById(R.id.cvLenovo3);
        CardView cvLenovo4 = findViewById(R.id.cvLenovo4);
        CardView cvLenovo5 = findViewById(R.id.cvLenovo5);

        cvLenovo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(LenovoActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.lenovo_ideapad_slim5);
                intent.putExtra("nama_barang", "Lenovo Ideapad Slim 5");
                intent.putExtra("deskripsi_barang", "AMD Ryzen™ 5 7530U, RAM 16 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.9.599.000");
                startActivity(intent);
            }
        });

        cvLenovo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(LenovoActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.lenovo_yoga6);
                intent.putExtra("nama_barang", "Lenovo Yoga 6");
                intent.putExtra("deskripsi_barang", "AMD Ryzen™ 5 7530U, RAM 16 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.12.499.000");
                startActivity(intent);
            }
        });

        cvLenovo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(LenovoActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.lenovo_loq15);
                intent.putExtra("nama_barang", "Lenovo LOQ 15");
                intent.putExtra("deskripsi_barang", "AMD Ryzen™ 5 7640HS, RAM 8 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.15.179.000");
                startActivity(intent);
            }
        });

        cvLenovo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(LenovoActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.lenovo_legion_slim5);
                intent.putExtra("nama_barang", "Lenovo Legion Slim 5");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i7-13700H, RAM 2x8 GB SSD 512 GB");
                intent.putExtra("harga_barang", "Rp.25.999.000");
                startActivity(intent);
            }
        });

        cvLenovo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menyiapkan data untuk dikirim ke DetailActivity
                Intent intent = new Intent(LenovoActivity.this, DetailActivity.class);
                intent.putExtra("gambar_barang", R.drawable.lenovo_yoga_book9i);
                intent.putExtra("nama_barang", "Lenovo Yoga Book 9i");
                intent.putExtra("deskripsi_barang", "Intel® Core™ i7-1355U, RAM 16 GB SSD 1 TB");
                intent.putExtra("harga_barang", "Rp.34.999.000");
                startActivity(intent);
            }
        });
    }
}