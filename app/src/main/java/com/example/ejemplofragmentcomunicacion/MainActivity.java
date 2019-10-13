package com.example.ejemplofragmentcomunicacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyInterface{
    TextView tvTextoDeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTextoDeFragment = (TextView)findViewById(R.id.tvTextoDeFragment);

        agregarFragment();


    }

    public void agregarFragment(){
        FragmentManager fragmentManager= getSupportFragmentManager();
        MyFragment fragment= new MyFragment();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.contenedor, fragment,"fragment1");
        transaction.commit();
    }

    @Override
    public void enviarDatos(String dato) {
        //Seteamos el dato al textView, este es el que viene en el fragment
        tvTextoDeFragment.setText(dato);

    }
}
