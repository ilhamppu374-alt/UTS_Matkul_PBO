/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class ServiceCuciAC extends ServiceAC {

    private int jumlahAC;

    public ServiceCuciAC(int jumlahAC) {

        super("Cuci AC", 75000.0);

        this.jumlahAC = jumlahAC;
    }

    public int getJumlahAC() {
        return jumlahAC;
    }

    public void setJumlahAC(int jumlahAC) {
        this.jumlahAC = jumlahAC;
    }

    @Override
    public double hitungBiaya() {

        return hargaService * jumlahAC;
    }

    @Override
    public void tampilkanService() {

        System.out.println("Jenis Service : " + jenisService);
        System.out.println("Jumlah AC     : " + jumlahAC);
        System.out.println("Harga / AC    : Rp" + hargaService);
        System.out.println("Total Biaya   : Rp" + hitungBiaya());
    }
}