package com.xavi.alojamientosmadridxml.entidad;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;
@Root(strict = false)
public class Service {
    @ElementList
    private List<GeoData> geoData;

    public Service() {
    }

    public Service(List<GeoData> geoData) {
        this.geoData = geoData;
    }

    public List<GeoData> getGeoData() {
        return geoData;
    }

    public void setGeoData(List<GeoData> geoData) {
        this.geoData = geoData;
    }

    @Override
    public String toString() {
        return "Service{" +
                "geoData=" + geoData +
                '}';
    }
}
