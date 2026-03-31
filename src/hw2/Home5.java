package hw2;

public class Home5 {

	public static void main(String[] args) {
		int com =0;
		for(int i =1;i <=49;i++) {
		  if(i%10!=4 && i/10!=4) {
		  System.out.println(i+" ");
				com++;			
			}	
		}
		System.out.println("共有"+com+"個");
	}
		}
