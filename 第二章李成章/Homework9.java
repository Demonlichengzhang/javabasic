package java43class_Chapter01;
import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		int numbers;
		System.out.println("请输入4位会员卡号：");
		Scanner input=new Scanner(System.in);
		numbers=input.nextInt();
		int gw=numbers/1%10;
		int sw=numbers/10%10;
		int bw=numbers/100%10;
		int qw=numbers/1000%10;
		int sum=gw+sw+bw+qw;
		System.out.println("会员卡号："+numbers+"各位之和："+sum);
		boolean isLuck=sum>20;
		System.out.println("是幸运客户吗？："+isLuck);
	}

}
