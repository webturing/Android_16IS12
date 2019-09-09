package lec04;

public class MathRandom {
public static void main(String[] args) {
	for(int i=0;i<10;i++)
		System.out.println(Math.random()>0.5?"T":"F");//[0,1)
}
}
