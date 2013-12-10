package com.codility.problems;

import java.util.ArrayList;
import java.util.List;

public class Equilibrium {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {2,2,3,4};
		int[] A1 = {};
		
		List<int[]> args1 = new ArrayList<int[]>();
		args1.add(A);
		args1.add(A1);
		
		Solution s = new Solution();
		
		for(int[] a : args1) {
			System.out.println("Soln: "+s.solution(a));
		}
		

	}
	
	public static class Solution {
	    public int solution(int[] A) {
	        // write your code in Java SE 6
	        int aLength = A.length;
	        int sum = 0;
	        int pSize = 0;
	        List<Integer> pArray = new ArrayList<Integer>();
	        
	        if(aLength == 0)
	            return -1;
	        
	        // get all the valid p values
	        for(int i = 0; i < aLength; i++){
	            if(!isValidP(i, aLength))
	                break;
	            
	            
	            sum = sum+A[i];
	            
	        }
	        
	        // get p length
	        pSize = pArray.size();
	        if(pSize <= 0 || pSize > aLength)
	        	return -1;	        
	        
	        
	        // get the sum
	        System.out.println("SUM: "+sum);
	     
	        int p;
	        for(int i = 0; i < aLength; i++){
	            if(i >= pSize)
	            	break;
	            
	            p = pArray.get(i).intValue();
	            
	            
	            
	                        
	        }
	        
	        return -1;
	     
	        
	    }
	    
	    public boolean isValidP(int p, int length){
	        if(p <= 0 || p < length)
	            return true;
	        
	        return false;
	    }
	}

}
