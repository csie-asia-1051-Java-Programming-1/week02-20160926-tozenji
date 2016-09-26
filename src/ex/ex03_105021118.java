package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner; 
public class ex03_105021118 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 
			Scanner scn = new Scanner(System.in);   
			int a,b,c,d;   
		    a=scn.nextInt();   
			b=scn.nextInt();   
			c=scn.nextInt();   
			d=scn.nextInt();   
			double a1=((c*60)+d)-((a*60)+b);   
			  
			if(a1<=120){   
			int a2=(int)(a1/30);   
			System.out.println(a2*30);   
			}else (a1>120 && a1<=240){   
			  
			int a2=(int)((a1-120)/30);   
			System.out.println((a2*40)+120);   
			}else (a1>240){   
			int a2=(int)((a1-240)/30);   
			System.out.println((a2*60)+280);   
			}   
			}   
			}  



