/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class ServicePerbaikanAC extends ServiceAC {

    private String jenisKerusakan;

    public ServicePerbaikanAC(String jenisKerusakan) {

        super("Perbaikan AC", 150000.0);

        this.jenisKerusakan = jenisKerusakan;
    }

    public String getJenisKerusakan() {
        return jenisKerusakan;
    }

    public void setJenisKerusakan(String jenisKerusakan) {
        this.jenisKerusakan = jenisKerusakan;
    }

    @Override
    public double hitungBiaya() {

        if (jenisKerusakan.equalsIgnoreCase("Ringan")) {

            return hargaService;

        } else if (jenisKerusakan.equalsIgnoreCase("Sedang")) {

            return hargaService + 50000.0;

        } else {

            return hargaService + 100000.0;
        }
    }

    @Override
    public void tampilkanService() {

        System.out.println("Jenis Service   : " + jenisService);
        System.out.println("Jenis Kerusakan : " + jenisKerusakan);
        System.out.println("Biaya Dasar     : Rp" + hargaService);
        System.out.println("Total Biaya     : Rp" + hitungBiaya());
    }
}
