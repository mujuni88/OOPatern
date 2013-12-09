package com.equilibrium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Prefixer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,2,1,0,1,3,0};
		int[] A1 = {};
		
		List<int[]> args1 = new ArrayList<int[]>();
		args1.add(A);
		args1.add(A1);
		
		Solution s = new Solution();
		
		for(int[] a : args1) {
			System.out.println("Soln: "+s.solution(a));
		}
	}
	
	public static class Solution{
		
	public int solution(int[] A){
        int aLength = A.length;
        if(aLength <= 0) return -1;
        
        int temp = 0;
        int prefix = -1;
        Integer hashValue;
        
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < aLength; i++){
        	temp = A[i];
        	hashValue = new Integer(temp);
        	
        	if(!s.contains(hashValue)){
        		s.add(hashValue);
        		prefix = i;
        	}
        }
        
        return prefix;
        
	
	}
	}

}
