/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */

import java.util.ArrayList;

public class Pelanggan {

    // =========================
    // ENCAPSULATION
    // =========================
    private String idPelanggan;
    private String nama;
    private String noTelepon;
    private String alamat;

    // Menyimpan seluruh data pelanggan
    private static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();

    // Constructor
    public Pelanggan(String idPelanggan, String nama,
                     String noTelepon, String alamat) {

        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static void tambahPelanggan(Pelanggan pelanggan) {

        for (Pelanggan p : daftarPelanggan) {

            if (p.getIdPelanggan().equalsIgnoreCase(
                    pelanggan.getIdPelanggan())) {

                System.out.println("ID pelanggan sudah digunakan!");
                return;
            }
        }

        daftarPelanggan.add(pelanggan);

        System.out.println("Data pelanggan berhasil ditambahkan!");
    }

    public static void tampilkanPelanggan() {

        if (daftarPelanggan.isEmpty()) {

            System.out.println("Belum ada data pelanggan.");
            return;
        }

        System.out.println("\n========== DATA PELANGGAN ==========");

        int nomor = 1;

        // PERULANGAN
        for (Pelanggan p : daftarPelanggan) {

            System.out.println("\nPelanggan ke-" + nomor);
            System.out.println("ID Pelanggan : " + p.getIdPelanggan());
            System.out.println("Nama         : " + p.getNama());
            System.out.println("No. Telepon  : " + p.getNoTelepon());
            System.out.println("Alamat       : " + p.getAlamat());

            nomor++;
        }
    }

    public static void ubahPelanggan(String id) {

        for (Pelanggan p : daftarPelanggan) {

            if (p.getIdPelanggan().equalsIgnoreCase(id)) {

                p.setNama("Nama Diperbarui");
                p.setNoTelepon("Nomor Diperbarui");
                p.setAlamat("Alamat Diperbarui");

                System.out.println("Data pelanggan berhasil diubah!");
                return;
            }
        }

        System.out.println("Data pelanggan tidak ditemukan.");
    }

    public static void hapusPelanggan(String id) {

        for (int i = 0; i < daftarPelanggan.size(); i++) {

            if (daftarPelanggan.get(i)
                    .getIdPelanggan()
                    .equalsIgnoreCase(id)) {

                daftarPelanggan.remove(i);

                System.out.println("Data pelanggan berhasil dihapus!");
                return;
            }
        }

        System.out.println("Data pelanggan tidak ditemukan.");
    }
}