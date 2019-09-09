package lec04;

import java.util.Date;


public class DateDemo {
public static void main(String[] args) {
	Date today=new Date();
	System.out.println(today.toLocaleString());
	System.out.println(today.getTime());
	Date nationalDay=new Date(1949-1900,10-1,1);
	System.out.println(nationalDay.toLocaleString());
	long dif=today.getTime()-nationalDay.getTime();
	int days=(int) (dif/1000/3600/24);
	System.out.println(days);
	System.out.println(days/365);
}
}
