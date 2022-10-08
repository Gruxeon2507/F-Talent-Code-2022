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
public class ProblemB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rec[][] = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                rec[i][j] = sc.nextInt();
            }

        }
        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i) break;
                int x1=rec[i][0];
                int y1=rec[i][1];
                int x2=rec[j][0];
                int y2=rec[j][1];
                if(x1+rec[i][2]>x2&& y1+rec[i][3]>y2){
                    s = s+ (x1+rec[i][2]-x2)*(y1+rec[i][3]-y2);
                }
            }
        }
        System.out.println(s);
        
    }
}
