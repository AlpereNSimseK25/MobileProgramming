package com.example.hafta_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hafta_5.databinding.FragmentFirstBinding;

public class firstFragment extends Fragment {


    private FragmentFirstBinding fb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //
            fb=FragmentFirstBinding.inflate(inflater,container,false);

            fb.button1.setOnClickListener(view ->{
                Navigation.findNavController(view).navigate(R.id.ilk);
            });
            return fb.getRoot();
        //
    }
}