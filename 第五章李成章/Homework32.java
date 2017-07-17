package java43class_Chapter01;
import java.util.Scanner;
public class Homework32 {

	public static void main(String[] args) {
		String name="";
		double price=0.0;
		double discount=0.8;
		double total=0.0;
		double payment=0.0;
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("************************************");
		Scanner input=new Scanner(System.in);
		String answer="y";
		while("y".equals(answer)){
			System.out.println("请选择购买的商品编号：");
			int num=input.nextInt();
			System.out.println("请输入购买数量：");
			int amount=input.nextInt();
			switch(num){
				case 1:
					name="T恤";
					price=245.0;
					break;
				case 2:
					name="网球鞋";
					price=570.0;
					break;
				case 3:
					name="网球拍";
					price=320.0;
					break;
			}
			total=price*amount;
			System.out.println(name+"￥"+price+"\t数量"+amount+"\t合计￥"+total);
			System.out.println("是否继续：(y/n)");
			answer=input.next();
		}
		payment=total*discount;
		System.out.println("折扣："+discount);
		System.out.println("应付金额："+payment);
		System.out.println("实付金额：");
		double money=input.nextDouble();
		money=money-payment;
		System.out.println("找零："+money);
	}

}
