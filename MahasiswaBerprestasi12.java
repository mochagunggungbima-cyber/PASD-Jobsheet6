public class MahasiswaBerprestasi12 {
    Mahasiswa12[] listMhs = new Mahasiswa12[5];
    int idx = 0;
 

    public void tambah(Mahasiswa12 mhs) {
        listMhs[idx] = mhs;
        idx++;
    }
 
  
    public void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
        }
    }
 
  
    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa12 temp = listMhs[j];
                    listMhs[j]       = listMhs[j + 1];
                    listMhs[j + 1]   = temp;
                }
            }
        }
    }
 
   
    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[minIdx].ipk) {
                    minIdx = j;
                }
            }
            Mahasiswa12 temp = listMhs[minIdx];
            listMhs[minIdx]  = listMhs[i];
            listMhs[i]       = temp;
        }
    }
 

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa12 key = listMhs[i];
            int j = i - 1;
            while (j >= 0 && listMhs[j].ipk > key.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = key;
        }
    }
}
 