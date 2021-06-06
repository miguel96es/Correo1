package com.example.correo1.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.correo1.R;


public class DataFragment extends Fragment {

    Button btncambiar;
    TextView text1;


    public DataFragment() {
        // Required empty public constructor
    }

// here we replace first fragment with second

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_data, container, false);

        // Inflate the layout for this fragment
        btncambiar = view.findViewById(R.id.botonCambiar);
        btncambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailsFragment detailsFragment = new DetailsFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainerViewData, detailsFragment).commit();

            }
        });
/*
        text1 = view.findViewById(R.id.textCorreo1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailsFragment detailsFragment = new DetailsFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor, detailsFragment).commit();
            }
        });
*/
        return view;
    }
}