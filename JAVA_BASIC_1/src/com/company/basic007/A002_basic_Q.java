package com.company.basic007;

import com.companay.basic007_etc.Milk;

public class A002_basic_Q {
	public static void main(String[] args) {
      Milk m1 = new Milk();  
      System.out.println( m1 );
      m1.setMprice(2000);
      System.out.println( m1 );
      
    //ㅁ출력된화면
    //Milk [mno=0, mname=null, mprice=0]
    //Milk [mno=0, mname=null, mprice=2000]
	}
}
