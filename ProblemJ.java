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
public class ProblemJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        String arr[] = input.split("[, ]+");
        long a=Long.parseLong(arr[0]) ;
        long b=Long.parseLong(arr[1]);
        long sum=0;
        
        long i=1;
        long num=1;
        while(num <= b ){
            sum=sum+num;
            i++;
            num=i*i;
            
        }
        num =1;
        i=1;
        while (num<a){
            sum=sum-num;
            i++;
            num=i*i;
            
        }
        System.out.println(sum);
    }
}
