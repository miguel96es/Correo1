package com.example.correo1.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.correo1.Fragments.DataFragment;
import com.example.correo1.Fragments.DetailsFragment;
import com.example.correo1.R;

public class MainActivity extends AppCompatActivity implements DataFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add fragment to main activity

        //DataFragment dataFragment = new DataFragment();
        //FragmentManager manager = getSupportFragmentManager();
        //manager.beginTransaction().add(R.id.contenedor, dataFragment).commit();

        //first fragment is added successfully

    }



    @Override
    public void sendData(String text) {
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerViewDetails);
        detailsFragment.renderText(text);
    }
}