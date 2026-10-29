package com.example.hafta_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hafta_5.databinding.FragmentFirstBinding;
import com.example.hafta_5.databinding.FragmentThirdBinding;


public class thirdFragment extends Fragment {

    private FragmentThirdBinding tb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        tb=FragmentThirdBinding.inflate(inflater,container,false);
        tb.btn3.setOnClickListener(view ->{
            Navigation.findNavController(view).navigate(R.id.uc);
        });
        return tb.getRoot();
    }
}