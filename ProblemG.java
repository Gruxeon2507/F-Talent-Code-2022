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
public class ProblemG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        int i;
        for(i=0;i<input.length();i++){
            if(input.charAt(i)==':') break;
        }
        String name="";
        for(i=i+1;i<input.length();i++){
            if(input.charAt(i)==',') break;
            name= name +input.charAt(i);
        }
        name=name.substring(1,name.length()-1);
        String id="";
        for(i=i+1;i<input.length();i++){
            if(input.charAt(i)==':') break;
        }
        for(i=i+1;i<input.length();i++){
            if(input.charAt(i)=='}') break;
            id= id +input.charAt(i);
        }
        id=id.substring(1,id.length()-1);
        String nameword[]= name.split("[ ]");
        String idname="";
        idname=nameword[nameword.length-1].toLowerCase();
        for(i=0;i<nameword.length-1;i++){
            idname+=(nameword[i].charAt(0)+"").toLowerCase();
        }
        String finalid = (id.charAt(0)+"").toLowerCase() +(id.charAt(1)+"").toLowerCase()+id.substring(2);
        System.out.println(idname+finalid+"@fpt.edu.vn");
    }
}
