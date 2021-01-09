package com.xavi.alojamientosmadridxml.entidad;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "serviceList", strict = false)
public class ServiceList {
    @ElementList(name = "service")
    private List<Service> lista_service;

    public List<Service> getLista_service() {
        return lista_service;
    }

    public void setLista_service(List<Service> lista_service) {
        this.lista_service = lista_service;
    }

    @Override
    public String toString() {
        return "ServiceList{" +
                "lista_service=" + lista_service +
                '}';
    }
}
