package com.company.basic004;

public class Arr_PR001 {
	/*
	 #####
	  ### 
	   #  
	  ### 
	 ##### 
	*/
	
	public static void main(String[] args) {
		char arr[][] = new char[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(!(i<j && arr.length-1-i<j) && !(i>j && arr.length-1-i>j)) {
					arr[i][j] = '#';
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
