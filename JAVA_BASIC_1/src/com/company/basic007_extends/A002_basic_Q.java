package com.company.basic007_extends;

import com.companay.basic007_etc.Milk;

public class A002_basic_Q {
	public static void main(String[] args) {
      Milk m1 = new Milk();  
      System.out.println( m1 );
      m1.setMage(2000);
      System.out.println( m1 );
      
    //ㅁ출력된화면
    //Milk [mno=0, mname=null, mage=0]
    //Milk [mno=0, mname=null, mage=2000]
	}
}
