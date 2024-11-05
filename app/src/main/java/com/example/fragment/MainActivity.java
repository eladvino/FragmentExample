package com.example.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragment.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;
    Button btn_home, btn_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        replaceFragment(new SettingsFragment());

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btn_home = findViewById(R.id.btn_home);
        btn_settings = findViewById(R.id.btn_settings);
        btn_home.setOnClickListener(this);
        btn_settings.setOnClickListener(this);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.FL, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
        if (v == btn_home) {
            replaceFragment(new HomeFragment());
        }
        else if (v == btn_settings) {
            replaceFragment(new SettingsFragment());
        }
    }
}