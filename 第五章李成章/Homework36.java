package java43class_Chapter01;
import java.util.Scanner;
public class Homework36 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数(0结束)");
		int max;
		int min;
		int num;
		min=max=num=input.nextInt();
		while(num!=0){
			if(max<num){
			max=num;
			}
			if(num<min){
				min=num;
			}
			System.out.println("请输入一个整数(0结束)");	
			num=input.nextInt();
		}
		System.out.println("最大值："+max+"最小值："+min);
	}

}
