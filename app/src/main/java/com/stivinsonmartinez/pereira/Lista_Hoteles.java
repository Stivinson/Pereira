package com.stivinsonmartinez.pereira;

/**
 * Created by Stivinson on 04/10/2015.
 */
public class Lista_Hoteles{
    private int idImagenH;
    private String direccionH;
    private String informacionH;
    private int FlechaImagenH;

    public Lista_Hoteles(int idImagenH, String direccionH, String informacionH, int FlechaImagenH) {
        this.idImagenH = idImagenH;
        this.direccionH = direccionH;
        this.informacionH = informacionH;
        this.FlechaImagenH = FlechaImagenH;

    }

    public int getIdImagenH() {
        return idImagenH;
    }

    public void setIdImagenH(int idImagenH) {
        this.idImagenH = idImagenH;
    }

    public String getDireccionH() {
        return direccionH;
    }

    public void setDireccionH(String direccionH) {
        this.direccionH = direccionH;
    }

    public int getFlechaImagenH() {
        return FlechaImagenH;
    }

    public void setFlechaImagenH(int flechaImagenH) {
        FlechaImagenH = flechaImagenH;
    }

    public String getInformacionH() {
        return informacionH;
    }

    public void setInformacionH(String informacionH) {
        this.informacionH = informacionH;
    }
}
