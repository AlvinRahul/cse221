/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse221lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author rahul
 */
public class Task2 {
    public static void main(String[] args)throws Exception {
        File f=new File("C:\\Users\\USER\\Desktop\\input.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String x;
        while ((x = br.readLine()) != null) {
            System.out.println(x);
         }
        
    }
}
