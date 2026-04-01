public class Sorting12 {
    int[] data;
    int jmlDat;

  
    public Sorting12(int[] Data, int jmlDat) {
        this.data = Data;
        this.jmlDat = jmlDat;
    }


    public void bubbleSort() {
        for (int i = 0; i < jmlDat - 1; i++) {
            for (int j = 0; j < jmlDat - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

 
    public void selectionSort() {
        for (int i = 0; i < jmlDat - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < jmlDat; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
    }

 
    public void insertionSort() {
        for (int i = 1; i < jmlDat; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

  
    public void tampil() {
        System.out.print("Data: ");
        for (int i = 0; i < jmlDat; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}