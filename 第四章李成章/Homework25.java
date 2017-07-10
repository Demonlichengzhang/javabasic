package java43class_Chapter01;
import java.util.Scanner;
public class Homework25 {

	public static void main(String[] args) {
		System.out.println("请输入消费金额：");
		Scanner input=new Scanner(System.in);
		int money=input.nextInt();
		if(money>=50){
			System.out.println("是否参加优惠换购活动： ");
			System.out.println("1.满50元，加2元换购百事可乐饮料一瓶 ");
			System.out.println("2.满100元，加3元换购500ml可乐一瓶 ");
			System.out.println("3.满100元，加10元换购5kg面粉 ");
			System.out.println("4.满200元，加10元换购1个狗逼锅 ");
			System.out.println("5.满200元，加20元换购欧莱雅醒肤水一瓶 ");
			System.out.println("0.不换购 ");
			System.out.println("请选择：");	
		int num=input.nextInt();
		switch(num){
			case 1:
				money=money+2;
				System.out.println("本次消费总金额： "+money);
				System.out.println("成功换购：1瓶百事可乐 ");
				break;
			case 2:
				money=money+3;
				System.out.println("本次消费总金额： "+money);
				System.out.println("成功换购：1瓶500ml可乐 ");
				break;
			case 3:
				money=money+10;
				System.out.println("本次消费总金额： "+money);
				System.out.println("成功换购：5kg面粉 ");
				break;
			case 4:
				money=money+10;
				System.out.println("本次消费总金额： "+money);
				System.out.println("成功换购：1个狗逼锅");
				break;
			case 5:
				money=money+20;
				System.out.println("本次消费总金额： "+money);
				System.out.println("成功换购：欧莱雅醒肤水一瓶");
				break;
			default:
				System.out.println("谢谢您的光临！");
				break;
		}
		}else{
			money=50-money;
			System.out.println("您的消费金额还没有达到换购的金额。如果您想换购的话，您还需要消费："+money);
		}
		
	}

}
