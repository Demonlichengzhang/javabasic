package java43class_Chapter01;
import java.util.Scanner;
public class Homework118 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name=input.next();
		
		System.out.println("请输入密码：");
		int nums=input.nextInt();
		if(name.equals("青")||nums==123){
			System.out.println("欢迎你“青");
		}
		else{
			System.out.println("对不起，你不是”青");
		}
	}

}
