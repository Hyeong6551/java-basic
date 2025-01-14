package com.company.basic004;

public class Arr001_basic_Q2 {
	public static void main(String[] args) {
		//Q1
		float[] arrfloat;
		arrfloat = new float[5];
		float f = 1;
		
		for(int i=0;i<arrfloat.length;i++) {
			arrfloat[i] = f += 0.1f;
			System.out.printf("%.1f\t",arrfloat[i]);
		}
		System.out.println();
		
		//Q2
		char[] arrchar;
		arrchar = new char[5];
		char A = 'A';
		
		for(int i=0;i<arrchar.length;i++) {
			arrchar[i] = A++;
			System.out.print(arrchar[i]+"\t");
		}
		System.out.println();
	}
}
