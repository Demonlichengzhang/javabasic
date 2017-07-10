package java43class_Chapter01;
import java.util.Scanner;
public class Homework24 {

	public static void main(String[] args) {
		System.out.println("\n\t\t欢迎使用我行我素管理系统");
		System.out.println("\t\t\t1.登录系统");
		System.out.println("\t\t\t2.退出 ");
		System.out.println("***************************");
		Scanner input=new Scanner(System.in);
		System.out.println("请选择，输入数字：");
		int num=input.nextInt();
		switch(num){
			case 1:
			System.out.println("\n\t\t欢迎使用我行我素管理系统");
			System.out.println("\t\t\t1.客户信息管理");
			System.out.println("\t\t\t2.购物结算");
			System.out.println("\t\t\t3.真情回馈");
			System.out.println("\t\t\t4.注销");
			System.out.println("***************************");
			
			System.out.println("请选择，输入数字：");
			int num2=input.nextInt();
			break;
			case 2:
			System.out.println("谢谢您的使用！");
			break;
			default:
			System.out.println("输入错误");
			break;
		}
	}

}
