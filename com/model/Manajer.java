package com.model;

public class Manajer extends Pegawai {
    private double gajiPokok;
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }
}
