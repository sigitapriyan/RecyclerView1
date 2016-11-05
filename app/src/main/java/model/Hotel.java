package model;

import android.graphics.drawable.Drawable;

import java.sql.Driver;

/**
 * Created by SAVIOUR-2 on 05/11/2016.
 */

public class Hotel
{
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
