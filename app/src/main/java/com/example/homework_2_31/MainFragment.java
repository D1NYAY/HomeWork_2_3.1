package com.example.homework_2_31;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework_2_31.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
private Integer count = 0;
private String result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        method ();

    }

    private void method() {
        binding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                result = count.toString();
            }
        });
        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                result = count.toString();
            }
        });
        binding.btnNumber.setText(result);
    }
}


