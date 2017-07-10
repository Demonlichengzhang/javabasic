package java43class_Chapter01;
import java.util.Scanner;
public class Homework23 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您出行的月份：1~12");
		int month=input.nextInt();
		System.out.println("请问您选择做头等舱还是经济舱？头等舱输入1，经济舱输入2");
		int num=input.nextInt();
		int originalCost=5000;
		double money;
		if(month>=4&&month<=10){
			if(num==1){
			money=originalCost*0.9;
				System.out.println("您的机票价格为："+money);
			}
			else{
				money=originalCost*0.8;
				System.out.println("您的机票价格为："+money);
			}
		}
		else{
			if(num==1){
				money=originalCost*0.5;
				System.out.println("您的机票价格为："+money);
			}
			else{
				money=originalCost*0.4;
				System.out.println("您的机票价格为："+money);
			}
		}
	}

}
