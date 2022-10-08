/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftalentcode2022;

import java.util.Scanner;

public class ProblemH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        String name = "";
        int i;
        for (i = 0; i < input.length(); i++) {
            if ((input.charAt(i + 2) + "").matches("[0-9]")) {
                break;
            } else {
                name = name + input.charAt(i);
            }
        }
        String id = "";
        for (i = i; i < input.length(); i++) {
            if (input.charAt(i) == '@') {
                break;
            } else {
                id = id + input.charAt(i);
            }
        }
        System.out.println("<name>"+name+"</name><id>"+id+"</id>");
    }
}
