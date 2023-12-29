package uasalpro_202353080;

import java.util.Scanner;

public class CintaKost {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        intro();
        stripe();
        System.out.println("");
        System.out.println("Terimakasih telah melakukan sewa kost"
                + " di cinta kost");
    }

    //awal method intro
    public static void intro() {
        stripe();
        System.out.println("");
        System.out.println("\t\t Cinta Kost");
        System.out.println("Selamat Datang di pelayanan sewa kamar Cinta Kost");
        tipeKamar();

    }
    //akhir method intro

    //awal method stripe
    public static void stripe() {
        int garis;

        for (garis = 1; garis <= 25; garis++) {
            System.out.print("--");
        }
    }
    //akhir method stripe

    //awal method tipeKamar
    public static void tipeKamar() {
        int pilih;
        String nama, noHp;

        stripe();
        System.out.println("");
        System.out.print("\t Masukkan Nama     : ");
        nama = input.next();
        System.out.print("\t Masukkan Nomor HP : ");
        noHp = input.next();
        stripe();
        System.out.println("");
        System.out.print("\tTersedia Tipe Kamar : "
                + "\n\t1. Tipe Kamar Single"
                + "\n\t2. Tipe Kamar Double"
                + "\n\t3. Tambahan Fasilitas Kamar"
                + "\n\t4. Beri Rating Cinta Kost");
        System.out.println("");
        stripe();
        System.out.println("");
        System.out.print("\tMasukkan pilihan : ");
        int ulangi;

        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                kamarSingle();
                System.out.print("Nama Penyewa : ");
                System.out.println(nama);
                System.out.print("Nomor HP : ");
                System.out.println(noHp);
                stripe();
                System.out.println("");
                System.out.print("Apakah anda ingin ke menu awal [1]"
                        + " atau selesai [2]."
                        + "\nMasukkan [1/2] : ");
                ulangi = input.nextInt();
                if (ulangi == 1) {
                    intro();
                }
                break;
            case 2:
                kamarDouble();
                System.out.print("Nama Penyewa : ");
                System.out.println(nama);
                System.out.print("Nomor HP : ");
                System.out.println(noHp);
                stripe();
                System.out.println("");
                System.out.print("Apakah anda ingin ke menu awal [1]"
                        + " atau selesai [2]."
                        + "\nMasukkan [1/2] : ");
                ulangi = input.nextInt();
                if (ulangi == 1) {
                    intro();
                }
                break;
            case 3:
                fasilitasKamar();
                System.out.print("Nama Penyewa : ");
                System.out.println(nama);
                System.out.print("Nomor HP : ");
                System.out.println(noHp);
                stripe();
                System.out.println("");
                System.out.print("Apakah anda ingin ke menu awal [1]"
                        + " atau selesai [2]."
                        + "\nMasukkan [1/2] : ");
                ulangi = input.nextInt();
                if (ulangi == 1) {
                    intro();
                }
                break;
            case 4:
                rating();
                System.out.print("Nama Penyewa : ");
                System.out.println(nama);
                System.out.print("Nomor HP : ");
                System.out.println(noHp);
                stripe();
                System.out.println("");
                System.out.print("Apakah anda ingin ke menu awal [1]"
                        + " atau selesai [2]."
                        + "\nMasukkan [1/2] : ");
                ulangi = input.nextInt();
                if (ulangi == 1) {
                    intro();
                }
                break;
            default:
                stripe();
                System.out.println("");
                System.out.println("Maaf pilihan tidak tersedia");
        }

    }
    //akhir method tipeKamar

    //awal method kamarSingle
    public static void kamarSingle() {
        int bil, lamaSewa;

        stripe();
        System.out.println("");
        System.out.println("\t\tKamar Single : ");
        System.out.println("1. Kamar mandi dalam, Springbed, "
                + "\n   bantal, almari (550k/bulan)");
        System.out.println("2. Sudah memesan kamar");
        stripe();
        System.out.println("");
        System.out.print("\tMasukkan pilihan anda : ");
        bil = input.nextInt();

        double bayar, uang, harga;

        switch (bil) {
            case 1:
                stripe();
                System.out.println("");
                System.out.print("\t\tLama Sewa : ");
                lamaSewa = input.nextInt();
                harga = 550000 * lamaSewa;
                stripe();
                System.out.println("");
                System.out.print("Anda menyewa selama " + lamaSewa + " bulan."
                        + "\nAnda harus membayar seharga " + harga
                        + "\nMasukkan jumlah pembayaran anda : ");
                uang = input.nextDouble();
                if (uang >= harga) {
                    stripe();
                    System.out.println("");
                    System.out.print("Selamat anda berhasil menyewa "
                            + "kamar single "
                            + "\ndi Cinta Kost"
                            + "\nSilakan ambil kembalian anda : ");
                    bayar = uang - harga;
                    System.out.print(bayar);
                    if (harga >= 6600000) {
                        System.out.println("\nSelamat! Sewa Kos selama " + lamaSewa
                                + " bulan "
                                + "\ndengan harga " + harga
                                + "\nMendapatkan bonus Voucher Listrik sebesar 100.000");
                    } else {
                        System.out.println("\nSelamat! Sewa Kos selama " + lamaSewa
                                + " bulan "
                                + "\nDengan harga " + harga + " Mendapatkan bonus Air Galon");
                    }
                } else {
                    stripe();
                    System.out.println("");
                    System.out.println("Maaf uang anda kurang untuk menyewa "
                            + "kamar single \ndi cinta kost"
                            + ""
                            + "\nKembali menghitung awal");
                    kamarSingle();
                }
                break;
            case 2:
                System.out.println("Terimakasih telah memesan kamar single"
                        + " di cinta kost.");
                break;
        }
    }
    //akhir method kamarSingle

    //awal method kamarDouble
    public static void kamarDouble() {
        int bil2, lamaSewa2;

        stripe();
        System.out.println("");
        System.out.println("\t\tKamar Double : ");
        System.out.println("1. Kamar mandi dalam, Springbed, "
                + "\n   bantal, almari (650k/bulan)");
        System.out.println("2. Sudah memesan kamar");
        stripe();
        System.out.println("");
        System.out.print("\tMasukkan pilihan anda : ");
        bil2 = input.nextInt();

        double bayar2, uang2, harga2;
        switch (bil2) {
            case 1:
                stripe();
                System.out.println("");
                System.out.print("\t\tLama Sewa : ");
                lamaSewa2 = input.nextInt();
                harga2 = 650000 * lamaSewa2;
                stripe();
                System.out.println("");
                System.out.print("Anda menyewa selama " + lamaSewa2 + " bulan."
                        + "\nAnda harus membayar seharga " + harga2);

                double diskon;
                if (harga2 >= 7800000) {
                    diskon = harga2 - (harga2 * 4 / 100);
                    System.out.println("");
                    System.out.print("Anda juga mendapatkan diskon"
                            + " sebesar 4%"
                            + "\nJadi total pembayaran anda "
                            + "\nsebesar " + diskon
                            + "\nSilakan masukan pembayaran anda : ");
                } else {
                    diskon = harga2 - (harga2 * 2 / 100);
                    System.out.println("");
                    System.out.print("Anda juga mendapatkn diskon"
                            + " sebesar 2%"
                            + "\nJadi total pembayaran anda "
                            + "\nsebesar " + diskon
                            + "\nSilakan masukan pembayaran anda : ");
                }
                uang2 = input.nextDouble();
                bayar2 = uang2 - diskon;
                if (uang2 >= diskon) {
                    stripe();
                    System.out.println("");
                    System.out.print("selamat anda telah berhasil menyewa"
                            + " kamar double "
                            + "\ndi cinta kost"
                            + "\nSilakan ambil kembalian anda : " + bayar2);
                    System.out.println("");
                } else {
                    stripe();
                    System.out.println("");
                    System.out.println("Maaf, uang anda kurang "
                            + "untuk menyewa kamar double"
                            + "\ndi cinta kost"
                            + "\nkembali menghitung awal");
                    kamarDouble();
                }
                break;
            case 2:
                System.out.println("Terimakasih telah memesan kamar double"
                        + " di cinta kost.");
                break;
        }
    }
    //akhir method kamarDouble

    //awal method fasilitasKamar
    public static void fasilitasKamar() {
        int pilihan, lamaSewa3, harga3, jumlahSewa, bayar3, uang3;

        stripe();
        System.out.println("");
        System.out.println("Tambahan Fasilitas Kamar : ");
        System.out.println("1. Meja Belajar [30k/bulan]");
        System.out.println("2. Setrika [32k/bulan]");
        System.out.println("3. Penanak Nasi [35k/bulan]");
        System.out.print("Masukkan fasilitas tambahan pilihan anda :  ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                stripe();
                System.out.println("");
                System.out.print("Lama Sewa : ");
                lamaSewa3 = input.nextInt();
                System.out.println("");
                System.out.print("Jumlah Sewa : ");
                jumlahSewa = input.nextInt();
                harga3 = 30000 * lamaSewa3 * jumlahSewa;
                System.out.println("");
                System.out.print("Jadi total bayar anda sebesar " + harga3
                        + "\nMasukkan pembayaran anda : ");
                uang3 = input.nextInt();
                if (uang3 >= harga3) {
                    stripe();
                    System.out.println("");
                    System.out.println("Selamat anda telah berhasil menyewa "
                            + "\n" + jumlahSewa + " meja belajar selama"
                            + " " + lamaSewa3 + " bulan.");
                    System.out.print("Silakan ambil kembalian anda : ");
                    bayar3 = uang3 - harga3;
                    System.out.println(bayar3);
                } else {
                    stripe();
                    System.out.println("");
                    System.out.println("Maaf uang anda tidak cukup"
                            + "\nuntuk menyewa " + jumlahSewa + " meja belajar selama"
                            + "\n" + lamaSewa3 + " bulan"
                            + "\nKembali menghitung");
                    fasilitasKamar();
                }
                break;
            case 2:
                stripe();
                System.out.println("");
                System.out.print("Lama Sewa : ");
                lamaSewa3 = input.nextInt();
                System.out.println("");
                System.out.print("Jumlah Sewa : ");
                jumlahSewa = input.nextInt();
                harga3 = 32000 * lamaSewa3 * jumlahSewa;
                System.out.println("");
                System.out.print("Jadi total bayar anda sebesar " + harga3
                        + "\nMasukkan pembayaran anda : ");
                uang3 = input.nextInt();
                if (uang3 >= harga3) {
                    stripe();
                    System.out.println("");
                    System.out.println("Selamat anda telah berhasil menyewa "
                            + "\n" + jumlahSewa + " setrika selama"
                            + " " + lamaSewa3 + " bulan.");
                    System.out.print("Silakan ambil kembalian anda : ");
                    bayar3 = uang3 - harga3;
                    System.out.println(bayar3);
                } else {
                    stripe();
                    System.out.println("");
                    System.out.println("Maaf uang anda tidak cukup"
                            + "\nuntuk menyewa " + jumlahSewa + " setrika selama"
                            + "\n" + lamaSewa3 + " bulan"
                            + "\nKembali menghitung");
                    fasilitasKamar();
                }
                break;
            case 3:
                stripe();
                System.out.println("");
                System.out.print("Lama Sewa : ");
                lamaSewa3 = input.nextInt();
                System.out.println("");
                System.out.print("Jumlah Sewa : ");
                jumlahSewa = input.nextInt();
                harga3 = 35000 * lamaSewa3 * jumlahSewa;
                System.out.println("");
                System.out.print("Jadi total bayar anda sebesar " + harga3
                        + "\nMasukkan pembayaran anda : ");
                uang3 = input.nextInt();
                if (uang3 >= harga3) {
                    stripe();
                    System.out.println("");
                    System.out.println("Selamat anda telah berhasil menyewa "
                            + "\n" + jumlahSewa + " penanak nasi selama"
                            + " " + lamaSewa3 + " bulan.");
                    System.out.print("Silakan ambil kembalian anda : ");
                    bayar3 = uang3 - harga3;
                    System.out.println(bayar3);
                } else {
                    stripe();
                    System.out.println("");
                    System.out.println("Maaf uang anda tidak cukup"
                            + "\nuntuk menyewa " + jumlahSewa + " penanak nasi selama"
                            + "\n" + lamaSewa3 + " bulan"
                            + "\nKembali menghitung");
                    fasilitasKamar();
                }
                break;
        }
    }
    //akhir method fasilitasKamar

    //awal method rating
    public static void rating() {
        String[] a = new String[2];
        int[] z = new int[2];
        int x, y;

        for (x = 0; x <= 1; x++) {
            stripe();
            System.out.println("");
            System.out.print("Silakan berikan rating ke-" + (x + 1)
                    + "\ndalam [1-5] : ");
            z[x] = input.nextInt();
            System.out.println("");
            System.out.print("Silakan berikan ulasanmu ke-" + (x + 1)
                    + "\nmengenai cinta kost :");
            a[x] = input.next();
        }
        for (y = 0; y <= 1; y++) {
            stripe();
            System.out.println("");
            System.out.println("Rating anda mengenai cinta kost : "
                    + z[y]);
            System.out.println("Ulasan anda mengenai cinta kost : "
                    + a[y]);
        }
        stripe();
        System.out.println("");
        System.out.println("Terimakasih telah memberikan rating"
                + "\ndan ulasan pada cinta kost ");
    }
    //akhir method rating
}
