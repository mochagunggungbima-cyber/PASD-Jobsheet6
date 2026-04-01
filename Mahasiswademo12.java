public class Mahasiswademo12 {
    public static void main(String[] args) {
 
        MahasiswaBerprestasi12 mb = new MahasiswaBerprestasi12();
 
     
        Mahasiswa12 mhs1 = new Mahasiswa12("001", "Andi",    "TI-1A", 3.75);
        Mahasiswa12 mhs2 = new Mahasiswa12("002", "Budi",    "TI-1A", 3.50);
        Mahasiswa12 mhs3 = new Mahasiswa12("003", "Citra",   "TI-1B", 3.90);
        Mahasiswa12 mhs4 = new Mahasiswa12("004", "Dewi",    "TI-1B", 3.20);
        Mahasiswa12 mhs5 = new Mahasiswa12("005", "Eko",     "TI-1A", 3.65);
 
        mb.tambah(mhs1);
        mb.tambah(mhs2);
        mb.tambah(mhs3);
        mb.tambah(mhs4);
        mb.tambah(mhs5);
 
        System.out.println("====== DATA SEBELUM SORTING ======");
        mb.tampil();
 
        mb.bubbleSort();
        System.out.println("====== SETELAH BUBBLE SORT (Descending IPK) ======");
        mb.tampil();
        mb.selectionSort();
        System.out.println("====== SETELAH SELECTION SORT (Ascending IPK) ======");
        mb.tampil();
        mb.insertionSort();
        System.out.println("====== SETELAH INSERTION SORT (Ascending IPK) ======");
        mb.tampil();
    }
}
 