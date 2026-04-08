import java.util.Scanner;

public class MainDosen12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen12 list = new DataDosen12();

        int pilih;
        do {
            System.out.println("1. Tambah");
            System.out.println("2. Tampil");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("0. Keluar");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.next();
                    System.out.print("Nama: ");
                    String nm = sc.next();
                    System.out.print("JK (true/false): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    list.tambah(new Dosen(kd, nm, jk, usia));
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    list.tampil();
                    break;
            }
        } while (pilih != 0);
    }
}