package com.company.basic004;

public class Arr_PR002 {
	public static void main(String[] args) {
		// [3][4]
//		int [][] datas = {{10,10,10,10},{20,20,20,20},{30,30,30,30}};
		int [][] datas = {{10,11,12,13},{20,21,22,23},{30,31,32,33}};
		
		// [4][5]
		int [][] result = new int[datas.length+1][datas[0].length+1];
		
		
		/*
		 30 = 00 10 20  
		 result[3][0]
		 
		 * */
		int sum=0;
//		for(int i=0;i<datas.length;i++) {
//			for(int j=0;j<datas[i].length;j++){
//				result[i][j] = datas[i][j]; 
//				sum += datas[i][j];
//				result[i][j+1] = sum;
//			}
//			sum=0;
//		}
		
		for(int i=0;i<datas.length;i++) {
			for(int j=0;j<datas[i].length;j++){
				sum += datas[j][i+1];
				result[i][j] = sum;
			}
			sum=0;
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++){
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
