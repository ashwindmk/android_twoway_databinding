package com.ashwin.android.twowaydatabinding.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.ashwin.android.twowaydatabinding.R;
import com.ashwin.android.twowaydatabinding.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    private RegisterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegisterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        binding.setLifecycleOwner(this);

        viewModel = new ViewModelProvider(this).get(RegisterViewModel.class);
        binding.setViewModel(viewModel);

        viewModel.name.observe(this, s -> {
            Log.d("2-way-data-binding", "RegisterActivity: name = " + s);
        });
    }
}
