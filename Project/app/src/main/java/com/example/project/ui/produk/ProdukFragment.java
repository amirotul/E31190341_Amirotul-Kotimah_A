package com.example.project.ui.produk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.project.R;

public class ProdukFragment extends Fragment {

    private ProdukViewModel produkViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        produkViewModel =
                new ViewModelProvider(this).get(ProdukViewModel.class);
        View root = inflater.inflate(R.layout.fragment_produk, container, false);
        final TextView textView = root.findViewById(R.id.text_produk);
        produkViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}