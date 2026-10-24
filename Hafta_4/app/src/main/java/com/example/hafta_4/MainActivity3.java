package com.example.hafta_4;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hafta_4.databinding.ActivityMain2Binding;
import com.example.hafta_4.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding bnd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //

            bnd3 = ActivityMain3Binding.inflate(getLayoutInflater());
            setContentView(bnd3.getRoot());
            bnd3.button3.setOnClickListener(view->{
                Intent i3 = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(i3);
            });

        //

    }
}