package java43class_Chapter01;
import java.util.Scanner;
public class Homework17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入会员积分：");
		int custScore=input.nextInt();
		if(custScore<2000){
			System.out.println("该会员享受的折扣是：0.9");
		}
		else if(custScore>=2000&&custScore<4000){
			System.out.println("该会员享受的折扣是：0.8");
		}
		else if(custScore>=4000&&custScore<8000){
			System.out.println("该会员享受的折扣是：0.7");
		}
		else{
			System.out.println("该会员享受的折扣是：0.6");
		}
}
}