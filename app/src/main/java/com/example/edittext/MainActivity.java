package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tiklama();
    }

    private void tanimla() {
        editText = findViewById(R.id.text);
        textView = findViewById(R.id.sonucText);
        button = findViewById(R.id.hesaplaButonu);
    }

    private void tiklama() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deger = editText.getText().toString();
                int fakSayi = Integer.parseInt(deger);
                int faktoriyel = hesapla(fakSayi);
                textView.setText("Sonuç= " + faktoriyel);
            }
        });
    }

    private int hesapla(int sayi) {
        int sonuc = 1;
        int a = 1;
        for (int i = sayi; i > 1; i--) {
            sonuc = sonuc *i;
        }
        return sonuc;
    }
}