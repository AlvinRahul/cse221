
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Task3_DirectedAdjacencyMatrix {
public static void main(String[] ags)throws Exception,IOException{
        File f=new File("C:\\Users\\USER\\Desktop\\input.txt");
       BufferedReader br = new BufferedReader (new FileReader (f)) ;
        String s;
        String y = br.readLine();
        int x=Integer.parseInt(y) ;
        int array[][]=new int[x][x];
        while((s = br.readLine ()) != null){
       String[]arr=s.split(" ");
       int []a=new int[2];
       for(int i=0;i<arr.length;i++){
           a[i]=Integer.parseInt(arr[i]);
       }
       array[a[0]][a[1]]=1;
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
    

