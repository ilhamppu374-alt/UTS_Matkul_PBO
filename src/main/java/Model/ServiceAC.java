/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class ServiceAC {

    protected String jenisService;
    protected double hargaService;

    public ServiceAC(String jenisService, double hargaService) {

        this.jenisService = jenisService;
        this.hargaService = hargaService;
    }

    public double hitungBiaya() {

        return hargaService;
    }

    public void tampilkanService() {

        System.out.println("Jenis Service : " + jenisService);
        System.out.println("Harga Service : Rp" + hargaService);
    }
}

