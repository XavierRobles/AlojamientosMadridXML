package com.xavi.alojamientosmadridxml.recursos;

import android.util.Log;

import com.xavi.alojamientosmadridxml.entidad.Service;
import com.xavi.alojamientosmadridxml.entidad.ServiceList;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class PeticionXML {
    public static void pedirAlojamiento() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.esmadrid.com/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        PedirDatos service = retrofit.create(PedirDatos.class);
        Call<ServiceList> llamada = service.pedirAlojamientos();
        llamada.enqueue(new Callback<ServiceList>() {
            @Override
            public void onResponse(Call<ServiceList> call, Response<ServiceList> response) {
                ServiceList s = response.body();
                List<Service> lista_services = s.getLista_service();
                Log.d("RESPUESTA", lista_services.toString());
            }
            @Override
            public void onFailure(Call<ServiceList> call, Throwable t) {
                Log.d("RESPUESTA", t.getMessage());
            }
        });

    }

    public interface ActualizacionDatos {

    }
}
