/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class SelectionSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] tabInt = {51,23,17,32,43,88};
        int i,j,N;
        N=6;
        
        for (i = 0; i < N; i++) {
              int min = tabInt[i];
              int pos = i;
              for (j = i; j < N; j++) {
                   /* Cari nilai yang terkecil */
                   if (tabInt[j] < min) {
                   min = tabInt[j];
                   pos = j;
                }
              }
              /* Tukar nilai terkecil ke arr[i] jika pos tdk sama i */
              if(i!=pos) {
                 int temp = tabInt[i];
                 tabInt[i] = tabInt[pos];
                 tabInt[pos] = temp;
               }
            }
        for(i=0; i<6; i++){ 
            System.out.print(tabInt[i]+" ");
        }
    }
}