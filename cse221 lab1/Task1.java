    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package cse221lab1;

    import java.util.Stack;

    /**
     *
     * @author rahul
     */
   

        /**
         */
        public class Task1{

            /**
             *
             * @param args
             */
            public static void main(String[] args)throws Exception {
            // TODO code application logic here
        Stack s =new Stack();
        s.push(10);
        System.out.println("Pushing 10...");
        System.out.println("Printing Top:");
        System.out.println(Integer.parseInt(s.peek().toString()));
        s.push(5);
        System.out.println("pushing 5...");
        System.out.println("Printing Top:");
        System.out.println(Integer.parseInt(s.peek().toString()));
        s.pop();
        System.out.println("Popping...");
        System.out.println("Printing Top:");
        System.out.print(Integer.parseInt(s.peek().toString()));
  }
 }

