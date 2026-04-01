public class Sortingmain12 {
    public static void main(String[] args) {

      
        int[] a = {64, 25, 12, 22, 11};
        Sorting12 dataurut1 = new Sorting12(a, a.length);
        System.out.println("=== BUBBLE SORT ===");
        System.out.print("Sebelum sorting: ");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.print("Sesudah sorting: ");
        dataurut1.tampil();

        System.out.println();

      
        int[] b = {29, 10, 14, 37, 13};
        Sorting12 dataurut2 = new Sorting12(b, b.length);
        System.out.println("=== SELECTION SORT ===");
        System.out.print("Sebelum sorting: ");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.print("Sesudah sorting: ");
        dataurut2.tampil();

        System.out.println();

        
        int[] c = {5, 2, 4, 6, 1, 3};
        Sorting12 dataurut3 = new Sorting12(c, c.length);
        System.out.println("=== INSERTION SORT ===");
        System.out.print("Sebelum sorting: ");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.print("Sesudah sorting: ");
        dataurut3.tampil();
    }
}