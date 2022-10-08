/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftalentcode2022;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemA {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String arr[] = word.split("[ ]+");
    String input = sc.nextLine();
    String inputword[]=input.split("[ ]");
    for(int i =0; i <inputword.length;i++){
        for(int j=0;j<arr.length;j++){
            if(inputword[i].toLowerCase().contains(arr[j].toLowerCase())){
                String temp =inputword[i];
                inputword[i]=inputword[i].charAt(0)+"";
                int k;
                for(k=1;k<arr[j].length()-1;k++){
                    inputword[i]=inputword[i]+"*";
                }
                inputword[i]=inputword[i]+temp.charAt(arr[j].length()-1)+temp.substring(k+1);
            }
        }
        
    }  
    for(int i=0;i<inputword.length;i++){
        System.out.print(inputword[i]+" ");
    }
    }

}
