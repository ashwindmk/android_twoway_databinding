package com.ashwin.android.twowaydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ashwin.android.twowaydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ObservableModel observableModel;

    public class ObservableModel extends BaseObservable {
        private String name;

        public ObservableModel() {
            this.name = "";
        }

        @Bindable({"name"})
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
            notifyPropertyChanged(BR.name);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        observableModel = new ObservableModel();
        binding.setModel(observableModel);
    }
}