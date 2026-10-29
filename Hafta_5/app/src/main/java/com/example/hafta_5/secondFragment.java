package com.example.hafta_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hafta_5.databinding.FragmentFirstBinding;
import com.example.hafta_5.databinding.FragmentSecondBinding;


public class secondFragment extends Fragment {

    private FragmentSecondBinding sb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        sb= FragmentSecondBinding.inflate(inflater,container,false);

        sb.button2.setOnClickListener(view ->{
            Navigation.findNavController(view).navigate(R.id.iki);
        });

        return sb.getRoot();
    }
}