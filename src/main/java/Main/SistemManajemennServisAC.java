/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Main;

import Model.DetailService;
import Model.Pelanggan;
import Model.ServiceAC;
import Model.ServiceCuciAC;
import Model.ServicePerbaikanAC;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SistemManajemennServisAC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
        ArrayList<DetailService> daftarService = new ArrayList<>();

        daftarPelanggan.add(
                new Pelanggan(
                        "P001",
                        "Andi",
                        812345678,
                        "Samarinda"
                )
        );

        daftarService.add(
                new DetailService(
                        "S001",
                        "28-09-2026",
                        "AC tidak dingin",
                        "Menunggu"
                )
        );

        int pilihan;

        do {

            System.out.println("\n==========================================");
            System.out.println("     SISTEM MANAJEMEN JASA SERVICE AC");
            System.out.println("==========================================");
            System.out.println("1. Kelola Data Pelanggan");
            System.out.println("2. Kelola Data Service");
            System.out.println("3. Informasi Jenis Service");
            System.out.println("4. Keluar");
            System.out.println("==========================================");
            System.out.print("Pilih Menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {

                int menuPelanggan;

                do {

                    System.out.println("\n------------------------------");
                    System.out.println("       MENU PELANGGAN");
                    System.out.println("------------------------------");
                    System.out.println("1. Tambah Pelanggan");
                    System.out.println("2. Lihat Pelanggan");
                    System.out.println("3. Ubah Pelanggan");
                    System.out.println("4. Hapus Pelanggan");
                    System.out.println("5. Kembali");
                    System.out.print("Pilih : ");

                    menuPelanggan = input.nextInt();
                    input.nextLine();

                    switch (menuPelanggan) {

                        case 1:

                            System.out.println("\n--- TAMBAH PELANGGAN ---");

                            System.out.print("ID Pelanggan : ");
                            String id = input.nextLine();

                            System.out.print("Nama         : ");
                            String nama = input.nextLine();

                            System.out.print("No. Telepon  : ");
                            int noTelepon = input.nextInt();
                            input.nextLine();

                            System.out.print("Alamat       : ");
                            String alamat = input.nextLine();

                            Pelanggan pelangganBaru =
                                    new Pelanggan(
                                            id,
                                            nama,
                                            noTelepon,
                                            alamat
                                    );

                            Pelanggan.tambahPelanggan(
                                    daftarPelanggan,
                                    pelangganBaru
                            );

                            break;

                        case 2:

                            System.out.println("\n--- DATA PELANGGAN ---");

                            Pelanggan.tampilkanPelanggan(
                                    daftarPelanggan
                            );

                            break;

                        case 3:

                            System.out.println("\n--- UBAH PELANGGAN ---");

                            System.out.print("Masukkan ID Pelanggan : ");
                            String idUbah = input.nextLine();

                            System.out.print("Nama Baru            : ");
                            String namaBaru = input.nextLine();

                            System.out.print("No. Telepon Baru     : ");
                            int noTeleponBaru = input.nextInt();
                            input.nextLine();

                            System.out.print("Alamat Baru          : ");
                            String alamatBaru = input.nextLine();

                            Pelanggan.ubahPelanggan(
                                    daftarPelanggan,
                                    idUbah,
                                    namaBaru,
                                    noTeleponBaru,
                                    alamatBaru
                            );

                            break;

                        case 4:

                            System.out.println("\n--- HAPUS PELANGGAN ---");

                            System.out.print("Masukkan ID Pelanggan : ");
                            String idHapus = input.nextLine();

                            Pelanggan.hapusPelanggan(
                                    daftarPelanggan,
                                    idHapus
                            );

                            break;

                        case 5:

                            System.out.println(
                                    "Kembali ke menu utama."
                            );

                            break;

                        default:

                            System.out.println(
                                    "Pilihan tidak tersedia."
                            );
                    }

                } while (menuPelanggan != 5);
            }

            else if (pilihan == 2) {

                int menuService;

                do {

                    System.out.println("\n------------------------------");
                    System.out.println("        MENU SERVICE AC");
                    System.out.println("------------------------------");
                    System.out.println("1. Tambah Service");
                    System.out.println("2. Lihat Service");
                    System.out.println("3. Ubah Service");
                    System.out.println("4. Hapus Service");
                    System.out.println("5. Kembali");
                    System.out.print("Pilih : ");

                    menuService = input.nextInt();
                    input.nextLine();

                    switch (menuService) {

                        case 1:

                            System.out.println("\n--- TAMBAH SERVICE ---");

                            System.out.print("ID Service : ");
                            String idService = input.nextLine();

                            System.out.print("Tanggal    : ");
                            String tanggal = input.nextLine();

                            System.out.print("Keluhan    : ");
                            String keluhan = input.nextLine();

                            System.out.print("Status     : ");
                            String status = input.nextLine();

                            DetailService serviceBaru =
                                    new DetailService(
                                            idService,
                                            tanggal,
                                            keluhan,
                                            status
                                    );

                            DetailService.tambahService(
                                    daftarService,
                                    serviceBaru
                            );

                            break;

                        case 2:

                            System.out.println("\n--- DATA SERVICE ---");

                            DetailService.tampilkanService(
                                    daftarService
                            );

                            break;

                        case 3:

                            System.out.println("\n--- UBAH SERVICE ---");

                            System.out.print("Masukkan ID Service : ");
                            String idUbahService =
                                    input.nextLine();

                            System.out.print("Tanggal Baru       : ");
                            String tanggalBaru =
                                    input.nextLine();

                            System.out.print("Keluhan Baru       : ");
                            String keluhanBaru =
                                    input.nextLine();

                            System.out.print("Status Baru        : ");
                            String statusBaru =
                                    input.nextLine();

                            DetailService.ubahService(
                                    daftarService,
                                    idUbahService,
                                    tanggalBaru,
                                    keluhanBaru,
                                    statusBaru
                            );

                            break;

                        case 4:

                            System.out.println("\n--- HAPUS SERVICE ---");

                            System.out.print("Masukkan ID Service : ");
                            String idHapusService =
                                    input.nextLine();

                            DetailService.hapusService(
                                    daftarService,
                                    idHapusService
                            );

                            break;

                        case 5:

                            System.out.println(
                                    "Kembali ke menu utama."
                            );

                            break;

                        default:

                            System.out.println(
                                    "Pilihan tidak tersedia."
                            );
                    }

                } while (menuService != 5);
            }

            else if (pilihan == 3) {

                System.out.println(
                        "\n=================================="
                );
                System.out.println(
                        "       INFORMASI JENIS SERVICE"
                );
                System.out.println(
                        "=================================="
                );


                ServiceAC cuci =
                        new ServiceCuciAC(1);

                ServiceAC perbaikan =
                        new ServicePerbaikanAC("Sedang");

                System.out.println("\n1. Cuci AC");
                cuci.tampilkanService();

                System.out.println("\n2. Perbaikan AC");
                perbaikan.tampilkanService();
            }

            else if (pilihan == 4) {

                System.out.println(
                        "\nTerima kasih telah menggunakan "
                        + "Sistem Manajemen Jasa Service AC."
                );
            }

            else {

                System.out.println(
                        "\nPilihan tidak tersedia!"
                );
            }

        } while (pilihan != 4);

        input.close();
    }
}