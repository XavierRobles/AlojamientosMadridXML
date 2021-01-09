package com.xavi.alojamientosmadridxml.entidad;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class GeoData {
    @Element(name = "address")
    public String address;
    @Element(name="zipcode")
    private String cp;
    @Element(name="locality")
    private String provincia;
    @Element(name="country")
    private String pais;

    public String getCalle() {
        return address;
    }

    public void setCalle(String address) {
        this.address = address;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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
                "calle='" + address + '\'' +
                ", cp='" + cp + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
