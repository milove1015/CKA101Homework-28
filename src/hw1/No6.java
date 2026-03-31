package hw1;

public class No6 {
        
	    public static void main(String[] args) {
		
	    	System.out.println(5 + 5);
			//為10,因預設的數值型態是int，所以數字兩個數值相加
			
			System.out.println(5 + '5');
			//為58,數字5加上'5'等於是ASCII編碼中的數值53，所以5+53
			
			System.out.println(5 + "5");
			//為55,當中的"5"為字串，所以就變成串接的字串
	    	
            }
}