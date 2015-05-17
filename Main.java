/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsuzs;

import java.util.Arrays;

public class Main {

    public static void makeReverseSentence (String str){
        String myStr = str.replaceAll("[^a-zA-Z'\\s]", "").toLowerCase();
        String[] strArr = myStr.split("\\s+");
        for (String aStrArr : strArr) {
            char[] word = aStrArr.toCharArray();
            reverseWord(word);
       
            System.out.print(new String(word)+" ");
        }
    }

    public static char[] reverseWord(char [] a){
        int idx = 1;
        for (int i = a.length - 2; i>=a.length/2; i--) {
            char temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;
            idx++;
        }
        return a;
    }

    public static void main(String[] args) {
            String str = "To simplify the problem of scrambling it would not use random order";
            System.out.println( "The real sentence:");
            System.out.println("        "+str);
            System.out.println( "The reverse sentence: ");
            System.out.print("        ");
            makeReverseSentence(str);
        }
}