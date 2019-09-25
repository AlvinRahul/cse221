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
        int array[][]=new int[x][x];
       try{
        while((s = br.readLine ()) != null){
       String[]arr=s.split(" ");
       int []a=new int[2];
       for(int i=0;i<arr.length;i++){
           a[i]=Integer.parseInt(arr[i]);
       }
       array[a[0]][a[1]]=1;
       array[a[1]][a[0]]=1;
        }
        
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(array[i][j]==1){
                    list[i]=new LinkedList();
                    list[i].add(j);
                }
                    if(array[j][i]==1){
                    list[j]=new LinkedList();
                    list[j].add(i);
                }
                
                    
                }
            }
       }
    catch(Exception e){    
    }
    for(int i = 0 ; i < list.length ; i++){
             System.out.println(i + "--->" + list[i]);
         }    
    }
    
    }
    

       
    


       
           
        
    

