package com.evergent.coreJAVA.ExceptionHandling;
//If there are 2 exceptions then they are executed one by one

public class ExceptionDemo3 {
	
		String name=null; //try block exception will get executed first
		int k=0;
		
		public void myData() {
		try {
			System.out.println("ONE");	
			System.out.println(name.length());
			int t=10/k;
			System.out.println(k);
			System.out.println("END");
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println("I can handle:"+ e);
		}
		}
		public static void main(String[] args) {
			ExceptionDemo3 ed2= new ExceptionDemo3();
			ed2.myData();
	}

}
