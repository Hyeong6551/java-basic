package com.company.basic012_collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class A001_basic_Q {
	public static void main(String[] args) {
		int putNums = Integer.parseInt(JOptionPane.showInputDialog("1,2,3 중에 입력해주세요"));
	
		List<String> numbers = new ArrayList<>();
		numbers.add("ONE");		numbers.add("TWO");		numbers.add("THREE");
		
//		for(int i=0;i<numbers.size();i++) {
//			if(putNums==i) {
//				JOptionPane.showMessageDialog(null, numbers.get(i-1));
//				break;
//			} 
//		}
		
		JOptionPane.showMessageDialog(null, numbers.get(putNums-1));
	}
}
