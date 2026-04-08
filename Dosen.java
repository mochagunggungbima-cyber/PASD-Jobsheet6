public class Dosen {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen(String kd, String nm, boolean jk, int usia) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        System.out.println(kode + " | " + nama + " | " + usia);
    }
}