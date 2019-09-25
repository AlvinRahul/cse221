/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author rahul
 */
public class Task3_UndirectedAdjacencyList {
    public static void main(String[] ags)throws Exception,IOException{
       File f=new File("C:\\Users\\USER\\Desktop\\input.txt");
       BufferedReader br = new BufferedReader (new FileReader (f)) ;
       String s;
       String y=br.readLine();
       int x=Integer.parseInt(y);
       LinkedList[]list=new LinkedList[x];
        int []ar=new int[list.length];
        for(int i=0;i<list.length;i++){
            list[i]=new LinkedList();
        }
       try{
        while((s = br.readLine ()) != null){
       String[]arr=s.split(" ");
       int []a=new int[2];
       for(int i=0;i<arr.length;i++){
           a[i]=Integer.parseInt(arr[i]);
       }
       int p=a[0];
       int q=a[1];
       list[p].add(q);
       ar[p]++;
       list[q].add(p);
       ar[q]++;
    }
       }
    catch(Exception e){    
    }
       System.out.println("Adjacency List");
    for(int i=0;i<list.length;i++){
             System.out.println(i+"--->"+list[i]);
         }
    System.out.println("Degree");
    for(int i=0;i<ar.length;i++){
             System.out.println(i+"--->"+ar[i]);
         }    
    }
    }
    
    
    
    

       
    


       
           
        
    

