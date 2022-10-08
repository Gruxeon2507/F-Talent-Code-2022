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
public class ProblemM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String tail[] = input.split("");

        String head[] = input.split("");
        for (int i = 0; i < tail.length; i++) {
            System.out.print(head[i]);
        }
        System.out.println("");
        for (int i = 0; i < head.length; i++) {
            for (int j = 0; j < head.length; j++) {
                if (head[i].charAt(0) < head[j].charAt(0)) {
                    String temp = head[i];
                    head[i] = head[j];
                    head[j] = temp;
                }
            }

        }
        for (int i = 0; i < tail.length; i++) {
            System.out.print(head[i]);
        }
        String temp = "";
        System.out.println("");
        for (int i = 0; i < tail.length; i++) {
            temp = temp + tail[i]+head[i];
        }
        System.out.println(temp);
        int i;
        for( i=0;i<temp.length();i++){
            if(temp.charAt(i)=='@') break;
        }
        String result="";
        for( i=i+1;i<temp.length();i++){
            if(temp.charAt(i)=='@') break;
            result= result+temp.charAt(i);
        }
        System.out.println(result);
    }   
}
