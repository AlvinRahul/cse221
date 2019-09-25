/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221lab1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author rahul
 */
public class Task3_UndirectedAdjacencyMatrix_Sc {
    public static void main(String[] ags)throws Exception,IOException{
        File f=new File("C:\\Users\\USER\\Desktop\\input.txt");
        Scanner sc=new Scanner(f);
        int x=sc.nextInt();
        int[][]array = new int[x][x];
        System.out.println("Undirected Graph Adjacency Matrix");
        while(sc.hasNextInt()){
            int p=sc.nextInt();
            int q=sc.nextInt();
            array[p][q] = 1;
            array[q][p] = 1;
        }
        System.out.print("  ");
        for(int i=0;i<array.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j=0;j<array.length;j++){
            System.out.print(j+" ");
            for(int i=0;i<array.length;i++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}
