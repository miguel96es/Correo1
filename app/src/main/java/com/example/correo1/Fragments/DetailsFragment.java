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

public class DetailsFragment extends Fragment {


    private TextView getCorreo;
    Button btnVolver;

    public DetailsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        getCorreo =(TextView) view.findViewById(R.id.getCorreo);

        //Boton volver fragmento
       /*
        btnVolver = view.findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DataFragment dataFragment = new DataFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainerViewData, dataFragment).commit();

            }
        });
*/



        return view;
    }

    public void renderText(String text){
        getCorreo.setText(text);
    }
}