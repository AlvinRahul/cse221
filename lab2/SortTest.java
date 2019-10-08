/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221lab2;

import java.util.Arrays;

/**
 *
 * @author rahul
 */
public class SortTest {
     public static void main(String[] args){
        int[]array={3,5,10,23,25,8,7,9,50,47};
        MyArray x=new MyArray();
        System.out.println("insertionSort");
        x.print(array);
        Long Start=System.currentTimeMillis();
        Arrays.sort(x.insertionSort(x.Copy(array)));
        Long End=System.currentTimeMillis();
        x.print(x.insertionSort(x.Copy(array)));
        int time=(int)(End-Start);
        System.out.println("Time:"+time+" ms");
        System.out.println("mergeSort");
        x.print(array);
        Start=System.currentTimeMillis();
        Arrays.sort(x.mergeSort(x.Copy(array),0,array.length-1));
        End=System.currentTimeMillis();
        x.print(x.mergeSort(x.Copy(array),0,array.length-1));
        time=(int)(End-Start);
        System.out.println("Time:"+time+" ms");
        System.out.println("quickSort");
        x.print(array);
        Start=System.nanoTime();
        Arrays.sort(x.quickSort(x.Copy(array),0,array.length-1));
        End=System.nanoTime();
        x.print(x.quickSort(x.Copy(array),0,array.length-1));
        time=(int)(End-Start);
        System.out.println("Time:"+time+" ns");
    }
}
