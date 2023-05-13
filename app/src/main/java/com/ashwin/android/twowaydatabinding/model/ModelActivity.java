package com.ashwin.android.twowaydatabinding.model;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ashwin.android.twowaydatabinding.BR;
import com.ashwin.android.twowaydatabinding.R;
import com.ashwin.android.twowaydatabinding.databinding.ActivityModelBinding;

public class ModelActivity extends AppCompatActivity {
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

        ActivityModelBinding binding = DataBindingUtil.setContentView(ModelActivity.this, R.layout.activity_model);

        observableModel = new ObservableModel();
        binding.setModel(observableModel);
    }
}
