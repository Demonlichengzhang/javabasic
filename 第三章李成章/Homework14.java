package java43class_Chapter01;

import java.util.Scanner;

public class Homework14 {

	public static void main(String[] args) {
		int random=(int)(Math.random()*10);
		random=3;
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.println("请输入4位卡号：");
		Scanner input=new Scanner(System.in);
		int numbers=input.nextInt();
		int bw=numbers/100%10;
		if(bw==random){
			System.out.println(numbers+"号客户是幸运客户，获得精美宝马一辆。");
		}
		else{
			System.out.println(numbers+"号客户，谢谢你的支持！");
		}
	}

}
