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

public class DetailService {

    private String idService;
    private String tanggalService;
    private String keluhan;
    private String status;

    public DetailService(
            String idService,
            String tanggalService,
            String keluhan,
            String status) {

        this.idService = idService;
        this.tanggalService = tanggalService;
        this.keluhan = keluhan;
        this.status = status;
    }

    public String getIdService() {
        return idService;
    }

    public String getTanggalService() {
        return tanggalService;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getStatus() {
        return status;
    }

    public void setTanggalService(
            String tanggalService) {

        this.tanggalService = tanggalService;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void tambahService(
            ArrayList<DetailService> daftarService,
            DetailService service) {

        for (DetailService s : daftarService) {

            if (s.getIdService()
                    .equalsIgnoreCase(
                            service.getIdService())) {

                System.out.println(
                        "ID Service sudah digunakan!"
                );

                return;
            }
        }

        daftarService.add(service);

        System.out.println(
                "Data service berhasil ditambahkan."
        );
    }

    public static void tampilkanService(
            ArrayList<DetailService> daftarService) {

        if (daftarService.isEmpty()) {

            System.out.println(
                    "Belum ada data service."
            );

            return;
        }

        for (DetailService s : daftarService) {

            System.out.println("------------------------------");
            System.out.println(
                    "ID Service : "
                    + s.getIdService()
            );
            System.out.println(
                    "Tanggal    : "
                    + s.getTanggalService()
            );
            System.out.println(
                    "Keluhan    : "
                    + s.getKeluhan()
            );
            System.out.println(
                    "Status     : "
                    + s.getStatus()
            );
        }

        System.out.println("------------------------------");
    }

    public static void ubahService(
            ArrayList<DetailService> daftarService,
            String id,
            String tanggalBaru,
            String keluhanBaru,
            String statusBaru) {

        for (DetailService s : daftarService) {

            if (s.getIdService()
                    .equalsIgnoreCase(id)) {

                s.setTanggalService(tanggalBaru);
                s.setKeluhan(keluhanBaru);
                s.setStatus(statusBaru);

                System.out.println(
                        "Data service berhasil diubah."
                );

                return;
            }
        }

        System.out.println(
                "Data service tidak ditemukan."
        );
    }

    public static void hapusService(
            ArrayList<DetailService> daftarService,
            String id) {

        for (int i = 0;
                i < daftarService.size();
                i++) {

            if (daftarService.get(i)
                    .getIdService()
                    .equalsIgnoreCase(id)) {

                daftarService.remove(i);

                System.out.println(
                        "Data service berhasil dihapus."
                );

                return;
            }
        }

        System.out.println(
                "Data service tidak ditemukan."
        );
    }
}