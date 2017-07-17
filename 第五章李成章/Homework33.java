package java43class_Chapter01;
import java.util.Scanner;
public class Homework33 {

	public static void main(String[] args) {
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println("***********************************");
		System.out.println("1.客户信息管理");
		System.out.println("2.购物结算");
		System.out.println("3.真情回馈");
		System.out.println("4.注销");
		System.out.println("***********************************");
		Scanner input=new Scanner(System.in);
		boolean isRight=true;
		do{
			System.out.println("请选择，输入数字：");
			int num=input.nextInt();
			switch(num){
		 	case 1:
		 		System.out.println("执行客户信息管理");
		 		isRight=true;
		 		break;
		 	case 2:
		 		System.out.println("执行购物结算");
		 		isRight=true;
		 		break;
		 	case 3:
		 		System.out.println("执行真情回馈");
		 		isRight=true;
		 		break;
		 	case 4:
		 		System.out.println("执行注销");
		 		isRight=true;
		 		break;
		 	default:
				System.out.println("输入错误，请重新输入数字：");
				isRight=false;
				break;
			}
		}while(isRight==false);
			System.out.println("程序结束！");
	}

}
