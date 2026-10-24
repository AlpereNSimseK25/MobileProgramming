package com.example.hafta_4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hafta_4.databinding.ActivityMain2Binding;
import com.example.hafta_4.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding bnd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //

            bnd2 = ActivityMain2Binding.inflate(getLayoutInflater());
            setContentView(bnd2.getRoot());

            bnd2.textView2.setText(getIntent().getStringExtra("kelime" ) + " " + getIntent().getDoubleExtra("virgüllü sayı", 3.0)); //MainActivity de verilen mesaj yazdırılır. sayısal değerlerde default bir değer verilmeli

            Musteriler mm = (Musteriler) getIntent().getSerializableExtra("nesne");
            bnd2.textView2.setText(mm.getIsim()+"'in yaşı -> "+ mm.getYas());
            bnd2.button2.setOnClickListener(view->{
                Intent i2 = new Intent(MainActivity2.this, MainActivity3.class);
                finish(); // yaptığımız zaman o sayfada geri tuşuna bastığımız zaman bir önceki sayfa yerine ana sayfaya döner
                startActivity(i2);
            });

            bnd2.button21.setOnClickListener(view->{
                Intent i2_1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i2_1);
            });

        //


    }
}