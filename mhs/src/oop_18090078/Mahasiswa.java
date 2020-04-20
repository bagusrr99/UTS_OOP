package oop_18090078;

import java.util.List;
import java.util.Scanner;

public class Mahasiswa {
    
    public void printMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pendaftaran Mahasiswa Baru 2019-2020");
        System.out.println("------------------------------------");
        System.out.println("1. Tambah Data" + "\n2. Ubah Data" + "\n3. Hapus Data" + "\n4. Lihat Data" + "\n5. Keluar");
        System.out.print("Pilihan: ");
    }

    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Urutan data yang dihapus: ");
        int idx = Integer.parseInt(scan.nextLine());
        // proses hapus data
        Operasi.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang diubah: ");
        int idx = Integer.parseInt(scan.nextLine());
        System.out.println("--------------------------");
        System.out.print("Nim       : ");
        String nim = scan.nextLine();
        System.out.print("Nama      : ");
        String nama = scan.nextLine();
        System.out.print("Prodi     : ");
        String prodi = scan.nextLine();
        System.out.print("alamat    : ");
        String alamat = scan.nextLine();
        // proses ubah data
        Operasi.editData(new Data(nim, nama, prodi, alamat), idx - 1);
    }

    public void listData() {
        List<Data> result = Operasi.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.println("  Nim       : " + result.get(i).getnim());
            System.out.println("  Nama      : " + result.get(i).getnama());
            System.out.println("  prodi     : " + result.get(i).getprodi());
            System.out.println("  Alamat    : " + result.get(i).getalamat());
        }
    }

    public void addData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Nim : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("prodi : ");
        String prodi = scan.nextLine();
        System.out.print("Alamat : ");
        String alamat = scan.nextLine();
        // proses tambah data
        Operasi.addData(new Data(nim, nama, prodi, alamat));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa app = new Mahasiswa();
        while (true) {
            app.printMenu();
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Formulir Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Daftar Data");
                    app.listData();
                    System.out.println("Formulir Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Daftar Data");
                    app.listData();
                    System.out.println("Formulir Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Daftar Data");
                    app.listData();
                    break;
                case 5:
                    System.out.println("\nApakah Anda iIngin Melanjutkan Pendaftaran ?");
                    System.out.println("1.Ya \t2.Tidak");
                    char persetuju = scan.next().charAt(0);
                    if (persetuju == '1') {
                        app.printMenu();
//                        pilihan = Sammal.nextInt();

                    } else if (persetuju == '2') {
                        System.out.println("OK, bye qaqa");
                        System.exit(0);
                    }
            }
        }
    }
}
