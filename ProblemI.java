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
public class ProblemI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int matrix[][] = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int total=0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(matrix[i][j]<0){
                    total-=matrix[i][j];
                    matrix[i][j]=0;
                }
            }
        }
  for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(matrix[i][j]+ " ");
                }
               System.out.println("");
            }
     

        System.out.println(total);
        int havewater[][] = new int[m + 1][n + 1];
         for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                havewater[i][j] = 0;
            }
        }       
         for(int i=2;i<m-1;i++){
             for(int j=2;j<n-1;j++){
                 int check1=0;
                 int check2=0;
                 int check3=0;
                 int check4=0;
                 for(int k=0;k<i;k++){
                     if(matrix[i][j]<=matrix[i][k]&&check1==0){
                         check1=matrix[i][k];
                         
                     }else if(check1<=matrix[i][k]){
                         check1=matrix[i][k];
                     }
                 }
                 for(int k=i+1;k<m;k++){
                     if(matrix[i][j]<=matrix[i][k]&&check2==0){
                         check2=matrix[i][k];

                     }else if(check2<=matrix[i][k]){
                         check2=matrix[i][k];
                     }
                 }
                 for(int k=0;k<j;k++){
                     if(matrix[i][j]<=matrix[k][j]&&check3==0){
                         check3=matrix[k][j];
                         
                     }else if(check3<=matrix[i][k]){
                         check3=matrix[i][k];
                     }
                 }
                 for(int k=j+1;k<n;k++){
                     if(matrix[k][j]<=matrix[k][j]&&check4==0){
                         
                         check4=matrix[k][j];
                     }else if(check4<=matrix[i][k]){
                         check4=matrix[i][k];
                     }
                 }
                 if(check1!=0 && check2!=0 && check3!=0 && check4!=0){
                     total=total+Math.min(check1, Math.min(check2, Math.min(check3,check4)))-matrix[i][j];
                 }
             }
         }
         System.out.println(total);
    }
}
