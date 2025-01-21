package com.company.basic008;

/*
 * Object
 *   ↓
 * Parent	(int i,j)
 *   ↓
 * Child	(int k)
 * 
 */

class Parent {
    int i, j;
    public Parent(){   super();     }  //// 1) 누구 호출한것이지 적어주세요!  =>  
    public Parent(int i, int j) {
        super();  //// 2) 누구 호출한것이지 적어주세요!  =>  
        this.i=i;
        this.j=j;
    }
}
class Child extends Parent {
    int k;
    public Child(){  super();  }  //// 3) 누구 호출한것이지 적어주세요! =>   
    public Child(int i,int j,int k){
        super(i,j); //// 4) 누구 호출한것이지 적어주세요! => 
        this.k=k;
    }
}
public class A002_basic_Q {
	public static void main(String[] args) {
        Child child=new Child(10,20,30);
        // child (int k) 보장
        // Child child;		 Child(int k) Parent(int i,j)
        System.out.println(child.i);  //5) 결과 출력   
        System.out.println(child.j);  //5) 결과 출력   
        System.out.println(child.k); //5) 결과 출력   
        
        Parent p = child;
        System.out.println(p);
	}
}

// Q1. Object
// Q2. Object
// Q3. Parent
// Q4. Parent
// Q5, 10 20 30