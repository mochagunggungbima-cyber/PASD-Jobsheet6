- PRAKTIKUM 1
1. untuk mengurutkan data angka dari kecil ke besar (ascending) menggunakan tiga algoritma:

Bubble Sort
Selection Sort
Insertion Sort
2. if (data[j] < data[min]) {
    min = j;
}
  (Digunakan untuk mencari indeks nilai terkecil)
  3. Artinya:
  - Selama nilai sebelumnya lebih besar dari temp, maka data digeser ke kanan
  - Digunakan untuk menyisipkan data ke posisi yang benar
  4. Untuk menempatkan nilai (temp) ke posisi yang sudah benar setelah proses pergeseran
  
- PRAKTIKUM 2

 1. Karena elemen terakhir sudah otomatis berada di posisi benar, jadi tidak perlu dibandingkan lagi
 2. Karena setiap iterasi, bagian belakang sudah terurut, jadi tidak perlu dicek ulang
 3. - Perulangan i = 49 kali
    - Tahap Bubble sort = 49 tahap
 4. Scanner sc = new Scanner(System.in);

System.out.print("NIM: ");
String nim = sc.nextLine();

System.out.print("Nama: ");
String nama = sc.nextLine();

System.out.print("Kelas: ");
String kelas = sc.nextLine();

System.out.print("IPK: ");
double ipk = sc.nextDouble();

list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
 5. Untuk menemukan nilai terkecil lalu menempatkannya di posisi depan agar data terurut
 6. Program digunakan untuk mengelola data dosen, dengan fitur:
  -Tambah Data
  - Tampil Data
  - Sorting ASC (Bubble Sort)
  - Sorting DSC (Selection/Insertion)
  