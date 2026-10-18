package com.example.ders2026;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ders2026.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding bnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

//Hafta3
        bnd = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bnd.getRoot()); //bütün köklere ulaşıldı

        bnd.button1.setOnClickListener(view -> {
            Snackbar.make(view, "İlk uygulama", Snackbar.LENGTH_LONG).show();
        });

        bnd.button2.setOnClickListener(view -> {
            bnd.textView2.setText("Selam");
        });

        //Hafta3 yeni uygulama
        Musteriler musteri1 = new Musteriler(25, "Alperen", 2506);
        bnd.button2.setOnClickListener(view -> {
            Snackbar.make(view, musteri1.getMusteriId()+" id'li "+musteri1.getAd()+" isimli müşterinin ödediği rakam: "+musteri1.getOdenecek(), Snackbar.LENGTH_LONG).show();
        });
//

        ViewCompat.setOnApplyWindowInsetsListener(bnd.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}