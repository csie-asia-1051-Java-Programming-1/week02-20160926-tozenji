package hw;
import java .util.Scanner;
public class hw02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("（1）男生（2）女生："); 
		int x = scn.nextInt(); 
		System.out.println("身高："); 
		int y = scn.nextInt();
		if( x == 1 ) {
			System.out.println(( y - 80 ) * 0.7); 
		}else {
		
			System.out.println( ( y - 70 ) * 0.6); 
		}
	}}