package oop_18090078;

public class Data {
    private String nim;
    private String nama;
    private String prodi;
    private String alamat;

    public Data() {
        nim = "";
        nama = "";
        prodi = "";
        alamat = "";
    }

    public Data(String nim, String nama, String prodi, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnim() {
        return nim;
    }

    public String getnama() {
        return nama;
    }

    public String getprodi() {
        return prodi;
    }

    public String getalamat() {
        return alamat;
    }
}
