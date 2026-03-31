package hw1;

public class No3 {

	public static void main(String[] args) {
		
		int allsec = 256559;
		int day,hour,min,sec;
		day = allsec/60/60/24;
		hour = (allsec/60/60) % 24;
		min =  (allsec/60) % 60;
		sec = allsec % 60;
		System.out.println(day + "天" + hour + "小時" + min + "分" + sec + "秒");
				
	}
}
