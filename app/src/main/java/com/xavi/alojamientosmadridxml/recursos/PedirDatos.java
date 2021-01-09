package com.xavi.alojamientosmadridxml.recursos;

import com.xavi.alojamientosmadridxml.entidad.Service;
import com.xavi.alojamientosmadridxml.entidad.ServiceList;

import retrofit2.Call;
import retrofit2.http.GET;
//http://www.esmadrid.com/opendata/alojamientos_v1_es.xml
public interface PedirDatos {
        @GET("opendata/alojamientos_v1_es.xml")
        Call<ServiceList> pedirAlojamientos();
}
