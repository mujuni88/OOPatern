package com.codility.problems;

import java.util.HashSet;

public class Pawn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // write your code in Java SE 6
		String S = "abcd";
        int length = S.length();
        String out;
        
        char[] charArray = new char[length];
        int charCounter = 0;

        for(int i = length-1; i < 1; i--){
            char temp = S.charAt(i);
            
            charArray[charCounter]=temp;
            charCounter++;
        }
        
        System.out.println( new String(charArray));
        
        

	}
	
	class Solution {
	    public int solution(int[] A) {
	        // write your code in Java SE 6
	        
	        int aLength = A.length;
	        int finalLength = 1;
	        Integer hsVal;
	        
	        HashSet<Integer> hs = new HashSet<Integer>();
	        
	        int temp = A[0];
	        hsVal = new Integer(temp);
	        hs.add(hsVal);
	        
	        System.out.println(temp);
	        
	        while(temp < aLength && !hs.contains(hsVal)){
	        
	            temp = A[temp];
	            hsVal = new Integer(temp);
	            
	            hs.add(hsVal);
	            finalLength++;

	        }
	        
	        return finalLength;
	        
	    }
	}


}
