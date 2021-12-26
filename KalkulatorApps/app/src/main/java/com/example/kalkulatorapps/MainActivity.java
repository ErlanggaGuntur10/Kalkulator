package com.example.kalkulatorapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Inputn1, Inputn2;
    Button bttambah, btkurang, btkali, btbagi;
    TextView tvHasildari;
    double dInput1, dInput2, dHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inputn1 = findViewById(R.id.Inputn1);
        Inputn2 = findViewById(R.id.Inputn2);
        bttambah = findViewById(R.id.bttambah);
        btkurang = findViewById(R.id.btkurang);
        btkali = findViewById(R.id.btkali);
        btbagi = findViewById(R.id.btbagi);
        tvHasildari = findViewById(R.id.tvHasildari);

        bttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Inputn1.getText().toString().equalsIgnoreCase("") || Inputn2.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !", Toast.LENGTH_SHORT).show();
                } else {
                    dInput1 = Double.parseDouble(Inputn1.getText().toString());
                    dInput2 = Double.parseDouble(Inputn2.getText().toString());
                    dHasil = dInput1 + dInput2;
                    tvHasildari.setText(Inputn1.getText().toString() + " + " + Inputn2.getText().toString() + " = " + dHasil);
                    Inputn1.setText("");
                    Inputn2.setText("");
                }
            }
        });

        btkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Inputn1.getText().toString().equalsIgnoreCase("") || Inputn2.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !", Toast.LENGTH_SHORT).show();
                } else {
                    dInput1 = Double.parseDouble(Inputn1.getText().toString());
                    dInput2 = Double.parseDouble(Inputn2.getText().toString());
                    dHasil = dInput1 - dInput2;
                    tvHasildari.setText(Inputn1.getText().toString() + " - " + Inputn2.getText().toString() + " = " + dHasil);
                    Inputn1.setText("");
                    Inputn2.setText("");
                }
            }
        });

        btkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Inputn1.getText().toString().equalsIgnoreCase("") || Inputn2.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !", Toast.LENGTH_SHORT).show();
                } else {
                    dInput1 = Double.parseDouble(Inputn1.getText().toString());
                    dInput2 = Double.parseDouble(Inputn2.getText().toString());
                    dHasil = dInput1 * dInput2;
                    tvHasildari.setText(Inputn1.getText().toString() + " * " + Inputn2.getText().toString() + " = " + dHasil);
                    Inputn1.setText("");
                    Inputn2.setText("");
                }
            }
        });

        btbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Inputn1.getText().toString().equalsIgnoreCase("") || Inputn2.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Inputan tidak boleh kosong, silahkan pastikan kembali !", Toast.LENGTH_SHORT).show();
                } else {
                    dInput1 = Double.parseDouble(Inputn1.getText().toString());
                    dInput2 = Double.parseDouble(Inputn2.getText().toString());
                    dHasil = dInput1 / dInput2;
                    tvHasildari.setText(Inputn1.getText().toString() + " / " + Inputn2.getText().toString() + " = " + dHasil);
                    Inputn1.setText("");
                    Inputn2.setText("");
                }
            }
        });
    }
}