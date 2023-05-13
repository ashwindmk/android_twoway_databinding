package com.ashwin.android.twowaydatabinding.mvvm;

import androidx.databinding.Bindable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegisterViewModel extends ViewModel {
    public MutableLiveData<String> name = new MutableLiveData<>("");

    public MutableLiveData<Boolean> agree = new MutableLiveData<>(false);
}
