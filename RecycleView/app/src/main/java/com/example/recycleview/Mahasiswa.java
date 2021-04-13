package com.example.recycleview;

public class Mahasiswa {
    public int getNoHp;
    private String nama;
    private String nim;
    private String noHp;

    public Mahasiswa (String nama, String nim, String noHp){
        this.nama = nama;
        this.nim = nim;
        this.noHp = noHp;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNoHpnoHp(){
        return noHp;
    }
    public void setnoHp(String noHp){
        this.noHp = noHp;
    }

}
