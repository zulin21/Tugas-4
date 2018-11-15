/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickSort;

/**
 *
 * @author ASUS
 */
public class QuickSort {
        public static void main(String[] args) {
        int i;
        int[] data = {25, 57, 48, 37, 12, 92, 80, 33};
        quickSort(data, 0, data.length - 1);
        System.out.println("Hasil pengurutan data:");
        tampilkanLarik(data, data.length);

    }

    public static void tampilkanLarik(int[] data, int n) {
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", data[i]);
            System.out.println();
    }   
   
    public static int partisi(int[] data, int p, int r) {
        int x, i, j, tmp;
       
        x = data[p];
        i = p;
        j = r;
       
        while (true) {
            while (data[j] > x)
                j--;
               
            while (data[i] < x)
                i++;

            if (i < j) {
                // Tukarkan data
                tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
            }           
            else
                return j;
        }
    }
   
    public static void quickSort(int[] data, int p, int r) {
        int q;
       
        if (p < r) {
            q = partisi(data, p, r);
            quickSort(data, p, q);
            quickSort(data, q+1, r);
        }       
    }
}