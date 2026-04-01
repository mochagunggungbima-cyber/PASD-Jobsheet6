public class mahasiswa12 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    public mahasiswa12() {
    }

    // Konstruktor berparameter
    public mahasiswa12(String nm, String name, String kls, double ip) {
        this.nim   = nm;
        this.nama  = name;
        this.kelas = kls;
        this.ipk   = ip;
    }

    // Method tampilInformasi
    public void tampilInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("----------------------------");
    }
}