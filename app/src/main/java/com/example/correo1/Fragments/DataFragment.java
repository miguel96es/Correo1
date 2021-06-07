package com.example.correo1.Fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
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

    private DataListener callback;
    TextView textCorreo1;
    TextView textCorreo2;
    TextView textCorreo3;



    public DataFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            callback = (DataListener) context;
        }catch (Exception e){
            throw new ClassCastException(context.toString()+" should implement DataListener ");
        }
    }
// here we replace first fragment with second

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_data, container, false);


 //Boton cambiar fragmento
        /*
        btncambiar = view.findViewById(R.id.botonCambiar);
        btncambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DetailsFragment detailsFragment = new DetailsFragment();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainerViewData, detailsFragment).commit();



            }
        });

*/


//Envia datos del correo1
        textCorreo1 = (TextView) view.findViewById(R.id.textCorreo1);
        textCorreo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String textToSend = textCorreo1.getText().toString();
                    callback.sendData(textToSend);
            }
        });
//Envia datos del correo2
        textCorreo2 = (TextView) view.findViewById(R.id.textCorreo2);
        textCorreo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = textCorreo2.getText().toString();
                callback.sendData(textToSend);
            }
        });
        //Envia datos del correo3
        textCorreo3 = (TextView) view.findViewById(R.id.textCorreo3);
        textCorreo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = textCorreo3.getText().toString();
                callback.sendData(textToSend);
            }
        });




        return view;
    }

    public interface DataListener {
        void sendData(String text);
    }



}