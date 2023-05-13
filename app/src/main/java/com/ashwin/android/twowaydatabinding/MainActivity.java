package com.ashwin.android.twowaydatabinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ashwin.android.twowaydatabinding.databinding.ActivityMainBinding;
import com.ashwin.android.twowaydatabinding.model.ModelActivity;
import com.ashwin.android.twowaydatabinding.mvvm.RegisterActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mvvmButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        });

        binding.modelButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ModelActivity.class));
        });
    }
}
