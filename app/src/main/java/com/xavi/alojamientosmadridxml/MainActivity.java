package com.xavi.alojamientosmadridxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xavi.alojamientosmadridxml.recursos.PedirDatos;
import com.xavi.alojamientosmadridxml.recursos.PeticionXML;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PeticionXML.pedirAlojamiento();

    }
}