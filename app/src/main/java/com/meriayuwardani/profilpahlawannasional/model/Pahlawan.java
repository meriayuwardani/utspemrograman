package com.meriayuwardani.profilpahlawannasional.model;

public class    Pahlawan {
    private String profil;
    private String nama;
    private String alamat;
    private String tgl_lahir;
    private int drawableRes;

    public Pahlawan(String profil, String nama, String alamat, String tgl_lahir, int drawableRes) {
        this.profil = profil;
        this.nama = nama;
        this.alamat = alamat;
        this.tgl_lahir = tgl_lahir;
        this.drawableRes = drawableRes;
    }
    public String getprofil() {
        return profil;
    }

    public void setprofil(String profil) {
        this.profil = profil;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String gettgl_lahir() {
        return tgl_lahir;
    }

    public void settgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
