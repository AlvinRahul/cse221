/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221lab2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author rahul
 */
public class MyArray {
    public int[] Copy(int[]a){
        int[]b=new int[a.length];
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
        }
        return b;
    }
    
    public static int[] insertionSort(int[]a){
       for(int i=1;i<a.length;i++){
      int j=i-1;
      int key=a[i];
      while(j>=0 && a[j]>key){
      a[j+1]=a[j];
      j--;
      }
      a[j+1]=key;
    }
    return a;
    }
    public static int[]mergeSort(int[]a,int i,int j){
    if(i==j) return a;
    int mid=(i+j)/2;
    int []a1=mergeSort(a,i,mid);
    int []a2=mergeSort(a,mid+1,j);
    if(a1==a2){
            int []mergedArray=merge(a1,i,mid,a2,mid+1,j);
            return mergedArray;
        }
    else if(a1!=a && a2!=a){
            int[]mergedArray=merge(a1,0,a1.length-1,a2,0,a2.length-1);
            return mergedArray;
        }
    else if(a1==a && a2!=a){
            int[]mergedArray=merge(a1,i,mid,a2,0,a2.length-1);
            return mergedArray;
        }
    else{
            int[]mergedArray=merge(a1,0,a1.length-1,a2,mid+1,j);
            return mergedArray;
        }
    }
    public static int[] merge(int[]a1,int sa1,int ea1,int[]a2,int sa2,int ea2){
        int l1=ea1-sa1+1;
        int l2=ea2-sa2+1;
        int[]c=new int[l1+l2];
        int i=sa1;
        int j=sa2;
        int k=0;
        while(k<c.length){
            if(i<=ea1 && j<=ea2){
                if(a1[i]<a2[j]){
                    c[k]=a1[i];
                    i++;
                }
                else{
                    c[k]=a2[j];
                    j++;
                }
            }
            else{
                break;
            }
            k++;
        }
        if(i<=ea1){
            while(i<=ea1){
                c[k]=a1[i];
                i++;
                k++;
            }
        }
        else{
            while(j<=ea2){
                c[k]=a2[j];
                j++;
                k++;
            } 
        }
        return c;
    }
    public static int[] quickSort(int[] a,int start,int end){
        if(start<end){
            int x=partition(a,start,end);
            quickSort(a,start,x-1);
            quickSort(a,x+1,end);
        }
        return a;
    }
    public static int partition(int[]a,int start,int end){
        int pivot=a[end];
        int j=start;
        for(int i=start;i<end;i++){
            if(a[i]<pivot){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        int temp=a[j];
        a[j]=a[end];
        a[end]=temp;
        return j;
    }
     public static void print(int[]a){
         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+",");
         }
         System.out.println();
     }
}   

