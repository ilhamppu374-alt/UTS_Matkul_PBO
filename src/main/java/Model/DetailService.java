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

    // =========================
    // ATRIBUT
    // =========================
    private String idService;
    private String tanggalService;
    private String keluhan;
    private String status;

    private static ArrayList<DetailService> daftarService
            = new ArrayList<>();

    public DetailService(String idService,
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

    public void setTanggalService(String tanggalService) {
        this.tanggalService = tanggalService;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void tambahService(DetailService service) {

        for (DetailService d : daftarService) {

            if (d.getIdService()
                    .equalsIgnoreCase(service.getIdService())) {

                System.out.println("ID service sudah digunakan!");
                return;
            }
        }

        daftarService.add(service);

        System.out.println("Data service berhasil ditambahkan!");
    }

    public static void tampilkanService() {

        if (daftarService.isEmpty()) {
            System.out.println("Belum ada data service.");
            return;
        }

        System.out.println("\n========== DATA SERVICE AC ==========");

        int nomor = 1;

        for (DetailService d : daftarService) {

            System.out.println("\nService ke-" + nomor);
            System.out.println("ID Service   : " + d.getIdService());
            System.out.println("Tanggal      : " + d.getTanggalService());
            System.out.println("Keluhan      : " + d.getKeluhan());
            System.out.println("Status       : " + d.getStatus());

            nomor++;
        }
    }

    public static void ubahService(
            String id) {

        for (DetailService d : daftarService) {

            if (d.getIdService().equalsIgnoreCase(id)) {
                String tanggalBaru;

                String keluhanBaru;
                String statusBaru;

                System.out.println("Data service berhasil diubah!");
                return;
            }
        }

        System.out.println("Data service tidak ditemukan.");
    }

    public static void hapusService(String id) {

        for (int i = 0; i < daftarService.size(); i++) {

            if (daftarService.get(i)
                    .getIdService()
                    .equalsIgnoreCase(id)) {

                daftarService.remove(i);

                System.out.println("Data service berhasil dihapus!");
                return;
            }
        }

        System.out.println("Data service tidak ditemukan.");
    }
}