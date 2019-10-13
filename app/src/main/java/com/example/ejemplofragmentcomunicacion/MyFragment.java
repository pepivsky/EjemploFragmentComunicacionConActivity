package com.example.ejemplofragmentcomunicacion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    EditText edtNum;
    Button btnEnviar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment, container, false);

        edtNum = (EditText)view.findViewById(R.id.edtNum);
        btnEnviar = (Button) view.findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepararDatos();

            }
        });

        return view;
    }

    private void prepararDatos(){
        //Obtenemos el dato
        String dato = edtNum.getText().toString();
        MyInterface myInterface = (MyInterface)getActivity();
        //Le pasamos el dato a la interfaz
        myInterface.enviarDatos(dato);
    }


}
