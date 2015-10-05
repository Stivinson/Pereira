package com.stivinsonmartinez.pereira;

/**
 * Created by Stivinson on 02/10/2015.
 */
public class Lista_Bares {
    private int idImagen;
    private String direccion;
    private String informacion;
    private int FlechaImagen;

    public Lista_Bares(int idImagen, String direccion, String informacion, int FlechaImagen) {
        this.idImagen = idImagen;
        this.direccion = direccion;
        this.informacion = informacion;
        this.FlechaImagen = FlechaImagen;

    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFlechaImagen() {
        return FlechaImagen;
    }

    public void setFlechaImagen(int flechaImagen) {
        FlechaImagen = flechaImagen;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
