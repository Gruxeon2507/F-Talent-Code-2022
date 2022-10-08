package ftalentcode2022;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        String p1[] = input.split("[:|,|;,]");
        input = sc.nextLine();
        String p2[] = input.split("[:,]");
        input = sc.nextLine();
        String p3[] = input.split("[:,]");
        input = sc.nextLine();
        String p4[] = input.split("[:,]");
        int bull=-1;
        int score1 = 0;
        if (p1.length == 1) {
            score1 = -1;
        } else {
            for (int i = 0; i < p1.length; i = i + 2) {
                if (p1[i].equalsIgnoreCase("0") && p1[i + 1].equalsIgnoreCase("0")) {
                    score1 += 13;
                    bull=1;
                } else {
                    score1 += Integer.parseInt(p1[i]);
                    score1 += Integer.parseInt(p1[i + 1]);
                }
            }
        }

        int score4 = 0;
        if (p4.length == 1) {
            score4 = -1;
        } else {
            for (int i = 0; i < p4.length; i = i + 2) {
                if (p4[i].equalsIgnoreCase("0") && p4[i + 1].equalsIgnoreCase("0")) {
                    score4 += 13;
                    bull=4;
                } else {
                    score4 += Integer.parseInt(p4[i]);
                    score4 += Integer.parseInt(p4[i + 1]);
                }
            }
        }
 
        int score2 = 0;
        if (p2.length == 1) {
            score2 = -1;
        } else {
            for (int i = 0; i < p2.length; i = i + 2) {
                if (p2[i].equalsIgnoreCase("0") && p2[i + 1].equalsIgnoreCase("0")) {
                    score2 += 13;
                    bull=2;
                } else {
                    score2 += Integer.parseInt(p2[i]);
                    score2 += Integer.parseInt(p2[i + 1]);
                }
            }
        }
  
        int score3 = 0;
        if (p3.length == 1) {
            score3 = -1;
        } else {
            for (int i = 0; i < p3.length; i = i + 2) {
                if (p3[i].equalsIgnoreCase("0") && p3[i + 1].equalsIgnoreCase("0")) {
                    score3 += 13;
                    bull=3;
                } else {
                    score3 += Integer.parseInt(p3[i]);
                    score3 += Integer.parseInt(p3[i + 1]);
                }
            }
        }

        int rank[] = new int[4];
        rank[0] = score1;
        rank[1] = score2;
        rank[2] = score3;
        rank[3] = score4;
        int lengh[] = new int[4];
        lengh[0]=p1.length;
        lengh[1]=p2.length;
        lengh[2]=p3.length;
        lengh[3]=p4.length;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (rank[i] < rank[j]) {
                    int temp = rank[i];
                    rank[i] = rank[j];
                    rank[j] = temp;
                    temp = lengh[i];
                    lengh[i]=lengh[j];
                    lengh[j]=temp;
                }
                if(rank[i]==rank[j]&&lengh[i]<lengh[j]){
                    int temp = rank[i];
                    rank[i] = rank[j];
                    rank[j] = temp;
                    temp = lengh[i];
                    lengh[i]=lengh[j];
                    lengh[j]=temp;
                }
            }
        }
        String finalrank[] =new String[4];

        for (int i = 1; i <= 4; i++) {
            if (score1 == rank[i - 1]&& p1.length==lengh[i-1]) {
                finalrank[0] = ranking(i);{
                rank[i-1]=-3;
            }
            }
            if (score2 == rank[i - 1] &&p2.length==lengh[i-1]) {
                finalrank[1] = ranking(i);
                rank[i-1]=-4;
            }
            if (score3 == rank[i - 1]&&p3.length==lengh[i-1]) {
                finalrank[2] = ranking(i);
                rank[i-1]=-5;
            }
            if (score4 == rank[i - 1]&&p4.length==lengh[i-1]) {
                finalrank[3] = ranking(i);
                rank[i-1]=-6;
            }
        }

        for (int i = 0; i < 4; i++) {
            
            System.out.println(finalrank[i]);
        }

    }

    static String ranking(int n) {
        if (n == 1) {
            return "winner";
        } else if (n == 2) {
            return "1st loser";
        } else if (n == 3) {
            return "2nd loser";
        } else {
            return "3rd loser";
        }
    }
}
