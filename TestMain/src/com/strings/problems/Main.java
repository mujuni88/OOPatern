package com.strings.problems;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: joebm08
 * Date: 9/13/13
 * Time: 2:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {

        Main mn = new Main();
        String res = mn.reverseWords("Tomorrow Home Going am I,");
        System.out.println("Expect: I, am Going Home Tomorrow => "+res);
    }

    public String removeChars(String str, String remove) {
        String newString = "";

        for(int i = 0; i < remove.length(); i++) {
            Character rmChar = remove.charAt(i);
            newString = "";
            for(int x = 0; x < str.length(); x++) {
                Character st = str.charAt(x);
                if(!rmChar.equals(st)){
                    newString = newString+st;
                }

            }

            str = newString;
        }

        return newString;
    }


    public String removeCharsOptimized(String str, String remove) {
        char[] src = str.toCharArray();
        char[] rmv = remove.toCharArray();
        boolean[] flags = new boolean[128]; // ASCII

        int len = src.length;
        int s, d;

        // characters to exclude
        for(d = 0; d < remove.length(); ++d) {
           flags[rmv[d]] = true;
        }

        s = 0;
        d = 0;

        while(s < len) {
            if(!flags[src[s]]){
                src[d++] = src[s];
            }

            ++s;
        }


         return String.valueOf(src,0,d);
    }

    public String reverseWords(String word) {
        Stack<String> stack = new Stack<String>();
        
        int i = 0, begin = 0, end = 0, len = word.length();
        while(i < len) {
            if((int)word.charAt(i) == 32) {
                end = i;

                String wrd = word.substring(begin, end);
                stack.push(wrd);
                begin = end;
            }

            ++i;
        }

        String wrd = word.substring(begin, len);
        stack.push(wrd);

       return printStack(stack);
    }

    public String printStack(Stack st){
        StringBuffer sb = new StringBuffer();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
    }
}
