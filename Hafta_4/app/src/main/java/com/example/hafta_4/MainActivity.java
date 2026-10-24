package com.example.hafta_4;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hafta_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding bnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //

            bnd = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(bnd.getRoot());

            bnd.button1.setOnClickListener(view->{

                Musteriler m1 = new Musteriler("Alperen", 20);


                Intent i1 = new Intent(MainActivity.this, MainActivity2.class); // birinci değer nerede olduğumuz ikinci değer nereye gitmek istediğimix
                i1.putExtra("kelime", "merhaba"); //karşı tarafa mesaj gönderme
                i1.putExtra("sayı", 25);
                i1.putExtra("virgüllü sayı", 3.14159);

                i1.putExtra("nesne", m1);

                startActivity(i1);
            });

        //


    }
}