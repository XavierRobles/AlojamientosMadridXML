package com.xavi.alojamientosmadridxml.entidad;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "geoData", strict = false)
public class GeoData {
    @Element(name = "address")
    public String address;
    @Element(name = "zipcode")
    public String zipcode;
    @Element(name = "locality")
    public String provincia;
    @Element(name = "country")
    public String pais;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "GeoData{" +
                "address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
