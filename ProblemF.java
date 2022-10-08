/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftalentcode2022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Minh
 */
public class ProblemF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String domino[] = input.split("[,]");
        int bull = 0;;
        ArrayList<Character> bullVal = new ArrayList<>();


        for (int i = 0; i < domino.length; i++) {
            if (domino[i].charAt(0) == domino[i].charAt(2)) {
                bull++;
                bullVal.add(domino[i].charAt(0));
            }
        }

        if (bull == 0) {
            System.out.println("INVALID");
        } else {
            int check = 0;
            for (int i = 0; i < domino.length; i++) {
                for (int j = i + 1; j < domino.length; j++) {
                    if (domino[i].equals(domino[j])||(domino[i].charAt(0)==domino[j].charAt(2)&&domino[i].charAt(2)==domino[j].charAt(0))) {
                        check++;
                    }
                }
            }
            if (check != 0) {
                System.out.println("INVALID");
            } else {
                ArrayList<Character> character = new ArrayList<>();
                ArrayList<Integer> count = new ArrayList<>();
                character.add(domino[0].charAt(0));
                count.add(1);
                if(domino[0].charAt(2)==domino[0].charAt(1)){
                    count.set(0, 2);
                }
                else{
                    character.add(domino[0].charAt(2));
                count.add(1);
                }
                for (int i = 1; i < domino.length; i++) {
                    char first = domino[i].charAt(0);
                    char second = domino[i].charAt(2);
                    int check1 = 0;
                    int check2 = 0;
                    for (int j = 0; j < character.size(); j++) {
                        if (first == character.get(j)) {
                            count.set(j, count.get(j) + 1);
                            check1++;
                            break;
                        }

                    }
                    for (int j = 0; j < character.size(); j++) {
                        if (second == character.get(j)) {
                            count.set(j, count.get(j) + 1);
                            check2++;
                            break;
                        }

                    }
                    if (check1 == 0) {
                        character.add(first);
                        count.add(1);
                    }
                    if (check2 == 0) {
                        character.add(second);
                        count.add(1);
                    }
                }
                check=0;
                for(int i=0;i<character.size();i++){
                    int check1=0;
                    for(int j=0;j<bullVal.size();j++){
                        if(character.get(i)==bullVal.get(j)){
                            check1++;
                        }
                    }
                    
                    if(count.get(i)%2!=0&&check1==0){
                        check++;
                        
                    }
                }
       
                if(check<2) System.out.println("VALID");
                else System.out.println("INVALID");
            }
        }
    }
}
