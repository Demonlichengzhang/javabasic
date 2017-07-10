package java43class_Chapter01;
import java.util.Scanner;
public class Homework28 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入你的出行月份： ");
	
		int month=input.nextInt();
		int num=input.nextInt();
		double money=5000;
		if(month>=4&&month<=10){
			System.out.println("请你选择做头等舱还是经济舱：(头等舱1.经济舱2) ");
		switch(num){
			case 1:
				money=money*0.9;
				System.out.println("您的机票价格为： "+money);
				break;
			case 2:
				money=money*0.8;
				System.out.println("您的机票价格为： "+money);
				break;
		}
		}
		else{
			System.out.println("请你选择做头等舱还是经济舱：(头等舱1.经济舱2) ");
		
		switch(num){
		case 1:
			money=money*0.5;
			System.out.println("您的机票价格为： "+money);
			break;
		case 2:
			money=money*0.4;
			System.out.println("您的机票价格为： "+money);
			break;
		}
			
		}
	}

}
