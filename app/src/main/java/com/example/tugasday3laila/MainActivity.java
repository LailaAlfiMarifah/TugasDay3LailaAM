package com.example.tugasday3laila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLenovo = findViewById(R.id.btnLenovo);
        Button btnAsus = findViewById(R.id.btnAsus);
        Button btnAcer = findViewById(R.id.btnAcer);

        btnLenovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman LenovoActivity
                Intent intent = new Intent(MainActivity.this, LenovoActivity.class);
                startActivity(intent);
            }
        });

        btnAsus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman AsusActivity
                Intent intent = new Intent(MainActivity.this, AsusActivity.class);
                startActivity(intent);
            }
        });

        btnAcer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman AcerActivity
                Intent intent = new Intent(MainActivity.this, AcerActivity.class);
                startActivity(intent);
            }
        });
    }
}
