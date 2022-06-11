package com.prodapt.weeklytest1;

public class SimpleInterest {
	static int rate;
	static int time;
	static int amount;
	 void interest(int p , int r , int t) {
		 amount = p ;
		 time = t;
		 rate = r;
		 int si = (p * t * r)/100;
		 System.out.println("the SimpleInterest amount = "+ si);
		 int total = si + p;
		 System.out.println("The total amount to be paid after is "+ total);
		 
	 }

}
