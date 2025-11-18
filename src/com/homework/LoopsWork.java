package com.homework;

public class LoopsWork {
	public static void main(String[] args) {
		
		
		int a = 34;
		int b = 55;
		int c = 10;
		 if (a>b && a>c) {
			 System.out.println("a is greater");
		 } else if(b>a && b>c) {
			 System.out.println("b is greater");
			 
		 }else if (c>a && c>b) {
			 System.out.println("c is greater");
		 }
		 
		 
		 System.out.println("2nd questions");
		 
		 int x = 18;
		  if (x/3 ==0 && x/7 ==0) {
			  System.out.println("is divisible by 3 & 7 ");
		  }else {
			  System.out.println("not divisible by 3 & 7");
		  }
		 
		  System.out.println("3nd questions");
		   
		   int h = 23;
		     if (h%100 ==0 ) {
		    	 System.out.println("withdrawal approved ");
		     } else {
		    	 System.out.println(" withdrawal not approved");
		     }
		     
		     System.out.println("4nd questions");
		     
		     int temp = -2;
		     if(temp<0) {
		    	 System.out.println("freezing");
		     }else if (temp>=0 && temp<=20) {
		    	 System.out.println("cold");
		     }else if (temp>=21 && temp<=35) {
		    	 System.out.println("normal");
		     }else {
		    	 System.out.println("hot");
		     }
		    System.out.println("5th question");
		    
		    int num= 858;
		    if(num>=0 && num<=9) {
		    	System.out.println("1 digit");
		    }else if(num>=10 && num<=99) {
		    	System.out.println("2 digits");
		    }else {
		    	System.out.println("more than 2 digits");
		    }
		    System.out.println("6th question");
		    
		     System.out.println("7th question");
		     int m1 = 80;
		     int m2 = 76;
		     int m3 = 95;
		     int m4 = 90;
		     int m5 = 88;
		     
		     int total = m1+m2+m3+m4+m5;
		     int average = total/5;
		     System.out.println("total "+total);
		     System.out.println("average "+average);
		     if(average>=90) {
		    	 System.out.println("A+");
		     }else if (average>=80) {
		    	 System.out.println("A");
		     }else if (average>=70) {
		    	 System.out.println("B");
		     }else if (average>=60) {
		    	 System.out.println("C");
		     }else if (average>=50) {
		    	 System.out.println("D");
		     }else {
		    	 System.out.println("fail");
		     }
		     System.out.println("8th question");
		     
		     int year = 2003;
		     if(year % 100 == 0){
		    	 System.out.println("century year");
		     }else {
		    	 System.out.println("not century year");
		     }
		     
		     System.out.println("9th question");
		     
		     
		     int n1 = 5;
		     int n2 = 35;
		    
		     
		     if(n2 % n1 == 0) {
		    	 System.out.println("is multiple");
		     }else {
		    	 System.out.println("is not multiple");
		     }
		     
		     System.out.println("10th question");
		     
		     int digit = 105;
		     if (digit % 10 == 5 || digit % 10 ==-5) {
		    	 System.out.println("last digit is 5");
		     }else {
		    	 System.out.println("last digit is not 5");
		     }
		     
		     System.out.println(" part b 11 question");
		     
		     int l =9;
		     for ( l=1 ;l <= 100;l++) {
		    	 if(l%9 == 0)
		    		 System.out.println(l);
		     }

		System.out.println("part b 12 question");
		
		 int sum = 0; 
	       
	        for (int i = 1; i <= 100; i++) {
	          
	            if (i % 9 == 0) {
	                sum = sum + i;  
	            }
	        }

	       
	        System.out.println  ("The sum of all numbers between 1 and 100 divisible by 9 is: " + sum);
	    }
	

	{

	}

}

















