package com.example.wego;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.wego.databinding.ActivityMainBinding;
import com.example.wego.databinding.ActivityMainNavMenuBinding;

public class mainNavMenu extends AppCompatActivity {

    ActivityMainNavMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainNavMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new fgHome());

        binding.navMenu.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.mainHome:
                    replaceFragment(new fgHome());
                    break;
                case R.id.mainUsuario:
                    replaceFragment(new fgUsuario());
                    break;
                case R.id.mainEvento:
                    replaceFragment(new fgEvento());
                    break;
                case R.id.mainConfiguracion:
                    replaceFragment(new fgConfiguracion());
                    break;
            }


            return true;
        });



    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainFrameLayout, fragment);
        fragmentTransaction.commit();
    }
}