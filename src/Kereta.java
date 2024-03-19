public class Kereta {
    String namaKereta;
    int jumlahTiketTersedia;
    Ticket tiket;

    public Kereta() {
        this.namaKereta = "Kereta Komuter";
        this.jumlahTiketTersedia = 1000;
        this.tiket = new Ticket();
    }

    public Kereta(String namaKereta, int jumlahTiketTersedia) {
        this.namaKereta = namaKereta;
        this.jumlahTiketTersedia = jumlahTiketTersedia;
        this.tiket = new Ticket(namaKereta, jumlahTiketTersedia);
    }

    public void tambahTiket(String namaPenumpang) {

        String[] nama = new String[tiket.getNamaPenumpang().length + 1];
        System.arraycopy(tiket.getNamaPenumpang(), 0, nama, 0, tiket.getNamaPenumpang().length);
        nama[tiket.getNamaPenumpang().length] = namaPenumpang;
        tiket.setNamaPenumpang(nama);

        System.out.println("==========================================");
        System.out.println("Tiket Berhasil Dipesan");
    }

    public void tambahTiket(String namaPenumpang, String a, String t) {
        if (tiket.getNamaPenumpang().length < jumlahTiketTersedia) {
            String[] nama = new String[tiket.getNamaPenumpang().length + 1];
            String[] asal = new String[tiket.getAsal().length + 1];
            String[] tujuan = new String[tiket.getTujuan().length + 1];

            System.arraycopy(tiket.getNamaPenumpang(), 0, nama, 0, tiket.getNamaPenumpang().length);
            System.arraycopy(tiket.getAsal(), 0, asal, 0, tiket.getAsal().length);
            System.arraycopy(tiket.getTujuan(), 0, tujuan, 0, tiket.getTujuan().length);
            ;

            nama[tiket.getNamaPenumpang().length] = namaPenumpang;
            asal[tiket.getAsal().length] = a;
            tujuan[tiket.getTujuan().length] = t;

            tiket.setNamaPenumpang(nama);
            tiket.setAsal(asal);
            tiket.setTujuan(tujuan);

            if (jumlahTiketTersedia - tiket.getNamaPenumpang().length < 30) {
                System.out.println("==========================================");
                System.out.println(
                        "Tiket Berhasil Dipesan Sisa Tiket Tersedia: "
                                + (jumlahTiketTersedia - tiket.getNamaPenumpang().length));

            } else {
                System.out.println("==========================================");
                System.out.println("Tiket Berhasil Dipesan");

            }

        } else {
            System.out.println("==========================================");
            System.out.println("Kereta Telah Habis, Silahkan Cari Jadwal Keberangkatan Lain");

        }
    }

    public void tampilkanTiket() {
        System.out.println("==========================================");
        System.out.println("Daftar Penumpang Kereta Api " + this.namaKereta + ": ");
        System.out.println("------------------------------");

        for (int i = 0; i < tiket.getNamaPenumpang().length; i++) {
            if (this.namaKereta.equals("Kereta Komuter")) {
                System.out.println("Nama: " + this.tiket.getNamaPenumpang()[i]);

            } else {
                System.out.println("Nama: " + this.tiket.getNamaPenumpang()[i]);
                System.out.println("Asal: " + this.tiket.getAsal()[i]);
                System.out.println("Tujuan: " + this.tiket.getTujuan()[i]);
                System.out.println("------------------------------");
            }
        }
    }

}