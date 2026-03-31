package hw1;

public class No5 {

        public static void main(String[] args) {
		
	    double money = 1500000,years = 10,fv;	
	    double rate = 0.02;
	    fv = money * Math.pow((1 + rate), years);
	    System.out.printf("共 %.2f 元 %n", fv);
		System.out.println();        	
       }
}