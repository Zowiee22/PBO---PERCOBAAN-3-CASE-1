package com.model;

public abstract class Pegawai { //tambahkan public dan abstract 
    protected String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }
    
    public abstract double hitungGaji(); //tambahkan abstract dan hapus kondisi
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Total Gaji: Rp" + hitungGaji());
    }
}
