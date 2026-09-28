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

    private String idPelanggan;
    private String nama;
    private int noTelepon;
    private String alamat;

    public Pelanggan(
            String idPelanggan,
            String nama,
            int noTelepon,
            String alamat) {

        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }

    // Getter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public int getNoTelepon() {
        return noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoTelepon(int noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static void tambahPelanggan(
            ArrayList<Pelanggan> daftarPelanggan,
            Pelanggan pelanggan) {

        for (Pelanggan p : daftarPelanggan) {

            if (p.getIdPelanggan()
                    .equalsIgnoreCase(
                            pelanggan.getIdPelanggan())) {

                System.out.println(
                        "ID Pelanggan sudah digunakan!"
                );

                return;
            }
        }

        daftarPelanggan.add(pelanggan);

        System.out.println(
                "Data pelanggan berhasil ditambahkan."
        );
    }

    // ==============================
    // READ
    // ==============================
    public static void tampilkanPelanggan(
            ArrayList<Pelanggan> daftarPelanggan) {

        if (daftarPelanggan.isEmpty()) {

            System.out.println(
                    "Belum ada data pelanggan."
            );

            return;
        }

        for (Pelanggan p : daftarPelanggan) {

            System.out.println("------------------------------");
            System.out.println(
                    "ID Pelanggan : "
                    + p.getIdPelanggan()
            );
            System.out.println(
                    "Nama         : "
                    + p.getNama()
            );
            System.out.println(
                    "No. Telepon  : "
                    + p.getNoTelepon()
            );
            System.out.println(
                    "Alamat       : "
                    + p.getAlamat()
            );
        }

        System.out.println("------------------------------");
    }

    // ==============================
    // UPDATE
    // ==============================
    public static void ubahPelanggan(
            ArrayList<Pelanggan> daftarPelanggan,
            String id,
            String namaBaru,
            int noTeleponBaru,
            String alamatBaru) {

        for (Pelanggan p : daftarPelanggan) {

            if (p.getIdPelanggan()
                    .equalsIgnoreCase(id)) {

                p.setNama(namaBaru);
                p.setNoTelepon(noTeleponBaru);
                p.setAlamat(alamatBaru);

                System.out.println(
                        "Data pelanggan berhasil diubah."
                );

                return;
            }
        }

        System.out.println(
                "Data pelanggan tidak ditemukan."
        );
    }

    public static void hapusPelanggan(
            ArrayList<Pelanggan> daftarPelanggan,
            String id) {

        for (int i = 0;
                i < daftarPelanggan.size();
                i++) {

            if (daftarPelanggan.get(i)
                    .getIdPelanggan()
                    .equalsIgnoreCase(id)) {

                daftarPelanggan.remove(i);

                System.out.println(
                        "Data pelanggan berhasil dihapus."
                );

                return;
            }
        }

        System.out.println(
                "Data pelanggan tidak ditemukan."
        );
    }
}