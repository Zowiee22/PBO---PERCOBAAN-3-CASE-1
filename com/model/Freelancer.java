package com.model;

public class Freelancer extends Pegawai {
    private int jamKerja;
    private double tarifPerJam;

    public Freelancer(String nama, int jamKerja, double tarifPerJam) { 
        super(nama); //menambahkan constructor super
        this.jamKerja = jamKerja;
        this.tarifPerJam = tarifPerJam;
    }

    @Override
    public double hitungGaji() { //ubah tipe data
        return jamKerja * tarifPerJam; //hapus tipe data
    } 
}
