package com.ocjp.basicjava;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	 
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else if(n%2==0){
            if(n>=2 || n<=5){
                ans = "Not Weird";
            } else if(n>=6 || n<=20){
                ans = "Weird";
            }else if(n>20){
                ans = "Not Weird";
            }
            
        }
        System.out.println(ans);*/
    	Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            
           String str = String.format("%03d", x);
           System.out.printf("%-14s %s",s1, str);
           System.out.println();
        }
        System.out.println("================================");
        
    }
}
